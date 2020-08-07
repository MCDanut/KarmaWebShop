import React, {Component} from "react";

class Footer extends Component{
    render(): React.ReactElement<any, string | React.JSXElementConstructor<any>> | string | number | {} | React.ReactNodeArray | React.ReactPortal | boolean | null | undefined {
        return(
            <footer className="footer-area section_gap">
                <div className="container">
                    <div className="row">
                        <div className="col-lg-3  col-md-6 col-sm-6">
                            <div className="single-footer-widget">
                                <h6>About Us</h6>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                    incididunt ut labore dolore
                                    magna aliqua.
                                </p>
                            </div>
                        </div>
                        <div className="col-lg-4  col-md-6 col-sm-6">
                            <div className="single-footer-widget">
                                <h6>Newsletter</h6>
                                <p>Stay update with our latest</p>
                                <div className="" id="mc_embed_signup">

                                    <form target="_blank" //noValidate="true"
                                          action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
                                          method="get" className="form-inline">

                                        <div className="d-flex flex-row">

                                            <input className="form-control" name="EMAIL" placeholder="Enter Email"
                                                   // onFocus="this.placeholder = ''"
                                                   // onBlur="this.placeholder = 'Enter Email '"
                                                   // required="" type="email"
                                            />


                                                <button className="click-btn btn btn-default"><i
                                                    className="fa fa-long-arrow-right" aria-hidden="true"></i></button>
                                                    <div style={{position: "absolute", left: "-5000px"}}>
                                                    <input name="b_36c4fd991d266f23781ded980_aefe40901a" //tabIndex="-1"
                                                            type="text"/>
                                                </div>

                                        </div>
                                        <div className="info"></div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-3  col-md-6 col-sm-6">
                            <div className="single-footer-widget mail-chimp">
                                <h6 className="mb-20">Instragram Feed</h6>
                                <ul className="instafeed d-flex flex-wrap">
                                    <li><img src="img/i1.jpg" alt=""/></li>
                                    <li><img src="img/i2.jpg" alt=""/></li>
                                    <li><img src="img/i3.jpg" alt=""/></li>
                                    <li><img src="img/i4.jpg" alt=""/></li>
                                    <li><img src="img/i5.jpg" alt=""/></li>
                                    <li><img src="img/i6.jpg" alt=""/></li>
                                    <li><img src="img/i7.jpg" alt=""/></li>
                                    <li><img src="img/i8.jpg" alt=""/></li>
                                </ul>
                            </div>
                        </div>
                        <div className="col-lg-2 col-md-6 col-sm-6">
                            <div className="single-footer-widget">
                                <h6>Follow Us</h6>
                                <p>Let us be social</p>
                                <div className="footer-social d-flex align-items-center">
                                    <a href="index.html"><i className="fa fa-facebook"/></a>
                                    <a href="index.html"><i className="fa fa-twitter"/></a>
                                    <a href="index.html"><i className="fa fa-dribbble"/></a>
                                    <a href="index.html"><i className="fa fa-behance"/></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="footer-bottom d-flex justify-content-center align-items-center flex-wrap">
                        <p className="footer-text m-0">
                            Copyright &copy;
                            <script>document.write(new Date().getFullYear());</script>
                            All rights reserved | This template is made with <i className="fa fa-heart-o"
    aria-hidden="true"/> by <a
                                href="https://colorlib.com" target="_blank" rel="noopener noreferrer">Colorlib</a>
                        </p>
                    </div>
                </div>
            </footer>
        );
    }
}

export default Footer;