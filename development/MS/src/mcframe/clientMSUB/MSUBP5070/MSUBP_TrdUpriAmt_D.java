// FMSE PANEL_EI
package mcframe.clientMSUB.MSUBP5070;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.commonCore.annotation.EI;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil_MC.*;


/**
 * 画面"MSUBP_TrdUpriAmt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSUBP_TrdUpriAmt_D extends MSUBP_TrdUpriAmt_D_MC {

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_TrdUpriAmt_D() {
		super();
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_TrdUpriAmt_D(String name) {
		super(name);
	}

	private boolean allowManualUnitPrice = false;

	/**
	 * 単価取得対象外の状態にかかわらず単価入力を許可する。
	 * 得意先・品目の単価変更許可は維持する。
	 */
	public void setAllowManualUnitPrice(boolean allow) {
	    allowManualUnitPrice = allow;
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {

	    if (allowManualUnitPrice
	            && column == columnTrdUpriAmt_trd_cur_upri) {

	        // 得意先・品目の両方が変更不可なら編集不可
	        if (_bpUpriChngFlg != null && _itmUpriChngFlg != null) {
	            if (!(Boolean)getValueOf(_bpUpriChngFlg, index)
	                    && !(Boolean)getValueOf(_itmUpriChngFlg, index)) {
	                return MCMode.READ_ONLY;
	            }
	        }

	        // 画面定義のモードに従う
	        return column.getMode();
	    }

	    return super.getCellMode(index, column);
	}
	
	
}