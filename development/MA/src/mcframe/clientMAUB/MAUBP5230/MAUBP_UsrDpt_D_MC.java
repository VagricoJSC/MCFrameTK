package mcframe.clientMAUB.MAUBP5230;

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
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_UsrDpt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_UsrDpt_D_MC extends MAUBP_UsrDpt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_UsrDpt_D_MC() {
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
	public MAUBP_UsrDpt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _dt;

	protected MCBeans _schd_no;

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param dt 適用日
	 */
	public void setRelateBeans(MCBeans dt) {
		_dt = dt;
		getUsrDpt_usr_cd_ListPutter().putBind(UsrCols.$i_dt, _dt);
		getUsrDpt_dpt_cd_ListPutter().putBind(DptCols.$i_dt, _dt);
	}

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 予定引継ぎでの実績登録と予定なしで実績登録できる画面で使用する。
	 * 引数の予定ＮＯの部品の値がnullでない場合、日付変更時に担当者・部門をクリアしない
	 * 
	 * @param dt 適用日
	 * @param schd_no 予定ＮＯ
	 */
	public void setRelateBeans(MCBeans dt, MCBeans schd_no) {
		_dt = dt;
		_schd_no = schd_no;
		getUsrDpt_usr_cd_ListPutter().putBind(UsrCols.$i_dt, _dt);
		getUsrDpt_dpt_cd_ListPutter().putBind(DptCols.$i_dt, _dt);
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (_dt != null) {
			((MCLCBeans) _dt).addLCListener(this);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _dt) {
			doBeans_dt_LC(info);
		}
		if (lc == columnUsrDpt_usr_cd) {
			doBeans_usr_cd_LC(info);
		}
	}

	/**
	 * 適用日が変更されたときに実行される。<br>
	 * <br>
	 * 担当者ＣＤをクリアする。<br>
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_dt_LC(MCEventInfo info) {
		clearUsr(info.getEventIndex());
		clearDpt(info.getEventIndex());
	}

	/**
	 * 担当者ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 担当者の部門ＣＤをセットする。<br>
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_usr_cd_LC(MCEventInfo info) {
		//部門に制限があり、入力された担当者の主務部門が制限されたものと相違する場合
		//エラーメッセージを表示せず、部門ＣＤをクリアする
		try{
			setValueEx(columnUsrDpt_dpt_cd, info.getEventIndex(), columnUsrDpt_def_dpt_cd.getValue(info.getEventIndex()));
		} 
		catch (MCException ex){
			setValueEx(columnUsrDpt_dpt_cd, info.getEventIndex(), null);
		}
	}
	
	/**
	 * 担当者ＣＤをクリアする。<br>
	 * 
	 * @param i イベント行のインデックス
	 */
	protected void clearUsr(int i) {
		// 実績で予定引継ぎ時はセルコンフィグで部門が入力不可になり、正しい部門へはサーバロジックで
		// 書き換える
		// 予定ＮＯがnullの場合（予定ＮＯと連携していない場合含む）のみ日付と連動してnullを設定する
		if (i < 0) {
			for (UsrDptR r : exceptBaseEmpty(UsrDptTable)) {
				if (isNull(MAUCP_BeansUtil.getValueOf(_schd_no, r.getGUIIndex()))) {
					setValueEx(columnUsrDpt_usr_cd, r.getGUIIndex(), null);
				}
			}
		}
		// 適用日が明細の場合
		else {
			if (isNull(MAUCP_BeansUtil.getValueOf(_schd_no, i))) {
				setValueEx(columnUsrDpt_usr_cd, i, null);
			}
		}
	}

	/**
	 * 部門ＣＤをクリアする。<br>
	 * 
	 * @param i イベント行のインデックス
	 */
	protected void clearDpt(int i) {
		// 実績で予定引継ぎ時はセルコンフィグで部門が入力不可になり、正しい部門へはサーバロジックで
		// 書き換える
		// 予定ＮＯがnullの場合（予定ＮＯと連携していない場合含む）のみ日付と連動してnullを設定する
		if (i < 0) {
			for (UsrDptR r : exceptBaseEmpty(UsrDptTable)) {
				if (isNull(MAUCP_BeansUtil.getValueOf(_schd_no, r.getGUIIndex()))) {
					setValueEx(columnUsrDpt_dpt_cd, r.getGUIIndex(), null);
				}
			}
		}
		// 適用日が明細の場合
		else {
			if (isNull(MAUCP_BeansUtil.getValueOf(_schd_no, i))) {
				setValueEx(columnUsrDpt_dpt_cd, i, null);
			}
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if ((column == columnUsrDpt_usr_cd || column == columnUsrDpt_dpt_cd) && isDefaultModeEditable(column)) {
			if (_dt != null && isNull(getBeansValue(_dt, index))) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

}