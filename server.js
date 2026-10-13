// const{add,sub} = require("./Oct-13");
// console.log(add(5,5));
// console.log(sub(10,4));
// console.log("manjot")

// const express = require("express");
// const app = express();
// const PORT=3000;

// app.get("/",(req,res)=>{
//     res.send("welcome manjot");
// })

// app.get("/abc",(req,res)=>{
//     res.send("how are you?")
// })

// app.listen(PORT,()=>{
//     console.log(`server is running on ${PORT}`);
// })

const http = require("http");
const port=5000;
const employees =[
    {id:1, name:"Manjot"},
    {id:2, name:"jot"}
];

const server = http.createServer((req,res)=>{
    if(req.url==="/employees" && req.method==="GET"){
        res.writeHead(200, {"Content-Type":"application/json"});
        res.end(JSON.stringify(employees));
    }
    else{
        res.writeHead(404);
        res.end("not found")
    }
})

server.listen(port, ()=>console.log("server is running on"+port));