package mcframe.clientMSBE.MSBEP1740;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMSBE.MSBEP1730.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_IvDSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IvDSel_MC extends MSBEP_IvDSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// 呼び元の明細テーブル(本画面の選択結果の追加反映先)
	protected mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg _param2;

	/**
	 * MSBGP1730に遷移する前に重複チェックするカラムの配列を返します
	 */
	protected MCColumnConfig[] getChkBeforeScreenTran() {

		if (_chkBeforeScreenTran == null) {
			_chkBeforeScreenTran = new MCColumnConfig[] {
					columnRslt_trnspt_cd,// 輸送方法ＣＤ
					columnRslt_trnspt_nm,// 輸送方法名
					columnRslt_vssl_flght, // 船名／便名
					columnRslt_load_port_cd,// 船積港ＣＤ
					columnRslt_load_port_nm,// 船積港名
					columnRslt_etd_dt,// 船積予定日
					columnRslt_dschrg_port_cd,// 船卸港ＣＤ
					columnRslt_dschrg_port_nm,// 船卸港名
					columnRslt_eta_dt,// 船卸予定日
					columnRslt_via_port_cd,// 経由地ＣＤ
					columnRslt_via_port_nm,// 経由地名
					columnRslt_via_schd_dt,// 経由予定日
					columnRslt_tterm_cd1,// 取引条件ＣＤ１
					columnRslt_tterm_nm1,// 取引条件名１
					columnRslt_tterm_rmrks1,// 取引条件備考１
					columnRslt_tterm_cd2,// 取引条件ＣＤ２
					columnRslt_tterm_nm2,// 取引条件名２
					columnRslt_tterm_rmrks2,// 取引条件備考２
					columnRslt_tterm_cd3,// 取引条件ＣＤ３
					columnRslt_tterm_nm3,// 取引条件名３
					columnRslt_tterm_rmrks3,// 取引条件備考３
					columnRslt_xrate,// 為替レート
					columnRslt_ptax_xrate// 納税為替レート
			};
		}
		return _chkBeforeScreenTran;
	}

	/**
	 * MSBEP1730に遷移する前に重複チェックするカラム<br>
	 * (MSBEP1730に画面遷移時にGroupByされる項目)
	 */
	protected MCColumnConfig[] _chkBeforeScreenTran = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvDSel_MC() {
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
	public MSBEP_IvDSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	// - INIT -----------------------------------------//
	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>
	 * 起動タイプ：T1 （インボイス登録(MSBEP1730)からの遷移）<br>
	 * バインド値 ＜必須＞<br>
	 * <table border = 1>
	 * <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	 * <tr><td>trd_ptn_typ</td><td>String</td><td>必須</td></tr>
	 * <tr><td>ship_rqst_id_cd</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_id_cd</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_id_nm</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_zip_cd</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_addr1</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_addr2</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_addr3</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_addr4</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_cntct_dpt</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_cntct_psn</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_tel</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_fax</td><td>String</td><td>必須</td></tr>
	 * <tr><td>dlv_sundry_flg</td><td>Boolean</td><td>必須</td></tr>
	 * <tr><td>tdlv_cd</td><td>String</td><td>必須</td></tr>
	 * <tr><td>tterm_cd1</td><td>String</td><td>必須</td></tr>
	 * <tr><td>tterm_cd2</td><td>String</td><td>必須</td></tr>
	 * <tr><td>trd_cur_cd</td><td>String</td><td>必須</td></tr>
	 * <tr><td>tterm_cd3</td><td>String</td><td>必須</td></tr>
	 * <tr><td>trnspt_cd</td><td>String</td><td>任意</td></tr>
	 * <tr><td>trnspt_nm</td><td>String</td><td>任意</td></tr>
	 * <tr><td>vssl_flght</td><td>String</td><td>任意</td></tr>
	 * <tr><td>load_port_cd</td><td>String</td><td>任意</td></tr>
	 * <tr><td>load_port_nm</td><td>String</td><td>任意</td></tr>
	 * <tr><td>etd_dt</td><td>MCDate</td><td>任意</td></tr>
	 * <tr><td>dschrg_port_cd</td><td>String</td><td>任意</td></tr>
	 * <tr><td>dschrg_port_nm</td><td>String</td><td>任意</td></tr>
	 * <tr><td>eta_dt</td><td>MCDate</td><td>任意</td></tr>
	 * <tr><td>via_port_cd</td><td>String</td><td>任意</td></tr>
	 * <tr><td>via_port_nm</td><td>String</td><td>任意</td></tr>
	 * <tr><td>via_schd_dt</td><td>MCDate</td><td>任意</td></tr>
	 * <tr><td>tterm_rmrks1</td><td>String</td><td>任意</td></tr>
	 * <tr><td>tterm_rmrks2</td><td>String</td><td>任意</td></tr>
	 * <tr><td>tterm_rmrks3</td><td>String</td><td>任意</td></tr>
	 * <tr><td>xrate</td><td>MCNumber</td><td>任意</td></tr>
	 * </table> <br>
	 * その他の引数：List(ship_schd_noが格納されたList)</li>
	 * </P><br>
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数

	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);

		// インボイス登録(MSBE1730)からの遷移
		if (T1 == openTyp) {

			// [バインド値：1] 検索条件
			getCnd1R().iv_src_typ(bind.getStringNE("iv_src_typ"));
			getCnd1R().sls_cststk_flg(bind.getBooleanNE("sls_cststk_flg"));
			getCnd1R().trd_ptn_typ(bind.getString("trd_ptn_typ"));
			getCnd1R().is_slo_iv_no(bind.getBoolean("is_slo_iv_no"));
			getCnd1R().iv_no(bind.getString("iv_no"));
			getCnd1R().dlv_id_typ(bind.getString("dlv_id_typ"));
			getCnd1R().sls_basis_typ(bind.getString("sls_basis_typ"));
			getCnd1R().prov_basis_typ(bind.getString("prov_basis_typ"));
			getCnd1R().iv_dt(bind.getDate("iv_dt"));
			getCnd1R().ship_rqst_id_cd(bind.getString("ship_rqst_id_cd"));
			getCnd1R().dlv_id_cd(bind.getString("dlv_id_cd"));
			getCnd1R().dlv_id_nm(bind.getString("dlv_id_nm"));
			getCnd1R().dlv_zip_cd(bind.getString("dlv_zip_cd"));
			getCnd1R().dlv_addr1(bind.getString("dlv_addr1"));
			getCnd1R().dlv_addr2(bind.getString("dlv_addr2"));
			getCnd1R().dlv_addr3(bind.getString("dlv_addr3"));
			getCnd1R().dlv_addr4(bind.getString("dlv_addr4"));
			getCnd1R().dlv_cntct_dpt(bind.getString("dlv_cntct_dpt"));
			getCnd1R().dlv_cntct_psn(bind.getString("dlv_cntct_psn"));
			getCnd1R().dlv_tel(bind.getString("dlv_tel"));
			getCnd1R().dlv_fax(bind.getString("dlv_fax"));
			getCnd1R().tdlv_cd(bind.getString("tdlv_cd"));
			getCnd1R().tdlv_nm(bind.getString("tdlv_nm"));
			getCnd1R().tdlv_zip_cd(bind.getString("tdlv_zip_cd"));
			getCnd1R().tdlv_addr1(bind.getString("tdlv_addr1"));
			getCnd1R().tdlv_addr2(bind.getString("tdlv_addr2"));
			getCnd1R().tdlv_addr3(bind.getString("tdlv_addr3"));
			getCnd1R().tdlv_addr4(bind.getString("tdlv_addr4"));
			getCnd1R().tdlv_cntct_dpt(bind.getString("tdlv_cntct_dpt"));
			getCnd1R().tdlv_cntct_psn(bind.getString("tdlv_cntct_psn"));
			getCnd1R().tdlv_tel(bind.getString("tdlv_tel"));
			getCnd1R().tdlv_fax(bind.getString("tdlv_fax"));
			getCnd1R().via_dlv_typ(bind.getString("via_dlv_typ"));
			getCnd1R().trd_cur_cd(bind.getString("trd_cur_cd"));
			getCnd1R().purc_ddlv_flg(bind.getBoolean("purc_ddlv_flg"));

			// [バインド値：2] 明細比較項目
			getCnd1R().trnspt_cd(bind.getString("trnspt_cd"));
			getCnd1R().trnspt_nm(bind.getString("trnspt_nm"));
			getCnd1R().vssl_flght(bind.getString("vssl_flght"));
			getCnd1R().load_port_cd(bind.getString("load_port_cd"));
			getCnd1R().load_port_nm(bind.getString("load_port_nm"));
			getCnd1R().etd_dt(bind.getDate("etd_dt"));
			getCnd1R().dschrg_port_cd(bind.getString("dschrg_port_cd"));
			getCnd1R().dschrg_port_nm(bind.getString("dschrg_port_nm"));
			getCnd1R().eta_dt(bind.getDate("eta_dt"));
			getCnd1R().via_port_cd(bind.getString("via_port_cd"));
			getCnd1R().via_port_nm(bind.getString("via_port_nm"));
			getCnd1R().via_schd_dt(bind.getDate("via_schd_dt"));
			getCnd1R().tterm_cd1(bind.getString("tterm_cd1"));
			getCnd1R().tterm_nm1(bind.getString("tterm_nm1"));
			getCnd1R().tterm_rmrks1(bind.getString("tterm_rmrks1"));
			getCnd1R().tterm_cd2(bind.getString("tterm_cd2"));
			getCnd1R().tterm_nm2(bind.getString("tterm_nm2"));
			getCnd1R().tterm_rmrks2(bind.getString("tterm_rmrks2"));
			getCnd1R().tterm_cd3(bind.getString("tterm_cd3"));
			getCnd1R().tterm_nm3(bind.getString("tterm_nm3"));
			getCnd1R().tterm_rmrks3(bind.getString("tterm_rmrks3"));
			getCnd1R().xrate(bind.getNumber("xrate"));
			getCnd1R().ptax_xrate(bind.getNumber("ptax_xrate"));
			
			// param[0] からship_schd_noのList取得
			List<String> aL = (List<String>) param[0];
			for (int i = 0; i < aL.size(); i++) {

				Cnd2R c2R = Cnd2R.create();
				 if (MSC_IV_SRC_TYP.isSHIP_SCHD(bind.getString("iv_src_typ"))) {
					 c2R.ship_schd_no(aL.get(i));
				}
				 else if (MSC_IV_SRC_TYP.isSHIP_INST(bind.getString("iv_src_typ"))) {
					 c2R.ship_inst_d_no(aL.get(i));
				}
				else if (MSC_IV_SRC_TYP.isSHIP_ACT(bind.getString("iv_src_typ"))) {
					c2R.ship_act_d_no(aL.get(i));
				}
				getCnd2L().add(c2R);
			}

			// 呼び元の明細テーブル(本画面の選択結果の追加反映先)
			_param2 = (mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg) param[1];

			addDoBehind(Btn_srch);
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}
	
	/**
	 * [MS_MSBEL1730_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch03Caller<P extends MSBEP_IvDSel, B extends MS_MSBEL1730_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1730_Srch03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void setMode() {
			super.setMode();
			
			setSRCHStatus();
		}
	
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		if (MSC_IV_SRC_TYP.isSHIP_ACT(getCnd1R().iv_src_typ())) {
			
			setDefaultMode(columnRslt_ship_act_no);
			setDefaultMode(columnRslt_ship_act_d_no);
			setDefaultMode(columnRslt_ship_dt);
			setDefaultMode(columnRslt_ship_hm);
			setDefaultMode(columnRslt_dlv_dt);
			setDefaultMode(columnRslt_dlv_hm);
		}
		else {
			
			columnRslt_ship_act_no.setMode(MCMode.INVISIBLE);
			columnRslt_ship_act_no.setMode(MCMode.INVISIBLE);
			columnRslt_ship_act_d_no.setMode(MCMode.INVISIBLE);
			columnRslt_ship_dt.setMode(MCMode.INVISIBLE);
			columnRslt_ship_hm.setMode(MCMode.INVISIBLE);
			columnRslt_dlv_dt.setMode(MCMode.INVISIBLE);
			columnRslt_dlv_hm.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {

		MCList<RsltR> dL = getRsltL().subList(RsltR.$check, true);
		String strForLog = new String();

		if (!dL.isEmpty()) {

			// ヘッダと明細のヘッダ項目を比較し、異なる場合はメッセージを出す
			Cnd1R cR = getCnd1R();
			RsltR baseR = dL.get(0);

			for (MCColumnConfig conf : getChkBeforeScreenTran()) {

				String s = conf.getBaseRowColumnName();
				int sz = dL.groupList(s).length;

				// GroupByの結果と、ヘッダの比較
				if (sz > 1 || !isSame(cR.getValueNE(s), baseR.getValueNE(s))) {

					String headerName = conf.getHeaderName();
					strForLog = strForLog + headerName + " / ";
				}
			}

			if (!isNull(strForLog)) {
				dialog(MSBEP0006, strForLog);
			}

			// ROWの追加
			MCList <mcframe.clientMSBE.MSBEP1730.DtlR> dtl1730L = MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class);
			setAll(dtl1730L, dL, createMap_DtlR_RsltR());
			_param2.mergeDtl(dtl1730L);
			if (MAC_TRD_PTN_TYP.isSLS(getCnd1R().trd_ptn_typ())) {
				_param2.DtlTable.fillSpace();
			}
		}

		statusClear();
		requestCloseWindow();
	}
	/**
	 * Panel[Btn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doBtn_srch(MCEventInfo info) {
		callMS_MSBEL1730_Srch03();
	}
	// ------------オープン時の処理実装------------			
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ, columnRslt_sno4_mng_typ);
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_iv_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
	}
	
	//  ------------イベント処理実装------------	
	// mapper
	protected Map_DtlR_RsltR<DtlR,RsltR> createMap_DtlR_RsltR() {
		return new Map_DtlR_RsltR<DtlR, RsltR>();
	}

	public class Map_DtlR_RsltR<D extends DtlR, S extends RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$trd_cd, RsltR.$trd_cd);
			addColumnPathMap(DtlR.$trd_nm, RsltR.$trd_nm);
			addColumnPathMap(DtlR.$itm_p, RsltR.$itm_p);
			addColumnPathMap(DtlR.$sls_upri_cng_flg, RsltR.$sls_upri_cng_flg);
			addColumnPathMap(DtlR.$sno1_mng_typ, RsltR.$sno1_mng_typ);
			addColumnPathMap(DtlR.$sno2_mng_typ, RsltR.$sno2_mng_typ);
			addColumnPathMap(DtlR.$sno3_mng_typ, RsltR.$sno3_mng_typ);
			addColumnPathMap(DtlR.$sno4_mng_typ, RsltR.$sno4_mng_typ);
			addColumnPathMap(DtlR.$exim_xpns_typ, RsltR.$exim_xpns_typ);
			addColumnPathMap(DtlR.$iv_itm_nm, RsltR.$iv_itm_nm);
			addColumnPathMap(DtlR.$stk_mng_typ, RsltR.$stk_mng_typ);
			addColumnPathMap(DtlR.$asset_mng_typ, RsltR.$asset_mng_typ);
			addColumnPathMap(DtlR.$asset_mng_typ_nm, RsltR.$asset_mng_typ_nm);
			addColumnPathMap(DtlR.$sundry_itm_flg, RsltR.$sundry_itm_flg);
			addColumnPathMap(DtlR.$cntry_org_cd, RsltR.$cntry_org_cd);
			addColumnPathMap(DtlR.$cntry_org_nm, RsltR.$cntry_org_nm);
			addColumnPathMap(DtlR.$dscnt_itm_flg, RsltR.$dscnt_itm_flg);
			addColumnPathMap(DtlR.$trd_unit_cd, RsltR.$trd_unit_cd);
			addColumnPathMap(DtlR.$trd_unit_nm, RsltR.$trd_unit_nm);
			addColumnPathMap(DtlR.$trd_unit_conv_base_qty, RsltR.$trd_unit_conv_base_qty);
			addColumnPathMap(DtlR.$trd_unit_conv_qty, RsltR.$trd_unit_conv_qty);
			addColumnPathMap(DtlR.$trd_unit_dec_place, RsltR.$trd_unit_dec_place);
			addColumnPathMap(DtlR.$trd_unit_rnd_typ, RsltR.$trd_unit_rnd_typ);
			addColumnPathMap(DtlR.$trd_unit_qty_p, RsltR.$trd_unit_qty_p);
			addColumnPathMap(DtlR.$max_base_unit_qty, RsltR.$max_base_unit_qty);
			addColumnPathMap(DtlR.$max_trd_unit_qty, RsltR.$max_trd_unit_qty);
			addColumnPathMap(DtlR.$base_unit_cd, RsltR.$base_unit_cd);
			addColumnPathMap(DtlR.$base_unit_nm, RsltR.$base_unit_nm);
			addColumnPathMap(DtlR.$base_unit_dec_place, RsltR.$base_unit_dec_place);
			addColumnPathMap(DtlR.$base_unit_rnd_typ, RsltR.$base_unit_rnd_typ);
			addColumnPathMap(DtlR.$base_unit_qty_p, RsltR.$base_unit_qty_p);
			addColumnPathMap(DtlR.$gd_cd, RsltR.$gd_cd);
			addColumnPathMap(DtlR.$gd_nm, RsltR.$gd_nm);
			addColumnPathMap(DtlR.$upri_not_tgt_flg, RsltR.$upri_not_tgt_flg);
			addColumnPathMap(DtlR.$interim_flg, RsltR.$interim_flg);
			addColumnPathMap(DtlR.$trd_cur_upri, RsltR.$trd_cur_upri);
			addColumnPathMap(DtlR.$trd_cur_amt, RsltR.$trd_cur_amt);
			addColumnPathMap(DtlR.$trd_cur_dscnt_amt, RsltR.$trd_cur_dscnt_amt);
			addColumnPathMap(DtlR.$dscnt_rsn_cd, RsltR.$dscnt_rsn_cd);
			addColumnPathMap(DtlR.$dscnt_rsn_nm, RsltR.$dscnt_rsn_nm);
			addColumnPathMap(DtlR.$iv_upri_p, RsltR.$iv_upri_p);
			addColumnPathMap(DtlR.$iv_amt_p, RsltR.$iv_amt_p);
			addColumnPathMap(DtlR.$tax_fix_flg, RsltR.$tax_fix_flg);
			addColumnPathMap(DtlR.$tax_cd, RsltR.$tax_cd);
			addColumnPathMap(DtlR.$tax_nm, RsltR.$tax_nm);
			addColumnPathMap(DtlR.$tax_rate, RsltR.$tax_rate);
			addColumnPathMap(DtlR.$inc_tax_flg, RsltR.$inc_tax_flg);
			addColumnPathMap(DtlR.$trd_cur_tax_amt, RsltR.$trd_cur_tax_amt);
			addColumnPathMap(DtlR.$trd_cur_inc_tax_amt, RsltR.$trd_cur_inc_tax_amt);
			addColumnPathMap(DtlR.$cst_po_no, RsltR.$cst_po_no);
			addColumnPathMap(DtlR.$cst_po_d_no, RsltR.$cst_po_d_no);
			addColumnPathMap(DtlR.$sno1, RsltR.$sno1);
			addColumnPathMap(DtlR.$sno2, RsltR.$sno2);
			addColumnPathMap(DtlR.$sno3, RsltR.$sno3);
			addColumnPathMap(DtlR.$sno4, RsltR.$sno4);
			addColumnPathMap(DtlR.$wrk_no, RsltR.$wrk_no);
			addColumnPathMap(DtlR.$wrk_nm, RsltR.$wrk_nm);
			addColumnPathMap(DtlR.$ship_fr_lg_grp_cd, RsltR.$ship_fr_lg_grp_cd);
			addColumnPathMap(DtlR.$ship_fr_lg_grp_nm, RsltR.$ship_fr_lg_grp_nm);
			addColumnPathMap(DtlR.$cst_itm_cd, RsltR.$cst_itm_cd);
			addColumnPathMap(DtlR.$cst_itm_nm, RsltR.$cst_itm_nm);
			addColumnPathMap(DtlR.$rsn_cd, RsltR.$rsn_cd);
			addColumnPathMap(DtlR.$rsn_nm, RsltR.$rsn_nm);
			addColumnPathMap(DtlR.$bd_dpt_cd, RsltR.$bd_dpt_cd);
			addColumnPathMap(DtlR.$bd_dpt_nm, RsltR.$bd_dpt_nm);
			addColumnPathMap(DtlR.$sls_usr_cd, RsltR.$sls_usr_cd);
			addColumnPathMap(DtlR.$sls_usr_nm, RsltR.$sls_usr_nm);
			addColumnPathMap(DtlR.$sls_dpt_cd, RsltR.$sls_dpt_cd);
			addColumnPathMap(DtlR.$sls_dpt_nm, RsltR.$sls_dpt_nm);
			addColumnPathMap(DtlR.$sls_dpt_wg_cd, RsltR.$sls_dpt_wg_cd);
			addColumnPathMap(DtlR.$ar_dpt_cd, RsltR.$ar_dpt_cd);
			addColumnPathMap(DtlR.$ar_dpt_nm, RsltR.$ar_dpt_nm);
			addColumnPathMap(DtlR.$trd_rmrks, RsltR.$trd_rmrks);
			addColumnPathMap(DtlR.$trd_d_rmrks, RsltR.$trd_d_rmrks);
			addColumnPathMap(DtlR.$slo_no, RsltR.$slo_no);
			addColumnPathMap(DtlR.$ship_rqst_no, RsltR.$ship_rqst_no);
			addColumnPathMap(DtlR.$slo_d_no, RsltR.$slo_d_no);
			addColumnPathMap(DtlR.$dest_cd1, RsltR.$dest_cd1);
			addColumnPathMap(DtlR.$dest_cd2, RsltR.$dest_cd2);
			addColumnPathMap(DtlR.$dest_cd3, RsltR.$dest_cd3);
			addColumnPathMap(DtlR.$xfr_schd_no, RsltR.$xfr_schd_no);
			addColumnPathMap(DtlR.$dlv_rqst_dt, RsltR.$dlv_rqst_dt);
			addColumnPathMap(DtlR.$dlv_rqst_hm, RsltR.$dlv_rqst_hm);
			addColumnPathMap(DtlR.$ptax_cur_amt, RsltR.$ptax_cur_amt);
			addColumnPathMap(DtlR.$wtax_rate, RsltR.$wtax_rate);
			addColumnPathMap(DtlR.$wtax_amt, RsltR.$wtax_amt);
			addColumnPathMap(DtlR.$purc_schd_no, RsltR.$purc_schd_no);
			addColumnPathMap(DtlR.$purc_act_d_no, RsltR.$purc_act_d_no);
			addColumnPathMap(DtlR.$ship_schd_no, RsltR.$ship_schd_no);
			addColumnPathMap(DtlR.$manual_add_flg, RsltR.$manual_add_flg);
			addColumnPathMap(DtlR.$existed_flg, RsltR.$existed_flg);
			addColumnPathMap(DtlR.$ship_pr_no, RsltR.$ship_pr_no);
			addColumnPathMap(DtlR.$ship_pr_upd_cntr, RsltR.$ship_pr_upd_cntr);
			addColumnPathMap(DtlR.$purc_ddlv_flg, RsltR.$purc_ddlv_flg);
			addColumnPathMap(DtlR.$schd_base_unit_qty, RsltR.$schd_base_unit_qty);
			addColumnPathMap(DtlR.$schd_trd_cur_dscnt_amt, RsltR.$schd_trd_cur_dscnt_amt);
			addColumnPathMap(DtlR.$pr_sts_typ, RsltR.$pr_sts_typ);
			addColumnPathMap(DtlR.$ship_inst_no, RsltR.$ship_inst_no);
			addColumnPathMap(DtlR.$ship_inst_d_no, RsltR.$ship_inst_d_no);
			addColumnPathMap(DtlR.$ship_act_no, RsltR.$ship_act_no);
			addColumnPathMap(DtlR.$ship_act_d_no, RsltR.$ship_act_d_no);
			addColumnPathMap(DtlR.$dlv_slip_d_no, RsltR.$dlv_slip_d_no);
			addColumnPathMap(DtlR.$ship_alloc_sts_no, RsltR.$ship_alloc_sts_no);
			addColumnPathMap(DtlR.$uplnd_flg, RsltR.$uplnd_flg);
			addColumnPathMap(DtlR.$ship_inst_typ, RsltR.$ship_inst_typ);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (MAC_TRD_PTN_TYP.isSLS(getCnd1R().trd_ptn_typ())) {
				dest.upri_qty(src.trd_unit_qty());
			}
			else {
				dest.upri_qty(src.base_unit_qty());
			}
		}

	}

}