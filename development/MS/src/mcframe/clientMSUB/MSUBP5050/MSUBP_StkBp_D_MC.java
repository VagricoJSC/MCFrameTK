package mcframe.clientMSUB.MSUBP5050;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_StkBp_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_StkBp_D_MC extends MSUBP_StkBp_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkBp_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUBP_StkBp_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _stkIdTyp;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * 
	 * @param stkIdTyp 在庫識別区分
	 */
	public void setRelateBeans(MCBeans stkIdTyp) {
		_stkIdTyp = stkIdTyp;
	}
	protected MCBeans getStkIdTyp() {
		return _stkIdTyp;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getStkIdTyp() != null) {
			((MCLCBeans) getStkIdTyp()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getStkIdTyp()) {
			doBeans_stk_id_typ_LC(info);
		}
	}

	/**
	 * 在庫識別区分が変更されたときに実行される。<br>
	 * <br>
	 * 在庫識別区分がクリアされた場合、在庫取引先をクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_stk_id_typ_LC(MCEventInfo info) {
		clearStkBp(info.getEventIndex());
	}

	protected void clearStkBp(int i) {
		// 変更対象がヘッダの場合（全てクリア）
		if (i < 0) {
			for (StkBpR r : exceptBaseEmpty(StkBpTable)) {
				setValueEx(columnStkBp_stk_bp_cd, r.getGUIIndex(), null);
			}
		}
		// 変更対象が明細の場合（指定された行のみクリア）
		else {
			setValueEx(columnStkBp_stk_bp_cd, i, null);
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		StkBpTable.setCellConfig(createPartsCellConfig());
	}

	protected MAUDP_CommonCellConfig createPartsCellConfig() {
		return new MAUDP_CommonCellConfig();
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnStkBp_stk_bp_cd) {
			String typ = (String) getBeansValue(getStkIdTyp(), index);
			if (isNull(typ) || MSC_STK_ID_TYP.isCOSTK(typ)) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}
	
	@Override
	public MCList getStkBp_stk_bp_cd(MCRow row, MCEventInfo info) {

		// 入力補助画面を開かずに手入力したときに参照する動的なバインド値の設定
		setDynamicBind(row, info.getEventIndex());
		
		return super.getStkBp_stk_bp_cd(row, info);
	}

	@Override
	protected void setDynamicBind(MCRow bind, int eventIndex) {
		super.setDynamicBind(bind, eventIndex);
		
		bind.setValueNE(BpCols.$i_bp_is_srch_typ, getBpIsSrchTyp(eventIndex));
	}
	
	/**
	 * 取引先入力補助検索区分を取得する。
	 * 
	 * @return 取引先入力補助検索区分
	 */
	public String getBpIsSrchTyp(int index) {
		if (getStkIdTyp() == null) {
			return null;
		}

		String typ = (String) getBeansValue(getStkIdTyp(), index);

		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(typ)
				|| MSC_STK_ID_TYP.isCSTSTK(typ)) {

			return MAC_BP_IS_SRCH_TYP.CST.value();

		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(typ)
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(typ)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(typ)
				|| MSC_STK_ID_TYP.isNCV_RCV(typ)
				|| MSC_STK_ID_TYP.isONR_PROV(typ)) {

			return MAC_BP_IS_SRCH_TYP.SPPL.value();

		}
		return MAC_BP_IS_SRCH_TYP.COMM.value();
	}

}