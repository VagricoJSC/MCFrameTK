package mcframe.clientMSBB.MSBBP1230;

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

import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0210.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5400.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsDlvDtAdjstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsDlvDtAdjstReg_MC extends MSBBP_SlsDlvDtAdjstReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	/**
	 * 受注明細ＮＯと出荷予定を格納するマップ
	 */
	protected Map<String, MCList<Dtl_Ship_SchdR>> _sloShipSchdMap = new HashMap<String, MCList<Dtl_Ship_SchdR>>();
	
	/**
	 * 受注明細ＮＯと受注納期回答を格納するマップ
	 */
	protected Map<String, MCList<Dtl_Slo_PrmsR>> _sloPrmsMap = new HashMap<String, MCList<Dtl_Slo_PrmsR>>();
	
	/**
	 * 受注明細ＮＯとＷＧ間依頼を格納するマップ
	 */
	protected Map<String, MCList<Dtl_WG_RqstR>> _wgRqstMap = new HashMap<String, MCList<Dtl_WG_RqstR>>();
	/**
	 * 受注明細ＮＯと売上予定を格納するマップ
	 */
	protected Map<String, MCList<Dtl_Sls_SchdR>> _slsSchdMap = new HashMap<String, MCList<Dtl_Sls_SchdR>>();
	/**
	 * 納期回答履歴の裏リスト
	 */
	protected MCList<Dtl_Slo_PrmsR> _dtlSloPrmsL = MCList.create(Dtl_Slo_PrmsR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsDlvDtAdjstReg_MC() {
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
	public MSBBP_SlsDlvDtAdjstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[prnt_prms]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_prms(MCEventInfo info) {
		callMS_MSBBL1230_Prnt01();
	}
	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		
		getSplitPane(CenterPnlPanel).setDividerLocation(0.45);
		getSplitPane(DtlTabTab).setDividerLocation(0.61);
		getSplitPane(Dtl_WG_Rqst_PrmsPanel).setDividerLocation(0.50);	
	}
	
	@Override
	protected MCPanel getSplitPaneTopPanel() {
		return HdrTabPanel;
	}

	@Override
	protected MCPanel getOpeHdrPanel() {
		return HdrTabPanel;
	}

	/**
	 * [MS_MSBBL1230_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1230_Srch01Caller<P extends MSBBP_SlsDlvDtAdjstReg, B extends MS_MSBBL1230_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1230_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void clear() {
			super.clear();
			clearHiddenList();
		}
		
		@Override
		protected void show() {
			super.show();
			setHiddenList();
		}
		
		protected void clearHiddenList() {
			_dtlSloPrmsL = MCList.create(Dtl_Slo_PrmsR.class);
		}
		
		protected void setHiddenList() {
			// 納期回答履歴の裏リスト			
			MCList<Dtl_Slo_Prms_hisR> sloPrmsHisList = getDtl_Slo_Prms_his_AllL();
			MCIndexKey idxKey = sloPrmsHisList.createIndex(Dtl_Slo_Prms_hisR.$slo_prms_h_no);
			MCList<Dtl_Slo_Prms_hisR> sloPrmsHGroup = sloPrmsHisList.groupBy(Dtl_Slo_Prms_hisR.$slo_prms_h_no);
			
			for (Dtl_Slo_Prms_hisR r : sloPrmsHGroup) {
				MCList<Dtl_Slo_Prms_hisR> subL = sloPrmsHisList.subList(idxKey, r.slo_prms_h_no());
				subL.sort(SortType.DESC, Dtl_Slo_Prms_hisR.$slo_prms_rev);
				Dtl_Slo_Prms_hisR tmp = subL.get(0);
				Dtl_Slo_PrmsR sloPrmsR = Dtl_Slo_PrmsR.create();
				sloPrmsR.slo_d_no(tmp.slo_d_no());
				sloPrmsR.slo_prms_h_no(tmp.slo_prms_h_no());
				sloPrmsR.slo_prms_rev(tmp.slo_prms_rev());
				_dtlSloPrmsL.add(sloPrmsR);
			}
		}
		
		@Override
		public boolean isDownBlockChanged() {
			
			if (Cnd_ope_UPD.isSelected()) {
				
				boolean isChanged = super.isDownBlockChanged();
				
				if (isChanged) {
					return true;
				}
				else {
					return isChanged();
				}
			}
			else {
				return false;
			}
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			
			clearAll();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			
			setSloShipSchdMap(bridge.down1(), bridge.down2());
			setSloPrmsMap(bridge.down1(), bridge.down3());
			setWgRqstMap(bridge.down1(), bridge.down7());
			setSlsSchdMap(bridge.down1(), bridge.down11());
			setDlv(bridge.down0(), bridge.down1());
			setDest(bridge.down0(), bridge.down1());
			setTdlv(bridge.down0(), bridge.down1());
			
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DtlTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			if (Cnd_ope_UPD.isSelected()) {
				setUPDStatus();
			}
			else {
				setREFStatus();
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			setSRCHStatus();
		}
		
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			
			_sloPrmsMap.clear();
			_sloShipSchdMap.clear();
			_wgRqstMap.clear();
			_slsSchdMap.clear();
		}
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (hasWgDefCd(this)) {
			setComponentInvisibleAllStatus(WgRqstPanel);
		}
	}
	/**
	 * 納品先関連項目設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setDlv(HdrR hdrR, MCList<DtlR> dtlL) {
		// 納品先ＣＤ
		MCList<DtlR> dlv_cdL = dtlL.groupBy(DtlR.$dlv_cd);
		if (dlv_cdL.size() != 1) {
			return;
		}

		// 納品先諸口ＦＬＧにより編集可否が変更されない項目は、一律コピー
		DtlR firstDtlR = dtlL.get(0);
		hdrR.dlv_cd(firstDtlR.dlv_cd());
		hdrR.dlv_sundry_flg(firstDtlR.dlv_sundry_flg());
		hdrR.pri_prnt_flg(getCopyFlg(dtlL, DtlR.$pri_prnt_flg));
		hdrR.dlv_cntry_cd(firstDtlR.dlv_cntry_cd());
		hdrR.dlv_cntry_nm(firstDtlR.dlv_cntry_nm());

		// 納品先諸口ＦＬＧにより編集可否が変更される項目は、同一であればコピー
		if(firstDtlR.dlv_sundry_flg()) {
			hdrR.dlv_nm(getCopyStr(dtlL, DtlR.$dlv_nm));
			hdrR.dlv_zip_cd(getCopyStr(dtlL, DtlR.$dlv_zip_cd));

			DtlR addr1R = getCopyR(dtlL, DtlR.$dlv_addr1);
			if (!isNull(addr1R)) {hdrR.dlv_addr1(addr1R.dlv_addr1());}

			DtlR addr2R = getCopyR(dtlL, DtlR.$dlv_addr2);
			if (!isNullOr(addr1R, addr2R)) {hdrR.dlv_addr2(addr2R.dlv_addr2());}

			DtlR addr3R = getCopyR(dtlL, DtlR.$dlv_addr3);
			if (!isNullOr(addr1R, addr2R, addr3R)) {hdrR.dlv_addr3(addr3R.dlv_addr3());}

			DtlR addr4R = getCopyR(dtlL, DtlR.$dlv_addr4);
			if (!isNullOr(addr1R, addr2R, addr3R, addr4R)) {hdrR.dlv_addr4(addr4R.dlv_addr4());}

			hdrR.dlv_tel(getCopyStr(dtlL, DtlR.$dlv_tel));
			hdrR.dlv_fax(getCopyStr(dtlL, DtlR.$dlv_fax));
			hdrR.dlv_cntct_dpt(getCopyStr(dtlL, DtlR.$dlv_cntct_dpt));
			hdrR.dlv_cntct_psn(getCopyStr(dtlL, DtlR.$dlv_cntct_psn));

			DtlR dlv_lg_grpR = getCopyR(dtlL, DtlR.$dlv_lg_grp_cd, DtlR.$dlv_lg_grp_nm);
			if (!isNull(dlv_lg_grpR)) {
				hdrR.dlv_lg_grp_cd(dlv_lg_grpR.dlv_lg_grp_cd());
				hdrR.dlv_lg_grp_nm(dlv_lg_grpR.dlv_lg_grp_nm());
			}
		}
		else {
			hdrR.dlv_nm(firstDtlR.dlv_nm());
			hdrR.dlv_zip_cd(firstDtlR.dlv_zip_cd());
			hdrR.dlv_addr1(firstDtlR.dlv_addr1());
			hdrR.dlv_addr2(firstDtlR.dlv_addr2());
			hdrR.dlv_addr3(firstDtlR.dlv_addr3());
			hdrR.dlv_addr4(firstDtlR.dlv_addr4());
			hdrR.dlv_tel(firstDtlR.dlv_tel());
			hdrR.dlv_fax(firstDtlR.dlv_fax());
			hdrR.dlv_cntct_dpt(firstDtlR.dlv_cntct_dpt());
			hdrR.dlv_cntct_psn(firstDtlR.dlv_cntct_psn());
			hdrR.dlv_lg_grp_cd(firstDtlR.dlv_lg_grp_cd());
			hdrR.dlv_lg_grp_nm(firstDtlR.dlv_lg_grp_nm());
		}
	}

	/**
	 * 仕向先１～３設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setDest(HdrR hdrR, MCList<DtlR> dtlL) {
		DtlR dest01R = getCopyR(dtlL, DtlR.$dest_cd1, DtlR.$dest_nm1);
		if (!isNull(dest01R)) {
			hdrR.dest_cd1(dest01R.dest_cd1());
			hdrR.dest_nm1(dest01R.dest_nm1());
		}

		DtlR dest02R = getCopyR(dtlL, DtlR.$dest_cd2, DtlR.$dest_nm2);
		if (!isNull(dest02R)) {
			hdrR.dest_cd2(dest02R.dest_cd2());
			hdrR.dest_nm2(dest02R.dest_nm2());
		}

		DtlR dest03R = getCopyR(dtlL, DtlR.$dest_cd3, DtlR.$dest_nm3);
		if (!isNull(dest03R)) {
			hdrR.dest_cd3(dest03R.dest_cd3());
			hdrR.dest_nm3(dest03R.dest_nm3());
		}
	}

	/**
	 * 配送先関連項目設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setTdlv(HdrR hdrR, MCList<DtlR> dtlL) {
		// 配送先ＣＤ
		MCList<DtlR> tdlv_cdL = dtlL.groupBy(DtlR.$tdlv_cd);
		if (tdlv_cdL.size() != 1) {
			return;
		}

		// 配送先ＣＤ未設定の場合、後続の設定処理不要
		DtlR firstDtlR = dtlL.get(0);
		if (isNull(firstDtlR.tdlv_cd())) {
			return;
		}

		// 配送先諸口ＦＬＧにより編集可否が変更されない項目は、一律コピー
		hdrR.tdlv_cd(firstDtlR.tdlv_cd());
		hdrR.tdlv_sundry_flg(firstDtlR.tdlv_sundry_flg());
		hdrR.tdlv_cntry_cd(firstDtlR.tdlv_cntry_cd());
		hdrR.tdlv_cntry_nm(firstDtlR.tdlv_cntry_nm());

		DtlR via_dlv_typR = getCopyR(dtlL, DtlR.$via_dlv_typ, DtlR.$via_dlv_typ_nm);
		if (!isNull(via_dlv_typR)) {
			hdrR.via_dlv_typ(via_dlv_typR.via_dlv_typ());
			hdrR.via_dlv_typ_nm(via_dlv_typR.via_dlv_typ_nm());
		}

		// 配送先諸口ＦＬＧにより編集可否が変更される項目は、同一であればコピー
		if(firstDtlR.tdlv_sundry_flg()) {
			hdrR.tdlv_nm(getCopyStr(dtlL, DtlR.$tdlv_nm));

			DtlR tdlv_lg_grpR = getCopyR(dtlL, DtlR.$tdlv_lg_grp_cd, DtlR.$tdlv_lg_grp_nm);
			if (!isNull(tdlv_lg_grpR)) {
				hdrR.tdlv_lg_grp_cd(tdlv_lg_grpR.tdlv_lg_grp_cd());
				hdrR.tdlv_lg_grp_nm(tdlv_lg_grpR.tdlv_lg_grp_nm());
			}

			hdrR.tdlv_zip_cd(getCopyStr(dtlL, DtlR.$tdlv_zip_cd));

			DtlR addr1R = getCopyR(dtlL, DtlR.$tdlv_addr1);
			if (!isNull(addr1R)) {hdrR.tdlv_addr1(addr1R.tdlv_addr1());}

			DtlR addr2R = getCopyR(dtlL, DtlR.$tdlv_addr2);
			if (!isNullOr(addr1R, addr2R)) {hdrR.tdlv_addr2(addr2R.tdlv_addr2());}

			DtlR addr3R = getCopyR(dtlL, DtlR.$tdlv_addr3);
			if (!isNullOr(addr1R, addr2R, addr3R)) {hdrR.tdlv_addr3(addr3R.tdlv_addr3());}

			DtlR addr4R = getCopyR(dtlL, DtlR.$tdlv_addr4);
			if (!isNullOr(addr1R, addr2R, addr3R, addr4R)) {hdrR.tdlv_addr4(addr4R.tdlv_addr4());}

			hdrR.tdlv_tel(getCopyStr(dtlL, DtlR.$tdlv_tel));
			hdrR.tdlv_fax(getCopyStr(dtlL, DtlR.$tdlv_fax));
			hdrR.tdlv_cntct_dpt(getCopyStr(dtlL, DtlR.$tdlv_cntct_dpt));
			hdrR.tdlv_cntct_psn(getCopyStr(dtlL, DtlR.$tdlv_cntct_psn));
		}
		else {
			hdrR.tdlv_nm(firstDtlR.tdlv_nm());
			hdrR.tdlv_lg_grp_cd(firstDtlR.tdlv_lg_grp_cd());
			hdrR.tdlv_lg_grp_nm(firstDtlR.tdlv_lg_grp_nm());
			hdrR.tdlv_zip_cd(firstDtlR.tdlv_zip_cd());
			hdrR.tdlv_addr1(firstDtlR.tdlv_addr1());
			hdrR.tdlv_addr2(firstDtlR.tdlv_addr2());
			hdrR.tdlv_addr3(firstDtlR.tdlv_addr3());
			hdrR.tdlv_addr4(firstDtlR.tdlv_addr4());
			hdrR.tdlv_tel(firstDtlR.tdlv_tel());
			hdrR.tdlv_fax(firstDtlR.tdlv_fax());
			hdrR.tdlv_cntct_dpt(firstDtlR.tdlv_cntct_dpt());
			hdrR.tdlv_cntct_psn(firstDtlR.tdlv_cntct_psn());
		}
	}

	/**
	 * コピー文字列取得
	 * 
	 * @param srcL 明細リスト
	 * @param tgtColNm 対象項目名
	 * @return コピー文字列
	 */
	protected String getCopyStr(MCList<DtlR> srcL, String tgtColNm) {
		String result = null;

		MCList<DtlR> grpL = srcL.groupBy(tgtColNm);
		if (grpL.size() == 1) {
			result = grpL.get(0).getStringNE(tgtColNm);
		}

		return result;
	}

	/**
	 * コピー行取得
	 * 
	 * @param srcL 明細リスト
	 * @param tgtColNm 対象項目名
	 * @return コピー文字列
	 */
	protected DtlR getCopyR(MCList<DtlR> srcL, String... tgtColNm) {
		DtlR result = null;

		MCList<DtlR> grpL = srcL.groupBy(tgtColNm);
		if (grpL.size() == 1) {
			result = grpL.get(0);
		}

		return result;
	}

	/**
	 * コピーＦＬＧ取得
	 * 
	 * @param srcL 対象リスト
	 * @param tgtColNm 対象項目名
	 * @return コピーＦＬＧ
	 */
	protected boolean getCopyFlg(MCList<DtlR> srcL, String tgtColNm) {
		boolean result = !srcL.isEmpty();

		if(!isNull(srcL.getFirst(tgtColNm, false))) {
			result = false;
		}

		return result;
	}

	/**
	 * [MS_MSBBL1230_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1230_Upd01Caller<P extends MSBBP_SlsDlvDtAdjstReg, B extends MS_MSBBL1230_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<Dtl_Ship_SchdR> _shipSchdLForCall = null;
		protected MCList<Dtl_Slo_PrmsR> _sloPrmsLForCall = null;
		protected MCList<Dtl_WG_RqstR> _wgRqstLForCall = null;
		protected MCList<Dtl_Sls_SchdR> _slsSchdLForCall = null;
				
		protected MS_MSBBL1230_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
			
			_shipSchdLForCall = MCList.create(Dtl_Ship_SchdR.class);
			for (Comparable<String> key : _sloShipSchdMap.keySet()) {
				if (!isNull(key)){
					_shipSchdLForCall.addAll(exceptGuiCreate(_sloShipSchdMap.get(key)));
				}
			}
			MAUCP_DateUtil.setYmdHm(_shipSchdLForCall, Dtl_Ship_SchdR.$ship_rqst_dt, Dtl_Ship_SchdR.$ship_rqst_hm);
			MAUCP_DateUtil.setYmdHm(_shipSchdLForCall, Dtl_Ship_SchdR.$pd_inst_dlv_dt, Dtl_Ship_SchdR.$pd_inst_dlv_hm);
			MAUCP_DateUtil.setYmdHm(_shipSchdLForCall, Dtl_Ship_SchdR.$ship_schd_dt, Dtl_Ship_SchdR.$ship_schd_hm);
			MAUCP_DateUtil.setYmdHm(_shipSchdLForCall, Dtl_Ship_SchdR.$dlv_schd_dt, Dtl_Ship_SchdR.$dlv_schd_hm);
			_sloPrmsLForCall = MCList.create(Dtl_Slo_PrmsR.class);
			for (Comparable<String> key : _sloPrmsMap.keySet()) {
				if (!isNull(key)){
					_sloPrmsLForCall.addAll(exceptGuiCreate(_sloPrmsMap.get(key)));
				}
			}
			MAUCP_DateUtil.setYmdHm(_sloPrmsLForCall, Dtl_Slo_PrmsR.$prms_dlv_dt, Dtl_Slo_PrmsR.$prms_dlv_hm);
			_wgRqstLForCall = MCList.create(Dtl_WG_RqstR.class);
			for (Comparable<String> key : _wgRqstMap.keySet()) {
				if (!isNull(key)){
					_wgRqstLForCall.addAll(_wgRqstMap.get(key));
				}
			}
			_slsSchdLForCall = MCList.create(Dtl_Sls_SchdR.class);
			for (Comparable<String> key : _slsSchdMap.keySet()) {
				if (!isNull(key)){
					_slsSchdLForCall.addAll(_slsSchdMap.get(key));
				}
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up2().setAll(_shipSchdLForCall);
			bridge.up3().setAll(_sloPrmsLForCall);
			bridge.up4().setAll(_wgRqstLForCall);
			bridge.up5().setAll(_slsSchdLForCall);
		}
		
		@Override
		protected boolean checkForCall() {
			
			boolean chkRslt = super.checkForCall();
			
			if (!chkRslt) {
				return chkRslt;
			}
			
			int index = DtlTable.getMCSelectedRow();
			MCColumnConfig colConfig = DtlTable.getLastSelectedColumnConfig();
			
			for (DtlR dtlR: getDtlL()) {
				
				if (colConfig != null) {
					DtlTable.focusCellAt(dtlR.getGUIIndex(), colConfig);
				}
				else {
					DtlTable.selectRowNoFocus(dtlR.getGUIIndex());
				}
				
				chkRslt = super.checkForCall();
				
				if (!chkRslt) {
					return chkRslt;
				}
			}
			
			if (colConfig != null) {
				DtlTable.focusCellAt(index, colConfig);
			}
			else {
				DtlTable.selectRowNoFocus(index);
			}
			
			return chkRslt;
		}
		
		@Override
		protected void checkReqSub(MCMessageList msgList, MCContainer c) {
			
			if (c == Dtl_Ship_SchdTable.getList()) {
				
				super.checkReqSub(msgList, exceptGuiCreate(Dtl_Ship_SchdTable.getList()));
			}
			else if (c == Dtl_Slo_PrmsTable.getList()) {
				
				super.checkReqSub(msgList, exceptGuiCreate(Dtl_Slo_PrmsTable.getList()));
			}
			else {
				
				super.checkReqSub(msgList, c);
			}
		}
		
		@Override
		protected void show() {
			super.show();
			
			for (Dtl_Ship_SchdR down0R : bridge.down0()) {
				
				MCList<Dtl_Ship_SchdR> shipSchdL = _sloShipSchdMap.get(down0R.slo_d_no());
				Dtl_Ship_SchdR shipSchdR = shipSchdL.getFirst(Dtl_Ship_SchdR.$param_row_index, down0R.param_row_index());
				
				merge(shipSchdR, down0R, getDownItemNames(0));
			}
			
			for (Dtl_Slo_PrmsR down1R : bridge.down1()) {
				
				MCList<Dtl_Slo_PrmsR> sloPrmsL = _sloPrmsMap.get(down1R.slo_d_no());
				Dtl_Slo_PrmsR sloPrmsR = sloPrmsL.getFirst(Dtl_Slo_PrmsR.$param_row_index, down1R.param_row_index());
				
				merge(sloPrmsR, down1R, getDownItemNames(1));
			}
			
			DtlR dtlR = DtlTable.getSelectedMCRow();
			
			int shipSchdIndex = Dtl_Ship_SchdTable.getMCSelectedRow();
			int sloPrmsIndex = Dtl_Slo_PrmsTable.getMCSelectedRow();
			getDtl_Ship_SchdL().setAll(_sloShipSchdMap.get(dtlR.slo_d_no()));
			getDtl_Slo_PrmsL().setAll(_sloPrmsMap.get(dtlR.slo_d_no()));
			Dtl_Ship_SchdTable.selectLeftmostColumn(shipSchdIndex);
			Dtl_Slo_PrmsTable.selectLeftmostColumn(sloPrmsIndex);
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			
			return true;
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBBL1230_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1230_Prnt01Caller<P extends MSBBP_SlsDlvDtAdjstReg, B extends MS_MSBBL1230_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1230_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			
			bridge.up1().clear();
			bridge.up1().setAll(_dtlSloPrmsL);
		}
	}
			
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Hdr_ttl_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_ttl_amt_no_cost_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Hdr_adv_bill_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_adv_rcv_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_amt_dec_place);

		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_upri_dec_place);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place);
		
		Dtl_cost_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place);
		Dtl_cost_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place);

		Dtl_iv_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_iv_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Dtl_tdlv_p_PPanel.setTdlvMode(true);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_alloc_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_wait_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_iv_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_iv_act_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_sls_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_ret_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_re_ship_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_schd_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_sls_schd_abort_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		
		Dtl_Ship_Schd_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_trd_unit_cd, columnDtl_Ship_Schd_trd_unit_dec_place);
		Dtl_Ship_Schd_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, 
				columnDtl_Ship_Schd_base_unit_dec_place,
				columnDtl_Ship_Schd_base_unit_rnd_typ,
				columnDtl_Ship_Schd_trd_unit_qty,
				columnDtl_Ship_Schd_trd_unit_conv_base_qty,
				columnDtl_Ship_Schd_trd_unit_conv_qty);
		
		Dtl_Ship_Schd_alloc_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_wait_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_ship_inst_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_ship_act_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_iv_schd_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_iv_act_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_sls_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_ship_ret_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Schd_base_unit_cd, columnDtl_Ship_Schd_base_unit_dec_place);
		Dtl_Ship_Schd_dlv_p_PPanel.setRelateBeans(Hdr_cst_cd);
		Dtl_Ship_Schd_tdlv_p_PPanel.setTdlvMode(true);
		
		Dtl_Slo_Prms_trd_unit_prms_qty_p_PPanel.setRelateBeans(columnDtl_Slo_Prms_trd_unit_cd, columnDtl_Slo_Prms_trd_unit_dec_place);
		
		Dtl_Slo_Sts_qty_p_PPanel.setRelateBeans(columnDtl_Slo_Sts_unit_cd, columnDtl_Slo_Sts_trd_unit_dec_place);
		Dtl_Slo_Sts_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_trd_cur_upri_dec_place);
		Dtl_Slo_Sts_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_Slo_Sts_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		Dtl_Alloc_Sts_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_Alloc_Sts_trd_unit_cd, columnDtl_Alloc_Sts_trd_unit_dec_place);
		Dtl_Alloc_Sts_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_Alloc_Sts_pack_unit_cd, columnDtl_Alloc_Sts_pack_unit_dec_place);
		Dtl_Alloc_Sts_ent_unit_qty_p_PPanel.setRelateBeans(columnDtl_Alloc_Sts_ent_unit_cd, columnDtl_Alloc_Sts_ent_unit_dec_place);
		Dtl_Alloc_Sts_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_Alloc_Sts_base_unit_cd, columnDtl_Alloc_Sts_base_unit_dec_place);
		Dtl_Alloc_Sts_ship_act_qty_p_PPanel.setRelateBeans(columnDtl_Alloc_Sts_base_unit_cd, columnDtl_Alloc_Sts_base_unit_dec_place);
		
		Dtl_Dlv_Inst_Rcpt_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_Dlv_Inst_Rcpt_trd_unit_cd, columnDtl_Dlv_Inst_Rcpt_trd_unit_dec_place);
		Dtl_Dlv_Inst_Rcpt_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_Dlv_Inst_Rcpt_base_unit_cd, columnDtl_Dlv_Inst_Rcpt_base_unit_dec_place);
		
		Dtl_WG_Rqst_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_WG_Rqst_trd_unit_cd, columnDtl_WG_Rqst_trd_unit_dec_place);
		
		Dtl_WG_Rqst_Prms_prms_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_WG_Rqst_Prms_prms_trd_unit_cd, columnDtl_WG_Rqst_Prms_trd_unit_dec_place);
		Dtl_WG_Rqst_Prms_prms_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_WG_Rqst_Prms_prms_base_unit_cd, columnDtl_WG_Rqst_Prms_base_unit_dec_place);
		Dtl_Sls_Schd_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_Sls_Schd_trd_unit_cd, columnDtl_Sls_Schd_trd_unit_dec_place);
		Dtl_Sls_Schd_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_Sls_Schd_base_unit_cd, columnDtl_Sls_Schd_base_unit_dec_place);
		Dtl_Sls_Schd_base_unit_abort_qty_p_PPanel.setRelateBeans(columnDtl_Sls_Schd_base_unit_cd, columnDtl_Sls_Schd_base_unit_dec_place);
		Dtl_Sls_Schd_base_unit_sls_qty_p_PPanel.setRelateBeans(columnDtl_Sls_Schd_base_unit_cd, columnDtl_Sls_Schd_base_unit_dec_place);
		
		Dtl_Ship_Act_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Act_trd_unit_cd, columnDtl_Ship_Act_trd_unit_dec_place);
		Dtl_Ship_Act_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Act_pack_unit_cd, columnDtl_Ship_Act_pack_unit_dec_place);
		Dtl_Ship_Act_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_Ship_Act_base_unit_cd, columnDtl_Ship_Act_base_unit_dec_place);
		
		Dtl_Slo_Prms_his_trd_unit_prms_qty_p_PPanel.setRelateBeans(columnDtl_Slo_Prms_his_trd_unit_cd, columnDtl_Slo_Prms_his_trd_unit_dec_place);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		setListListener(Dtl_Ship_SchdTable, createDtlShipSchdSListListener());
		setListListener(Dtl_Slo_PrmsTable, createDtlSloPrmsSListListener());
		
		columnDtl_Ship_Schd_dlv_cd.addLCListener(this);
		columnDtl_Ship_Schd_tdlv_cd.addLCListener(this);
		getDtl_Ship_Schd_dlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_slo_dt);
		getDtl_Ship_Schd_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter().putBind(BpCols.$i_dt, Hdr_slo_dt);
		getDtl_Ship_Schd_dlv_day_week_typ_nm_ListPutter().setColumns(
				DayWeekTypCols.$o_day_week_typ_nm, DayWeekTypCols.$o_day_week_typ);
	}
	
	@Override
	public MCList<?> getListForIS(MCEventBeans compo, MCRow row, MCEventInfo info) {
		if (compo == columnDtl_Ship_Schd_dlv_cd && compo instanceof MCLinkBeans) {
			return super.getDtl_Ship_Schd_dlv_p_PPanel_columnDlv_bp_cd(
					getBindRowForISCustom(row, (MCLinkBeans) compo,info.getEventIndex()), info);
		}
		return super.getListForIS(compo, row, info);
	}
	
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == columnDtl_Ship_Schd_dlv_cd) doDtl_Ship_Schd_dlv_cd_LC(info);
		if (lc == columnDtl_Ship_Schd_tdlv_cd) doDtl_Ship_Schd_tdlv_cd_LC(info);
	}
	
	/**
	 * 明細の配送先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_Ship_Schd_tdlv_cd_LC(MCEventInfo info) {
		
		Dtl_Ship_SchdR r = getDtl_Ship_SchdL().get(info.getEventIndex());
		
		setViaDlvTyp(r, r.mst_via_dlv_typ(), info.getEventIndex());
	}
	
	/**
	 * 得意先のインボイス対象取引がオフの場合は、配送先を入力しても、全明細の配送先経由区分を「経由しない」で固定する。
	 * 手配区分が仕入直送の場合も同様。
	 * @param dtlR 出荷予定
	 * @param viaDlvtyp 配送先経由区分
	 * @param index インデックス
	 */
	protected void setViaDlvTyp(Dtl_Ship_SchdR dtlR, String viaDlvtyp, int index) {
		
		DtlR sloDR = DtlTable.getSelectedMCRow();
		
		if (isNull(dtlR.tdlv_cd())) {
			dtlR.mst_via_dlv_typ(null);
			setValueEx(columnDtl_Ship_Schd_via_dlv_typ, index, null);
		}
		else {
			if (!getHdrR().cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
				setValueEx(columnDtl_Ship_Schd_via_dlv_typ, index, MAC_VIA_DLV_TYP.NOT_VIA.value());
			}
			else {
				setValueEx(columnDtl_Ship_Schd_via_dlv_typ, index, viaDlvtyp);
			}
		}
	}
	
	/**
	 * 明細の納品先ＣＤのＬＣイベント
	 * @param info MCEventInfo
	 */
	public void doDtl_Ship_Schd_dlv_cd_LC(MCEventInfo info) {
		
		DtlR sloDR = DtlTable.getSelectedMCRow();
		
		if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())
				|| sloDR.vmi_flg()) {
			
			setValueEx(columnDtl_Ship_Schd_pri_prnt_flg, info.getEventIndex(), false);
		}
	}
	
	@Override
	public void doDtl_Ship_Schd_via_dlv_typ_LC(MCEventInfo info) {
		super.doDtl_Ship_Schd_via_dlv_typ_LC(info);
		
		Dtl_Ship_SchdR r = getDtl_Ship_SchdL().get(info.getEventIndex());
		
		DtlR sloDtlR = DtlTable.getSelectedMCRow();
		
		if (MAC_VIA_DLV_TYP.isVIA(r.via_dlv_typ()) 
				|| (isNull(r.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(sloDtlR.via_dlv_typ()))) {
			setValueEx(columnDtl_Ship_Schd_dlv_day_week_typ_nm, info.getEventIndex(), null);
			setValueEx(columnDtl_Ship_Schd_pd_inst_dlv_dt, info.getEventIndex(), null);
		}
		else {
			setValueEx(columnDtl_Ship_Schd_pd_inst_dlv_dt, info.getEventIndex(), sloDtlR.dlv_rqst_dt());
			setValueEx(columnDtl_Ship_Schd_pd_inst_dlv_hm, info.getEventIndex(), sloDtlR.dlv_rqst_hm());
		}
	}
	
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		
		int index = DtlTabTab.getSelectedIndex();
		
		if (info.getEventIndex() < 0) {
			return;
		}
		
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		//受注明細ＮＯを取得する。
		String sloDno = dtlR.slo_d_no();
		
		//受注明細ＮＯをもとに出荷予定を抽出する。
		MCList<Dtl_Ship_SchdR> shipSchdList = _sloShipSchdMap.get(sloDno);
		getDtl_Ship_SchdL().setAll(shipSchdList);
		Dtl_Ship_SchdTable.adjustWidth();
		Dtl_Ship_SchdTable.selectRowNoFocus(0);
		
		//受注明細ＮＯをもとに受注納期回答を抽出する。
		MCList<Dtl_Slo_PrmsR> sloPrmsList = _sloPrmsMap.get(sloDno);
		getDtl_Slo_PrmsL().setAll(sloPrmsList);
		Dtl_Slo_PrmsTable.adjustWidth();
		Dtl_Slo_PrmsTable.selectRowNoFocus(0);
		
		//受注明細ＮＯをもとに受注状況を抽出する。
		MCList<Dtl_Slo_StsR> sloStsList = getDtl_Slo_Sts_AllL().subList(
				Dtl_Slo_StsR.$slo_d_no, sloDno);
		getDtl_Slo_StsL().setAll(sloStsList);
		Dtl_Slo_StsTable.adjustWidth();
		
		//受注明細ＮＯをもとに引当状況を抽出する。
		MCList<Dtl_Alloc_StsR> allocStsList = getDtl_Alloc_Sts_AllL().subList(
				Dtl_Alloc_StsR.$slo_d_no, sloDno);
		getDtl_Alloc_StsL().setAll(allocStsList);
		Dtl_Alloc_StsTable.adjustWidth();
		
		//受注明細ＮＯをもとに納入指示受領を抽出する。
		MCList<Dtl_Dlv_Inst_RcptR> dlvInstRcptList = getDtl_Dlv_Inst_Rcpt_AllL().subList(
				Dtl_Dlv_Inst_RcptR.$slo_d_no, sloDno);
		getDtl_Dlv_Inst_RcptL().setAll(dlvInstRcptList);
		Dtl_Dlv_Inst_RcptTable.adjustWidth();
		
		// ＷＧ間依頼回答情報をクリアする。
		getDtl_WG_Rqst_PrmsL().clear();
		
		//受注明細ＮＯをもとにＷＧ間依頼を抽出する。
		MCList<Dtl_WG_RqstR> wgRqstList = _wgRqstMap.get(sloDno);
		getDtl_WG_RqstL().setAll(wgRqstList);
		Dtl_WG_RqstTable.adjustWidth();
		Dtl_WG_RqstTable.selectRowNoFocus(0);
		// 売上予定情報をクリアする。
		getDtl_Sls_SchdL().clear();
		
		//受注明細ＮＯをもとに売上予定を抽出する。
		MCList<Dtl_Sls_SchdR> slsSchdList = _slsSchdMap.get(sloDno);
		getDtl_Sls_SchdL().setAll(slsSchdList);
		Dtl_Sls_SchdTable.adjustWidth();
		Dtl_Sls_SchdTable.selectRowNoFocus(0);
		
		//受注明細ＮＯをもとに出荷実績を抽出する。
		MCList<Dtl_Ship_ActR> shipActList = getDtl_Ship_Act_AllL().subList(
				Dtl_Ship_ActR.$slo_d_no, sloDno);
		getDtl_Ship_ActL().setAll(shipActList);
		Dtl_Ship_ActTable.adjustWidth();
		
		//受注明細ＮＯをもとに納期回答履歴を抽出する。
		MCList<Dtl_Slo_Prms_hisR> sloPrmsHisList = getDtl_Slo_Prms_his_AllL().subList(
				Dtl_Slo_Prms_hisR.$slo_d_no, sloDno);
		getDtl_Slo_Prms_hisL().setAll(sloPrmsHisList);
		Dtl_Slo_Prms_hisTable.adjustWidth();
		
		setBtnMode();

		DtlTabTab.setSelectedIndex(index);
	}

	@Override
	public void doDtl_Ship_Schd_NC(MCEventInfo info) {
		super.doDtl_Ship_Schd_NC(info);
		
		setShipSchdRDelBtnMode();
		
		setOpenMSBEP0040BtnMode();
		
		setSloPrmsRAddBtnMode();
	}
	
	@Override
	public void doDtl_Slo_Prms_NC(MCEventInfo info) {
		super.doDtl_Slo_Prms_NC(info);
		
		setSloPrmsRDelBtnMode();
	}
	
	@Override
	public void doDtl_Ship_Schd_abort_flg_NC(MCEventInfo info) {
		super.doDtl_Ship_Schd_abort_flg_NC(info);
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		Dtl_Ship_SchdR shipSchdR = getDtl_Ship_SchdL().get(info.getEventIndex());
		
		for (Dtl_Slo_PrmsR prmsR : getDtl_Slo_PrmsL()) {
			
			if (isSame(prmsR.slo_prms_no(), shipSchdR.slo_prms_no()) 
					|| (prmsR.isStatusDelete() && isSame(prmsR.slo_prms_no(), shipSchdR.org_slo_prms_no()))
					|| (!isNull(shipSchdR.slo_prms_index()) && isSame(prmsR.slo_prms_index(), shipSchdR.slo_prms_index()))) {
				
				Dtl_Slo_PrmsTable.deleteRowNoFocus(prmsR.getGUIIndex());
				if (shipSchdR.abort_flg()) {
					
					shipSchdR.slo_prms_no(null);
				}
				else {
					shipSchdR.slo_prms_no(prmsR.slo_prms_no());
				}
				
				break;
			}
		}
		
		replaceSloPrmsMap(dtlR);
		
		setSloPrmsRAddBtnMode();
		
		setShipSchdRDelBtnMode();
		
		setSloPrmsBtnMode();
	}
	
	@Override
	public void doDtl_WG_Rqst_NC(MCEventInfo info) {
		super.doDtl_WG_Rqst_NC(info);
		
		Dtl_WG_RqstR wgRqstR = Dtl_WG_RqstTable.getSelectedMCRow();
		
		getDtl_WG_Rqst_PrmsL().clear();
		
		if (!isNull(wgRqstR) && !wgRqstR.isEmpty()) {
			
			MCIndexKey idxkey = getDtl_WG_Rqst_Prms_AllL().createIndex(Dtl_WG_Rqst_PrmsR.$wg_rqst_no, Dtl_WG_Rqst_PrmsR.$wg_rqst_src_no);
			
			MCList<Dtl_WG_Rqst_PrmsR> wgRqstPrmsList = getDtl_WG_Rqst_Prms_AllL().subList(
					idxkey, wgRqstR.wg_rqst_no(), wgRqstR.wg_rqst_src_no());
			
			getDtl_WG_Rqst_PrmsL().setAll(wgRqstPrmsList);

			Dtl_WG_Rqst_PrmsTable.selectRowNoFocus(0);
			Dtl_WG_Rqst_PrmsTable.adjustAllWidth();
		}
	}
	
	@Override
	public void doDtl_WG_Rqst_re_rqst_flg_NC(MCEventInfo info) {
		super.doDtl_WG_Rqst_re_rqst_flg_NC(info);
		
		Dtl_WG_RqstR dR = getDtl_WG_RqstL().get(info.getEventIndex());
		if (dR.re_rqst_flg()) {
			dR.prms_uncn_flg(false);
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		if (Cnd_ope_REF.isSelected()) {
			
			clearAll();
			setSRCHStatus();
			getBtnR().prnt_out_flg(false);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			
			if (isSame(getStatus(), REF)) {
				setUPDStatus();
			}
			else {
				setSRCHStatus();
			}
		}
	}
	
	@Override
	public MCList<?> getDtl_Ship_Schd_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info) {
		
		row.setStringNE(BpCols.$i_cst_cd, getHdrR().cst_cd());
		row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.DLV_BY_CST.value());
		return super.getDtl_Ship_Schd_dlv_p_PPanel_columnDlv_bp_cd(row, info);
	}
	
	
	/**
	 * 画面をクリアする。
	 */
	protected void clearAll() {
		
		clearContainers(getHdrR(), 
				getDtlL(), 
				getDtl_Ship_SchdL(), 
				getDtl_Ship_Schd_AllL(), 
				getDtl_Slo_PrmsL(),
				getDtl_Slo_Prms_AllL(), 
				getDtl_Slo_StsL(),
				getDtl_Slo_Sts_AllL(),
				getDtl_Alloc_StsL(),
				getDtl_Alloc_Sts_AllL(),
				getDtl_Dlv_Inst_RcptL(),
				getDtl_Dlv_Inst_Rcpt_AllL(),
				getDtl_WG_RqstL(),
				getDtl_WG_Rqst_AllL(),
				getDtl_WG_Rqst_PrmsL(),
				getDtl_WG_Rqst_Prms_AllL(),
				getDtl_Sls_SchdL(),
				getDtl_Sls_Schd_AllL(),
				getDtl_Ship_ActL(),
				getDtl_Ship_Act_AllL(),
				getDtl_Slo_Prms_hisL(),
				getDtl_Slo_Prms_his_AllL());
		
		_sloShipSchdMap.clear();
		_sloPrmsMap.clear();
		_wgRqstMap.clear();
		_slsSchdMap.clear();
	}

	/**
	 * ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		setShipSchdBtnMode();
		
		setSloPrmsBtnMode();
		
		setOpenBtnMode();
	}
	
	/**
	 * 出荷予定のボタンの制御を行う。
	 */
	protected void setShipSchdBtnMode() {
		
		if (isShipSchdBtnDisable()) {
			
			CtLeftBtn_radd.setMode(MCMode.DISABLE);
			CtLeftBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(CtLeftBtn_radd);
			setDefaultMode(CtLeftBtn_rcopy);
		}

		setShipSchdRDelBtnMode();
	}
	
	/**
	 * 出荷予定行削除ボタンの制御を行う。
	 */
	protected void setShipSchdRDelBtnMode() {

		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
				
		if (isShipSchdBtnDisable()
				|| isNull(shipSchdR)
				|| !isNull(shipSchdR.slo_prms_no()) 
				|| shipSchdR.abort_flg()
				|| shipSchdR.org_abort_flg()
				|| (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0))
				|| (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
				|| (((!isNull(shipSchdR.sls_qty()) && shipSchdR.sls_qty().gt(0))
						|| (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0)))
						&& (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
						&& !isNull(shipSchdR.sls_act_d_no()))
				|| isOriginalShipSchdSlsCststk(shipSchdR)
				|| (!isNull(shipSchdR.iv_schd_qty()) && shipSchdR.iv_schd_qty().gt(0))) {
			
			CtLeftBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(CtLeftBtn_rdel);
		}
	}
	
	/**
	 * 引数に指定されている出荷予定が預り売上時の元の出荷予定かを判定する。
	 * @param shipSchdR 出荷予定
	 * @return 預り売上時の元の出荷予定の場合はtrue
	 */
	protected boolean isOriginalShipSchdSlsCststk(Dtl_Ship_SchdR shipSchdR) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR.sls_cststk_flg()
				&& !isNull(shipSchdR.sls_act_d_no()) 
				&& !isNull(shipSchdR.sls_qty())
				&& shipSchdR.sls_qty().gt(0) 
				&& getDtl_Sls_SchdL().subList(Dtl_Sls_SchdR.$ship_schd_no, shipSchdR.ship_schd_no()).size() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 納期回答ボタンのモードを設定する。
	 */
	protected void setSloPrmsBtnMode() {
		
		if (isSloPrmsNotEditable()) {
				
			CtRightBtn_dlvSchdUpd.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(CtRightBtn_dlvSchdUpd);
		}
		
		setSloPrmsRAddBtnMode();
		
		setSloPrmsRDelBtnMode();
	}
	
	/**
	 * 納期回答の行削除のモードを設定する。
	 */
	protected void setSloPrmsRDelBtnMode() {
		
		Dtl_Slo_PrmsR sloPrmsR = Dtl_Slo_PrmsTable.getSelectedMCRow();
		
		if (isSloPrmsNotEditable() || isNull(sloPrmsR) || isShipSchdAbort(sloPrmsR.slo_prms_no())) {
			CtRightBtn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(CtRightBtn_rdel);
		}
	}
	
	/**
	 * 納期回答の行追加・行コピーボタンのモードを設定する。
	 */
	protected void setSloPrmsRAddBtnMode() {
			
		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		
		if (isSloPrmsNotEditable() 
				|| isNull(shipSchdR) 
				|| shipSchdR.isStatusGUICreate()
				|| shipSchdR.isStatusDelete()
				|| shipSchdR.abort_flg()
				|| isShipSchdPrms(shipSchdR)
				|| !isNull(shipSchdR.slo_prms_no())) {
			
			CtRightBtn_radd.setMode(MCMode.DISABLE);
			CtRightBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			
			setDefaultMode(CtRightBtn_radd);
			setDefaultMode(CtRightBtn_rcopy);
		}
	}
	
	/**
	 * 画面遷移ボタンのモードを設定する。
	 */
	protected void setOpenBtnMode() {
		
		if (isNull(getHdrR().slo_no()) || getHdrR().can_flg()) {
			
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
			Btn_open_MSBBP1240.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1210);
			setDefaultMode(Btn_open_MSBBP1240);
		}
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR) 
				|| dtlR.isEmpty() 
				|| dtlR.can_flg() 
				|| (dtlR.abort_flg() && isSame(dtlR.ship_schd_abort_qty(), dtlR.base_unit_qty()))
				|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
				|| MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
			
			Btn_open_MSBEP0060.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0060);
		}
		
		String sloMfgSnoTyp = getSysParm("SLO_MFG_SNO_TYP");
		if (isNull(dtlR) 
				|| dtlR.isEmpty() 
				|| dtlR.can_flg() 
				|| (dtlR.abort_flg() && isSame(dtlR.ship_schd_abort_qty(), dtlR.base_unit_qty()))
				|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
				|| MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())
				|| isNull(sloMfgSnoTyp)
				|| (isSame(sloMfgSnoTyp, "1") && isNullOrNullVal(dtlR.sno1()))
				|| (isSame(sloMfgSnoTyp, "2") && isNullOrNullVal(dtlR.sno2()))
				|| (isSame(sloMfgSnoTyp, "3") && isNullOrNullVal(dtlR.sno3()))
				|| (isSame(sloMfgSnoTyp, "4") && isNullOrNullVal(dtlR.sno4()))) {
			
			Btn_open_MSBCP0080.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBCP0080);
		}
		
		setOpenMSBEP0040BtnMode();
	}
	
	/**
	 * 在庫引当状況画面遷移ボタンのモードを設定する。
	 */
	protected void setOpenMSBEP0040BtnMode() {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		Dtl_Ship_SchdR dtlShipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		
		if (isNull(dtlR) 
				|| dtlR.isEmpty() 
				|| isNull(dtlShipSchdR) 
				|| dtlShipSchdR.isEmpty() 
				|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
				|| MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
			
			Btn_open_MSBEP0040.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0040);
		}
	}
	protected void setPrntPrmsBtnMode() {
		
		DtlR dtlR = getDtlL().get(0);
		
		if(Cnd_ope_UPD.isSelected()) {
			if(dtlR.edi_prms_flg()) {
				getBtnR().prnt_out_flg(false);
				Btn_prnt_out_flg.setMode(MCMode.ENABLE);
			}
			else {
				getBtnR().prnt_out_flg(true);
				Btn_prnt_out_flg.setMode(MCMode.REQUIRED);
			}
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		setCstIvMode();
		setBtnMode();
		EdiPrmsFlg();
		setEdiPrmsFlg();
		setHdrCanMode();
		getBtnR().prnt_out_flg(true);
		setPrntPrmsBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		setCstIvMode();
		
		if(isNull(getDtl_Slo_Prms_AllL())){
			Btn_prnt_prms.setMode(MCMode.READ_ONLY);
		}
	}
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		
		setOpenBtnMode();
	}
	
	/**
	 * インボイス取引用項目の表示モードを設定する。
	 */
	protected void setCstIvMode() {
		
		if (!getHdrR().cst_iv_flg()) {

			columnDtl_iv_itm_nm.setVisible(false);
			columnDtl_cntry_org_cd.setVisible(false);
			columnDtl_cntry_org_nm.setVisible(false);
			columnDtl_iv_upri.setVisible(false);
			columnDtl_iv_amt.setVisible(false);
		}
		else {
			
			setDefaultMode(columnDtl_iv_itm_nm);
			setDefaultMode(columnDtl_cntry_org_cd);
			setDefaultMode(columnDtl_cntry_org_nm);
			setDefaultMode(columnDtl_iv_upri);
			setDefaultMode(columnDtl_iv_amt);
		}
	}

	/**
	 * 納期回答の初回登録の場合、納期回答のデータを入力した後に「ＥＤＩ納期回答」入力可能になり、
	 * EDI IF制御マスタにレコード存在する場合オンで初期表示する。納期回答を初回登録した後に、「ＥＤＩ納期回答」が変更不可になる。
	 */
	protected void EdiPrmsFlg() {
	}

	protected void setEdiPrmsFlg() {
		for (DtlR dtlR : getDtlL()) {
			// ＥＤＩ納期回答送信対象を今回ＥＤＩ納期回答にコピーする。
			dtlR.edi_prms_flg(dtlR.edi_send_flg());

			// 今回ＥＤＩ納期回答の編集可否を制御する
			if (dtlR.edi_send_flg()) {
				columnDtl_edi_prms_flg.setMode(MCMode.ENABLE);
			}
			else {
				columnDtl_edi_prms_flg.setMode(MCMode.READ_ONLY);
			}
		}
	}
	/**
	 * 受注ヘッダの取消関連項目のモードを設定する。
	 */
	protected void setHdrCanMode() {
		
		//取消FLGの場合取消理由、取消備考入力可能
		if (!getHdrR().can_flg()) {
			
			Hdr_can_rsn_cd.setMode(MCMode.READ_ONLY);
			Hdr_can_rmrks.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_can_rsn_cd);
			setDefaultMode(Hdr_can_rmrks);
		}
	}
	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL1230_Srch01();
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {

		callMS_MSBBL1230_Upd01();
	}

	/**
	 * Panel[CtLeftBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doCtLeftBtn_radd(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		if (dtlR == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		
		Dtl_Ship_SchdR insR = insertRow(Dtl_Ship_SchdTable);
		insR.fix_flg(shipSchdR.fix_flg());
		
		setShipSchdRDefValue(insR, dtlR);
		
		replaceSloShipSchdMap(dtlR);
		
		fixSrcShipSchd(shipSchdR);
		
		setSloPrmsRAddBtnMode();
		
		setShipSchdRDelBtnMode();
	}
	
	/**
	 * 分割元の出荷予定の確定をオンにする。
	 * @param shipSchdR 出荷予定
	 */
	protected void fixSrcShipSchd(Dtl_Ship_SchdR shipSchdR) {
		
		if (isEditable(columnDtl_Ship_Schd_fix_flg, shipSchdR.getGUIIndex()) && !shipSchdR.fix_flg()) {
			setValueEx(columnDtl_Ship_Schd_fix_flg, shipSchdR.getGUIIndex(), true);
		}
	}
	
	/**
	 * 出荷予定の初期値を設定する。
	 * @param shipSchdR 出荷予定
	 * @param dtlR 受注明細
	 */
	protected void setShipSchdRDefValue(Dtl_Ship_SchdR shipSchdR, DtlR dtlR) {
		
		if (shipSchdR.isStatusGUICreate()) {
			
			shipSchdR.slo_d_no(dtlR.slo_d_no());
			shipSchdR.trd_unit_cd(dtlR.trd_unit_cd());
			shipSchdR.trd_unit_nm(dtlR.trd_unit_nm());
			shipSchdR.trd_unit_dec_place(dtlR.trd_unit_dec_place());
			shipSchdR.trd_unit_conv_base_qty(dtlR.trd_unit_conv_base_qty());
			shipSchdR.trd_unit_conv_qty(dtlR.trd_unit_conv_qty());
			shipSchdR.base_unit_cd(dtlR.base_unit_cd());
			shipSchdR.base_unit_nm(dtlR.base_unit_nm());
			shipSchdR.base_unit_dec_place(dtlR.base_unit_dec_place());
			shipSchdR.base_unit_rnd_typ(dtlR.base_unit_rnd_typ());
		}
		
		if (!isEditable(columnDtl_Ship_Schd_ship_fr_lg_grp_cd, shipSchdR.getGUIIndex())) {
			// 出荷元物流Ｇが入力不可の場合に、初期値を設定する。
			Dtl_Ship_SchdR srcShipSchdR = getDtl_Ship_SchdL().subList(r -> !isNull(r.ship_schd_no())).get(0);
			
			if (!isNull(srcShipSchdR)) {
				shipSchdR.ship_fr_lg_grp_cd(srcShipSchdR.ship_fr_lg_grp_cd());
				shipSchdR.ship_fr_lg_grp_nm(srcShipSchdR.ship_fr_lg_grp_nm());
				shipSchdR.wg_cd(srcShipSchdR.wg_cd());
				shipSchdR.wg_nm(srcShipSchdR.wg_nm());
			}
		}
	}
	
	/**
	 * 受注明細に紐付く出荷予定情報をマップに格納する。
	 * @param dtlL 受注明細リスト
	 * @param shipSchdL 受注納期回答リスト
	 */
	protected void setSloShipSchdMap(MCList<DtlR> dtlL, MCList<Dtl_Ship_SchdR> shipSchdL) {

		_sloShipSchdMap.clear();
		
		MCIndexKey idxkey = shipSchdL.createIndex(Dtl_Ship_SchdR.$slo_d_no);
		
		for (DtlR dtlR : dtlL) {
			
			_sloShipSchdMap.put(dtlR.slo_d_no(), shipSchdL.subList(idxkey, dtlR.slo_d_no()));
		}
	}
	
	/**
	 * 受注明細に紐付く納期回答をマップに格納する。
	 * @param dtlL 受注明細リスト
	 * @param sloPrmsL 受注納期回答リスト
	 */
	protected void setSloPrmsMap(MCList<DtlR> dtlL, MCList<Dtl_Slo_PrmsR> sloPrmsL) {

		_sloPrmsMap.clear();
		
		MCIndexKey idxkey = sloPrmsL.createIndex(Dtl_Slo_PrmsR.$slo_d_no);
		
		for (DtlR dtlR : dtlL) {
			
			_sloPrmsMap.put(dtlR.slo_d_no(), sloPrmsL.subList(idxkey, dtlR.slo_d_no()));
		}
	}
	
	/**
	 * 受注明細に紐付くＷＧ間依頼をマップに格納する。
	 * @param dtlL 受注明細リスト
	 * @param wgRqstL ＷＧ間依頼リスト
	 */
	protected void setWgRqstMap(MCList<DtlR> dtlL, MCList<Dtl_WG_RqstR> wgRqstL) {

		_wgRqstMap.clear();
		
		MCIndexKey idxkey = wgRqstL.createIndex(Dtl_WG_RqstR.$slo_d_no);
		
		for (DtlR dtlR : dtlL) {
			
			_wgRqstMap.put(dtlR.slo_d_no(), wgRqstL.subList(idxkey, dtlR.slo_d_no()));
		}
	}
	/**
	 * 受注明細に紐付く売上予定をマップに格納する。
	 * @param dtlL 受注明細リスト
	 * @param slsSchdL 売上予定リスト
	 */
	protected void setSlsSchdMap(MCList<DtlR> dtlL, MCList<Dtl_Sls_SchdR> slsSchdL) {

		_slsSchdMap.clear();
		
		MCIndexKey idxkey = slsSchdL.createIndex(Dtl_WG_RqstR.$slo_d_no);
		
		for (DtlR dtlR : dtlL) {
			
			_slsSchdMap.put(dtlR.slo_d_no(), slsSchdL.subList(idxkey, dtlR.slo_d_no()));
		}
	}
	
	/**
	 * 指定した受注明細の出荷予定マップを上書きする。
	 * @param dtlR 受注明細
	 */
	protected void replaceSloShipSchdMap(DtlR dtlR) {
		
		_sloShipSchdMap.replace(dtlR.slo_d_no(), getDtl_Ship_SchdL().clone());
		
		int index = Dtl_Ship_SchdTable.getMCSelectedRow();
		MCColumnConfig colConfig = Dtl_Ship_SchdTable.getLastSelectedColumnConfig();
		
		MCList<Dtl_Ship_SchdR> shipSchdL = _sloShipSchdMap.get(dtlR.slo_d_no());
		getDtl_Ship_SchdL().setAll(shipSchdL);
		
		if (index > -1) {
			
			if (colConfig != null) {
				Dtl_Ship_SchdTable.focusCellAt(index, colConfig);
			}
			else {
				Dtl_Ship_SchdTable.selectRowNoFocus(index);
			}
		}
	}

	/**
	 * Panel[CtLeftBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doCtLeftBtn_rdel(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		Dtl_Ship_SchdR shipSchdR = deleteRow(Dtl_Ship_SchdTable);
		
		if (!isNull(shipSchdR)) {
			for (Dtl_Slo_PrmsR sloPrmsR : exceptDeleteAndEmpty(getDtl_Slo_PrmsL())) {
				
				if ((!isNull(shipSchdR.ship_schd_no()) && isSame(shipSchdR.ship_schd_no(), sloPrmsR.ship_schd_no())) 
						|| (!isNull(shipSchdR.slo_prms_index()) && isSame(shipSchdR.slo_prms_index(), sloPrmsR.slo_prms_index()))) {
					
					if (!isSloPrmsNotEditable() && !sloPrmsR.isStatusDelete()) {
						deleteRow(Dtl_Slo_PrmsTable, sloPrmsR.getGUIIndex());
						replaceSloPrmsMap(dtlR);
						break;
					}
				}
			}
		}
		
		replaceSloShipSchdMap(dtlR);
		
		setSloPrmsRAddBtnMode();
	}

	/**
	 * Panel[CtLeftBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doCtLeftBtn_rcopy(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		Dtl_Ship_SchdR srcR = Dtl_Ship_SchdTable.getSelectedMCRow();
		Dtl_Ship_SchdR shipSchdR = copyRow(Dtl_Ship_SchdTable);
		
		if (!isNull(shipSchdR)) {
			
			shipSchdR.ship_schd_no(null);
			shipSchdR.slo_prms_no(null);
			shipSchdR.pr_sts_typ(null);
			shipSchdR.pr_sts_typ_nm(null);
			shipSchdR.alloc_sts_typ(null);
			shipSchdR.alloc_sts_typ_nm(null);
			shipSchdR.answd_flg(false);
			shipSchdR.abort_flg(false);
			shipSchdR.org_abort_flg(false);
			shipSchdR.ship_abl_flg(false);
			shipSchdR.cmpl_flg(false);
			shipSchdR.alloc_qty(null);
			shipSchdR.wait_qty(null);
			shipSchdR.ship_inst_qty(null);
			shipSchdR.ship_act_qty(null);
			shipSchdR.iv_schd_qty(null);
			shipSchdR.iv_act_qty(null);
			shipSchdR.sls_qty(null);
			shipSchdR.ship_ret_qty(null);
			shipSchdR.org_slo_prms_no(null);
			
			if (srcR.isStatusGUICreate()) {
				shipSchdR.setStatus(Status.GUICREATE);
			}
		}
		
		replaceSloShipSchdMap(dtlR);
		
		fixSrcShipSchd(srcR);
		
		setSloPrmsRAddBtnMode();
		
		setShipSchdRDelBtnMode();
	}
	
	/**
	 * Panel[CtRightBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doCtRightBtn_radd(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		
		if (isNull(dtlR) || isNull(shipSchdR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		if ((!isShipSchdNotEditable() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) && shipSchdR.isStatusNone()) {
			shipSchdR.setStatus(Status.MODIFY);
		}
		
		MCNumber maxIdx = nvl((MCNumber)getDtl_Slo_PrmsL().max(Dtl_Slo_PrmsR.$slo_prms_index), MCNumber.ZERO);
		shipSchdR.slo_prms_index(maxIdx.add(1));
		
		Dtl_Slo_PrmsR sloPrmsR = insertRow(Dtl_Slo_PrmsTable);
		
		setSloPrmsRDefValue(sloPrmsR, dtlR, shipSchdR);
		sloPrmsR.slo_prms_index(shipSchdR.slo_prms_index());
		sloPrmsR.ship_schd_no(shipSchdR.ship_schd_no());
		sloPrmsR.dlv_inst_rcpt_no(shipSchdR.dlv_inst_rcpt_no());
		
		replaceSloPrmsMap(dtlR);
		
		Dtl_Slo_PrmsTable.adjustWidth();
		
		setSloPrmsRAddBtnMode();
		
		EdiPrmsFlg();
	}
	
	/**
	 * 納期回答の初期値を設定する。
	 * @param sloPrmsR 納期回答
	 * @param dtlR 受注明細
	 * @param shipSchdR 出荷予定
	 */
	protected void setSloPrmsRDefValue(Dtl_Slo_PrmsR sloPrmsR, DtlR dtlR, Dtl_Ship_SchdR shipSchdR) {
		
		if (sloPrmsR.isStatusGUICreate()) {
			
			sloPrmsR.slo_d_no(dtlR.slo_d_no());
			sloPrmsR.trd_unit_cd(shipSchdR.trd_unit_cd());
			sloPrmsR.trd_unit_dec_place(shipSchdR.trd_unit_dec_place());
		}
	}
	
	/**
	 * 指定した受注明細の受注納期回答マップを上書きする。
	 * @param dtlR 受注明細
	 */
	protected void replaceSloPrmsMap(DtlR dtlR) {
		
		_sloPrmsMap.replace(dtlR.slo_d_no(), getDtl_Slo_PrmsL().clone());
		
		int index = Dtl_Slo_PrmsTable.getMCSelectedRow();
		MCColumnConfig colConfig = Dtl_Slo_PrmsTable.getLastSelectedColumnConfig();
		
		MCList<Dtl_Slo_PrmsR> sloPrmsL = _sloPrmsMap.get(dtlR.slo_d_no());
		getDtl_Slo_PrmsL().setAll(sloPrmsL);
		
		if (index > -1) {
			
			if (colConfig != null) {
				Dtl_Slo_PrmsTable.focusCellAt(index, colConfig);
			}
			else {
				Dtl_Slo_PrmsTable.selectRowNoFocus(index);
			}
		}
	}

	/**
	 * Panel[CtRightBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doCtRightBtn_rdel(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		Dtl_Slo_PrmsR sloPrmsR = deleteRow(Dtl_Slo_PrmsTable);
		
		if (!isNull(sloPrmsR)) {
			
			delShipSchdPrms(sloPrmsR);
			
			replaceSloPrmsMap(dtlR);
			
			setSloPrmsRAddBtnMode();
			
			EdiPrmsFlg();
		}
	}
	
	/**
	 * 指定された納期回答に紐付く出荷予定の納期回答NOをクリアする。
	 * @param sloPrmsR 納期回答
	 */
	protected void delShipSchdPrms(Dtl_Slo_PrmsR sloPrmsR) {
		
		for (Dtl_Ship_SchdR shipSchdR : exceptDeleteAndEmpty(getDtl_Ship_SchdL())) {
			
			if (!isNull(sloPrmsR.slo_prms_no())
					&& (isSame(shipSchdR.slo_prms_no(), sloPrmsR.slo_prms_no()) 
					|| isSame(shipSchdR.org_slo_prms_no(), sloPrmsR.slo_prms_no()))) {
				
				DtlR dtlR = DtlTable.getSelectedMCRow();
				if ((!isShipSchdNotEditable() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) && shipSchdR.isStatusNone()) {
					shipSchdR.setStatus(Status.MODIFY);
				}
				
				if (sloPrmsR.isStatusDelete()) {
					shipSchdR.slo_prms_no(null);
				}
				else {
					shipSchdR.slo_prms_no(shipSchdR.org_slo_prms_no());
				}
			}
		}
	}

	/**
	 * Panel[CtRightBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doCtRightBtn_rcopy(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		Dtl_Slo_PrmsR sloPrmsR = copyRow(Dtl_Slo_PrmsTable);
		
		if (isNull(dtlR) || isNull(shipSchdR) || isNull(sloPrmsR)) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		if ((!isShipSchdNotEditable() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) && shipSchdR.isStatusNone()) {
			shipSchdR.setStatus(Status.MODIFY);
		}
		
		MCNumber maxIdx = nvl((MCNumber)getDtl_Slo_PrmsL().max(Dtl_Slo_PrmsR.$slo_prms_index), MCNumber.ZERO);
		shipSchdR.slo_prms_index(maxIdx.add(1));
		
		setSloPrmsRDefValue(sloPrmsR, dtlR, shipSchdR);
		sloPrmsR.slo_prms_no(null);
		sloPrmsR.slo_prms_rev(null);
		sloPrmsR.slo_prms_index(shipSchdR.slo_prms_index());
		sloPrmsR.ship_schd_no(shipSchdR.ship_schd_no());
		sloPrmsR.dlv_inst_rcpt_no(shipSchdR.dlv_inst_rcpt_no());
		
		replaceSloPrmsMap(dtlR);
		
		Dtl_Slo_PrmsTable.adjustWidth();
		
		setSloPrmsRAddBtnMode();
		
		EdiPrmsFlg();
	}

	/**
	 * Panel[CtRightBtn]のボタン[dlvSchdUpd]の押下時の処理
	 */
	@Override
	public void doCtRightBtn_dlvSchdUpd(MCEventInfo info) {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		MCList<Dtl_Slo_PrmsR> delL = MCList.create(Dtl_Slo_PrmsR.class);
		
		for (Dtl_Slo_PrmsR prmsR : getDtl_Slo_PrmsL()) {
			
			if (isNull(prmsR.slo_prms_no())) {
				
				delL.add(prmsR);
				continue;
			}
			
			boolean isExist = false;
			for (Dtl_Ship_SchdR shipSchdR : getDtl_Ship_SchdL()) {
				
				if (isSame(prmsR.slo_prms_no(), shipSchdR.slo_prms_no()) 
						|| (prmsR.isStatusDelete() && isSame(prmsR.slo_prms_no(), shipSchdR.org_slo_prms_no()))) {
					
					isExist = true;
					if (!shipSchdR.abort_flg()) {
						
						setValueEx(columnDtl_Slo_Prms_slo_d_no, prmsR.getGUIIndex(), shipSchdR.slo_d_no());
						setValueEx(columnDtl_Slo_Prms_ship_schd_no, prmsR.getGUIIndex(), shipSchdR.ship_schd_no());
						setValueEx(columnDtl_Slo_Prms_dlv_inst_rcpt_no, prmsR.getGUIIndex(), shipSchdR.dlv_inst_rcpt_no());
						setValueEx(columnDtl_Slo_Prms_prms_dlv_dt, prmsR.getGUIIndex(), shipSchdR.dlv_schd_dt());
						setValueEx(columnDtl_Slo_Prms_prms_dlv_hm, prmsR.getGUIIndex(), shipSchdR.dlv_schd_hm());
						setValueEx(columnDtl_Slo_Prms_trd_unit_prms_qty, prmsR.getGUIIndex(), shipSchdR.trd_unit_qty());
						
						if (prmsR.isStatusDelete()) {
							prmsR.setStatus(Status.MODIFY);
							shipSchdR.slo_prms_no(prmsR.slo_prms_no());
						}
					}
					break;
				}
			}
			if (!isExist && !prmsR.isStatusDelete()) {
				
				delL.add(prmsR);
			}
		}
		
		for (Dtl_Slo_PrmsR delR : delL) {
			
			Dtl_Slo_PrmsTable.deleteRowNoFocus(delR.getGUIIndex());
			delShipSchdPrms(delR);
		}
		
		MCNumber maxIdx = MCNumber.ZERO;
		
		MCList<Dtl_Slo_PrmsR> newL = MCList.create(Dtl_Slo_PrmsR.class);
		
		Set<String> prmsNoSet = new HashSet<String>();
		
		for (Dtl_Ship_SchdR shipSchdR : getDtl_Ship_SchdL()) {
			
			if (isNull(shipSchdR.ship_schd_no()) && shipSchdR.isStatusNone()) {
				continue;
			}
			
			// 納期回答後に販売納期調整以外で出荷予定が分割されることがあるため、
			// 一旦回答ＮＯをクリアして回答が分割されるようにする
			if (!isNull(shipSchdR.slo_prms_no()) && !shipSchdR.abort_flg() && !shipSchdR.isStatusDelete()) {
				if (prmsNoSet.contains(shipSchdR.slo_prms_no())) {
					shipSchdR.slo_prms_no(null);
				}
				else {
					prmsNoSet.add(shipSchdR.slo_prms_no());
				}
			}
			
			if (isNull(shipSchdR.slo_prms_no()) && !shipSchdR.abort_flg() && !shipSchdR.isStatusDelete()) {
				
				if ((!isShipSchdNotEditable() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) && shipSchdR.isStatusNone()) {
					shipSchdR.setStatus(Status.MODIFY);
				}
				
				maxIdx = maxIdx.add(1);
				shipSchdR.slo_prms_index(maxIdx);
				
				Dtl_Slo_PrmsR sloPrmsR = Dtl_Slo_PrmsR.create();
				copy(sloPrmsR, shipSchdR, createMap_Dtl_Slo_PrmsR_Dtl_Ship_SchdR());
				sloPrmsR.slo_prms_index(shipSchdR.slo_prms_index());
				sloPrmsR.setStatus(Status.CREATE);
				newL.add(sloPrmsR);
			}
		}
		getDtl_Slo_PrmsL().addAll(newL);
		
		replaceSloPrmsMap(dtlR);
		
		Dtl_Slo_PrmsTable.adjustWidth();
		
		setSloPrmsRAddBtnMode();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.putCnd(crtOpenMSBBP1210CndR(aso));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 受注登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(
			MAUCP_AppScreenOpener aso) {
		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = (mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();
			
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(getHdrR().slo_no());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1240]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1240(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1240");
		aso.putCnd(crtOpenMSBBP1240CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 納入指示受領登録画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBB.MSBBP1240.CndR crtOpenMSBBP1240CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBB.MSBBP1240.MSBBP_DlvInstRcptReg p = (mcframe.clientMSBB.MSBBP1240.MSBBP_DlvInstRcptReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1240.CndR to = mcframe.clientMSBB.MSBBP1240.CndR.create();
			
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.slo_no(getHdrR().slo_no());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0060(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0060");
		aso.putCnd(crtOpenMSBEP0060CndR(aso));
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	
	/**
	 * 在庫推移画面の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBE.MSBEP0060.CndR crtOpenMSBEP0060CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBE.MSBEP0060.CndR to = mcframe.clientMSBE.MSBEP0060.CndR.create();
	
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		to.itm_cd(dtlR.itm_cd());
		to.itm_sub1(dtlR.itm_sub1());
		to.itm_sub2(dtlR.itm_sub2());
		to.itm_sub3(dtlR.itm_sub3());
		
		to.alloc_grp_cd(dtlR.alloc_grp_cd());
		to.lg_grp_cd(dtlR.ship_lg_grp_cd());
		to.loc_cd(dtlR.loc_cd());
		to.sno1(dtlR.sno1());
		to.sno2(dtlR.sno2());
		to.sno3(dtlR.sno3());
		to.sno4(dtlR.sno4());
		to.gd_cd(dtlR.gd_cd());
		
		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0040(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.putCnd(crtOpenMSBEP0040CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 在庫引当状況の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch p = (mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0040.CndR to = mcframe.clientMSBE.MSBEP0040.CndR.create();
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		Dtl_Ship_SchdR shipSchdR = Dtl_Ship_SchdTable.getSelectedMCRow();
		
		to.ope(p.Cnd_ope_ALLOC.getActionCommand());
		
		if (MAC_ALLOC_SCOPE_TYP.isLOC(dtlR.alloc_scope_typ())) {
			to.tgt(p.Cnd_tgt_LOC.getActionCommand());
		}
		else if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(dtlR.alloc_scope_typ())) {
			to.tgt(p.Cnd_tgt_GRS.getActionCommand());
		}
		
		to.lg_grp_cd(shipSchdR.ship_fr_lg_grp_cd());
		to.alloc_grp_cd(dtlR.alloc_grp_cd());
		to.itm_cd(dtlR.itm_cd());
		to.itm_sub1(dtlR.itm_sub1());
		to.itm_sub2(dtlR.itm_sub2());
		to.itm_sub3(dtlR.itm_sub3());
		to.loc_cd(dtlR.loc_cd());
		to.lot_no(dtlR.lot_no());
		to.sublot_no(dtlR.sublot_no());
		to.sno1(dtlR.sno1());
		to.sno2(dtlR.sno2());
		to.sno3(dtlR.sno3());
		to.sno4(dtlR.sno4());
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0080");
		aso.putCnd(crtOpenMSBCP0080CndR(aso));
		aso.putSearchAction();
		aso.runValueInit();
		aso.show();
	}
	
	/**
	 * 品目オーダ進捗の遷移条件を作成する。
	 * @param aso MAUCP_AppScreenOpener
	 * @return 遷移条件
	 */
	protected mcframe.clientMSBC.MSBCP0080.CndR crtOpenMSBCP0080CndR(MAUCP_AppScreenOpener aso) {
		
		mcframe.clientMSBC.MSBCP0080.CndR to = mcframe.clientMSBC.MSBCP0080.CndR.create();
	
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		to.itm_cd(dtlR.itm_cd());
		to.itm_sub1(dtlR.itm_sub1());
		to.itm_sub2(dtlR.itm_sub2());
		to.itm_sub3(dtlR.itm_sub3());
		
		String sloMfgSnoTyp = getSysParm("SLO_MFG_SNO_TYP");
		
		if (isSame(sloMfgSnoTyp, "1") && !isNullOrNullVal(dtlR.sno1())) {
			
			to.sno1(dtlR.sno1());
		}
		else if (isSame(sloMfgSnoTyp, "2") && !isNullOrNullVal(dtlR.sno2())) {
			
			to.sno2(dtlR.sno2());
		}
		else if (isSame(sloMfgSnoTyp, "3") && !isNullOrNullVal(dtlR.sno3())) {
			
			to.sno3(dtlR.sno3());
		}
		else if (isSame(sloMfgSnoTyp, "4") && !isNullOrNullVal(dtlR.sno4())) {
			
			to.sno4(dtlR.sno4());
		}
		
		return to;
	}
	
	/**
	 * 出荷予定枠が編集不可かどうか。<br>
	 * 
	 * 以下のいずれかに該当する場合は、出荷予定枠の項目は編集不可、またボタンは押下不可<br>
	 * ・受注明細の手配区分が「2：仕入直送」<br>
	 * ・受注明細の指図区分が「2：ピッキングなし」<br>
	 * ・受注明細の取消ＦＬＧがオン<br>
	 * ・受注明細の打切ＦＬＧがオン<br>
	 * @return 編集不可の場合はtrue
	 */
	protected boolean isShipSchdNotEditable() {

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		return isNull(dtlR)
				|| MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
				|| MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())
				|| dtlR.can_flg()
				|| dtlR.abort_flg();
	}
	
	/**
	 * 出荷予定が指図対象外、かつ一部出荷どうか。
	 * 
	 * 出荷予定枠の、出荷予定の値が以下のいずれかの行は、打切以外は変更できない。<br>
	 * ・指図区分指図対象外
	 * ・出荷数量＞０かつ　出荷数量＜基準単位数<br>
	 * @param shipSchdR 出荷予定
	 * @param dtlR 受注明細
	 * @return 編集不可の場合はtrue
	 */
	protected boolean isShipSchdShipNoPicKPartAct(Dtl_Ship_SchdR shipSchdR, DtlR dtlR) {
		
		return  MAC_SHIP_INST_TYP.isNON(dtlR.ship_inst_typ())
				 && (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0) && shipSchdR.ship_act_qty().lt(shipSchdR.base_unit_qty()));
	}
	
	/**
	 * 出荷予定の行が入力可能かどうか。
	 * 
	 * 出荷予定枠の、出荷予定の値が以下のいずれかの行は、全項目変更できない。<br>
	 * ・指図数量＞０<br>
	 * ・出荷数量＞０<br>
	 * ・売上数量＞０<br>
	 * ・Ｉ／Ｖ出荷予定数量＞０<br>
	 * 
	 * @param shipSchdR 出荷予定
	 * @return 編集不可の場合はtrue
	 */
	protected boolean isShipSchdRowNotEditable(Dtl_Ship_SchdR shipSchdR) {
		
		return  (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0))
				|| (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
				|| (((!isNull(shipSchdR.sls_qty()) && shipSchdR.sls_qty().gt(0))
						|| (!isNull(shipSchdR.ship_inst_qty()) && shipSchdR.ship_inst_qty().gt(0)))
								&& (!isNull(shipSchdR.ship_act_qty()) && shipSchdR.ship_act_qty().gt(0))
								&& !isNull(shipSchdR.sls_act_d_no()))
				|| (!isNull(shipSchdR.iv_schd_qty()) && shipSchdR.iv_schd_qty().gt(0));
	}
	
	/**
	 * 出荷予定のボタンが押下不可かどうか。<br>
	 * 以下のいずれかに該当する場合は、出荷予定枠の項目は編集可能だが、ボタンは押下不可
	 * ・受注明細の品揃ＧＮＯが指定されている
	 * ・受注のインボイスＮＯが指定されている
	 * ・受注ヘッダの品揃区分が「2：品揃する」
	 * @return 押下不可の場合はtrue
	 */
	protected boolean isShipSchdBtnDisable() {

		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		return MSC_SHIP_ASSORT_TYP.isAST(getHdrR().assort_typ())
				|| !isNull(getHdrR().iv_no())
				|| isNull(dtlR)
				|| !isNull(dtlR.set_itm_grp_no())
				|| isShipSchdNotEditable();
	}
	
	/**
	 * 納期回答枠が編集不可かどうか。<br>
	 * 以下のいずれかに該当する場合は、納期回答枠の項目は編集不可、またボタンは押下不可
	 * 受注明細の指図区分が「2：ピッキングなし」
	 * 受注明細の打切りＦＬＧがオン
	 * 受注明細の取消ＦＬＧがオン
	 * @return 編集不可の場合はtrue
	 */
	protected boolean isSloPrmsNotEditable() {
		
		DtlR dtlR = DtlTable.getSelectedMCRow();
		
		return isNull(dtlR)
				|| MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())
				|| (dtlR.abort_flg() && isSame(dtlR.ship_schd_abort_qty(), dtlR.base_unit_qty()))
				|| dtlR.can_flg();
	}

	protected MAUDP_RowListener createDtlShipSchdSListListener() {
		return new DtlShipSchdListRowListener();
	}
	
	protected class DtlShipSchdListRowListener extends MAUDP_RowListener {
		
		@Override
		public void statusChanged(mcframe.clientCore.container.MCRowStatusEvent event) {
			super.statusChanged(event);
			
			setSloPrmsRAddBtnMode();
		}
	}
	
	protected MAUDP_RowListener createDtlSloPrmsSListListener() {
		return new DtlShipSchdListRowListener();
	}
	
	protected class DtlSloPrmsListRowListener extends MAUDP_RowListener {
		
		@Override
		public void statusChanged(mcframe.clientCore.container.MCRowStatusEvent event) {
			super.statusChanged(event);
			
			setSloPrmsRAddBtnMode();
		}
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		
		DtlTable.setCellConfig(createDtlCellConfig());
		Dtl_Ship_SchdTable.setCellConfig(createDtlShipSchdCellConfig());
		Dtl_Slo_PrmsTable.setCellConfig(createDtlSloPrmsCellConfig());
		Dtl_WG_RqstTable.setCellConfig(createDtlWGRqstCellConfig());
		Dtl_Sls_SchdTable.setCellConfig(createDtlSlsSchdCellConfig());
	}

	protected MCCellConfig createDtlCellConfig() {

		return new DtlCellConfig();
	}

	protected MCCellConfig createDtlShipSchdCellConfig() {

		return new DtlShipSchdCellConfig();
	}
	
	protected MCCellConfig createDtlSloPrmsCellConfig() {
		
		return new DtlSloPrmsCellConfig();
	}

	protected MCCellConfig createDtlWGRqstCellConfig() {

		return new DtlWGRqstCellConfig();
	}
	protected MCCellConfig createDtlSlsSchdCellConfig() {

		return new DtlSlsSchdCellConfig();
	}
	/**
	 * Dtl_Sls_SchdTable用のセルコンフィグ
	 */
	public class DtlSlsSchdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (isSame(getStatus(), UPD)) {
				
				Dtl_Sls_SchdR slsSchdR = getDtl_Sls_SchdL().get(index);
				
				if (column == columnDtl_Sls_Schd_sls_schd_dt) {
					
					if (!isSlsSchdDtEditable(slsSchdR)) {
					
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Sls_Schd_abort_flg) {
					
					if (!isSlsSchdAbortEditable(slsSchdR)) {
					
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	protected boolean isSlsSchdDtEditable(Dtl_Sls_SchdR slsSchdR) {
		
		return	!getHdrR().cst_iv_flg()
				&& (!isNull(slsSchdR.dlv_slip_d_no()) || !isNull(slsSchdR.purc_act_d_no()))
				&& slsSchdR.base_unit_sls_qty().isZero();
	}
	
	protected boolean isSlsSchdAbortEditable(Dtl_Sls_SchdR slsSchdR) {
		
		return (!getHdrR().cst_iv_flg()
				&& (!isNull(slsSchdR.dlv_slip_d_no()) || !isNull(slsSchdR.purc_act_d_no()))
				&& slsSchdR.base_unit_qty().gt(slsSchdR.base_unit_sls_qty()))
			|| (getHdrR().cst_iv_flg()
					&& !isNull(slsSchdR.purc_act_d_no())
					&& isNull(slsSchdR.iv_d_no())
					&& slsSchdR.base_unit_qty().gt(slsSchdR.base_unit_sls_qty()));
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (isSame(getStatus(), UPD)) {
				
				DtlR dR = getDtlL().get(index);
				
				if (column == columnDtl_can_rsn_cd
						|| column == columnDtl_slo_d_can_rmkrs) {
					
					if (!dR.can_flg()) {
					
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * DtlShipSchdTable用のセルコンフィグ
	 */
	public class DtlShipSchdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (isSame(getStatus(), UPD)) {
				
				Dtl_Ship_SchdR dR = getDtl_Ship_SchdL().get(index);
				
				DtlR dtlR = DtlTable.getSelectedMCRow();
				
				if (column != columnDtl_Ship_Schd_dlv_show_dtl && column != columnDtl_Ship_Schd_tdlv_show_dtl) {
					if (isShipSchdNotEditable()) {
						return MCMode.READ_ONLY;
					}
					else if (isShipSchdShipNoPicKPartAct(dR, dtlR)) {
						if (column != columnDtl_Ship_Schd_abort_flg) {
							return MCMode.READ_ONLY;
						}
					}
					else if (isShipSchdRowNotEditable(dR)) {
						return MCMode.READ_ONLY;
					}
				}
				
				//打切りFLGをオフからオンにした時、該当する明細は打切りFLG以外の項目はすべて入力不可にする。
				if (dR.abort_flg() || dR.org_abort_flg()) {
					
					if (column != columnDtl_Ship_Schd_abort_flg 
							&& column != columnDtl_Ship_Schd_dlv_show_dtl 
							&& column != columnDtl_Ship_Schd_tdlv_show_dtl) {
						
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_ship_fr_lg_grp_cd) {
					
					if (!isNull(getHdrR().iv_no())
								|| !isNull(dR.sls_act_d_no())
								|| !isNull(dtlR.ship_lg_grp_cd())
								|| !isNull(dtlR.loc_cd())) {
						
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_pd_inst_dlv_dt
						|| column == columnDtl_Ship_Schd_pd_inst_dlv_hm) {
					
					if (MAC_VIA_DLV_TYP.isVIA(nvl(dR.via_dlv_typ(), dtlR.via_dlv_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_ship_schd_dt
						|| column == columnDtl_Ship_Schd_ship_schd_hm
						|| column == columnDtl_Ship_Schd_dlv_schd_dt
						|| column == columnDtl_Ship_Schd_dlv_schd_hm) {
					
					if (!dR.not_dt_calc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_re_ship_schd_flg) {
					//　出荷予定枠の再出荷ＦＬＧは、登録済データ　 または　出荷数量が0 の場合は変更不可
					if ((!dR.isStatusCreate() && !dR.isStatusGUICreate()) || !dtlR.ship_act_qty().isPositive()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (MSC_SHIP_ASSORT_TYP.isAST(getHdrR().assort_typ()) 
						|| !isNull(dtlR.set_itm_grp_no())) {
					if (column == columnDtl_Ship_Schd_dlv_cd
							|| column == columnDtl_Ship_Schd_pri_prnt_flg
							|| column == columnDtl_Ship_Schd_tdlv_cd
							|| column == columnDtl_Ship_Schd_via_dlv_typ
							|| column == columnDtl_Ship_Schd_dlv_day_week_typ_nm) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_pri_prnt_flg) {
					if (isNull(dR.dlv_cd()) || MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ()) || dtlR.vmi_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_tdlv_cd) {
					if ((MAC_VIA_DLV_TYP.isVIA(dR.via_dlv_typ()) || dR.tdlv_req_flg()) && isNull(dtlR.tdlv_cd())) {
						return MCMode.REQUIRED;
					}
				}
				
				if (column == columnDtl_Ship_Schd_via_dlv_typ) {
					if (!getHdrR().cst_iv_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnDtl_Ship_Schd_dlv_day_week_typ_nm) {
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
							|| MAC_VIA_DLV_TYP.isVIA(dR.via_dlv_typ())
							|| (isNull(dR.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	
	public class DtlSloPrmsCellConfig extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
		
			if (isSloPrmsNotEditable()) {
				
				return MCMode.READ_ONLY;
			}
			
			Dtl_Slo_PrmsR sloPrmsR = getDtl_Slo_PrmsL().get(index);
			
			if (isShipSchdAbort(sloPrmsR.slo_prms_no())) {
				return MCMode.READ_ONLY;
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

	public class DtlWGRqstCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			
			if (isSame(getStatus(), UPD)) {
				
				Dtl_WG_RqstR dR = getDtl_WG_RqstL().get(index);
				
				if (MSC_WG_RQST_STS_TYP.isCMPL(dR.wg_rqst_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				
				if (column == columnDtl_WG_Rqst_prms_uncn_flg) {
					
					if (!dR.prms_uncn_flg() || dR.re_rqst_flg()) {
						
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	
	
	/**
	 * 納期回答に紐付く出荷予定が打切りかどうか。
	 * @param sloPrmsNo 納期回答ＮＯ
	 * @return 打切の出荷予定が一つでもあった場合はtrue
	 */
	protected boolean isShipSchdAbort(String sloPrmsNo) {
		
		if (!isNull(sloPrmsNo)) {
			for (Dtl_Ship_SchdR shipSchdR : getDtl_Ship_SchdL()) {
				if ((isSame(sloPrmsNo, shipSchdR.slo_prms_no())
						|| isSame(sloPrmsNo, shipSchdR.org_slo_prms_no()))
						&& shipSchdR.abort_flg()) {
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 対象のリストから 「ステータスがGUICREATE」を取り除いたリストを返します。<br>
	 * 
	 * @param <R>
	 * @param list 対象のリスト
	 * @return 取り除いたリスト
	 */
	protected <R extends MCConstRow> MCList<R> exceptGuiCreate(MCList<R> list) {

		MCList<R> ans = list.createInstance();
		for (R row : list) {
			if (!row.isStatusGUICreate()) {
				row.setValueNE("param_row_index", MCNumber.valueOf(row.getGUIIndex()));
				ans.add(row);
			}
		}
		return ans;
	}
	
	/**
	 * 出荷予定が回答済みかどうか。
	 * @param shipSchdR　出荷予定
	 * @return 出荷予定が回答済みの場合はtrue
	 */
	protected boolean isShipSchdPrms(Dtl_Ship_SchdR shipSchdR) {
		
		if (!isNull(shipSchdR.slo_prms_index())) {
			for (Dtl_Slo_PrmsR sloPrmsR : getDtl_Slo_PrmsL().subList(Dtl_Slo_PrmsR.$slo_prms_index, shipSchdR.slo_prms_index())) {
				if (!sloPrmsR.isStatusDelete()) {
					return true;
				}
			}
		}

		if (!isNull(shipSchdR.ship_schd_no())) {
			for (Dtl_Slo_PrmsR sloPrmsR : getDtl_Slo_PrmsL().subList(Dtl_Slo_PrmsR.$ship_schd_no, shipSchdR.ship_schd_no())) {
				if (!sloPrmsR.isStatusDelete()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public boolean isChanged() {
		
		boolean isChangedFlg = super.isChanged();
		
		if (isChangedFlg) {
			return isChangedFlg;
		}
		
		MCColumnConfig colConfig = DtlTable.getLastSelectedColumnConfig();
		
		for (DtlR dtlR: getDtlL()) {
			
			if (colConfig != null) {
				DtlTable.focusCellAt(dtlR.getGUIIndex(), colConfig);
			}
			else {
				DtlTable.selectRowNoFocus(dtlR.getGUIIndex());
			}
			
			isChangedFlg = super.isChanged();
			
			if (isChangedFlg) {
				break;
			}
		}
		
		return isChangedFlg;
	}
	
	// エラーメッセージのフォーカス用
	@Override
	public void setFocus(MCMessage msg) {
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Dtl_Ship_SchdR) {
			for (DtlR r : getDtlL()) {
				if (isSame(((Dtl_Ship_SchdR) msg.getCauseRow()).slo_d_no(), r.slo_d_no())) {
					DtlTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Dtl_Slo_PrmsR) {
			for (DtlR r : getDtlL()) {
				if (isSame(((Dtl_Slo_PrmsR) msg.getCauseRow()).slo_d_no(), r.slo_d_no())) {
					DtlTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof Dtl_WG_RqstR) {
			for (DtlR r : getDtlL()) {
				if (isSame(((Dtl_WG_RqstR) msg.getCauseRow()).wg_rqst_src_no(), r.slo_d_no())) {
					DtlTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		
		super.setFocus(msg);
	}

	protected Map_Dtl_Slo_PrmsR_Dtl_Ship_SchdR<Dtl_Slo_PrmsR, Dtl_Ship_SchdR> createMap_Dtl_Slo_PrmsR_Dtl_Ship_SchdR() {
		return new Map_Dtl_Slo_PrmsR_Dtl_Ship_SchdR<Dtl_Slo_PrmsR, Dtl_Ship_SchdR>();
	}

	public class Map_Dtl_Slo_PrmsR_Dtl_Ship_SchdR<D extends Dtl_Slo_PrmsR, S extends Dtl_Ship_SchdR>
			extends MCRowMapper<D, S> {
		@Override
		public void valueCopy(D dest, S src) {
			dest.slo_d_no(src.slo_d_no()); //受注明細ＮＯ
			dest.ship_schd_no(src.ship_schd_no()); //出荷予定ＮＯ
			dest.dlv_inst_rcpt_no(src.dlv_inst_rcpt_no()); //納入指示受領ＮＯ
			dest.prms_dlv_dt(src.dlv_schd_dt()); //回答納入日時
			dest.prms_dlv_hm(src.dlv_schd_hm()); //回答納入日時
			dest.trd_unit_prms_qty(src.trd_unit_qty()); //取引単位回答数量
			dest.prms_rmrks(null); //回答備考
			dest.intr_rmrks(null); //内部備考
			dest.sub_char1(null); //予備１
			dest.sub_char2(null); //予備２
			dest.sub_char3(null); //予備３
			dest.trd_unit_cd(src.trd_unit_cd());
			dest.trd_unit_dec_place(src.trd_unit_dec_place());
		}
	}

	@Override
	public void doDtl_Ship_Schd_not_dt_calc_flg_NC(MCEventInfo info) {
		super.doDtl_Ship_Schd_not_dt_calc_flg_NC(info);
		
		Dtl_Ship_SchdR shipSchdR = getDtl_Ship_SchdL().get(info.getEventIndex());
		
		if (!shipSchdR.not_dt_calc_flg()) {
			setValueEx(columnDtl_Ship_Schd_ship_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_Ship_Schd_ship_schd_hm, info.getEventIndex(), null);
			setValueEx(columnDtl_Ship_Schd_dlv_schd_dt, info.getEventIndex(), null);
			setValueEx(columnDtl_Ship_Schd_dlv_schd_hm, info.getEventIndex(), null);
		}
	}

}