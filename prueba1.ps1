echo Bienvenido

Function showmenu {
    Clear-Host
    Write-Host "Starting Menu..."
    Write-Host "1. Search"
    Write-Host "2. Create"
    Write-Host "3. Delete"
    Write-Host "4. Exit"
}

Function buscarCuenta {
    Get-LocalUser
}
 
showmenu
 
while(($inp = Read-Host -Prompt "Select an option") -ne "4"){
 
switch($inp){
        1 {
            Clear-Host
            Write-Host "------------------------------";
            Write-Host "Search account"; 
            Write-Host "------------------------------";
            buscarCuenta
            pause;
            break
        }
        2 {
            Clear-Host
            Write-Host "------------------------------";
            Write-Host "Create account";
            Write-Host "------------------------------";
            pause; 
            break
        }
        3 {
            Clear-Host
            Write-Host "------------------------------";
            Write-Host "Remove account";
            Write-Host "------------------------------"; 
            pause;
            break
            }
        4 {"Exit"; break}
        default {Write-Host -ForegroundColor red -BackgroundColor white "Invalid option. Please select another option";pause}
        
    }
 
showmenu
}