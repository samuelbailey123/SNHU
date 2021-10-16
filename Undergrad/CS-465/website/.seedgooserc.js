const { model } = require("mongoose");

model.exports = {
    modelBaseDirectory: 'app_api/models/travlr.js',
    models: ['*.js', '!db.js'],
    data: 'data', 
    db: 'mongodb://localhost:27017/travlr'
};