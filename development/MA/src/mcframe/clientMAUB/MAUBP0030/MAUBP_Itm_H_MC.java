package mcframe.clientMAUB.MAUBP0030;

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
import mcframe.clientCore.beans.list.MCListType;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
import mcframe.clientFXUC.FXUCP0150.FXUCP_BeansUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Itm_H"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Itm_H_MC extends MAUBP_Itm_H_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Itm_H_MC() {
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
	protected MAUBP_Itm_H_MC(mcframe.clientMAUB.MAUBP0030.ItmR row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_Itm START

		//FMCB CUSTOM_CONSTRUCTOR_ROW_Itm END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCRowBeans _sundryItmFlg;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param sundryItmFlg 諸口品ＦＬＧ部品
	 */
	public void setRelateBeans(MCRowBeans sundryItmFlg) {
		_sundryItmFlg = sundryItmFlg;
	}
	protected MCRowBeans getSundryItmFlg() {
		return _sundryItmFlg;
	}
	
	protected boolean _useNotReleaseItm = false;

	@Override
	protected void listInit() {
		super.listInit();
		getItm_itm_sub1_ListPutter().putBind("itm_cd", Itm_itm_cd);
		getItm_itm_sub2_ListPutter().putBind("itm_cd", Itm_itm_cd);
		getItm_itm_sub2_ListPutter().putBind("itm_sub1", Itm_itm_sub1);
		getItm_itm_sub3_ListPutter().putBind("itm_cd", Itm_itm_cd);
		getItm_itm_sub3_ListPutter().putBind("itm_sub1", Itm_itm_sub1);
		getItm_itm_sub3_ListPutter().putBind("itm_sub2", Itm_itm_sub2);
		
		// addIgnoreListBeansの設定
		Itm_itm_cd.addIgnoreListBeans(Itm_itm_sub1, Itm_itm_sub2, Itm_itm_sub3);
		Itm_itm_sub1.addIgnoreListBeans(Itm_itm_sub2, Itm_itm_sub3);
		Itm_itm_sub2.addIgnoreListBeans(Itm_itm_sub3);
	}

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		// リリースＦＬＧの設定
		if (Itm_itm_cd.getBaseRootPanel() instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase || _useNotReleaseItm == true) {
			mcframe.clientCore.beans.list.MCListPutter putter;
			putter = Itm_itm_cd.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_cd_ListPutter().getListLogicId())) {
				putter.putBind(ItmCols.$i_release_flg_on, true);
				putter.putBind(ItmCols.$i_release_flg_off, true);
			}
			putter = Itm_itm_sub1.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub1_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub1Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub1Cols.$i_release_flg_off, true);
			}
			putter = Itm_itm_sub2.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub2_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub2Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub2Cols.$i_release_flg_off, true);
			}
			putter = Itm_itm_sub3.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub3_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub3Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub3Cols.$i_release_flg_off, true);
			}
		}
	}

	// イベント処理

	@Override
	protected void listenerInit() {
		super.listenerInit();

		if (getSundryItmFlg() != null) {
			((MCNCBeans) getSundryItmFlg()).addNCListener(this);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);

		if (nc == getSundryItmFlg()) {
			doBeans_sundry_itm_flg_NC(info);
		}
	}

	/**
	 * 諸口品ＦＬＧが変更されたときに実行される。<br>
	 * <br>
	 * GUI 部品のモードを設定する。
	 * 
	 * @param info イベント情報
	 * @see #setItmNmGUIMode()
	 */
	protected void doBeans_sundry_itm_flg_NC(MCEventInfo info) {
		setItmNmGUIMode();
	}
	protected void setItmNmGUIMode() {
		setGUIMode(Itm_itm_nm);
	}
	protected void setGUIMode(MCModeBeans compo) {
		if (isDefaultModeEditable(compo)) {
			MCMode mode = getGUIMode(compo);
			if (mode != null) {
				compo.setMode(mode);
			}
			else {
				setDefaultMode(compo);
			}
		}
	}

	/**
	 * 指定された GUI 部品のモードを取得する。<br>
	 * 変更内容：
	 * 品名部品が入力可能なモードでも、連携する諸口品ＦＬＧがfalseの場合は入力不可にする。
	 * 
	 * @param compo GUI 部品
	 * @return モードまたは null
	 */
	@Override
	public MCMode getGUIMode(MCModeBeans compo) {
		if (compo == Itm_itm_nm && isDefaultModeEditable(compo)) {
			if (getSundryItmFlg() == null || !(boolean) getSundryItmFlg().getRowValue()) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getGUIMode(compo);
	}
	
	/**
	 * LCリスナを品目ＣＤ、枝番１～３に設定する。
	 * @param listener
	 */
	public void addItmLCListner(MCLCListener listener) {
		((MCLCBeans)Itm_itm_cd).addLCListener(listener);
		((MCLCBeans)Itm_itm_sub1).addLCListener(listener);
		((MCLCBeans)Itm_itm_sub2).addLCListener(listener);
		((MCLCBeans)Itm_itm_sub3).addLCListener(listener);
	}
	
	/**
	 * 品目の項目（品目ＣＤ、枝番１～３）であるかどうかを判定する。
	 * 
	 * @param b
	 */
	public boolean isItm(MCBeans b) {
		if (b == Itm_itm_cd || b == Itm_itm_sub1 || b == Itm_itm_sub2 || b == Itm_itm_sub3) {
			return true;
		}
		return false;
	}
	
	/**
	 * 品目が確定したかどうかを判定する。<p>
	 * セルコンフィグや行選択時、一覧ループ内でチェックするときには使用しないでください。
	 */
	public boolean isItmFix() {
		Comparable<?> v = getValueOf(Itm_itm_sub3);
		return !isNull(v) && Itm_itm_sub3.checkValue(v).isEmpty();
	}

	/**
	 * 品目が確定したかどうかを判定する。ライト版。<p>
	 * セルコンフィグや行選択時、一覧ループ内でチェックするときに使用します。
	 */
	public boolean isItmFixLight() {
		if (isNull(getValueOf(Itm_itm_sub3))
				|| isNull(getValueOf(Itm_itm_cd))
				|| isNull(getValueOf(Itm_itm_sub1))
				|| isNull(getValueOf(Itm_itm_sub2))
				) {
			return false;
		}
		return true;
	}

	@Override
	public void setENABLE_SRCHStatus() {
		super.setENABLE_SRCHStatus();
		
		setLstTyp();
	}

	@Override
	public void setENABLEStatus() {
		super.setENABLEStatus();

		setItmNumSubMode();
		setItmNmGUIMode();
		setLstTyp();
	}


	@Override
	public void setDISABLEStatus() {
		super.setDISABLEStatus();

		setItmNumSubMode();
	}

	@Override
	public void setREAD_ONLYStatus() {
		super.setREAD_ONLYStatus();

		setItmNumSubMode();
	}

	@Override
	public void setREQUIREDStatus() {
		super.setREQUIREDStatus();

		setItmNumSubMode();
		setItmNmGUIMode();
	}

	@Override
	public void setINVISIBLEStatus() {
		super.setINVISIBLEStatus();

		setItmNumSubMode();
	}

	@Override
	public void doItm_itm_cd_LC(MCEventInfo info) {
		super.doItm_itm_cd_LC(info);

		setItmNumSubMode();
	}

	@Override
	public void doItm_itm_sub1_LC(MCEventInfo info) {
		super.doItm_itm_sub1_LC(info);

		setItmNumSubMode();
	}

	@Override
	public void doItm_itm_sub2_LC(MCEventInfo info) {
		super.doItm_itm_sub2_LC(info);

		setItmNumSubMode();
	}

	@Override
	public void doItm_itm_sub3_LC(MCEventInfo info) {
		super.doItm_itm_sub3_LC(info);

		setItmNumSubMode();
	}

	/**
	 * 枝番のモードを設定する。
	 */
	protected void setItmNumSubMode() {
		setItmNumSubMode(ItmR.$itm_sub1, Itm_itm_sub1);
		setItmNumSubMode(ItmR.$itm_sub2, Itm_itm_sub2);
		setItmNumSubMode(ItmR.$itm_sub3, Itm_itm_sub3);
	}

	/**
	 * 枝番のモードを設定する。
	 *
	 * @param name 項目名
	 * @param sub 枝番の GUI 部品
	 */
	protected void setItmNumSubMode(String name, MCModeBeans sub) {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			return;
		}

		if (isDefaultModeEditable(sub)) {
			ItmR itm = getItmR();
			boolean e = true;
			String[] a = {ItmR.$itm_sub1, ItmR.$itm_sub2, ItmR.$itm_sub3};
			for (String n : a) {
				if (isSame(name, n)) {
					break;
				}
				if (isNull(itm.getString(n))) {
					e = false;
					break;
				}
			}
			if (!e || isNull(itm.itm_cd())) {
				sub.setMode(MCMode.READ_ONLY);
			}
			else if (!isNull(itm.itm_nm())) {
				sub.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(sub);
			}

		}
	}

	/**
	 * 品目、枝番のモードを設定する。
	 *
	 * @param name 項目名
	 * @param sub 枝番の GUI 部品
	 */
	protected void setLstTyp() {
		if (isSame(getStatus(), ENABLE_SRCH)) {
			Itm_itm_cd.setListType(MCListType.FREE);
			setPluralValueEnable(Itm_itm_cd, true);

			Itm_itm_sub1.setListType(MCListType.FREE);
			setPluralValueEnable(Itm_itm_sub1, true);

			Itm_itm_sub2.setListType(MCListType.FREE);
			setPluralValueEnable(Itm_itm_sub2, true);

			Itm_itm_sub3.setListType(MCListType.FREE);
			setPluralValueEnable(Itm_itm_sub3, true);
			
			setPluralValueEnable(Itm_itm_nm, true);
			setListLogicBind();
		}
		else if (isSame(getStatus(), ENABLE)) {
			Itm_itm_cd.setListType(MCListType.STRICT);
			setPluralValueEnable(Itm_itm_cd, false);
			
			Itm_itm_sub1.setListType(MCListType.STRICT);
			setPluralValueEnable(Itm_itm_sub1, false);
			
			Itm_itm_sub2.setListType(MCListType.STRICT);
			setPluralValueEnable(Itm_itm_sub2, false);

			Itm_itm_sub3.setListType(MCListType.STRICT);
			setPluralValueEnable(Itm_itm_sub3, false);			
			setPluralValueEnable(Itm_itm_nm, false);
		}
	}
	
	protected void setListLogicBind() {
		// 検索条件で使用される場合は、リストロジックの定義を書かなくてもいいように、全件、リリースＦＬＧ、諸口の制御をする
		mcframe.clientCore.beans.list.MCListPutter putter_itm_cd = Itm_itm_cd.getListConfig().getListPutter();
		if (isSame(putter_itm_cd.getListLogicId(), getItm_itm_cd_ListPutter().getListLogicId())) {
			putter_itm_cd.putBind(ItmCols.$i_sundry_itm_nm_rem_flg, true);
		}
		mcframe.clientCore.beans.list.MCListPutter putter_itm_sub1 = Itm_itm_sub1.getListConfig().getListPutter();
		if (isSame(putter_itm_sub1.getListLogicId(), getItm_itm_sub1_ListPutter().getListLogicId())) {
			putter_itm_cd.putBind(ItmSub1Cols.$i_sundry_itm_nm_rem_flg, true);
		}
		mcframe.clientCore.beans.list.MCListPutter putter_itm_sub2 = Itm_itm_sub2.getListConfig().getListPutter();
		if (isSame(putter_itm_sub2.getListLogicId(), getItm_itm_sub2_ListPutter().getListLogicId())) {
			putter_itm_cd.putBind(ItmSub2Cols.$i_sundry_itm_nm_rem_flg, true);
		}
		mcframe.clientCore.beans.list.MCListPutter putter_itm_sub3 = Itm_itm_sub3.getListConfig().getListPutter();
		if (isSame(putter_itm_sub3.getListLogicId(), getItm_itm_sub3_ListPutter().getListLogicId())) {
			putter_itm_cd.putBind(ItmSub3Cols.$i_sundry_itm_nm_rem_flg, true);
		}
	}
	/**
	 * リリースしていない品目を入力できるようにする場合はtrueを指定する。
	 * デフォルトはfalse。
	 * 
	 * @param useFlg
	 */
	public void setUseNotReleaseItm(boolean useFlg) {
		_useNotReleaseItm = useFlg;
		partsInitSub();
	}

}