package mcframe.clientMAUB.MAUBP5030;

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
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Itm_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Itm_D_MC extends MAUBP_Itm_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Itm_D_MC() {
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
	public MAUBP_Itm_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	protected MCBeans _sundryItmFlg;
	protected MCBeans _stkMngTyp;

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param sundryItmFlg 諸口品ＦＬＧ部品
	 */
	public void setRelateBeans(MCBeans sundryItmFlg) {
		_sundryItmFlg = sundryItmFlg;
	}

	/**
	 * 連携に必須の部品を設定する。<br>
	 * setupPartsにて設定することを想定。
	 * 
	 * @param sundryItmFlg 諸口品ＦＬＧ部品
	 * @param stkMngTyp 在庫管理区分部品
	 */
	public void setRelateBeans(MCBeans sundryItmFlg, MCBeans stkMngTyp) {
		_sundryItmFlg = sundryItmFlg;
		_stkMngTyp = stkMngTyp;
	}

	protected MCBeans getSundryItmFlg() {
		return _sundryItmFlg;
	}

	protected MCBeans getStkMngTyp() {
		return _stkMngTyp;
	}
	
	protected boolean _useNotReleaseItm = false;
	
//	@Override
//	protected void linkBeansToISPanel() {
//		super.linkBeansToISPanel();
//		linkBeansToISPanel(getItm_itm_cd_ListPutter());
//	}

	@Override
	protected void listInit() {
		super.listInit();
		getItm_itm_sub1_ListPutter().putBind("itm_cd", columnItm_itm_cd);
		getItm_itm_sub2_ListPutter().putBind("itm_cd", columnItm_itm_cd);
		getItm_itm_sub2_ListPutter().putBind("itm_sub1", columnItm_itm_sub1);
		getItm_itm_sub3_ListPutter().putBind("itm_cd", columnItm_itm_cd);
		getItm_itm_sub3_ListPutter().putBind("itm_sub1", columnItm_itm_sub1);
		getItm_itm_sub3_ListPutter().putBind("itm_sub2", columnItm_itm_sub2);
		
		// addIgnoreListBeansの設定
		columnItm_itm_cd.addIgnoreListBeans(columnItm_itm_sub1, columnItm_itm_sub2, columnItm_itm_sub3);
		columnItm_itm_sub1.addIgnoreListBeans(columnItm_itm_sub2, columnItm_itm_sub3);
		columnItm_itm_sub2.addIgnoreListBeans(columnItm_itm_sub3);
	}

	@Override
	protected void partsInit() {
		super.partsInit();

		partsInitSub();
	}

	protected void partsInitSub() {
		// リリースＦＬＧの設定ｆ
		if (columnItm_itm_cd.getBaseRootPanel() instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase || _useNotReleaseItm == true) {
			mcframe.clientCore.beans.list.MCListPutter putter;
			putter = columnItm_itm_cd.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_cd_ListPutter().getListLogicId())) {
				putter.putBind(ItmCols.$i_release_flg_on, true);
				putter.putBind(ItmCols.$i_release_flg_off, true);
			}
			putter = columnItm_itm_sub1.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub1_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub1Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub1Cols.$i_release_flg_off, true);
			}
			putter = columnItm_itm_sub2.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub2_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub2Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub2Cols.$i_release_flg_off, true);
			}
			putter = columnItm_itm_sub3.getListConfig().getListPutter();
			if (isSame(putter.getListLogicId(), getItm_itm_sub3_ListPutter().getListLogicId())) {
				putter.putBind(ItmSub3Cols.$i_release_flg_on, true);
				putter.putBind(ItmSub3Cols.$i_release_flg_off, true);
			}
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
	}
	
	/**
	 * LCリスナを品目ＣＤ、枝番１～３に設定する。
	 * @param listener
	 */
	public void addItmLCListner(MCLCListener listener) {
		((MCLCBeans)columnItm_itm_cd).addLCListener(listener);
		((MCLCBeans)columnItm_itm_sub1).addLCListener(listener);
		((MCLCBeans)columnItm_itm_sub2).addLCListener(listener);
		((MCLCBeans)columnItm_itm_sub3).addLCListener(listener);
	}
	
	/**
	 * 品目の項目（品目ＣＤ、枝番１～３）であるかどうかを判定する。
	 * 
	 * @param b
	 */
	public boolean isItm(MCBeans b) {
		if (b == columnItm_itm_cd || b == columnItm_itm_sub1 || b == columnItm_itm_sub2 || b == columnItm_itm_sub3) {
			return true;
		}
		return false;
	}
	
	/**
	 * 品目が確定したかどうかを判定する。<p>
	 * セルコンフィグや行選択時、一覧ループ内でチェックするときには使用しないでください。
	 * @param index
	 */
	public boolean isItmFix(int index) {
		Comparable<?> v = getValueOf(columnItm_itm_sub3, index);
		return !isNull(v) && columnItm_itm_sub3.checkValue(v, index);
	}

	/**
	 * 品目が確定したかどうかを判定する。ライト版。<p>
	 * セルコンフィグや行選択時、一覧ループ内でチェックするときに使用します。
	 * @param index
	 */
	public boolean isItmFixLight(int index) {
		if (isNull(getValueOf(columnItm_itm_sub3, index))
				|| isNull(getValueOf(columnItm_itm_cd, index))
				|| isNull(getValueOf(columnItm_itm_sub1, index))
				|| isNull(getValueOf(columnItm_itm_sub2, index))
				) {
			return false;
		}
		return true;
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (isDefaultModeEditable(column)) {
			ItmR row = getItmL().get(index);
			boolean cn = isNull(row.itm_cd());
			boolean nn = isNull(row.itm_nm());
			if (column == columnItm_itm_sub1) {
				if (cn) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnItm_itm_sub2) {
				if (cn || isNull(row.itm_sub1())) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnItm_itm_sub3) {
				if (cn || isNull(row.itm_sub2())) {
					return MCMode.READ_ONLY;
				}
				else if (!nn) {
					return MCMode.ENABLE;
				}
			}
			else if (column == columnItm_itm_nm) {
				if (getSundryItmFlg() == null || !(Boolean) getBeansValue(getSundryItmFlg(), index)) {
					return MCMode.READ_ONLY;
				}
				else if (getStkMngTyp() != null && MAC_STK_MNG_TYP.isMNG((String)getBeansValue(getStkMngTyp(), index))) {
					return MCMode.READ_ONLY;
				}
			}
		}
		return super.getCellMode(index, column);
	}

}