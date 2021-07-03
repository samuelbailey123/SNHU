var express = require('express');
var router = express.Router();
const controller = require('../controllers/travel')

/* GET home page. */
router.get('/travel', controller.travel);

module.exports = router;