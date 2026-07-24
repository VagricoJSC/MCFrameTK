package mcframe.clientMSUB.MSUBP0070;

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


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_StkInfo_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_StkInfo_H_MC extends MSUBP_StkInfo_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkInfo_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * ベース画面を取得する。
	 * 
	 * @return ベース画面
	 */
	protected IfStkInspBase getStkInspBase() {
		return getLinkPartsPanel(IfStkInspBase.class);
	}

	/**
	 * Panel[StkInfo]のボタン[open_MSBEP0500]の押下時の処理
	 */
	@Override
	public void doStkInfo_open_MSBEP0500(MCEventInfo info) {
		IfStkInspBase base = getStkInspBase();
		
		if (!canOpenMSBEP0500(base)) {
			throw new MCAppException(MSUBP0002);
		}
		else if (base.checkOpenStkInfoPanel(this)) {
			doStkInfo_exec_open_MSBEP0500();
		}
	}

	/**
	 * 在庫情報選択画面を開く
	 */
	protected void doStkInfo_exec_open_MSBEP0500() {
		openModalPanel("MS", "MSBEP0500", T1, get_open_MSBEP0500_bind_Row(), this);
	}

	/**
	 * 在庫情報を表示するテーブルから選択行を取得し、<br>
	 * デフォルトのバインド検索条件として在庫情報選択画面に渡す。
	 * @return 選択行
	 */
	protected MCRow get_open_MSBEP0500_bind_Row() {
		IfStkInspBase base = getStkInspBase();
		if (base == null) {
			return null;
		}

		MCTable<?> table = base.getStkTable(this);
		if (table == null) {
			return null;
		}

		return base.get_open_MSBEP0500_bind_Row(table);
	}

	/**
	 * 在庫情報選択画面を開けるかをチェックする。
	 * @param base ベース画面
	 * @return true: 開ける, false: 開けない
	 */
	protected boolean canOpenMSBEP0500(IfStkInspBase base) {
		if (base == null) {
			return false;
		}

		MCTable<?> t = base.getStkTable(this);
		if (t == null) {
			return false;
		}
		
		MCRow row = t.getSelectedMCRow();
		if (isNull(row)) {
			return false;
		}
		else {
			if (row.isStatusDelete()) {
				if (!base.isOpeTypEnable(this, row.getGUIIndex(), IfStkInspBase.OPE_INS)) {
					return false;
				}
			}
		}
		return true;
	}

}