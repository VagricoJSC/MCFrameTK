package mcframe.clientMSUA.MSUAP1120;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5190.*;

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
import mcframe.clientCore.beans.list.MCListPutter;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlSpplCols;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_ItmDtlBp"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_ItmDtlBp_MC extends MSUAP_ItmDtlBp_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_ItmDtlBp_MC() {
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
	public MSUAP_ItmDtlBp_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		Rslt_bp_grp_p_PPanel.afterCallParts_sub();
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		removeBpNm();
		doAccept();
	}

	@Override
	public void setOpenFocus() {
		// タブがある場合はこのメソッドを呼ばないとフィールドにフォーカスされない
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				ItmDtlSpplCols.$i_master_dt, ItmDtlSpplCols.$i_master_dt2, ItmDtlSpplCols.$i_itm_cd, ItmDtlSpplCols.$i_itm_sub1, ItmDtlSpplCols.$i_itm_sub2,
				ItmDtlSpplCols.$i_itm_sub3, "itm_nm", ItmDtlSpplCols.$i_wg_cd, "wg_nm", ItmDtlMakerCols.$i_sppl_cd, "sppl_nm",
				ItmDtlSpplCols.$i_inc_outsrc_flg, "sppl_flg", "maker_flg",
				ItmDtlSpplCols.$i_bp_cd, ItmDtlSpplCols.$i_bp_nm, ItmDtlSpplCols.$i_ein,
				ItmDtlSpplCols.$i_bp_alt_nm1, ItmDtlSpplCols.$i_bp_alt_nm2, ItmDtlSpplCols.$i_bp_alt_nm3, ItmDtlSpplCols.$i_bp_alt_nm4,
				ItmDtlSpplCols.$i_cntry_cd, ItmDtlSpplCols.$i_cntry_nm, ItmDtlSpplCols.$i_foreign_flg, ItmDtlSpplCols.$i_area_cd,
				ItmDtlSpplCols.$i_area_nm, ItmDtlSpplCols.$i_memo1, ItmDtlSpplCols.$i_memo2, ItmDtlSpplCols.$i_memo3,
				ItmDtlSpplCols.$i_bp_grp_flg1, ItmDtlSpplCols.$i_bp_grp_cd1, ItmDtlSpplCols.$i_bp_grp_nm1,
				ItmDtlSpplCols.$i_bp_grp_flg2, ItmDtlSpplCols.$i_bp_grp_cd2, ItmDtlSpplCols.$i_bp_grp_nm2,
				ItmDtlSpplCols.$i_bp_grp_flg3, ItmDtlSpplCols.$i_bp_grp_cd3, ItmDtlSpplCols.$i_bp_grp_nm3,
				ItmDtlSpplCols.$i_bp_grp_flg4, ItmDtlSpplCols.$i_bp_grp_cd4, ItmDtlSpplCols.$i_bp_grp_nm4,
				ItmDtlSpplCols.$i_bp_grp_flg5, ItmDtlSpplCols.$i_bp_grp_cd5, ItmDtlSpplCols.$i_bp_grp_nm5,
				ItmDtlSpplCols.$i_bp_grp_flg6, ItmDtlSpplCols.$i_bp_grp_cd6, ItmDtlSpplCols.$i_bp_grp_nm6,
				ItmDtlSpplCols.$i_bp_grp_flg7, ItmDtlSpplCols.$i_bp_grp_cd7, ItmDtlSpplCols.$i_bp_grp_nm7,
				ItmDtlSpplCols.$i_bp_grp_flg8, ItmDtlSpplCols.$i_bp_grp_cd8, ItmDtlSpplCols.$i_bp_grp_nm8,
				ItmDtlSpplCols.$i_bp_grp_flg9, ItmDtlSpplCols.$i_bp_grp_cd9, ItmDtlSpplCols.$i_bp_grp_nm9,
				ItmDtlSpplCols.$i_bp_grp_flg10, ItmDtlSpplCols.$i_bp_grp_cd10, ItmDtlSpplCols.$i_bp_grp_nm10,
				ItmDtlSpplCols.$i_asset_mng_typ, ItmDtlSpplCols.$i_manual_sppl_flg, ItmDtlSpplCols.$i_mode_nullval_flg,
				ItmDtlSpplCols.$i_sundry_bp_nm_rem_flg, ItmDtlSpplCols.$i_purc_basis_typ_flg
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				ItmDtlSpplCols.$m_master_dt, ItmDtlSpplCols.$m_itm_cd,
				ItmDtlSpplCols.$m_itm_sub1, ItmDtlSpplCols.$m_itm_sub2, ItmDtlSpplCols.$m_itm_sub3,
				ItmDtlSpplCols.$m_wg_cd, ItmDtlMakerCols.$m_sppl_cd,
				ItmDtlSpplCols.$m_sppl_flg, ItmDtlMakerCols.$m_maker_flg, ItmDtlMakerCols.$m_sppl_cd
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();

		setBpGrpFlg();
		setBpGrpCdNmMode();
	}

	@Override
	public void setCondition(MCRow row, String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().bp_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().bp_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setBpGrpFlg();
		setBpGrpCdNmMode();
	}

	@Override
	protected void saveInitValue(MCRow row) {
		super.saveInitValue(row);
	}

	/**
	 * 取引先分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setBpGrpFlg() {
		getCndR().bp_grp_flg1(true);
		getCndR().bp_grp_flg2(true);
		getCndR().bp_grp_flg3(true);
		getCndR().bp_grp_flg4(true);
		getCndR().bp_grp_flg5(true);
		getCndR().bp_grp_flg6(true);
		getCndR().bp_grp_flg7(true);
		getCndR().bp_grp_flg8(true);
		getCndR().bp_grp_flg9(true);
		getCndR().bp_grp_flg10(true);
	}

	/**
	 * 取引先分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setBpGrpCdNmMode() {
		setBpGrpCdNmMode(Cnd_bp_grp_cd1, Cnd_bp_grp_nm1, getCndR().bp_grp_flg1());
		setBpGrpCdNmMode(Cnd_bp_grp_cd2, Cnd_bp_grp_nm2, getCndR().bp_grp_flg2());
		setBpGrpCdNmMode(Cnd_bp_grp_cd3, Cnd_bp_grp_nm3, getCndR().bp_grp_flg3());
		setBpGrpCdNmMode(Cnd_bp_grp_cd4, Cnd_bp_grp_nm4, getCndR().bp_grp_flg4());
		setBpGrpCdNmMode(Cnd_bp_grp_cd5, Cnd_bp_grp_nm5, getCndR().bp_grp_flg5());
		setBpGrpCdNmMode(Cnd_bp_grp_cd6, Cnd_bp_grp_nm6, getCndR().bp_grp_flg6());
		setBpGrpCdNmMode(Cnd_bp_grp_cd7, Cnd_bp_grp_nm7, getCndR().bp_grp_flg7());
		setBpGrpCdNmMode(Cnd_bp_grp_cd8, Cnd_bp_grp_nm8, getCndR().bp_grp_flg8());
		setBpGrpCdNmMode(Cnd_bp_grp_cd9, Cnd_bp_grp_nm9, getCndR().bp_grp_flg9());
		setBpGrpCdNmMode(Cnd_bp_grp_cd10, Cnd_bp_grp_nm10, getCndR().bp_grp_flg10());
	}

	/**
	 * 取引先分類フラグの値に応じて、取引先分類ＣＤ・名のデフォルトモードを設定する
	 * @param cdBeans 取引先分類ＣＤの部品
	 * @param nmBeans 取引先分類名の部品
	 * @param flg 取引先分類フラグの値(true/false)
	 */
	protected void setBpGrpCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
		if (flg) {
			setDefaultMode(cdBeans);
			setDefaultMode(nmBeans);
		}
		else {
			cdBeans.setMode(MCMode.READ_ONLY);
			nmBeans.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 名称不要フラグと諸口先フラグに応じて、取引先名を削除する
	 */
	protected void removeBpNm() {
		if (getCndR().getBooleanNE(ItmDtlSpplCols.$i_sundry_bp_nm_rem_flg)) {
			MCList<MCRow> sundryList = MCList.create(MCRow.class);
			// 重複は考慮していない
			sundryList.addAll(getRsltL().subList(RsltR.$cst_sundry_flg, true));
			sundryList.addAll(getRsltL().subList(RsltR.$dlv_sundry_flg, true));
			for (MCRow r : sundryList) {
				getRsltL().setStringNE(getRsltL().indexOf(r), ItmDtlSpplCols.$o_bp_nm, null);
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}

	@Override
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
	}

	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");
		}
		return Cnd_bp_cd_p;
	}

	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	@Override
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isDestEnabled(this)) {
			setComponentInvisibleAllStatus(columnRslt_dest_flg);
		}
		if (!isMakerEnabled(this)) {
			setComponentInvisibleAllStatus(Cnd_maker_flg, columnRslt_maker_flg);
		}
		if (!isCredEnabled(this)) {
			setComponentInvisibleAllStatus(columnRslt_cred_flg);
		}
	}

}