package org.usfirst.frc.team999.autonomous;

public class FieldPacketReader {
	public String readInfo(String info) 
	{	
		String returnedInfo = "";
		//Four possibilities based on whether the packet is LLL, RRR, LRL, RLR
		
		//Check length to ensure we received the packet.
		if (info.length() > 0)
		{
			if (info.equals("LLL") || info.equals("RRR") || info.equals("LRL") || info.equals("RLR"))
				if (info.charAt(0) == 'L')
				{	//If the first character is L
					if (info.charAt(1) == 'L') 
					{	//If the second character is L
						returnedInfo = "1";
							//LLL
					}
					else 
					{	//If the second character is R
						returnedInfo = "3";
							//LRL
					}
				}
				
				else
				{	//If the first character is R
					if (info.charAt(1) == 'R')
					{	//If the second character is R
						returnedInfo = "2";
							//RRR
					}
					
					else 
					{	//If the second character is L
						returnedInfo = "4";
						//RLR
					}
				}
			else
			{
				returnedInfo = "X";
			}
		}
		
		else 
		{
			returnedInfo = "X";
			System.out.println("Field Condition Number:" + returnedInfo);
		}

		return returnedInfo;
	}
}