const express = require("express")
require("dotenv").config({ path: "../.env" })

const app = express()

const PORT = process.env.PORT || 3000

const videoDir = process.env.VIDEO_DIR;
const jarPath = process.env.PROCESSOR_JAR;

const { v4: uuidv4 } = require("uuid");

const jobId = uuidv4();

app.get("/", (req, res) => {
 res.json({
  message: "Salamander server running"
 })
})

app.listen(PORT, () => {
 console.log(`Server listening on port http://localhost:${PORT}`)
})