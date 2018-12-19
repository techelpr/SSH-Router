import org.apache.sshd.server.*;
import org.apache.sshd.server.scp.ScpCommandFactory;

public class server
{
	private SshServer sshd;
	private int sshPort;
	
	public server()
	{
		sshd = SshServer.setUpDefaultServer();
		sshd.setCommandFactory(new ScpCommandFactory());
	}
	
	public server(int sshPort)
	{
		sshd = SshServer.setUpDefaultServer();
	}
	
	public int getSshPort()
	{
		return sshPort;
	}
	public void setSshPort(int sshPort)
	{
		this.sshPort = sshPort;
	}
	
	
}
