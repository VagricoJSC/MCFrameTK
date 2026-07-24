package mcframe.serverMSBB.MSBBL6080;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6080.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloStsRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloStsRegService_MC extends MSBBL_SloStsRegService_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSBBL_SloStsRegService> CLAZZ = MSBBL_SloStsRegService.class;

	/**
	 * SloSts_Ins01オペレーション.<p>
	 *
	 * 受注明細ＮＯをもとに受注状況を登録します。<br>
	 */
	public class SloSts_Ins01 extends MSBBL_SloStsRegService_MC_A.SloSts_Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<MST_SLO_STS_R> insL = MCList.create(MST_SLO_STS_R.class);

			// シーケンス用キャッシュ
			doSeqCache(MSC_NUM_SYS_TYP.SLOSTS, up0().size());

			for (SloSts_DtlR row : up0()) {
				MST_SLO_STS_R insR = row.slo_sts();
				insR.slo_sts_no(getStrSeq(MSC_NUM_SYS_TYP.SLOSTS));

				// 場所ＣＤが設定されていて出荷物流グループＣＤが未指定の場合は物流グループを取得して設定する
				if (!isNull(row.loc_cd()) && isNull(row.ship_lg_grp_cd())) {
					MAM_LOC_R loc = getLoc(row.loc_cd());
					insR.ship_lg_grp_cd(loc.lg_grp_cd());
				}

				insL.add(insR);
			}
			dbInsert("MSBBL6080_MST_SLO_STS_I01", insL,
					MCQueryApiBuilder.create(MST_SLO_STS_R.create("T")));
		}
	}
	
	/** 場所マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locR;

	/**
	 * 場所ＣＤから場所マスタ情報を取得する。
	 * 
	 * @param locCd
	 */
	protected static MAM_LOC_R getLoc(String locCd) {
		return object(CLAZZ)._getLoc(locCd);
	}
	
	protected MAM_LOC_R _getLoc(String locCd) {
		if (_locR == null) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(t);
			locR_bldr.setSelect(t.lg_grp_cd);
			_locR = new FXUCL_MCDbcCache<MAM_LOC_R>(locR_bldr);
		}
		return _locR.get(locCd);
	}

	/**
	 * SloSts_Ins02オペレーション.<p>
	 *
	 * 手配ＮＯをもとに受注状況を登録します。<br>
	 */
	public class SloSts_Ins02 extends MSBBL_SloStsRegService_MC_A.SloSts_Ins02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			for (SloSts_DtlR row : up0()) {
				// 手配ＮＯ１～４が全てNULL文字の上り電文は、何もしない
				if (isNullOrNullVal(row.sno1()) && isNullOrNullVal(row.sno2())
						&& isNullOrNullVal(row.sno3()) && isNullOrNullVal(row.sno4())) {
					continue;
				}
				
				// 受注明細ＮＯの検索
				// 取得失敗または2件以上取得時はスキップ
				MST_SLO_D_R sloD = selectSloD(row);
				if (isNull(sloD)) {
					continue;
				}
				row.slo_d_no(sloD.slo_d_no());
				
				if ((MAC_DATA_CRUD_TYP.isUPD(row.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ()))
						&& isMfgActInspAct(row)) {
					setMfgActInspActSloSts(ope.up0(), row);
				}
				else {
					ope.up0().add(row);
				}
			}

			if (!ope.up0().isEmpty()) {
				// 登録処理はSloSts_Ins01オペレーションにて行う
				ope.exec();
			}
		}

		/**
		 * 	受注明細情報の検索
		 * 	<p>
		 * 	品目ＣＤ、枝番１～３、手配ＮＯ１～４をもとに受注明細を検索する<br>
		 * 	取得できなかった場合、もしくは取得行が2件以上の場合はnullを返す
		 * 	</p>
		 * @param r	
		 * @return
		 */
		protected MST_SLO_D_R selectSloD(SloSts_DtlR bind) {

			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);

			sloDL_bldr.setSelect(t.slo_d_no);
			sloDL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			sloDL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));

			// システムパラメータSLO_MFG_SNO_TYPに応じて、受注明細を特定する手配NOを決定する
			String sloMfgNoTyp = getSysParm("SLO_MFG_SNO_TYP");
			if (isSame(sloMfgNoTyp, "1")) {
				if (!isNullOrNullVal(bind.sno1())) {
					sloDL_bldr.addWhereWithAnd(t.sno1.eq(bind("sno1")));
				}
				else {
					return null;
				}
			}
			else if (isSame(sloMfgNoTyp, "2")) {
				if (!isNullOrNullVal(bind.sno2())) {
					sloDL_bldr.addWhereWithAnd(t.sno2.eq(bind("sno2")));
				}
				else {
					return null;
				}
			}
			else if (isSame(sloMfgNoTyp, "3")) {
				if (!isNullOrNullVal(bind.sno3())) {
					sloDL_bldr.addWhereWithAnd(t.sno3.eq(bind("sno3")));
				}
				else {
					return null;
				}
			}
			else if (isSame(sloMfgNoTyp, "4")) {
				if (!isNullOrNullVal(bind.sno4())) {
					sloDL_bldr.addWhereWithAnd(t.sno4.eq(bind("sno4")));
				}
				else {
					return null;
				}
			}
			else {
				return null;
			}

			dbSelect("MSBBL6080_MST_SLO_D_S01", sloDL, sloDL_bldr, bind);
			return (sloDL.isEmpty() || sloDL.size() > 1) ? null : sloDL.get(0);
		}
		
		/**
		 * 受注状況更新情報の設定
		 * 
		 * @param up
		 * @param bind
		 */
		protected void setMfgActInspActSloSts(MCList<SloSts_DtlR> up, SloSts_DtlR bind) {
			
			// 受注状況から前回の登録結果を取得する
			MCList<MST_SLO_STS_R> sloStsL = MCList.create(MST_SLO_STS_R.class);
			MST_SLO_STS_R t = MST_SLO_STS_R.create("T");
			MCQueryApiBuilder sloStsL_bldr = MCQueryApiBuilder.create(t);
			sloStsL_bldr.setWhere(t.slo_d_no.eq(bind("1")), bind.slo_d_no());
			sloStsL_bldr.addWhereWithAnd(t.slo_sts_typ.eq(bind("1")), bind.slo_sts_typ());
			sloStsL_bldr.addWhereWithAnd(t.qty.gte(value(0)));
			if (MSC_SLO_STS_TYP.isMFG_ST(bind.slo_sts_typ())
					|| MSC_SLO_STS_TYP.isMFG_CMPL(bind.slo_sts_typ())) {
				sloStsL_bldr.addWhereWithAnd(t.mfg_act_no.eq(bind("1")),
						bind.mfg_act_no());
			}
			else if (MSC_SLO_STS_TYP.isINSP_ST(bind.slo_sts_typ())
					|| MSC_SLO_STS_TYP.isINSP_CMPL(bind.slo_sts_typ())) {
				sloStsL_bldr.addWhereWithAnd(t.insp_act_no.eq(bind("1")),
						bind.insp_act_no());
			}
			sloStsL_bldr.setOrderByDesc(t.slo_sts_no);
			int cnt = dbSelect("MSBBL6080_MST_SLO_STS_S01", sloStsL, sloStsL_bldr, bind);
			
			if (cnt == 0) {
				return;
			}
			MST_SLO_STS_R sloStsR = sloStsL.get(0);
			
			// 削除時は符号を反転したデータを登録し、更新時は設定項目に変更があった場合に
			// 符号反転データと変更後データの2件を登録する
			if (MAC_DATA_CRUD_TYP.isDEL(bind.data_crud_typ())) {
				up.add(crtCanData(sloStsR));
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(bind.data_crud_typ())) {
				if (isDataUpd(bind, sloStsR)) {
					up.add(crtCanData(sloStsR));
					up.add(bind);
				}
			}
		}
		
		protected boolean isDataUpd(SloSts_DtlR bind, MST_SLO_STS_R sloStsR) {
			
			if (!isSame(bind.unit_cd(), sloStsR.unit_cd())) {
				return true;
			}
			if (!isSame(bind.qty(), sloStsR.qty())) {
				return true;
			}
			if (!isSame(bind.st_act_tm(), sloStsR.st_act_tm())) {
				return true;
			}
			if (!isSame(bind.st_schd_tm(), sloStsR.st_schd_tm())) {
				return true;
			}
			if (!isSame(bind.end_schd_tm(), sloStsR.end_schd_tm())) {
				return true;
			}
			if (!isSame(bind.end_act_tm(), sloStsR.end_act_tm())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 受注状況の取消レコードを作成する<p>
		 * 数量の符号を反転したデータを作成する
		 * 
		 * @param sloStsR
		 * @return
		 */
		protected SloSts_DtlR crtCanData (MST_SLO_STS_R sloStsR) {
			SloSts_DtlR ret = SloSts_DtlR.create();
			MST_SLO_STS_R clone = sloStsR.clone();
			clone.qty(clone.qty().negate());
			ret.slo_sts(clone);
			return ret;
		}
		
		/**
		 * 製造実績もしくは検査実績に関するデータか
		 * 
		 * @param bind
		 * @return
		 */
		protected boolean isMfgActInspAct(SloSts_DtlR bind) {
			if (MSC_SLO_STS_TYP.isMFG_ST(bind.slo_sts_typ())
					|| MSC_SLO_STS_TYP.isMFG_CMPL(bind.slo_sts_typ())
				 	|| MSC_SLO_STS_TYP.isINSP_ST(bind.slo_sts_typ())
					|| MSC_SLO_STS_TYP.isINSP_CMPL(bind.slo_sts_typ())) {
				return true;
			}
			return false;
		}
	}

	//FMCB CUSTOM END
}