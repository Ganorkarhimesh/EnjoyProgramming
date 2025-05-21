const { exec } = require("child process");
const os = require("os");
let cmd = os.platform() === "win32" ? "shutdown /s /t 0" : "sudo shutdown -h now";
exec(cmd);