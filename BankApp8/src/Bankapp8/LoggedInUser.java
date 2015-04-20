package Bankapp8;

import SQL.SQLProfileRecord;


public class LoggedInUser
{
    private SQLProfileRecord user = new SQLProfileRecord();
    public int g_UserId = -1;
    public int g_Access = -1;
    
    public LoggedInUser()
    {
	clearUser();
    }
    
    public boolean isLoggedIn()
    {
	return g_UserId >= 0;
    }   
    
    public SQLProfileRecord getUser() {
	return user;
    }

    public String getUserName()
    {
	return user.getUSERNAME();
    }
    
    
	public void setUser(SQLProfileRecord user) {
	if (user == null)
	{
	    clearUser();
	}
	else
	{
	    this.user = user;
	    this.g_UserId = user.getID();
	    this.g_Access = user.getAccess();
	}
    }
    
    public final void clearUser()
    {
	user = new SQLProfileRecord();
	this.g_UserId = -1;
	this.g_Access = -1;
    }
    
}