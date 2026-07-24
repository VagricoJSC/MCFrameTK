package mcframe.clientMAUA.MAUAP1090;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.ItmDtlCols;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_ItmDtl"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_ItmDtl_MC extends MAUAP_ItmDtl_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_ItmDtl_MC() {
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
	public MAUAP_ItmDtl_MC(String name) {
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
		setCndTarRToCndR(getCndTarR());
		setLocToCndR();
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		setCndTarRToCndR(getCndTarR());
		setLocToCndR();
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
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
				ItmDtlCols.$i_mfg_flg, ItmDtlCols.$i_purc_flg, ItmDtlCols.$i_outsrc_flg, ItmDtlCols.$i_wg_xfr_flg, ItmDtlCols.$i_dt,
				ItmDtlCols.$i_itm_cd, ItmDtlCols.$i_itm_sub1, ItmDtlCols.$i_itm_sub2, ItmDtlCols.$i_itm_sub3,
				ItmDtlCols.$i_itm_nm, ItmDtlCols.$i_itm_alt_nm1, ItmDtlCols.$i_itm_alt_nm2, ItmDtlCols.$i_itm_alt_nm3, ItmDtlCols.$i_itm_alt_nm4,
				ItmDtlCols.$i_itm_typ, ItmDtlCols.$i_itm_typ_d_cd, ItmDtlCols.$i_itm_typ_d_nm, ItmDtlCols.$i_stk_mng_typ, ItmDtlCols.$i_asset_mng_typ,
				ItmDtlCols.$i_sundry_itm_flg_on, ItmDtlCols.$i_sundry_itm_flg_off, ItmDtlCols.$i_foreign_flg,
				ItmDtlCols.$i_mfg_loc_cd, ItmDtlCols.$i_mfg_loc_nm, ItmDtlCols.$i_rqst_loc_cd, ItmDtlCols.$i_rqst_loc_nm,
				ItmDtlCols.$i_site_cd, ItmDtlCols.$i_site_nm, ItmDtlCols.$i_lg_grp_cd, ItmDtlCols.$i_lg_grp_nm,
				ItmDtlCols.$i_alloc_grp_cd, ItmDtlCols.$i_alloc_grp_nm, ItmDtlCols.$i_loc_grp_cd, ItmDtlCols.$i_loc_grp_nm,
				ItmDtlCols.$i_loc_mng_typ, ItmDtlCols.$i_sppl_cd, ItmDtlCols.$i_sppl_nm, ItmDtlCols.$i_ein,
				ItmDtlCols.$i_sppl_alt_nm1, ItmDtlCols.$i_sppl_alt_nm2, ItmDtlCols.$i_sppl_alt_nm3, ItmDtlCols.$i_sppl_alt_nm4,
				ItmDtlCols.$i_wg_cd, ItmDtlCols.$i_wg_nm, ItmDtlCols.$i_cntry_cd, ItmDtlCols.$i_cntry_nm, ItmDtlCols.$i_area_cd, ItmDtlCols.$i_area_nm
				, "get_sppl_flg", "get_maker_flg", "dt2", "inc_outsrc_flg", "manual_sppl_flg"
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				ItmDtlCols.$m_mfg_flg, ItmDtlCols.$m_purc_flg, ItmDtlCols.$m_outsrc_flg, ItmDtlCols.$m_wg_xfr_flg
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();

		setItmGrpFlg();
		setSpplGrpFlg();
		setItmGrpCdNmMode();
		setSpplGrpCdNmMode();
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);

		if (!isNull(row)) {
			if (GET_LIST == mode) {
				getCndR().itm_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().itm_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setItmGrpFlg();
		setSpplGrpFlg();
		setItmGrpCdNmMode();
		setSpplGrpCdNmMode();
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if(!containTarFlg(row)) {
			row.setBooleanNE(ItmDtlCols.$i_mfg_flg, true);
			row.setBooleanNE(ItmDtlCols.$i_purc_flg, true);
			row.setBooleanNE(ItmDtlCols.$i_outsrc_flg, true);
			row.setBooleanNE(ItmDtlCols.$i_wg_xfr_flg, true);
		}
		// 画面のloc_cd, loc_nmは1つにしたいため、実装で集約する
		String locCd = row.getStringNE(ItmDtlCols.$i_mfg_loc_cd);
		String locNm = row.getStringNE(ItmDtlCols.$i_mfg_loc_nm);
		if (isNullAnd(locCd, locNm)) {
			locCd = row.getStringNE(ItmDtlCols.$i_rqst_loc_cd);
			locNm = row.getStringNE(ItmDtlCols.$i_rqst_loc_nm);
		}
		_initVMap.put(CndR.$loc_cd, locCd);
		_initVMap.put(CndR.$loc_nm, locNm);

		setSundryItmFlg(row);

		super.saveInitValue(row);
	}

	@Override
	protected void setInitValue() {
		super.setInitValue();
		// CndTarブロックについての設定
		setInitValue(getCndTarR());
	}

	@Override
	protected void saveInitMode(MCRow row) {
		if (containTarFlg(row)) {
			row.setStringNE(ItmDtlCols.$m_mfg_flg, "READ_ONLY");
			row.setStringNE(ItmDtlCols.$m_purc_flg, "READ_ONLY");
			row.setStringNE(ItmDtlCols.$m_outsrc_flg, "READ_ONLY");
			row.setStringNE(ItmDtlCols.$m_wg_xfr_flg, "READ_ONLY");
		}

		super.saveInitMode(row);
	}

	@Override
	protected void setInitMode() {
		super.setInitMode();
		// CndTarブロックについての設定
		setInitMode(getCndTarR());
	}

	/**
	 * CndTarブロックのフラグに１つ以上trueのものがあるかどうかを判定する
	 * @param row CndTarR
	 * @return trueのフラグが１つ以上ある場合はtrueを返す
	 */
	protected boolean containTarFlg(MCRow row) {
		boolean mfg = row.getBooleanNE(ItmDtlCols.$i_mfg_flg);
		boolean purc = row.getBooleanNE(ItmDtlCols.$i_purc_flg);
		boolean outsrc = row.getBooleanNE(ItmDtlCols.$i_outsrc_flg);
		boolean wgxfr = row.getBooleanNE(ItmDtlCols.$i_wg_xfr_flg);

		return (mfg || purc || outsrc || wgxfr);
	}

	/**
	 * CndTarRの情報をCndRに設定する
	 * @param row CndTarR
	 */
	protected void setCndTarRToCndR(MCRow row) {
		if (!isNull(row)) {
			getCndR().setBooleanNE(ItmDtlCols.$i_mfg_flg, row.getBoolean(ItmDtlCols.$i_mfg_flg));
			getCndR().setBooleanNE(ItmDtlCols.$i_purc_flg, row.getBooleanNE(ItmDtlCols.$i_purc_flg));
			getCndR().setBooleanNE(ItmDtlCols.$i_outsrc_flg, row.getBooleanNE(ItmDtlCols.$i_outsrc_flg));
			getCndR().setBooleanNE(ItmDtlCols.$i_wg_xfr_flg, row.getBooleanNE(ItmDtlCols.$i_wg_xfr_flg));
		}
	}

	/**
	 * 場所情報をCndRに設定する
	 */
	protected void setLocToCndR() {
		// 画面のloc_cd, loc_nmは1つにしたいため、実装で振り分ける
		String locCd = getCndR().getStringNE(CndR.$loc_cd);
		String locNm = getCndR().getStringNE(CndR.$loc_nm);
		getCndR().addStringColumn(ItmDtlCols.$i_mfg_loc_cd, locCd);
		getCndR().addStringColumn(ItmDtlCols.$i_mfg_loc_nm, locNm);
		getCndR().addStringColumn(ItmDtlCols.$i_rqst_loc_cd, locCd);
		getCndR().addStringColumn(ItmDtlCols.$i_rqst_loc_nm, locNm);
	}

	/**
	 * 諸口品ＦＬＧのデフォルト値を設定する
	 */
	protected void setSundryItmFlg(MCRow row) {
		if (!row.contains(ItmDtlCols.$i_sundry_itm_flg_on) && !row.contains(ItmDtlCols.$i_sundry_itm_flg_off)) {
			row.setBooleanNE(ItmDtlCols.$i_sundry_itm_flg_on, true);
			row.setBooleanNE(ItmDtlCols.$i_sundry_itm_flg_off, true);
		}
	}

	/**
	 * 品目分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setItmGrpFlg() {
		getCndR().itm_grp_flg1(true);
		getCndR().itm_grp_flg2(true);
		getCndR().itm_grp_flg3(true);
		getCndR().itm_grp_flg4(true);
		getCndR().itm_grp_flg5(true);
		getCndR().itm_grp_flg6(true);
		getCndR().itm_grp_flg7(true);
		getCndR().itm_grp_flg8(true);
		getCndR().itm_grp_flg9(true);
		getCndR().itm_grp_flg10(true);
	}

	/**
	 * 発注先分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setSpplGrpFlg() {
		getCndR().sppl_grp_flg1(true);
		getCndR().sppl_grp_flg2(true);
		getCndR().sppl_grp_flg3(true);
		getCndR().sppl_grp_flg4(true);
		getCndR().sppl_grp_flg5(true);
		getCndR().sppl_grp_flg6(true);
		getCndR().sppl_grp_flg7(true);
		getCndR().sppl_grp_flg8(true);
		getCndR().sppl_grp_flg9(true);
		getCndR().sppl_grp_flg10(true);
	}

	/**
	 * 品目分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setItmGrpCdNmMode() {
		setGrpCdNmMode(Cnd_itm_grp_cd1, Cnd_itm_grp_nm1, getCndR().itm_grp_flg1());
		setGrpCdNmMode(Cnd_itm_grp_cd2, Cnd_itm_grp_nm2, getCndR().itm_grp_flg2());
		setGrpCdNmMode(Cnd_itm_grp_cd3, Cnd_itm_grp_nm3, getCndR().itm_grp_flg3());
		setGrpCdNmMode(Cnd_itm_grp_cd4, Cnd_itm_grp_nm4, getCndR().itm_grp_flg4());
		setGrpCdNmMode(Cnd_itm_grp_cd5, Cnd_itm_grp_nm5, getCndR().itm_grp_flg5());
		setGrpCdNmMode(Cnd_itm_grp_cd6, Cnd_itm_grp_nm6, getCndR().itm_grp_flg6());
		setGrpCdNmMode(Cnd_itm_grp_cd7, Cnd_itm_grp_nm7, getCndR().itm_grp_flg7());
		setGrpCdNmMode(Cnd_itm_grp_cd8, Cnd_itm_grp_nm8, getCndR().itm_grp_flg8());
		setGrpCdNmMode(Cnd_itm_grp_cd9, Cnd_itm_grp_nm9, getCndR().itm_grp_flg9());
		setGrpCdNmMode(Cnd_itm_grp_cd10, Cnd_itm_grp_nm10, getCndR().itm_grp_flg10());
	}

	/**
	 * 発注先分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setSpplGrpCdNmMode() {
		setGrpCdNmMode(Cnd_sppl_grp_cd1, Cnd_sppl_grp_nm1, getCndR().sppl_grp_flg1());
		setGrpCdNmMode(Cnd_sppl_grp_cd2, Cnd_sppl_grp_nm2, getCndR().sppl_grp_flg2());
		setGrpCdNmMode(Cnd_sppl_grp_cd3, Cnd_sppl_grp_nm3, getCndR().sppl_grp_flg3());
		setGrpCdNmMode(Cnd_sppl_grp_cd4, Cnd_sppl_grp_nm4, getCndR().sppl_grp_flg4());
		setGrpCdNmMode(Cnd_sppl_grp_cd5, Cnd_sppl_grp_nm5, getCndR().sppl_grp_flg5());
		setGrpCdNmMode(Cnd_sppl_grp_cd6, Cnd_sppl_grp_nm6, getCndR().sppl_grp_flg6());
		setGrpCdNmMode(Cnd_sppl_grp_cd7, Cnd_sppl_grp_nm7, getCndR().sppl_grp_flg7());
		setGrpCdNmMode(Cnd_sppl_grp_cd8, Cnd_sppl_grp_nm8, getCndR().sppl_grp_flg8());
		setGrpCdNmMode(Cnd_sppl_grp_cd9, Cnd_sppl_grp_nm9, getCndR().sppl_grp_flg9());
		setGrpCdNmMode(Cnd_sppl_grp_cd10, Cnd_sppl_grp_nm10, getCndR().sppl_grp_flg10());
	}

	/**
	 * 品目／発注先分類フラグの値に応じて、品目／発注先分類ＣＤ・名のデフォルトモードを設定する
	 * @param cdBeans 品目／発注先分類ＣＤの部品
	 * @param nmBeans 品目／発注先分類名の部品
	 * @param flg 品目／発注先分類フラグの値(true/false)
	 */
	protected void setGrpCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
		// 直接入力の場合はモード設定しない
		if (!isCreated()) {
			return;
		}
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
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 注意事項<br>
	 * 引数にセットしたコンポーネントに対して {@link MCModeBeans#setMode}
	 * をすると、そのモードになります。その後、画面ステータスが変わると
	 * 非表示になります。<br>
	 * タブの構成要素であるMCPanelを引数にセットすると、タブペインからMCPanelを
	 * 除去します。結果、 {@link MCTabbedPane#indexOfComponent(Component)}が
	 * -1 を返すようになります。<br>
	 * </p>
	 *
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans beans) {
		MAUCP_BeansUtil.setComponentInvisibleAllStatus(beans, getPanelLayerList(), this);
	}

	@Override
	protected void checkForCallStack(mcframe.commonCore.notice.MCMessageList msgList) {
		super.checkForCallStack(msgList);

		msgList.addAll(checkAtLeastOne(Cnd_sundry_itm_flg_on, Cnd_sundry_itm_flg_off));
	}

}