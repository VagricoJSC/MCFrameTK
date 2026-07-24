package mcframe.clientMAUB.MAUBP0320;

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
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientCore.beans.list.MCListType;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_UsrDpt_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_UsrDpt_H_MC extends MAUBP_UsrDpt_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_UsrDpt_H_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_UsrDpt_H_MC(mcframe.clientMAUB.MAUBP0320.UsrDptR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_UsrDpt START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_UsrDpt END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _dt;

	protected MCRowBeans _schd_no;

	/**
	 * 連携する部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param dt 適用日
	 */
	public void setRelateBeans(MCRowBeans dt) {
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
	public void setRelateBeans(MCRowBeans dt, MCRowBeans schd_no) {
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
			((MCLCBeans)_dt).addLCListener(this);
		}
		if (_schd_no != null) {
			((MCLCBeans)_schd_no).addLCListener(this);
		}
		UsrDpt_usr_cd.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _dt) {
			doBeans_dt_LC(info);
		}
		if (lc == _schd_no) {
			doBeans_schd_no_LC(info);
		}
		if (lc == UsrDpt_usr_cd) {
			doBeans_usr_cd_LC(info);
		}
	}

	/**
	 * 適用日が変更されたときに実行される。<br>
	 * <br>
	 * 担当者ＣＤをクリアする。<br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_dt_LC(MCEventInfo info) {

		// 予定ＮＯと連携する：
		// 実績で予定引継ぎ時はREAD_ONLYステータスを設定しており、正しい部門へはサーバロジックで書き換える
		// 予定ＮＯがnullの場合のみ日付と連動してnullを設定する
		// 予定ＮＯと連携しない：
		// 日付がクリアされたとき連動してnullを設定する
		if (isNull(MAUCP_BeansUtil.getValueOf(_dt)) || _schd_no != null && isNull(MAUCP_BeansUtil.getValueOf(_schd_no))) {
			setValueEx(UsrDpt_usr_cd, null);
			setValueEx(UsrDpt_dpt_cd, null);
		}

		setGUIMode();
	}

	/**
	 * 予定ＮＯが変更されたときに実行される。<br>
	 * <br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_schd_no_LC(MCEventInfo info) {
		setGUIMode();
	}

	/**
	 * 担当者ＣＤが変更されたときに実行される。<br>
	 * <br>
	 * 担当者の部門ＣＤをセットしGUI部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setGUIMode()
	 */
	protected void doBeans_usr_cd_LC(MCEventInfo info) {
		//部門に制限があり、入力された担当者の主務部門が制限されたものと相違する場合
		//エラーメッセージを表示せず、部門ＣＤをクリアする
		try{
			setValueEx(UsrDpt_dpt_cd, UsrDpt_def_dpt_cd.getValue());
		} 
		catch (MCException ex){
			setValueEx(UsrDpt_dpt_cd, null);
		}
	
		setGUIMode();
	}

	// モード設定

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();
		setGUIMode();
	}

	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();
		setGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();
		setGUIMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();
		setGUIMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();
		setGUIMode();
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 変更内容：
	 * 担当者ＣＤが入力可能なモードでも、連携する適用日がnullの場合は入力不可にする。
	 * 部門ＣＤが入力可能なモードでも、担当者ＣＤがnullの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if ((compo == UsrDpt_usr_cd || compo == UsrDpt_dpt_cd) && isDefaultModeEditable(compo)) {
			if (_dt != null && isNull(_dt.getRowValue())) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}

}