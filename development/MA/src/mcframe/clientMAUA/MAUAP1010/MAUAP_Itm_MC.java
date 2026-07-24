package mcframe.clientMAUA.MAUAP1010;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5170.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.ItmCols;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_Itm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_Itm_MC extends MAUAP_Itm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Itm_MC() {
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
	public MAUAP_Itm_MC(String name) {
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
		Rslt_itm_grp_p_PPanel.afterCallParts_sub();
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
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}

	@Override
	public MCList getAcceptList(MCLinkBeans target, boolean isDCEvent) {
		removeItmNm();
		return super.getAcceptList(target, isDCEvent);
	}

	@Override
	public void setOpenFocus() {
		// タブがある場合はこのメソッドを呼ばないとフィールドにフォーカスされない
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				ItmCols.$i_itm_sub1, ItmCols.$i_itm_sub2, ItmCols.$i_itm_sub3, ItmCols.$i_itm_nm,
				ItmCols.$i_itm_alt_nm1, ItmCols.$i_itm_alt_nm2, ItmCols.$i_itm_alt_nm3, ItmCols.$i_itm_alt_nm4,
				ItmCols.$i_itm_typ, ItmCols.$i_itm_typ_d_cd, ItmCols.$i_stk_mng_typ, ItmCols.$i_asset_mng_typ,
				ItmCols.$i_itm_is_srch_typ, ItmCols.$i_sundry_itm_nm_rem_flg, ItmCols.$i_mode_nullval_flg,
				ItmCols.$i_sundry_itm_flg_on, ItmCols.$i_sundry_itm_flg_off,
				ItmCols.$i_release_flg_on, ItmCols.$i_release_flg_off,
				ItmCols.$i_dt, ItmCols.$i_bp_cd, ItmCols.$i_bp_nm, ItmCols.$i_rpt_key_cd, ItmCols.$i_rpt_key_nm
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				ItmCols.$m_stk_mng_typ, ItmCols.$m_asset_mng_typ,
				ItmCols.$m_sundry_itm_flg_on, ItmCols.$m_sundry_itm_flg_off,
				ItmCols.$m_release_flg_on, ItmCols.$m_release_flg_off
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();

		setSrchTypNm();
		setItmGrpFlg();
		setItmGrpCdNmMode();
		setBpItmCdCdNmMode();
	}

	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);

		if (row != null) {
			if(GET_LIST == mode){
				getCndR().itm_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().itm_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setSrchTypNm();
		setItmGrpFlg();
		setItmGrpCdNmMode();
		setBpItmCdCdNmMode();
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if (isNull(row.getStringNE(ItmCols.$i_itm_is_srch_typ))) {
			row.setStringNE(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.COMM.value());
		}
		setSundryItmFlg(row);
		setReleaseFlg(row);

		super.saveInitValue(row);
	}

	@Override
	protected void saveInitMode(MCRow row) {
		setReleaseFlgMode(row);

		super.saveInitMode(row);
	}

	/**
	 * 検索区分を設定する
	 */
	protected void setSrchTypNm() {
		MAC_ITM_IS_SRCH_TYP.putNameNE(getCndR(), CndR.$itm_is_srch_typ, CndR.$itm_is_srch_typ_nm);
	}

	/**
	 * 諸口品ＦＬＧのデフォルト値を設定する
	 */
	protected void setSundryItmFlg(MCRow row) {
		if (!row.contains(ItmCols.$i_sundry_itm_flg_on) && !row.contains(ItmCols.$i_sundry_itm_flg_off)) {
			row.setBooleanNE(ItmCols.$i_sundry_itm_flg_on, true);
			row.setBooleanNE(ItmCols.$i_sundry_itm_flg_off, true);
		}
	}

	/**
	 * リリースＦＬＧのデフォルト値を設定する
	 */
	protected void setReleaseFlg(MCRow row) {
		if (!row.contains(ItmCols.$i_release_flg_on) && !row.contains(ItmCols.$i_release_flg_off)) {
			row.setBooleanNE(ItmCols.$i_release_flg_on, true);
			row.setBooleanNE(ItmCols.$i_release_flg_off, false);
		}
	}

	/**
	 * リリースＦＬＧのデフォルトモードを設定する
	 */
	protected void setReleaseFlgMode(MCRow row) {
		if (!row.contains(ItmCols.$m_release_flg_on) && !row.contains(ItmCols.$m_release_flg_off)) {
			boolean p1 = row.getBooleanNE(ItmCols.$i_release_flg_on) && !row.getBooleanNE(ItmCols.$i_release_flg_off);
			boolean p2 = !row.getBooleanNE(ItmCols.$i_release_flg_on) && row.getBooleanNE(ItmCols.$i_release_flg_off);
			if (p1 || p2) {
				row.setStringNE(ItmCols.$m_release_flg_on, "READ_ONLY");
				row.setStringNE(ItmCols.$m_release_flg_off, "READ_ONLY");
			}
		}
	}

	/**
	 * 品目分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setItmGrpFlg() {
		getCndR().itm_grp_flg1(false);
		getCndR().itm_grp_flg2(false);
		getCndR().itm_grp_flg3(false);
		getCndR().itm_grp_flg4(false);
		getCndR().itm_grp_flg5(false);
		getCndR().itm_grp_flg6(false);
		getCndR().itm_grp_flg7(false);
		getCndR().itm_grp_flg8(false);
		getCndR().itm_grp_flg9(false);
		getCndR().itm_grp_flg10(false);
	}

	/**
	 * 品目分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setItmGrpCdNmMode() {
		setItmGrpCdNmMode(Cnd_itm_grp_cd1, Cnd_itm_grp_nm1, getCndR().itm_grp_flg1());
		setItmGrpCdNmMode(Cnd_itm_grp_cd2, Cnd_itm_grp_nm2, getCndR().itm_grp_flg2());
		setItmGrpCdNmMode(Cnd_itm_grp_cd3, Cnd_itm_grp_nm3, getCndR().itm_grp_flg3());
		setItmGrpCdNmMode(Cnd_itm_grp_cd4, Cnd_itm_grp_nm4, getCndR().itm_grp_flg4());
		setItmGrpCdNmMode(Cnd_itm_grp_cd5, Cnd_itm_grp_nm5, getCndR().itm_grp_flg5());
		setItmGrpCdNmMode(Cnd_itm_grp_cd6, Cnd_itm_grp_nm6, getCndR().itm_grp_flg6());
		setItmGrpCdNmMode(Cnd_itm_grp_cd7, Cnd_itm_grp_nm7, getCndR().itm_grp_flg7());
		setItmGrpCdNmMode(Cnd_itm_grp_cd8, Cnd_itm_grp_nm8, getCndR().itm_grp_flg8());
		setItmGrpCdNmMode(Cnd_itm_grp_cd9, Cnd_itm_grp_nm9, getCndR().itm_grp_flg9());
		setItmGrpCdNmMode(Cnd_itm_grp_cd10, Cnd_itm_grp_nm10, getCndR().itm_grp_flg10());
	}

	/**
	 * 品目分類フラグの値に応じて、品目分類ＣＤ・名のデフォルトモードを設定する
	 * @param cdBeans 品目分類ＣＤの部品
	 * @param nmBeans 品目分類名の部品
	 * @param flg 品目分類フラグの値(true/false)
	 */
	protected void setItmGrpCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
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
	 * 名称不要フラグと諸口先フラグに応じて、品名を削除する
	 */
	protected void removeItmNm() {
		if (getCndR().getBooleanNE(ItmCols.$i_sundry_itm_nm_rem_flg)) {
			MCList<MCRow> sundryList = MCList.create(MCRow.class);
			sundryList.addAll(getRsltL().subList(RsltR.$sundry_itm_flg, true));
			for (MCRow r : sundryList) {
				getRsltL().setStringNE(getRsltL().indexOf(r), ItmCols.$o_itm_nm, null);
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	/**
	 * 取引先品目・品名のデフォルトモードを設定する
	 */
	protected void setBpItmCdCdNmMode() {
		if (isNull(getCndR().dt())) {
			Cnd_bp_itm_cd.setMode(MCMode.READ_ONLY);
			Cnd_bp_itm_nm.setMode(MCMode.READ_ONLY);
			columnRslt_bp_itm_cd.setMode(MCMode.INVISIBLE);
			columnRslt_bp_itm_nm.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(Cnd_bp_itm_cd);
			setDefaultMode(Cnd_bp_itm_nm);
			columnRslt_bp_itm_cd.setMode(MCMode.READ_ONLY);
			columnRslt_bp_itm_nm.setMode(MCMode.READ_ONLY);
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
		msgList.addAll(checkAtLeastOne(Cnd_release_flg_on, Cnd_release_flg_off));
	}

}