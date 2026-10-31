package mcframe.clientMSUA.MSUAP0030;

import mcframe.clientCore.event.MCEventInfo;
import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;

/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@EI
public class MSUAP_List extends MSUAP_List_MC {

	@Override
	protected void getSloDlv_Sort(
	        MCList<MCRow> down,
	        MCEventInfo info) {

	    // まず標準のソートを実行
	    super.getSloDlv_Sort(down, info);

	    // その後、納品先CD=99を最後へ移動する
	    for (int i = 0; i < down.size(); i++) {
	        MCRow row = down.get(i);

	        if ("99".equals(row.getStringNE("bp_cd"))) {
	            down.remove(i);
	            down.add(row);
	            break;
	        }
	    }
	}
	
}
