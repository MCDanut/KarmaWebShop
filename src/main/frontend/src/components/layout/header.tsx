import React, {Component} from "react";

class Header extends Component{
    render(): React.ReactElement | string | number | {} | React.ReactNodeArray | React.ReactPortal | boolean | null | undefined {
        return(
            <header className="header_area sticky-header">
                <div className="main_menu">
                    <nav className="navbar navbar-expand-lg navbar-light main_box">
                        <div className="container">
                            <a className="navbar-brand logo_h" href="index.html"><img src="img/logo.png" alt=""/></a>
                            <button className="navbar-toggler" type="button" data-toggle="collapse"
                                    data-target="#navbarSupportedContent"
                                    aria-controls="navbarSupportedContent" aria-expanded="false"
                                    aria-label="Toggle navigation">
                                <span className="icon-bar"></span>
                                <span className="icon-bar"></span>
                                <span className="icon-bar"></span>
                            </button>
                            <div className="collapse navbar-collapse offset" id="navbarSupportedContent">
                                <ul className="nav navbar-nav menu_nav ml-auto">
                                    <li className="nav-item active"><a className="nav-link" href="index.html">Home</a>
                                    </li>
                                {/*TODO Add here all the links to other pages*/}
                                {/*Pages: Shop, MyAccount, Contact*/}


                                </ul>
                                <ul className="nav navbar-nav navbar-right">
                                    <li className="nav-item"><a href="index.html" className="cart"><span className="ti-bag"/></a></li>
                                    {/*TODO Add Cart Page and link it here*/}
                                    <li className="nav-item">
                                        <button className="search"><span className="lnr lnr-magnifier" id="search"/></button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </div>
                <div className="search_input" id="search_input_box">
                    <div className="container">
                        <form className="d-flex justify-content-between">
                            <input type="text" className="form-control" id="search_input" placeholder="Search Here"/>
                                <button type="submit" className="btn"/>
                                {/*TODO on sumbit/click go to Shop And filter*/}
                                <span className="lnr lnr-cross" id="close_search" title="Close Search"/>
                        </form>
                    </div>
                </div>
            </header>
        );
    }

}

export default Header;