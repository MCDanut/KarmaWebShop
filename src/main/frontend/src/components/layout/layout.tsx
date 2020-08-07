import React, {Component} from "react";
import Header from "./header";
import Banner from "./banner";
import Footer from "./footer";

class Layout extends Component{

    render(): React.ReactElement<any, string | React.JSXElementConstructor<any>> | string | number | {} | React.ReactNodeArray | React.ReactPortal | boolean | null | undefined {
        return (
            <div>
                <Header/>
                <Banner/>
                {this.props.children}
                <Footer/>
            </div>
        );
    }

}

export default Layout;

