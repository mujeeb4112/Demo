// import com.optimus.idfc.dto.AccountRequest;

public class PrintJSON {
	
	static String getCreateAccountDecrypted() {
		return "{  \"verifyAEMPANDetailsResponse\":{    \"msgHdr\":{      \"rslt\":\"ERROR\", \"error\":\"null\"    },    \"msgBdy\":{      \"pnDtls\":[        {          \"pnNb\":\"AHIPD6737A\",          \"pnSts\":\"E\",          \"lstNm\":\"DUTT\",          \"fstNm\":\"DEVENDRA\",          \"mdNm\":null,          \"pnTtl\":\"Shri\",          \"lstUpDt\":\"26/01/2017\",          \"nameOnCard\":\"DEVENDRA DUTT\",          \"aadharSeedingStatus\":\"Y\"        }      ]    }  }}";
	}

	// AccountRequest userInfo2 = gson.fromJson(getCreateAccountDecrypted(), AccountRequest.class);
	
	public static void main(String args[]) {
		System.out.println(PrintJSON.getCreateAccountDecrypted());	
	}

}
