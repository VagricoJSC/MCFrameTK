package mcframe.clientMAUB.MAUBP5120;

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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_StrLn_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_StrLn_D_MC extends MAUBP_StrLn_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_StrLn_D_MC() {
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
	public MAUBP_StrLn_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _loc;
	protected MCBeans _strLnTgtFlg;

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param strLnTgtFlg 棚・ライン対象ＦＬＧ
	 */
	public void setRelateBeans(MCBeans loc, MCBeans strLnTgtFlg) {
		_loc = loc;
		_strLnTgtFlg = strLnTgtFlg;

		getStrLn_str_ln_cd_ListPutter().putBind(StrLnCols.$i_loc_cd, _loc);
	}
	protected MCBeans getLoc() {
		return _loc;
	}
	protected MCBeans getStrLnTgtFlg() {
		return _strLnTgtFlg;
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getLoc() != null) {
			((MCVCBeans) getLoc()).addVCListener(this);
		}
		if (getStrLnTgtFlg() != null) {
			((MCVCBeans) getStrLnTgtFlg()).addVCListener(this);
		}
	}

	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		Boolean flg = super.doVCEvent(vc, info);
		if (flg && (vc == getLoc() || vc == getStrLnTgtFlg())) {
			//locのリストロジックでstr_ln_cdが設定されることがあるため、VCイベントでクリアする
			clearStrLn(info.getEventIndex());
		}

		return flg;
	}

	/**
	 * 棚・ラインＣＤをクリアする。<br>
	 * 
	 * @param i イベント行のインデックス
	 */
	protected void clearStrLn(int i) {
		// 棚・ライン対象ＦＬＧがヘッダの場合
		if (i < 0) {
			for (StrLnR r : exceptBaseEmpty(StrLnTable)) {
				setValueEx(columnStrLn_str_ln_cd, r.getGUIIndex(), null);
				setValueEx(columnStrLn_str_ln_cd_none_flg, r.getGUIIndex(), false);
			}
		}
		// 棚・ライン対象ＦＬＧが明細の場合
		else {
			setValueEx(columnStrLn_str_ln_cd, i, null);
			setValueEx(columnStrLn_str_ln_cd_none_flg, i, false);
		}
	}

	@Override
	public void doStrLn_str_ln_cd_LC(MCEventInfo info) {
		super.doStrLn_str_ln_cd_LC(info);

		StrLnR r = getStrLnL().get(info.getEventIndex());
		if (!isNull(r.str_ln_cd())) {
			setValueEx(columnStrLn_str_ln_cd_none_flg, info.getEventIndex(), false);
		}
	}

	@Override
	public void doStrLn_str_ln_cd_none_flg_NC(MCEventInfo info) {
		super.doStrLn_str_ln_cd_none_flg_NC(info);
		
		StrLnR r = getStrLnL().get(info.getEventIndex());
		if (r.str_ln_cd_none_flg()) {
			setValueEx(columnStrLn_str_ln_cd, info.getEventIndex(), null);
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		StrLnTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnStrLn_str_ln_cd || column == columnStrLn_str_ln_cd_none_flg) {
			boolean flg = (boolean)getBeansValue(getStrLnTgtFlg(), index);
			if (!flg) {
				return MCMode.READ_ONLY;
			}
		}
		if (column == columnStrLn_str_ln_cd) {
			StrLnR r = getStrLnL().get(index);
			if (r.str_ln_cd_none_flg()) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}