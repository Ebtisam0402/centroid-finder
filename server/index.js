const express = require("express")
require("dotenv").config({ path: "../.env" })

const app = express()

const PORT = process.env.PORT || 3000

app.get("/", (req, res) => {
 res.json({
  message: "Salamander server running"
 })
})

app.listen(PORT, () => {
 console.log(`Server listening on port http://localhost:${PORT}`)
})