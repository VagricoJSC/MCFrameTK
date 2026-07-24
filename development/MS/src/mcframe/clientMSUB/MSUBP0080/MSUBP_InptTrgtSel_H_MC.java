package mcframe.clientMSUB.MSUBP0080;

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
import mcframe.clientMSUD.MSUDP0030.IfInptTrgtSelBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_InptTrgtSel_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_InptTrgtSel_H_MC extends MSUBP_InptTrgtSel_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_InptTrgtSel_H_MC() {
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
	protected IfInptTrgtSelBase getIfInptTrgtSelBase() {
		return getLinkPartsPanel(IfInptTrgtSelBase.class);
	}

	/**
	 * Panel[InptTrgtSel]のボタン[open_MSBCP1060]の押下時の処理
	 */
	@Override
	public void doInptTrgtSel_open_MSBCP1060(MCEventInfo info) {
		IfInptTrgtSelBase base = getIfInptTrgtSelBase();
		
		if (!canOpenMSBCP1060(base)) {
			throw new MCAppException(MSUBP0002);
		}
		else if (base.checkOpenInptTrgtSelPanel(this)) {
			doInptTrgtSel_exec_open_MSBCP1060();
		}
	}

	/**
	 * 投入対象選択画面を開く
	 */
	protected void doInptTrgtSel_exec_open_MSBCP1060() {
		openModalPanel("MS", "MSBCP1060", T1, get_open_MSBCP1060_bind_Row(), this);
	}

	/**
	 * 在庫情報を表示するテーブルから選択行を取得し、<br>
	 * デフォルトのバインド検索条件として投入対象選択画面に渡す。
	 * @return 選択行
	 */
	protected MCRow get_open_MSBCP1060_bind_Row() {
		IfInptTrgtSelBase base = getIfInptTrgtSelBase();
		if (base == null) {
			return null;
		}

		MCTable<?> table = base.getInptTable(this);
		if (table == null) {
			return null;
		}

		return base.get_open_MSBCP1060_bind_Row(table);
	}

	/**
	 * 投入対象選択画面を開けるかをチェックする。
	 * @param base ベース画面
	 * @return true: 開ける, false: 開けない
	 */
	protected boolean canOpenMSBCP1060(IfInptTrgtSelBase base) {
		if (base == null) {
			return false;
		}

		MCTable<?> t = base.getInptTable(this);
		if (t == null) {
			return false;
		}
		
		MCRow row = t.getSelectedMCRow();
		if (isNull(row)) {
			return false;
		}
		else {
			if (row.isStatusDelete()) {
				if (!base.isOpeTypEnable(this, row.getGUIIndex(), IfInptTrgtSelBase.OPE_INS)) {
					return false;
				}
			}
		}
		return true;
	}

}