import {GoogleLogin} from 'react-google-login';

const clientId = "560383036869-laueht47tm9m1u59cs50sumk8jkokcdt.apps.googleusercontent.com"

function login(){

    const onSuccess = (res) => {
        console.log("LOGIN SUCCESS! Current user: ",res.profileObj);
    }

    const onFailure = (res) => {
        console.log("LOGIN FAILED! res: ", res);
    }

    return(
        <div id ="signInButton">
            <GoogleLogin
                clientId={clientId}
                buttonText="Login"
                onSuccess={onSuccess}
                onFailure={onFailure}
                cookiePolicy={'single_host_origin'}
                osSignedIn={true}
                />
        </div>
    )
}