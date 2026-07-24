package mcframe.clientMSUA.MSUAP0010;

import java.util.Map;
import java.util.HashMap;

import mcframe.clientCore.event.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

abstract public class MSUAP_List_MC extends MSUAP_List_MC_A {

	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応項目 （ここから）
	// ///////////////////////////////////////////////
	
	// -- SpplByLoc:発注先（場所対応） (START)
	@Override
	protected void getSpplByLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SpplByLoc:発注先（場所対応） (END)
	
	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応項目 （ここまで）
	// ///////////////////////////////////////////////

	// -- IoSchdTyp:受払予定区分  (START)
	@Override
	protected MCList<MCRow>  getIoSchdTyp_GetList(MCRow row, MCEventInfo info){
		return super.getIoSchdTyp_GetList(row, info).subList(r -> MSC_IO_SCHD_TYP.is_listlogic_tgt(r.getString("io_schd_typ")));
	}
	// -- IoSchdTyp:受払予定区分  (END)
}
