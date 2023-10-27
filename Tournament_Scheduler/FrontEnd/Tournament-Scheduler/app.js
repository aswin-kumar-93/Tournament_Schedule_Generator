const express = require('express');
const bodyParser = require('body-parser');
const { Client } = require('pg');

const app = express();
const port = 5000;

app.use(bodyParser.urlencoded({ extended: true }));

const client = new Client({
  user: 'postgres',
  host: 'localhost',
  database: 'mydb',
  password: 'aswin93',
  port: 5432, // Default PostgreSQL port
});

client.connect();

app.get('/', (req, res) => {
    // Serve your index.html file
    res.sendFile(__dirname + '/index.html');
});

app.post('/create-schedule', (req, res) => {
    const scheduleData = JSON.parse(req.body.scheduleData);
    const insertQuery = 'INSERT INTO teamnames (team) VALUES ($1) RETURNING *';

    client.query(insertQuery, [scheduleData], (err, result) => {
        if (err) {
            console.error('Error inserting schedule data:', err);
            res.status(500).json({ error: 'Error inserting schedule data' });
        } else {
            const insertedData = result.rows[0];
            console.log('Schedule data inserted successfully:', insertedData);
            res.json({ success: 'Schedule data inserted successfully' });
        }
    });
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});








