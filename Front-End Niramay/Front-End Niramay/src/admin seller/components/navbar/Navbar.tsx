import React from 'react'
import MenuIcon from '@mui/icons-material/Menu';
import { Drawer, IconButton } from '@mui/material';
import { useNavigate } from 'react-router-dom';

const Navbar = ({DrawerList}:any) => {
  const navigate = useNavigate()
  const [open, setOpen] = React.useState(false);

  const toggleDrawer = (newOpen: any)=>() => {
    setOpen(newOpen);
    
  };

  return (
    <div className='h-[10vh] flex items-center px-5 border-b'>
      <div className='flex items-center gap-3 '>
        <IconButton onClick={toggleDrawer(true)} color='primary'>
          <MenuIcon color='primary' />
        </IconButton>

        <h1 onClick={() => navigate("/")}  className="logo cursor-pointer text-lg md:text-2xl font-extrabold text-transparent 
             bg-clip-text bg-gradient-to-r from-[#FF8C00] to-[#FFB84D] 
             hover:text-[#FF6F00] hover:scale-105 hover:drop-shadow-lg 
             transition-all duration-300 ease-out">Niramay</h1>
      </div>

      <Drawer open={open} onClose={toggleDrawer(false)}>
        <DrawerList toggleDrawer={toggleDrawer} />
      </Drawer>

    </div>
  )
}

export default Navbar