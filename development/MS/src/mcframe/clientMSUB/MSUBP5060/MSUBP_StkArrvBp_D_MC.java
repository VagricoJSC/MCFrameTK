package mcframe.clientMSUB.MSUBP5060;

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
 * 画面"MSUBP_StkArrvBp_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_StkArrvBp_D_MC extends MSUBP_StkArrvBp_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_StkArrvBp_D_MC() {
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
	public MSUBP_StkArrvBp_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _loc;
	protected MCBeans _sppl;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。<br>
	 * 
	 * @param loc 場所ＣＤ
	 * @param sppl 発注先ＣＤ
	 */
	public void setRelateBeans(MCBeans loc, MCBeans sppl) {
		_loc = loc;
		_sppl = sppl;
	}
	protected MCBeans getLoc() {
		return _loc;
	}
	protected MCBeans getSppl() {
		return _sppl;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getLoc() != null) {
			((MCLCBeans) getLoc()).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == getLoc()) {
			doBeans_loc_cd_LC(info);
		}
	}

	/**
	 * 場所ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 在庫着荷先をクリアする。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_loc_cd_LC(MCEventInfo info) {
		clearStkArrvBp(info.getEventIndex());
	}

	protected void clearStkArrvBp(int i) {
		// 変更対象がヘッダの場合（全てクリア）
		if (i < 0) {
			for (StkArrvBpR r : exceptBaseEmpty(StkArrvBpTable)) {
				setValueEx(columnStkArrvBp_stk_arrv_bp_cd, r.getGUIIndex(), null);
			}
		}
		// 変更対象が明細の場合（指定された行のみクリア）
		else {
			setValueEx(columnStkArrvBp_stk_arrv_bp_cd, i, null);
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		StkArrvBpTable.setCellConfig(createPartsCellConfig());
	}

	protected MAUDP_CommonCellConfig createPartsCellConfig() {
		return new MAUDP_CommonCellConfig();
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnStkArrvBp_stk_arrv_bp_cd) {
			if (isNull((String) getBeansValue(getLoc(), index))) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}
	
	@Override
	public MCList getStkArrvBp_stk_arrv_bp_cd(MCRow row, MCEventInfo info) {

		// 入力補助画面を開かずに手入力したときに参照する動的なバインド値の設定
		setDynamicBind(row, info.getEventIndex());
		
		return super.getStkArrvBp_stk_arrv_bp_cd(row, info);
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

		if (getLoc() == null || isNull(getBeansValue(getLoc(), index)) || getSppl() == null) {
			return null;
		}

		String cd = (String) getBeansValue(getSppl(), index);
		
		// 自社場所
		if (isNull(cd)) {
			return MAC_BP_IS_SRCH_TYP.DLV.value();
		}
		// 外注場所
		else {
			return MAC_BP_IS_SRCH_TYP.SPPL.value();
		}
	}

}