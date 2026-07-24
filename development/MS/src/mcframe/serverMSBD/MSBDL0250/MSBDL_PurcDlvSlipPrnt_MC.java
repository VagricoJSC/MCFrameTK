package mcframe.serverMSBD.MSBDL0250;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBD.MSBDL0250.Query.*;
import mcframe.serverMSBD.MSBDL5200.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcDlvSlipPrnt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcDlvSlipPrnt_MC extends MSBDL_PurcDlvSlipPrnt_MC_A{
	//FMCB CUSTOM START
	/** 操作種別：納品書発行 */
	protected static final String OPE_DLV_SLIP = "0";
	/** 動作種別：仕入直送納品書発行 */
	protected static final String OPE_PURC_DDLV_SLIP = "1";
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する<br>
	 */
	public class Prnt01 extends MSBDL_PurcDlvSlipPrnt_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			doPrnt();
		}
		protected void doPrnt() {
			if (isSame(up0().get(0).ope(), OPE_DLV_SLIP)) {
				prntDlvSlip();
			}
			else {
				prntPurcDldvDlvSlip();
			}
		}
		protected void prntDlvSlip() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			// 紐付ＮＯの設定
			setPegNo(up0());
			addAll(ope.up2(), up0(), createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR());
			ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			copyErrFlg(up0(), ope.down2());
		}
		protected void prntPurcDldvDlvSlip() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			// 紐付ＮＯの設定
			setPegNo(up0());
			addAll(ope.up4(), up0(), createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR());
			ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			copyErrFlg(up0(), ope.down3());
		}

		protected Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR<PurcPrnt_Prnt01_DlvSlipR,Prnt01_CndR> createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR() {
			return new Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR<PurcPrnt_Prnt01_DlvSlipR, Prnt01_CndR>();
		}
		public class Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_CndR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_CndR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Prnt01_CndR.$po_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, Prnt01_CndR.$dlv_slip_mng_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq, Prnt01_CndR.$dlv_slip_mng_seq);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_no, Prnt01_CndR.$purc_ddlv_dlv_slip_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_seq, Prnt01_CndR.$purc_ddlv_dlv_slip_seq);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.bp_srch_flg(true);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買納品書ヘッダを検索する<br>
	 */
	public class Srch01 extends MSBDL_PurcDlvSlipPrnt_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			setUpTmpCol(up0());

			MCQueryPlan sql = MSBDL0250_MST_PURC_DLV_SLIP_S01();
			if (isSame(up0().ope(), OPE_DLV_SLIP)) {
				sql.addDynamicSQLInfo(MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE01());
			}
			else {
				sql.addDynamicSQLInfo(MSBDL0250_MST_PURC_DLV_SLIP_S01_WHERE02());
			}
			sql.addDynamicSQLInfo(MSBDL0250_MST_PURC_DLV_SLIP_S01_ORDER_BY());
			executeQuery(rsltL, sql, up0());
			
			editDown(rsltL);
		}
		/**
		 * 検索条件を編集する
		 */
		protected void setUpTmpCol(Srch01_CndR cndR) {
			if (!isSame(cndR.dlv_prnt_flg(), cndR.not_dlv_prnt_flg())) {
				cndR.addStringColumn("dlv_prnt_flg_str", MCBooleanUtil.booleanToDBString(cndR.dlv_prnt_flg()));
			}
			cndR.addStringColumn("tmp_inv_non_prnt_flg", toTrueStr(cndR.inv_non_prnt_flg()));
		}
		/**
		 * 検索結果を加工する
		 */
		protected void editDown(MCList<Srch01_RsltR>rsltL) {
			setPurcDdlv(rsltL);
			setLatest(rsltL);
			down0().addAll(rsltL);
		}
		/**
		 * 仕入直送納品書関連の項目を設定する
		 */
		protected void setPurcDdlv(MCList<Srch01_RsltR>rsltL) {
			if (isSame(up0().ope(), OPE_DLV_SLIP)) {
				MCList<Srch01_RsltR> down0 = rsltL.clone();
				MCList<Srch01_RsltR> wkL = MCList.create(Srch01_RsltR.class);
				MCIndexKey purcDDlvIndex = down0.createIndex(Srch01_RsltR.$dlv_slip_mng_no, Srch01_RsltR.$dlv_slip_mng_seq);
				for (Srch01_RsltR wkR : down0) {
					if (!wkL.isEmpty()
						&& isColSame(wkR, wkL.get(wkL.size()-1), purcDDlvIndex.getKeys())) {
						continue;
					}
					
					MCList<Srch01_RsltR> tmpL = down0.subList(purcDDlvIndex, wkR.dlv_slip_mng_no(), wkR.dlv_slip_mng_seq());
					if (!isSame(tmpL.groupBy(Srch01_RsltR.$purc_ddlv_dlv_slip_no).size(), 1)) {
						wkR.purc_ddlv_dlv_slip_no(null);
						wkR.purc_ddlv_dlv_slip_rev(null);
						wkR.purc_ddlv_dlv_slip_seq(null);
						wkR.purc_ddlv_dlv_slip_multi_flg(true);
					}
					wkL.add(wkR);
				}
				rsltL.setAll(wkL);
			}
			else if (up0().inv_can_flg()) {
				// 「仕入直送納品書発行」モードかつ「無効・取消含む」の場合は、仕入直送の納品伝票をベースに検索結果を作成する
				MCList<Srch01_RsltR> wkL = MCList.create(Srch01_RsltR.class);
				MCIndexKey idx = rsltL.createIndex(Srch01_RsltR.$purc_ddlv_dlv_slip_no);
				for (Srch01_RsltR dlvSlipR : getPurcDdlvDlvSlipL(rsltL)) {
				
					MCList<Srch01_RsltR> tmpL = rsltL.subList(idx, dlvSlipR.purc_ddlv_dlv_slip_no());
					tmpL.sort(Srch01_RsltR.$purc_ddlv_dlv_slip_seq);
					
					MCNumber seq = dlvSlipR.purc_ddlv_dlv_slip_seq();
					if (MAC_SLIP_STS_TYP.isCAN(dlvSlipR.slip_sts_typ())) {
						// 購買納品伝票明細に設定される連番は「新規」または「無効」の連番のみ
						// 「取消」は「無効」と同じデータに紐付けるため連番を -1 する
						seq = seq.subtract(1);
					}
					
					// 仕入直送の納品書に、購買の納品書を紐付ける
					for (Srch01_RsltR tmpR : tmpL) {
						if (tmpR.purc_ddlv_dlv_slip_seq().gte(seq)) {
							Srch01_RsltR addR = tmpR.clone();
							addR.purc_ddlv_dlv_slip_no(dlvSlipR.purc_ddlv_dlv_slip_no());
							addR.purc_ddlv_dlv_slip_rev(dlvSlipR.purc_ddlv_dlv_slip_rev());
							addR.purc_ddlv_dlv_slip_seq(dlvSlipR.purc_ddlv_dlv_slip_seq());
							addR.slip_sts_typ(dlvSlipR.slip_sts_typ());
							addR.slip_prnt_flg(dlvSlipR.slip_prnt_flg());
							addR.setNumberNE("seq", dlvSlipR.purc_ddlv_dlv_slip_seq());
							wkL.add(addR);
							break;
						}
					}
				}
				
				// 発行状況による絞込み
				if (!isNull(up0().getStringNE("dlv_prnt_flg_str"))) {
					wkL.removeIf(r -> 
						!isSame(up0().dlv_prnt_flg(), r.slip_prnt_flg())
					);
				}
				
				rsltL.setAll(wkL);
			}
		}
		protected MCList<Srch01_RsltR> getPurcDdlvDlvSlipL(MCList<Srch01_RsltR> downL) {
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.dlv_slip_no.as("purc_ddlv_dlv_slip_no"),
				t.dlv_slip_seq.as("purc_ddlv_dlv_slip_seq"),
				t.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
				t.slip_sts_typ, t.slip_prnt_flg
			);
			bldr.setWhere(t.dlv_slip_no.eq(bind("purc_ddlv_dlv_slip_no")));
			
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			dbSelect("MSBDL0250_MST_DLV_SLIP_S01", rsltL, bldr, downL.groupBy(Srch01_RsltR.$purc_ddlv_dlv_slip_no));
			
			// 同一改訂番号内で最新の連番のみ抽出
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			for (MCList<Srch01_RsltR> gl : rsltL.groupList(
					Srch01_RsltR.$purc_ddlv_dlv_slip_no, Srch01_RsltR.$purc_ddlv_dlv_slip_rev)) {
				gl.sort(SortType.DESC, Srch01_RsltR.$purc_ddlv_dlv_slip_seq);
				
				Srch01_RsltR glR = gl.get(0);
				if (MAC_SLIP_STS_TYP.isCRT(glR.slip_sts_typ())) {
					tmpL.add(glR);	// 新規
				}
				else {
					tmpL.add(glR);	// 取消
					tmpL.add(gl.get(1));	// 無効
				}
			}
			tmpL.sort(Srch01_RsltR.$purc_ddlv_dlv_slip_no, Srch01_RsltR.$purc_ddlv_dlv_slip_seq);
			
			return tmpL;
		}
		
		/**
		 * 「納品書ＮＯ」「納品書連番」ごとに「納品書管理連番」が最新のレコードに、「最新」を設定する
		 * 検索条件：「最新」がオンの場合は、最新のレコードだけに絞り込む
		 */
		protected void setLatest(MCList<Srch01_RsltR>rsltL) {
			MCList<Srch01_RsltR> wkL =  MCList.create(Srch01_RsltR.class);
			
			for (Srch01_RsltR r : rsltL) {
				if (isSame(r.getNumber("seq"), r.getNumber("max_seq"))) {
					r.latest_flg(true);
				}
				if (!up0().latest_flg() || r.latest_flg()) {
					wkL.add(r);
				}
			}
			
			rsltL.setAll(wkL);
		}
	}

	//FMCB CUSTOM END
}