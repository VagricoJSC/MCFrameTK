package mcframe.serverMSLA.MSLAL9310;

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
import mcframe.serverMSBC.MSBCL0050.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OrdSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OrdSendIfService_MC extends MSLAL_OrdSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * OrdSendIf_Itm_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目マスタデータを検索する<br>
	 */
	public class OrdSendIf_Itm_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Itm_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 品目マスタ検索
			searchTargetItmS01(up0());
		}

		protected void searchTargetItmS01(OrdSendIf_Itm_Srch01_DtlR arg) {
			MCList<OrdSendIf_Itm_Srch01_RsltR> itmMstList = MCList.create(OrdSendIf_Itm_Srch01_RsltR.class);

			MSVM_MRP_ITM_R mrpItm = MSVM_MRP_ITM_R.create("MRP_ITM");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MCQueryApiBuilder mrpItmBldr = MCQueryApiBuilder.create(mrpItm);

			mrpItmBldr.addLeftOuterJoin(itm, mrpItm.itm_cd.eq(itm.itm_cd)
					.and(mrpItm.itm_sub1.eq(itm.itm_sub1))
					.and(mrpItm.itm_sub2.eq(itm.itm_sub2))
					.and(mrpItm.itm_sub3.eq(itm.itm_sub3)));

			mrpItmBldr.addSelect(itm.itm_nm.as("itm_nm"));
			mrpItmBldr.addSelect(itm.itm_alt_nm1.as("itm_alt_nm1"));
			mrpItmBldr.addSelect(itm.itm_alt_nm2.as("itm_alt_nm2"));
			mrpItmBldr.addSelect(itm.itm_alt_nm3.as("itm_alt_nm3"));
			mrpItmBldr.addSelect(itm.itm_alt_nm4.as("itm_alt_nm4"));
			mrpItmBldr.addSelect(itm.base_itm_nm.as("base_itm_nm"));
			mrpItmBldr.addSelect(itm.base_itm_alt_nm1.as("base_itm_alt_nm1"));
			mrpItmBldr.addSelect(itm.base_itm_alt_nm2.as("base_itm_alt_nm2"));
			mrpItmBldr.addSelect(itm.base_itm_alt_nm3.as("base_itm_alt_nm3"));
			mrpItmBldr.addSelect(itm.base_itm_alt_nm4.as("base_itm_alt_nm4"));
			mrpItmBldr.addSelect(itm.stk_mng_typ.as("stk_mng_typ"));
			mrpItmBldr.addSelect(itm.asset_mng_typ.as("asset_mng_typ"));
			mrpItmBldr.addSelect(itm.itm_typ.as("itm_typ"));
			mrpItmBldr.addSelect(itm.itm_typ_d_cd.as("itm_typ_d_cd"));
			mrpItmBldr.addSelect(itm.itm_grp_cd1.as("itm_grp_cd1"));
			mrpItmBldr.addSelect(itm.itm_grp_cd2.as("itm_grp_cd2"));
			mrpItmBldr.addSelect(itm.itm_grp_cd3.as("itm_grp_cd3"));
			mrpItmBldr.addSelect(itm.itm_grp_cd4.as("itm_grp_cd4"));
			mrpItmBldr.addSelect(itm.itm_grp_cd5.as("itm_grp_cd5"));
			mrpItmBldr.addSelect(itm.itm_grp_cd6.as("itm_grp_cd6"));
			mrpItmBldr.addSelect(itm.itm_grp_cd7.as("itm_grp_cd7"));
			mrpItmBldr.addSelect(itm.itm_grp_cd8.as("itm_grp_cd8"));
			mrpItmBldr.addSelect(itm.itm_grp_cd9.as("itm_grp_cd9"));
			mrpItmBldr.addSelect(itm.itm_grp_cd10.as("itm_grp_cd10"));

			// スケジューラＦＬＧがオン
			mrpItmBldr.addWhereWithAnd(mrpItm.sch_flg.eq(value(true)));
			// リリースＦＬＧがオン
			mrpItmBldr.addWhereWithAnd(itm.release_flg.eq(value(true)));

			// 引数指定されている条件を以下で追加
			mrpItmBldr.addWhereWithCutOffAnd(mrpItm.wg_cd.eq(bind("wg_cd")));

			dbSelect("MSLAL9310_MAM_ITM_S01", itmMstList, mrpItmBldr, arg);

			setDown(itmMstList);
		}

		protected void setDown(MCList<OrdSendIf_Itm_Srch01_RsltR> itmMstList) {

			if (isNull(up0().loc_grp_cd())) {
				down0().addAll(itmMstList);
				return;
			}

			MSLAL_OrdSendIfService.OrdSendIf_Itm_Dtl_Bom_Srch01 itmDtlBomSrch01Serv = MSLAL_OrdSendIfService.crtOrdSendIf_Itm_Dtl_Bom_Srch01();
			setArg(itmDtlBomSrch01Serv.up0());
			itmDtlBomSrch01Serv.exec();
			MCList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> itmDtlBomL = MCList.create(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class);
			itmDtlBomL.addAll(itmDtlBomSrch01Serv.down0());

			MCIndexKey itmDtlBomParIdxKey = itmDtlBomL.createIndex(getItmDtlBomParIdxKeyCols());
			MCIndexKey itmDtlBomChdIdxKey = itmDtlBomL.createIndex(getItmDtlBomChdIdxKeyCols());

			for (OrdSendIf_Itm_Srch01_RsltR r : itmMstList) {

				OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR itmDtlBomParR = itmDtlBomL.getFirst(itmDtlBomParIdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
				OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR itmDtlBomChdR = itmDtlBomL.getFirst(itmDtlBomChdIdxKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
				if (!isNull(itmDtlBomParR) || !isNull(itmDtlBomChdR)) {
					down0().add(r);
				}
			}
		}

		protected void setArg(OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR arg) {
			arg.master_dt(up0().master_dt());
			arg.wg_cd(up0().wg_cd());
			arg.mfg_loc_grp_cd(up0().loc_grp_cd());
		}

		protected String[] getItmDtlBomParIdxKeyCols(){
			return new String[]{
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$par_itm_cd,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$par_itm_sub1,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$par_itm_sub2,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$par_itm_sub3,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$wg_cd
			};
		}

		protected String[] getItmDtlBomChdIdxKeyCols(){
			return new String[]{
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_cd,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub1,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub2,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub3,
					OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$wg_cd
			};
		}
	}

	/**
	 * OrdSendIf_Itm_Dtl_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目詳細マスタデータを検索する<br>
	 */
	public class OrdSendIf_Itm_Dtl_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Itm_Dtl_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 品目詳細マスタ検索
			searchTargetItmDtlS01(up0());
		}

		/**
		 * 品目詳細マスタ検索
		 * @return MCList<MAM_ITM_DTL_R>
		 */
		protected void searchTargetItmDtlS01(OrdSendIf_Itm_Dtl_Srch01_DtlR arg) {

			MCList<OrdSendIf_Itm_Dtl_Srch01_RsltR> itmDtlMst = MCList.create(OrdSendIf_Itm_Dtl_Srch01_RsltR.class);
			MSVM_MRP_ITM_DTL_R itmDtlMst1 = MSVM_MRP_ITM_DTL_R.create("M1");

			MCQueryApiBuilder itmMst_bldr = MCQueryApiBuilder.create(itmDtlMst1);
			
			addItmConditionToQuery(itmDtlMst1,itmMst_bldr);
			addLocConditionToQuery(itmDtlMst1.mfg_loc_cd, itmMst_bldr, MSVM_MRP_ITM_DTL_R.$mfg_loc_cd);
			
			// 製造場所が設定されているデータ（製造・外注のもののみ）
			itmMst_bldr.addWhereWithAnd(itmDtlMst1.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value())));
			
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(arg.if_scheduler_typ())) {
				itmMst_bldr.addWhereWithAnd(itmDtlMst1.purc_lt.isNotNull());
			}
			
			// 引数指定されている条件を以下で追加
			// 開始日以上終了日以下
			itmMst_bldr.addWhereWithCutOffAnd(bind(OrdSendIf_Cal_Srch01_CndR.$master_dt)
					.between(itmDtlMst1.st_dt, itmDtlMst1.end_dt));

			dbSelect("MSLAL9310_MAM_ITM_DTL_S01", itmDtlMst, itmMst_bldr, arg);

			down0().addAll(itmDtlMst);
		}

	}
	/**
	 * OrdSendIf_Itm_Oper_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目工程マスタデータを検索する<br>
	 */
	public class OrdSendIf_Itm_Oper_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Itm_Oper_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 品目工程マスタ検索
			searchTargetItmOperS01(up0());
		}

		protected void searchTargetItmOperS01(OrdSendIf_Itm_Oper_Srch01_DtlR arg) {

			MCList<OrdSendIf_Itm_Oper_Srch01_RsltR> itmOperMstList = MCList.create(OrdSendIf_Itm_Oper_Srch01_RsltR.class);
			
			MSVM_MRP_ITM_OPER_R mrpItmOper = MSVM_MRP_ITM_OPER_R.create("MRP_ITM_OPER");
			MAM_OPER_R oper = MAM_OPER_R.create("OPER");
			MCQueryApiBuilder mrpItmOperBldr = MCQueryApiBuilder.create(mrpItmOper);
			
			addItmConditionToQuery(mrpItmOper, mrpItmOperBldr);
			addLocConditionToQuery(mrpItmOper, mrpItmOperBldr);

			mrpItmOperBldr.addLeftOuterJoin(oper, mrpItmOper.oper_cd.eq(oper.oper_cd));
			
			// 検索項目追加
			mrpItmOperBldr.addSelect(oper.oper_nm.as("oper_nm"));

			// 引数指定されている条件を以下で追加
			// 開始日以上終了日以下
			mrpItmOperBldr
					.addWhereWithCutOffAnd(bind(OrdSendIf_Itm_Oper_Srch01_DtlR.$master_dt)
							.between(mrpItmOper.st_dt, mrpItmOper.end_dt));

			dbSelect("MSLAL9310_MAM_ITM_OPER_S01", itmOperMstList, mrpItmOperBldr, arg);

			setDown(itmOperMstList);
		}

		protected void setDown(MCList<OrdSendIf_Itm_Oper_Srch01_RsltR> itmOperMstList) {

			MCSortPolicy policy = new MCSortPolicy();
			policy.add(SortType.ASC, OrdSendIf_Itm_Oper_Srch01_RsltR.$disp_seq);

			for (MCList<OrdSendIf_Itm_Oper_Srch01_RsltR> itmOperMstGrpList: itmOperMstList.groupList(getGrpKey())) {
				itmOperMstGrpList.sort(policy);
				down0().addAll(itmOperMstGrpList);
			}
		}
		protected String[] getGrpKey() {
			return new String[] {
				OrdSendIf_Itm_Oper_Srch01_RsltR.$itm_cd,
				OrdSendIf_Itm_Oper_Srch01_RsltR.$itm_sub1,
				OrdSendIf_Itm_Oper_Srch01_RsltR.$itm_sub2,
				OrdSendIf_Itm_Oper_Srch01_RsltR.$itm_sub3,
				OrdSendIf_Itm_Oper_Srch01_RsltR.$loc_cd,
				OrdSendIf_Itm_Oper_Srch01_RsltR.$oper_ptn
			};
		}
	}

	/**
	 * OrdSendIf_Bom_Srch01オペレーション.<p>
	 *
	 * 送信対象のＢＯＭマスタデータを検索する<br>
	 */
	public class OrdSendIf_Bom_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Bom_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// BOMマスタ検索
			searchTargetItmBomS01(up0());
		}

		/**
		 * ＢＯＭマスタ検索
		 * @return MCList<MAM_BOM_R>
		 */
		protected void searchTargetItmBomS01(OrdSendIf_Bom_Srch01_DtlR arg) {

			MCList<OrdSendIf_Bom_Srch01_RsltR> bomList = MCList.create(OrdSendIf_Bom_Srch01_RsltR.class);

			// 親品目の検索
			MCList<OrdSendIf_Bom_Srch01_RsltR> parBomList = searchTargetParentItmBomS01(arg);
			bomList.addAll(parBomList);

			// 子品目の検索
			MCList<OrdSendIf_Bom_Srch01_RsltR> chdBomList = searchTargetChildItmBomS01(arg);
			bomList.addAll(chdBomList);

			// 重複を除去する
			MCList<OrdSendIf_Bom_Srch01_RsltR> retList = bomList.distinctNE(OrdSendIf_Bom_Srch01_RsltR.$par_itm_cd
					,OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub1
					,OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub2
					,OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub3
					,OrdSendIf_Bom_Srch01_RsltR.$bom_ptn
					,OrdSendIf_Bom_Srch01_RsltR.$oper_cd
					,OrdSendIf_Bom_Srch01_RsltR.$oper_seq
					,OrdSendIf_Bom_Srch01_RsltR.$chd_itm_cd
					,OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub1
					,OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub2
					,OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub3
					,OrdSendIf_Bom_Srch01_RsltR.$ver_no
					,OrdSendIf_Bom_Srch01_RsltR.$ph_flg
					,OrdSendIf_Bom_Srch01_RsltR.$ph_bom_ptn
					,OrdSendIf_Bom_Srch01_RsltR.$alt_grp_cd
					,OrdSendIf_Bom_Srch01_RsltR.$alt_grp_seq
					,OrdSendIf_Bom_Srch01_RsltR.$alt_itm_typ
					,OrdSendIf_Bom_Srch01_RsltR.$alt_itm_ratio
					,OrdSendIf_Bom_Srch01_RsltR.$alt_alloc_prio
					,OrdSendIf_Bom_Srch01_RsltR.$par_inst_qty
					,OrdSendIf_Bom_Srch01_RsltR.$chd_rqmt_qty
					,OrdSendIf_Bom_Srch01_RsltR.$fxd_chd_rqmt_qty
					,OrdSendIf_Bom_Srch01_RsltR.$sno_typ1
					,OrdSendIf_Bom_Srch01_RsltR.$min_sno1
					,OrdSendIf_Bom_Srch01_RsltR.$max_sno1
					,OrdSendIf_Bom_Srch01_RsltR.$sno_typ2
					,OrdSendIf_Bom_Srch01_RsltR.$min_sno2
					,OrdSendIf_Bom_Srch01_RsltR.$max_sno2
					,OrdSendIf_Bom_Srch01_RsltR.$sno_typ3
					,OrdSendIf_Bom_Srch01_RsltR.$min_sno3
					,OrdSendIf_Bom_Srch01_RsltR.$max_sno3
					,OrdSendIf_Bom_Srch01_RsltR.$sno_typ4
					,OrdSendIf_Bom_Srch01_RsltR.$min_sno4
					,OrdSendIf_Bom_Srch01_RsltR.$max_sno4
					,OrdSendIf_Bom_Srch01_RsltR.$in_offst_typ
					,OrdSendIf_Bom_Srch01_RsltR.$in_offst
					,OrdSendIf_Bom_Srch01_RsltR.$inpt_ctl_typ
					,OrdSendIf_Bom_Srch01_RsltR.$st_dt
					,OrdSendIf_Bom_Srch01_RsltR.$end_dt
					,OrdSendIf_Bom_Srch01_RsltR.$wg_cd
					);
			down0().addAll(retList);
		}

		/**
		 * 親品目のＢＯＭマスタ検索
		 * @return MCList<MAM_BOM_R>
		 */
		protected MCList<OrdSendIf_Bom_Srch01_RsltR> searchTargetParentItmBomS01(OrdSendIf_Bom_Srch01_DtlR arg) {

			MCList<OrdSendIf_Bom_Srch01_RsltR> parBomList = MCList.create(OrdSendIf_Bom_Srch01_RsltR.class);

			MSVM_MRP_BOM_R bomMst = MSVM_MRP_BOM_R.create("M1");

			MCQueryApiBuilder itmMst_bldr = MCQueryApiBuilder.create(bomMst);

			addItmConditionToQuery(bomMst, bomMst.par_itm_cd, bomMst.par_itm_sub1,
					bomMst.par_itm_sub2, bomMst.par_itm_sub3, bomMst.wg_cd, itmMst_bldr);

			// 引数指定されている条件を以下で追加
			// 開始日以上終了日以下
			itmMst_bldr
					.addWhereWithCutOffAnd(bind(OrdSendIf_Itm_Oper_Srch01_DtlR.$master_dt)
							.between(bomMst.st_dt, bomMst.end_dt));

			dbSelect("MSLAL9310_MAM_BOM_S01", parBomList, itmMst_bldr, arg);

			return parBomList;
		}

		/**
		 * 子品目のＢＯＭマスタ検索
		 * @return MCList<MAM_BOM_R>
		 */
		protected MCList<OrdSendIf_Bom_Srch01_RsltR> searchTargetChildItmBomS01(OrdSendIf_Bom_Srch01_DtlR arg) {

			MCList<OrdSendIf_Bom_Srch01_RsltR> chdBomList = MCList.create(OrdSendIf_Bom_Srch01_RsltR.class);
			MSVM_MRP_BOM_R bomMst = MSVM_MRP_BOM_R.create("M1");

			MCQueryApiBuilder itmMst_bldr = MCQueryApiBuilder.create(bomMst);

			addItmConditionToQuery(bomMst, bomMst.chd_itm_cd, bomMst.chd_itm_sub1,
					bomMst.chd_itm_sub2, bomMst.chd_itm_sub3, bomMst.wg_cd, itmMst_bldr);

			// 引数指定されている条件を以下で追加
			// 開始日以上終了日以下
			itmMst_bldr
					.addWhereWithCutOffAnd(bind(OrdSendIf_Itm_Oper_Srch01_DtlR.$master_dt)
							.between(bomMst.st_dt, bomMst.end_dt));

			dbSelect("MSLAL9310_MAM_BOM_S02", chdBomList, itmMst_bldr, arg);

			return chdBomList;
		}
	}
	/**
	 * OrdSendIf_Srch01オペレーション.<p>
	 *
	 * 送信対象のオーダ情報を検索する<br>
	 */
	public class OrdSendIf_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 品目工程マスタ検索
			MCList<MST_ITM_ORDER_R> resultItmL = searchTargetItmOrdrS01(up0());
			if (up0().upd_flg()) {
				updateOrder(resultItmL);
			}
			setDown(resultItmL);
		}

		protected MCList<MST_ITM_ORDER_R> searchTargetItmOrdrS01(OrdSendIf_Srch01_DtlR arg) {
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())
					&& up0().include_unfirm_flg() && up0().upd_flg()) {
				
				MCList<MST_ITM_ORDER_R> itmOrdOpnL = srchTargetItmOrd(arg, up0().include_unfirm_flg());
				
				if (itmOrdOpnL.size() != 0) {
					callOrdStsUpdSrv(itmOrdOpnL);
				}
			}
			
			MCList<MST_ITM_ORDER_R> itmOrdNotOpnL = srchTargetItmOrd(arg, false);
			itmOrdL.addAll(itmOrdNotOpnL);
			
			return itmOrdL;
		}

		protected MCList<MST_ITM_ORDER_R> srchTargetItmOrd(OrdSendIf_Srch01_DtlR arg, boolean includeUnfirmFlg) {
			MCList<MST_ITM_ORDER_R> itmMstList = MCList.create(MST_ITM_ORDER_R.class);
			
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("ITM_ORDER");
			MST_OPER_ORDER_R operOrder= MST_OPER_ORDER_R.create("OPER_ORDER");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MAM_LOC_R strgLoc = MAM_LOC_R.create("STRG_LOC");
			MAM_LOC_R mfgLoc = MAM_LOC_R.create("MFG_LOC");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MAM_OPER_R oper = MAM_OPER_R.create("OPER");
			
			MCQueryApiBuilder itmOrderBldr = MCQueryApiBuilder.create(itmOrder);
			
			addItmConditionToQuery(itmOrder, itmOrderBldr);
			
			itmOrderBldr.addLeftOuterJoin(itm, itmOrder.itm_cd.eq(itm.itm_cd)
					.and(itmOrder.itm_sub1.eq(itm.itm_sub1))
					.and(itmOrder.itm_sub2.eq(itm.itm_sub2))
					.and(itmOrder.itm_sub3.eq(itm.itm_sub3)));
			itmOrderBldr.addLeftOuterJoin(strgLoc, itmOrder.strg_loc_cd.eq(strgLoc.loc_cd));
			itmOrderBldr.addLeftOuterJoin(mfgLoc, itmOrder.mfg_loc_cd.eq(mfgLoc.loc_cd));
			
			if (!includeUnfirmFlg) {
				itmOrderBldr.addInnerJoin(operOrder, itmOrder.itm_ord_no.eq(operOrder.itm_ord_no));
				itmOrderBldr.addLeftOuterJoin(loc, operOrder.loc_cd.eq(loc.loc_cd));
				itmOrderBldr.addLeftOuterJoin(oper, operOrder.oper_cd.eq(oper.oper_cd));
				itmOrderBldr.addSelect(operOrder.oper_ord_no.as("oper_ord_no"));
				itmOrderBldr.addSelect(operOrder.oper_ord_sts_typ.as("oper_ord_sts_typ"));
				itmOrderBldr.addSelect(operOrder.st_schd_tm.as("st_schd_tm"));
				itmOrderBldr.addSelect(operOrder.end_schd_tm.as("end_schd_tm"));
				itmOrderBldr.addSelect(operOrder.oper_schd_qty.as("oper_schd_qty"));
				itmOrderBldr.addSelect(operOrder.disp_seq.as("disp_seq"));
				itmOrderBldr.addSelect(operOrder.oper_cd.as("oper_cd"));
				itmOrderBldr.addSelect(oper.oper_nm.as("oper_nm"));
				itmOrderBldr.addSelect(operOrder.oper_seq.as("oper_seq"));
				itmOrderBldr.addSelect(operOrder.loc_cd.as("loc_cd"));
				itmOrderBldr.addSelect(loc.loc_nm.as("loc_nm"));
				itmOrderBldr.addSelect(operOrder.oper_rsrc.as("oper_rsrc"));
				itmOrderBldr.addSelect(operOrder.intr_rmrks.as("oper_ord_intr_rmrks"));
				itmOrderBldr.addSelect(operOrder.sub_char1.as("oper_ord_sub_char1"));
				itmOrderBldr.addSelect(operOrder.sub_char2.as("oper_ord_sub_char2"));
				itmOrderBldr.addSelect(operOrder.sub_char3.as("oper_ord_sub_char3"));
			}
			
			// select句追加
			itmOrderBldr.addSelect(itm.base_itm_nm.as("base_itm_nm"));
			itmOrderBldr.addSelect(itm.itm_nm.as("itm_nm"));
			itmOrderBldr.addSelect(strgLoc.loc_nm.as("strg_loc_nm"));
			itmOrderBldr.addSelect(mfgLoc.loc_nm.as("mfg_loc_nm"));
			itmOrderBldr.addSelect(itmOrder.intr_rmrks.as("itm_ord_intr_rmrks"));
			itmOrderBldr.addSelect(itmOrder.sub_char1.as("itm_ord_sub_char1"));
			itmOrderBldr.addSelect(itmOrder.sub_char2.as("itm_ord_sub_char2"));
			itmOrderBldr.addSelect(itmOrder.sub_char3.as("itm_ord_sub_char3"));
			
			// 引数指定されている条件を以下で追加
			itmOrderBldr.addWhereWithCutOffAnd(mfgLoc.site_cd.eq(bind("site_cd")));
			itmOrderBldr.addWhereWithCutOffAnd(itmOrder.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOrderBldr.addWhereWithCutOffAnd(mfgLoc.loc_grp_cd.eq(bind(MAM_LOC_R.$loc_grp_cd)));
			itmOrderBldr.addWhereWithCutOffAnd(itmOrder.mfg_st_schd_dt.gte(bind("dt_fr"))); 
			itmOrderBldr.addWhereWithCutOffAnd(itmOrder.mfg_end_schd_dt.lte(bind("dt_to")));
			itmOrderBldr.addWhereWithCutOffAnd(bracket(bind("1").eq(value(MSC_IF_SCHEDULER_TYP.FLEXSCHE.value()))
					.and(bracket(bind("2").eq(value(false))
							.and(itmOrder.itm_ord_sts_typ.neq(value(MSC_ITM_ORD_STS_TYP.OPN.value()))))
						.or(bind("2").eq(value(true))
							.and(itmOrder.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value()))
						)))
					)
					.or(bracket(bind("1").eq(value(MSC_IF_SCHEDULER_TYP.GP.value())))
						.and(itmOrder.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.SAV.value())))), arg.getStringNE("if_scheduler_typ"), includeUnfirmFlg
					);
			
			dbSelect("MSLAL9310_MST_ITM_ORDER_S01", itmMstList, itmOrderBldr, arg);
			
			return itmMstList;
		}

		protected void updateOrder(MCList<MST_ITM_ORDER_R> sndOrdL) {
			MCList<MST_ITM_ORDER_R> itmOrdList = MCList.create(MST_ITM_ORDER_R.class);
			
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("T1");
			MCQueryApiBuilder itmOrd_bldr = MCQueryApiBuilder.create(itmOrder);
			itmOrd_bldr.addWhereWithAnd(itmOrder.itm_ord_no.eq(bind("itm_ord_no")));
			
			// ファイル出力した品目オーダ情報の品目オーダNOに該当するオーダ情報を検索する
			dbSelect("MSLAL9920_MST_ITM_ORDER_S01", itmOrdList, itmOrd_bldr, sndOrdL);
			
			if (!itmOrdList.isEmpty()) {
				updOrdSnd(itmOrdList, itmOrd_bldr, itmOrder);
			}
		}

		protected void callOrdStsUpdSrv(MCList<MST_ITM_ORDER_R> opnItmOrdL) {
			MSBCL_OrdSrch.Upd01 ope = MSBCL_OrdSrch.crtUpd01();
			addAll(ope.up0(), opnItmOrdL, createMap_Chk01_DtlR_MST_ITM_ORDER_R());
			ope.exec();
		}

		protected void updOrdSnd(MCList<MST_ITM_ORDER_R> itmOrdList, MCQueryApiBuilder itmOrd_bldr, MST_ITM_ORDER_R itmOrder) {
			itmOrdList.setBoolean(MST_ITM_ORDER_R.$ord_snd_flg, true);
			itmOrd_bldr.setSet(itmOrder.ord_snd_flg);
			
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				itmOrdList.setBoolean(MST_ITM_ORDER_R.$for_scheduler_frozen_flg, true);
				itmOrd_bldr.addSet(itmOrder.for_scheduler_frozen_flg);
			}
			
			dbUpdateKey("MSLAL9920_MST_ITM_ORDER_U01", itmOrdList, itmOrd_bldr);
		}

		protected void setDown(MCList<MST_ITM_ORDER_R> resultItmL) {
			complDt(resultItmL);
			addAll(down0(), resultItmL, createMap_Map_OrdSend_Ordr_Srch01_RsltR());
		}

		protected void complDt(MCList<MST_ITM_ORDER_R> resultItmL) {
			for (MCList<MST_ITM_ORDER_R> itmOrdL : resultItmL.groupList(MST_ITM_ORDER_R.$itm_ord_no)) {
				MCDate mfgStSchdDt = (MCDate)itmOrdL.min(MST_OPER_ORDER_R.$st_schd_tm);
				MCDate mfgEndSchdDt = (MCDate)itmOrdL.max(MST_OPER_ORDER_R.$end_schd_tm);
				MCDate strgSchdDt = (MCDate)itmOrdL.max(MST_OPER_ORDER_R.$end_schd_tm);
				
				if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
					itmOrdL.setValueNE(MST_ITM_ORDER_R.$mfg_st_schd_dt, mfgStSchdDt);
					itmOrdL.setValueNE(MST_ITM_ORDER_R.$mfg_end_schd_dt, mfgEndSchdDt);
					itmOrdL.setValueNE(MST_ITM_ORDER_R.$strg_schd_dt, strgSchdDt);
				}
			}
		}

		protected Map_Chk01_DtlR_MST_ITM_ORDER_R<Chk01_DtlR, MST_ITM_ORDER_R> createMap_Chk01_DtlR_MST_ITM_ORDER_R() {
			return new Map_Chk01_DtlR_MST_ITM_ORDER_R<Chk01_DtlR, MST_ITM_ORDER_R>();
		}

		public class Map_Chk01_DtlR_MST_ITM_ORDER_R<D extends Chk01_DtlR, S extends MST_ITM_ORDER_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ord(src);
			}
		}

		/** MST_ITM_ORDER → OrdSendIf_Srch01_RsltR */
		protected Map_OrdSendIf_Srch01_RsltR<OrdSendIf_Srch01_RsltR, MST_ITM_ORDER_R> createMap_Map_OrdSend_Ordr_Srch01_RsltR() {
			return new Map_OrdSendIf_Srch01_RsltR<OrdSendIf_Srch01_RsltR, MST_ITM_ORDER_R>();
		}

		/** MST_ITM_ORDER → OrdSendIf_Srch01_RsltR */
		public class Map_OrdSendIf_Srch01_RsltR<D extends OrdSendIf_Srch01_RsltR, S extends MST_ITM_ORDER_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_typ, MST_ITM_ORDER_R.$itm_ord_typ);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_no, MST_ITM_ORDER_R.$itm_ord_no);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_no, "oper_ord_no");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_sts_typ, MST_ITM_ORDER_R.$itm_ord_sts_typ);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_sts_typ, "oper_ord_sts_typ");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_cd, MST_ITM_ORDER_R.$itm_cd);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_sub1, MST_ITM_ORDER_R.$itm_sub1);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_sub2, MST_ITM_ORDER_R.$itm_sub2);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_sub3, MST_ITM_ORDER_R.$itm_sub3);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_nm, "itm_nm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$ver_no, MST_ITM_ORDER_R.$ver_no);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$strg_loc_cd, MST_ITM_ORDER_R.$strg_loc_cd);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$strg_loc_nm, "strg_loc_nm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$mfg_loc_cd, MST_ITM_ORDER_R.$mfg_loc_cd);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$mfg_loc_nm, "mfg_loc_nm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$bom_ptn, MST_ITM_ORDER_R.$bom_ptn);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ptn, MST_ITM_ORDER_R.$oper_ptn);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$inst_qty, MST_ITM_ORDER_R.$inst_qty);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$yield_schd_qty, MST_ITM_ORDER_R.$yield_schd_qty);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$po_schd_dt, MST_ITM_ORDER_R.$po_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$mfg_st_schd_dt, MST_ITM_ORDER_R.$mfg_st_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$mfg_end_schd_dt, MST_ITM_ORDER_R.$mfg_end_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$strg_schd_dt, MST_ITM_ORDER_R.$strg_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$accpt_schd_dt, MST_ITM_ORDER_R.$accpt_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$insp_st_schd_dt, MST_ITM_ORDER_R.$insp_st_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$insp_end_schd_dt, MST_ITM_ORDER_R.$insp_end_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$avl_schd_dt, MST_ITM_ORDER_R.$avl_schd_dt);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$sno1, MST_ITM_ORDER_R.$sno1);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$sno2, MST_ITM_ORDER_R.$sno2);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$sno3, MST_ITM_ORDER_R.$sno3);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$sno4, MST_ITM_ORDER_R.$sno4);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$inst_po_cnt_rmrks, MST_ITM_ORDER_R.$inst_po_cnt_rmrks);
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_intr_rmrks, "itm_ord_intr_rmrks");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_sub_char1, "itm_ord_sub_char1");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_sub_char2, "itm_ord_sub_char2");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$itm_ord_sub_char3, "itm_ord_sub_char3");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$st_schd_tm, "st_schd_tm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$end_schd_tm, "end_schd_tm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_schd_qty, "oper_schd_qty");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$disp_seq, "disp_seq");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_cd, "oper_cd");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_nm, "oper_nm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_seq, "oper_seq");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$loc_cd, "loc_cd");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$loc_nm, "loc_nm");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_rsrc, "oper_rsrc");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_intr_rmrks, "oper_ord_intr_rmrks");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_sub_char1, "oper_ord_sub_char1");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_sub_char2, "oper_ord_sub_char2");
				addColumnPathMap( OrdSendIf_Srch01_RsltR.$oper_ord_sub_char3, "oper_ord_sub_char3");
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (isNull(dest.itm_nm())) {
					dest.itm_nm(src.getString("base_itm_nm"));
				}
				if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
					dest.master_dt(getToday());
				}
				else {
					dest.master_dt(src.master_dt());
				}
			}

		}
	}

	/**
	 * OrdSendIf_Loc_Srch01オペレーション.<p>
	 *
	 * 送信対象の場所マスタデータを検索する<br>
	 */
	public class OrdSendIf_Loc_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Loc_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetLoc();
		}
		
		protected void searchTargetLoc(){
			MCList<OrdSendIf_Loc_Srch01_RsltR> rslt = MCList.create(OrdSendIf_Loc_Srch01_RsltR.class);
			MSVM_MRP_LOC_R locL_t1 = MSVM_MRP_LOC_R.create("T1");
			MAM_LOC_R locL_t2 = MAM_LOC_R.create("T2");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(locL_t1);
			locL_bldr.setSelect(
					locL_t1.wg_cd,
					locL_t1.loc_cd,
					locL_t1.loc_grp_cd,
					locL_t1.cal_cd,
					locL_t2.loc_nm,
					locL_t1.site_cd
			);
			locL_bldr.addLeftOuterJoin(locL_t2, locL_t1.loc_cd.eq(locL_t2.loc_cd));
			locL_bldr.addWhereWithAnd(locL_t1.wg_cd.eq(bind(OrdSendIf_Loc_Srch01_CndR.$wg_cd)));
			locL_bldr.addWhereWithCutOffAnd(locL_t1.site_cd.eq(bind(OrdSendIf_Loc_Srch01_CndR.$site_cd)));
			locL_bldr.addWhereWithCutOffAnd(locL_t1.loc_cd.eq(bind(OrdSendIf_Loc_Srch01_CndR.$loc_cd)));
			
			dbSelect("MSLAL9310_MAM_LOC_S01",rslt, locL_bldr, up0());
			
			down0().addAll(rslt);
		}
	}
	/**
	 * OrdSendIf_Cal_Srch01オペレーション.<p>
	 *
	 * 送信対象のカレンダマスタデータを検索する。<br>
	 */
	public class OrdSendIf_Cal_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Cal_Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetCal();
		}
		
		protected void searchTargetCal(){
			MCList<OrdSendIf_Cal_Srch01_RsltR> rslt = MCList.create(OrdSendIf_Cal_Srch01_RsltR.class);
			MSVM_MRP_CAL_R calL_t1 = MSVM_MRP_CAL_R.create("T1");
			MAM_CAL_BASE_R calL_t2 = MAM_CAL_BASE_R.create("T2");
			MCQueryApiBuilder calL_bldr = MCQueryApiBuilder.create(calL_t1);
			calL_bldr.setSelect(
					calL_t1.cal_cd,
					calL_t2.cal_nm,
					calL_t1.st_dt,
					calL_t1.end_dt,
					calL_t1.sun_off_flg,
					calL_t1.mon_off_flg,
					calL_t1.tue_off_flg,
					calL_t1.wed_off_flg,
					calL_t1.thu_off_flg,
					calL_t1.fri_off_flg,
					calL_t1.sat_off_flg
			);
			calL_bldr.addLeftOuterJoin(calL_t2, calL_t1.cal_cd.eq(calL_t2.cal_cd));
			// 開始日以上終了日以下
			calL_bldr.addWhereWithAnd(bind(OrdSendIf_Cal_Srch01_CndR.$master_dt).between(calL_t1.st_dt, calL_t1.end_dt));
			
			dbSelect("MSLAL9310_MAM_CAL_S01",rslt, calL_bldr, up0());
			
			down0().addAll(rslt);
		}
	}
	/**
	 * OrdSendIf_Ext_Cal_Srch01オペレーション.<p>
	 *
	 * 送信対象の臨時カレンダマスタデータを検索する。<br>
	 */
	public class OrdSendIf_Ext_Cal_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Ext_Cal_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetExt_Cal();
		}
		
		protected void searchTargetExt_Cal(){
			MCList<OrdSendIf_Ext_Cal_Srch01_RsltR> rslt = MCList.create(OrdSendIf_Ext_Cal_Srch01_RsltR.class);
			MSVM_MRP_CAL_EXT_R calExtL_t1 = MSVM_MRP_CAL_EXT_R.create("T1");
			MCQueryApiBuilder calExtL_bldr = MCQueryApiBuilder.create(calExtL_t1);
			calExtL_bldr.setSelect(
					calExtL_t1.cal_cd,
					calExtL_t1.dt,
					calExtL_t1.off_flg
			);
			
			dbSelect("MSLAL9310_MSVM_MRP_CAL_EXT_S01",rslt, calExtL_bldr);
			
			down0().addAll(rslt);
		}
	}
	/**
	 * OrdSendIf_Stk_Srch01オペレーション.<p>
	 *
	 * 送信対象の在庫情報を検索する<br>
	 */
	public class OrdSendIf_Stk_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Stk_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			searchTargetStk();
		}
		
		protected void searchTargetStk(){
			MCList<OrdSendIf_Stk_Srch01_RsltR> rslt = MCList.create(OrdSendIf_Stk_Srch01_RsltR.class);
			
			MCList<OrdSendIf_Stk_Srch01_RsltR> locStkList = srchTargetLocStk();
			rslt.addAll(locStkList);
			
			if (!isNull(up0().loc_grp_cd())) {
				MCList<OrdSendIf_Stk_Srch01_RsltR> allocCtlItmStkL = srchTargetAllocCtlItmStk();
				rslt.addAll(allocCtlItmStkL);
				
				MCList<OrdSendIf_Stk_Srch01_RsltR> allocCtlStkL = srchTargetAllocCtlStk();
				rslt.addAll(allocCtlStkL);
			}
			
			setDown(rslt);
		}
		
		protected MCList<OrdSendIf_Stk_Srch01_RsltR> srchTargetLocStk(){
			MCList<OrdSendIf_Stk_Srch01_RsltR> locStkL = MCList.create(OrdSendIf_Stk_Srch01_RsltR.class);
			
			MSVT_MRP_STK_R mrpStk = MSVT_MRP_STK_R.create("MRP_STK");
			MCQueryApiBuilder mrpStkBldr = MCQueryApiBuilder.create(mrpStk);
			
			addLocConditionToQuery(mrpStk, mrpStkBldr);
			addItmConditionToQuery(mrpStk, mrpStkBldr);
			
			mrpStkBldr.setSelect(
					mrpStk.wg_cd,
					mrpStk.itm_cd,
					mrpStk.itm_sub1,
					mrpStk.itm_sub2,
					mrpStk.itm_sub3,
					mrpStk.loc_cd,
					mrpStk.ver_no,
					mrpStk.lot_no,
					mrpStk.sublot_no,
					mrpStk.base_unit_qty.as(OrdSendIf_Stk_Srch01_RsltR.$qty),
					mrpStk.gd_cd,
					mrpStk.first_gr_dt,
					mrpStk.lot_seq,
					mrpStk.lmt_dt,
					mrpStk.sno1,
					mrpStk.sno2,
					mrpStk.sno3,
					mrpStk.sno4
				);
			
			dbSelect("MSLAL9310_MSVT_MRP_STK_S01", locStkL, mrpStkBldr, up0());
			
			return locStkL;
		}
		
		protected MCList<OrdSendIf_Stk_Srch01_RsltR> srchTargetAllocCtlItmStk(){
			MCList<OrdSendIf_Stk_Srch01_RsltR> allocCtlItmStkL = MCList.create(OrdSendIf_Stk_Srch01_RsltR.class);
			
			MSVT_MRP_STK_R mrpStk = MSVT_MRP_STK_R.create("MRP_STK");
			MCQueryApiBuilder mrpStkBldr = MCQueryApiBuilder.create(mrpStk);
			
			addAllocCtlItmConditionToQuery(mrpStk, mrpStkBldr);
			addItmConditionToQuery(mrpStk, mrpStkBldr);
			
			mrpStkBldr.setDistinct();
			mrpStkBldr.setSelect(
					mrpStk.wg_cd,
					mrpStk.itm_cd,
					mrpStk.itm_sub1,
					mrpStk.itm_sub2,
					mrpStk.itm_sub3,
					mrpStk.loc_cd,
					mrpStk.ver_no,
					mrpStk.lot_no,
					mrpStk.sublot_no,
					mrpStk.base_unit_qty.as(OrdSendIf_Stk_Srch01_RsltR.$qty),
					mrpStk.gd_cd,
					mrpStk.first_gr_dt,
					mrpStk.lot_seq,
					mrpStk.lmt_dt,
					mrpStk.sno1,
					mrpStk.sno2,
					mrpStk.sno3,
					mrpStk.sno4
				);
			
			dbSelect("MSLAL9310_MSVT_MRP_STK_S02", allocCtlItmStkL, mrpStkBldr, up0());
			
			return allocCtlItmStkL;
		}
		
		protected MCList<OrdSendIf_Stk_Srch01_RsltR> srchTargetAllocCtlStk(){
			MCList<OrdSendIf_Stk_Srch01_RsltR> allocCtlStkL = MCList.create(OrdSendIf_Stk_Srch01_RsltR.class);
			
			MSVT_MRP_STK_R mrpStk = MSVT_MRP_STK_R.create("MRP_STK");
			MCQueryApiBuilder mrpStkBldr = MCQueryApiBuilder.create(mrpStk);
			
			addAllocCtlConditionToQuery(mrpStk, mrpStkBldr);
			addItmConditionToQuery(mrpStk, mrpStkBldr);
			
			mrpStkBldr.setDistinct();
			mrpStkBldr.setSelect(
					mrpStk.wg_cd,
					mrpStk.itm_cd,
					mrpStk.itm_sub1,
					mrpStk.itm_sub2,
					mrpStk.itm_sub3,
					mrpStk.loc_cd,
					mrpStk.ver_no,
					mrpStk.lot_no,
					mrpStk.sublot_no,
					mrpStk.base_unit_qty.as(OrdSendIf_Stk_Srch01_RsltR.$qty),
					mrpStk.gd_cd,
					mrpStk.first_gr_dt,
					mrpStk.lot_seq,
					mrpStk.lmt_dt,
					mrpStk.sno1,
					mrpStk.sno2,
					mrpStk.sno3,
					mrpStk.sno4
				);
			
			dbSelect("MSLAL9310_MSVT_MRP_STK_S03", allocCtlStkL, mrpStkBldr, up0());
			
			return allocCtlStkL;
		}

		protected void setDown(MCList<OrdSendIf_Stk_Srch01_RsltR> rslt) {
			MCList<OrdSendIf_Stk_Srch01_RsltR> downL = MCList.create(OrdSendIf_Stk_Srch01_RsltR.class);

			if (isNull(up0().loc_grp_cd())) {
				downL.addAll(rslt);
			}
			else {
				MCList<MAM_ALLOC_CTL_R> allocCtlL = getAllocCtl(up0().loc_grp_cd(), up0().site_cd(), up0().loc_cd());
				MCIndexKey allocCtlItmKey = allocCtlL.createIndex(MAM_ALLOC_CTL_R.$fr_loc_cd, MAM_ALLOC_CTL_R.$itm_cd, MAM_ALLOC_CTL_R.$itm_sub1, MAM_ALLOC_CTL_R.$itm_sub2, MAM_ALLOC_CTL_R.$itm_sub3);
				for (OrdSendIf_Stk_Srch01_RsltR r : rslt) {
					if (!isNegativePrio(allocCtlL, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), allocCtlItmKey)) {
						downL.add(r);
					}
				}
			}

			editDown(downL);
		}

		protected void editDown(MCList<OrdSendIf_Stk_Srch01_RsltR> downL) {

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				for (MCList<OrdSendIf_Stk_Srch01_RsltR> stkGrpL: downL.groupList(getGrpKey())) {
					OrdSendIf_Stk_Srch01_RsltR stkGrpR = stkGrpL.get(0);
					stkGrpR.loc_cd(MAC_STR.NULL_VAL.value());
					stkGrpR.ver_no(null);
					stkGrpR.lot_no(null);
					stkGrpR.sublot_no(null);
					stkGrpR.qty(stkGrpL.sum(OrdSendIf_Stk_Srch01_RsltR.$qty));
					stkGrpR.gd_cd(null);
					stkGrpR.first_gr_dt(null);
					stkGrpR.lot_seq(null);
					stkGrpR.lmt_dt(null);
					stkGrpR.sno1(MAC_STR.NULL_VAL.value());
					stkGrpR.sno2(MAC_STR.NULL_VAL.value());
					stkGrpR.sno3(MAC_STR.NULL_VAL.value());
					stkGrpR.sno4(MAC_STR.NULL_VAL.value());
					down0().add(stkGrpR);
				}
			}
			else {
				down0().addAll(downL);
			}
		}
		protected String[] getGrpKey() {
			return new String[] {
				OrdSendIf_Stk_Srch01_RsltR.$wg_cd,
				OrdSendIf_Stk_Srch01_RsltR.$itm_cd,
				OrdSendIf_Stk_Srch01_RsltR.$itm_sub1,
				OrdSendIf_Stk_Srch01_RsltR.$itm_sub2,
				OrdSendIf_Stk_Srch01_RsltR.$itm_sub3
			};
		}
	}

	/**
	 * OrdSendIf_IO_Gr_Srch01オペレーション.<p>
	 *
	 * 送信対象の入庫予定情報を検索する<br>
	 */
	public class OrdSendIf_IO_Gr_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_IO_Gr_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetIOGr();
		}
		
		protected void searchTargetIOGr(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> rslt = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> mrpIoSchdL = srchMrpIoSchd();
			rslt.addAll(mrpIoSchdL);
			
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				MCList<OrdSendIf_IO_Gr_Srch01_RsltR> savordIoSchdL = srchSavordIoSchd();
				rslt.addAll(savordIoSchdL);
				
				if (!isNull(up0().loc_grp_cd())) {
					MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlItmMrpIoSchdL = srchTargetAllocCtlItmMrpIoSchd();
					rslt.addAll(allocCtlItmMrpIoSchdL);
					
					MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlMrpIoSchdL = srchTargetAllocCtlMrpIoSchd();
					rslt.addAll(allocCtlMrpIoSchdL);
					
					MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlItmSavordIoSchdL = srchTargetAllocCtlItmSavordIoSchd();
					rslt.addAll(allocCtlItmSavordIoSchdL);
					
					MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlSavordIoSchdL = srchTargetAllocCtlSavordIoSchd();
					rslt.addAll(allocCtlSavordIoSchdL);
				}
			}
			
			setDown(rslt);
		}

		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchMrpIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> mrpIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GR_R ioSchdGr = MSVT_MRP_IO_SCHD_GR_R.create("MRP_IO_SCHD_GR");
			MCQueryApiBuilder ioSchdGrBldr = MCQueryApiBuilder.create(ioSchdGr);
			
			addLocConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addItmConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addDateTimeConditionToQuery(ioSchdGr.avl_schd_dt, ioSchdGrBldr);
			
			ioSchdGrBldr.setSelect(
					ioSchdGr.wg_cd,
					ioSchdGr.itm_ord_no,
					ioSchdGr.io_schd_no,
					ioSchdGr.io_schd_typ,
					ioSchdGr.io_schd_sts_typ,
					ioSchdGr.itm_cd,
					ioSchdGr.itm_sub1,
					ioSchdGr.itm_sub2,
					ioSchdGr.itm_sub3,
					ioSchdGr.loc_cd,
					ioSchdGr.ver_no,
					ioSchdGr.lot_no,
					ioSchdGr.sublot_no,
					ioSchdGr.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					ioSchdGr.avl_schd_dt,
					ioSchdGr.lmt_dt,
					ioSchdGr.sno1,
					ioSchdGr.sno2,
					ioSchdGr.sno3,
					ioSchdGr.sno4
				);
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S01", mrpIoSchdL, ioSchdGrBldr, up0());
			
			return mrpIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchSavordIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> savordIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MST_SAVORD_IO_SCHD_R savordIoSchd = MST_SAVORD_IO_SCHD_R.create("SAVORD_IO_SCHD");
			MSVT_LOT_LIST_R lotList = MSVT_LOT_LIST_R.create("LOT_LIST");
			MCQueryApiBuilder savordIoSchdBldr = MCQueryApiBuilder.create(savordIoSchd);
			
			addLocConditionToQuery(savordIoSchd, savordIoSchdBldr);
			addItmConditionToQuery(savordIoSchd,savordIoSchdBldr);
			addDateTimeConditionToQuery(savordIoSchd.avl_schd_dt, savordIoSchdBldr);
			
			savordIoSchdBldr.setSelect(
					savordIoSchd.wg_cd,
					savordIoSchd.io_schd_no.as("itm_ord_no"),
					savordIoSchd.io_schd_no,
					savordIoSchd.io_schd_typ,
					savordIoSchd.io_schd_sts_typ,
					savordIoSchd.itm_cd,
					savordIoSchd.itm_sub1,
					savordIoSchd.itm_sub2,
					savordIoSchd.itm_sub3,
					savordIoSchd.loc_cd,
					savordIoSchd.ver_no,
					savordIoSchd.lot_no,
					savordIoSchd.sublot_no,
					savordIoSchd.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					savordIoSchd.avl_schd_dt,
					lotList.lmt_dt,
					savordIoSchd.sno1,
					savordIoSchd.sno2,
					savordIoSchd.sno3,
					savordIoSchd.sno4
				);
			savordIoSchdBldr.addLeftOuterJoin(lotList, savordIoSchd.itm_cd.eq(lotList.itm_cd)
					.and(savordIoSchd.itm_sub1.eq(lotList.itm_sub1))
					.and(savordIoSchd.itm_sub2.eq(lotList.itm_sub2))
					.and(savordIoSchd.itm_sub3.eq(lotList.itm_sub3))
					.and(savordIoSchd.lot_no.eq(lotList.lot_no))
					.and(savordIoSchd.sublot_no.eq(lotList.sublot_no)));
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S02", savordIoSchdL, savordIoSchdBldr, up0());
			
			return savordIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchTargetAllocCtlItmMrpIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlItmMrpIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GR_R ioSchdGr = MSVT_MRP_IO_SCHD_GR_R.create("MRP_IO_SCHD_GR");
			MCQueryApiBuilder ioSchdGrBldr = MCQueryApiBuilder.create(ioSchdGr);
			
			addAllocCtlItmConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addItmConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addDateTimeConditionToQuery(ioSchdGr.avl_schd_dt, ioSchdGrBldr);
			
			ioSchdGrBldr.setDistinct();
			ioSchdGrBldr.setSelect(
					ioSchdGr.wg_cd,
					ioSchdGr.itm_ord_no,
					ioSchdGr.io_schd_no,
					ioSchdGr.io_schd_typ,
					ioSchdGr.io_schd_sts_typ,
					ioSchdGr.itm_cd,
					ioSchdGr.itm_sub1,
					ioSchdGr.itm_sub2,
					ioSchdGr.itm_sub3,
					ioSchdGr.loc_cd,
					ioSchdGr.ver_no,
					ioSchdGr.lot_no,
					ioSchdGr.sublot_no,
					ioSchdGr.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					ioSchdGr.avl_schd_dt,
					ioSchdGr.lmt_dt,
					ioSchdGr.sno1,
					ioSchdGr.sno2,
					ioSchdGr.sno3,
					ioSchdGr.sno4
				);
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S03", allocCtlItmMrpIoSchdL, ioSchdGrBldr, up0());
			
			return allocCtlItmMrpIoSchdL;
		}
		
		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchTargetAllocCtlMrpIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlMrpIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GR_R ioSchdGr = MSVT_MRP_IO_SCHD_GR_R.create("MRP_IO_SCHD_GR");
			MCQueryApiBuilder ioSchdGrBldr = MCQueryApiBuilder.create(ioSchdGr);
			
			addAllocCtlConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addItmConditionToQuery(ioSchdGr, ioSchdGrBldr);
			addDateTimeConditionToQuery(ioSchdGr.avl_schd_dt, ioSchdGrBldr);
			
			ioSchdGrBldr.setDistinct();
			ioSchdGrBldr.setSelect(
					ioSchdGr.wg_cd,
					ioSchdGr.itm_ord_no,
					ioSchdGr.io_schd_no,
					ioSchdGr.io_schd_typ,
					ioSchdGr.io_schd_sts_typ,
					ioSchdGr.itm_cd,
					ioSchdGr.itm_sub1,
					ioSchdGr.itm_sub2,
					ioSchdGr.itm_sub3,
					ioSchdGr.loc_cd,
					ioSchdGr.ver_no,
					ioSchdGr.lot_no,
					ioSchdGr.sublot_no,
					ioSchdGr.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					ioSchdGr.avl_schd_dt,
					ioSchdGr.lmt_dt,
					ioSchdGr.sno1,
					ioSchdGr.sno2,
					ioSchdGr.sno3,
					ioSchdGr.sno4
				);
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S04", allocCtlMrpIoSchdL, ioSchdGrBldr, up0());
			
			return allocCtlMrpIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchTargetAllocCtlItmSavordIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlItmSavordIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MST_SAVORD_IO_SCHD_R savordIoSchd = MST_SAVORD_IO_SCHD_R.create("SAVORD_IO_SCHD");
			MSVT_LOT_LIST_R lotList = MSVT_LOT_LIST_R.create("LOT_LIST");
			MCQueryApiBuilder savordIoSchdBldr = MCQueryApiBuilder.create(savordIoSchd);
			
			addAllocCtlItmConditionToQuery(savordIoSchd, savordIoSchdBldr);
			addItmConditionToQuery(savordIoSchd,savordIoSchdBldr);
			addDateTimeConditionToQuery(savordIoSchd.avl_schd_dt, savordIoSchdBldr);
			
			savordIoSchdBldr.setDistinct();
			savordIoSchdBldr.setSelect(
					savordIoSchd.wg_cd,
					savordIoSchd.io_schd_no.as("itm_ord_no"),
					savordIoSchd.io_schd_no,
					savordIoSchd.io_schd_typ,
					savordIoSchd.io_schd_sts_typ,
					savordIoSchd.itm_cd,
					savordIoSchd.itm_sub1,
					savordIoSchd.itm_sub2,
					savordIoSchd.itm_sub3,
					savordIoSchd.loc_cd,
					savordIoSchd.ver_no,
					savordIoSchd.lot_no,
					savordIoSchd.sublot_no,
					savordIoSchd.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					savordIoSchd.avl_schd_dt,
					lotList.lmt_dt,
					savordIoSchd.sno1,
					savordIoSchd.sno2,
					savordIoSchd.sno3,
					savordIoSchd.sno4
				);
			savordIoSchdBldr.addLeftOuterJoin(lotList, savordIoSchd.itm_cd.eq(lotList.itm_cd)
					.and(savordIoSchd.itm_sub1.eq(lotList.itm_sub1))
					.and(savordIoSchd.itm_sub2.eq(lotList.itm_sub2))
					.and(savordIoSchd.itm_sub3.eq(lotList.itm_sub3))
					.and(savordIoSchd.lot_no.eq(lotList.lot_no))
					.and(savordIoSchd.sublot_no.eq(lotList.sublot_no)));
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S05", allocCtlItmSavordIoSchdL, savordIoSchdBldr, up0());
			
			return allocCtlItmSavordIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gr_Srch01_RsltR> srchTargetAllocCtlSavordIoSchd(){
			MCList<OrdSendIf_IO_Gr_Srch01_RsltR> allocCtlSavordIoSchdL = MCList.create(OrdSendIf_IO_Gr_Srch01_RsltR.class);
			
			MST_SAVORD_IO_SCHD_R savordIoSchd = MST_SAVORD_IO_SCHD_R.create("SAVORD_IO_SCHD");
			MSVT_LOT_LIST_R lotList = MSVT_LOT_LIST_R.create("LOT_LIST");
			MCQueryApiBuilder savordIoSchdBldr = MCQueryApiBuilder.create(savordIoSchd);
			
			addAllocCtlConditionToQuery(savordIoSchd, savordIoSchdBldr);
			addItmConditionToQuery(savordIoSchd,savordIoSchdBldr);
			addDateTimeConditionToQuery(savordIoSchd.avl_schd_dt, savordIoSchdBldr);
			
			savordIoSchdBldr.setDistinct();
			savordIoSchdBldr.setSelect(
					savordIoSchd.wg_cd,
					savordIoSchd.io_schd_no.as("itm_ord_no"),
					savordIoSchd.io_schd_no,
					savordIoSchd.io_schd_typ,
					savordIoSchd.io_schd_sts_typ,
					savordIoSchd.itm_cd,
					savordIoSchd.itm_sub1,
					savordIoSchd.itm_sub2,
					savordIoSchd.itm_sub3,
					savordIoSchd.loc_cd,
					savordIoSchd.ver_no,
					savordIoSchd.lot_no,
					savordIoSchd.sublot_no,
					savordIoSchd.base_unit_qty.as(OrdSendIf_IO_Gr_Srch01_RsltR.$qty),
					savordIoSchd.avl_schd_dt,
					lotList.lmt_dt,
					savordIoSchd.sno1,
					savordIoSchd.sno2,
					savordIoSchd.sno3,
					savordIoSchd.sno4
				);
			savordIoSchdBldr.addLeftOuterJoin(lotList, savordIoSchd.itm_cd.eq(lotList.itm_cd)
					.and(savordIoSchd.itm_sub1.eq(lotList.itm_sub1))
					.and(savordIoSchd.itm_sub2.eq(lotList.itm_sub2))
					.and(savordIoSchd.itm_sub3.eq(lotList.itm_sub3))
					.and(savordIoSchd.lot_no.eq(lotList.lot_no))
					.and(savordIoSchd.sublot_no.eq(lotList.sublot_no)));
			dbSelect("MSLAL9310_MRP_IO_SCHD_GR_S06", allocCtlSavordIoSchdL, savordIoSchdBldr, up0());
			
			return allocCtlSavordIoSchdL;
		}

		protected void setDown(MCList<OrdSendIf_IO_Gr_Srch01_RsltR> rslt) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				down0().addAll(rslt);
				return;
			}

			MSLAL_OrdSendIfService.OrdSendIf_Srch01 ordSrch01Serv = MSLAL_OrdSendIfService.crtOrdSendIf_Srch01();
			setArg(ordSrch01Serv.up0());
			ordSrch01Serv.exec();
			MCList<OrdSendIf_Srch01_RsltR> ordL = MCList.create(OrdSendIf_Srch01_RsltR.class);
			ordL.addAll(ordSrch01Serv.down0());

			MCIndexKey ordIdxKey = ordL.createIndex(OrdSendIf_Srch01_RsltR.$itm_ord_no);
			MCList<MAM_ALLOC_CTL_R> allocCtlL = getAllocCtl(up0().loc_grp_cd(), up0().site_cd(), up0().loc_cd());
			MCIndexKey allocCtlItmKey = allocCtlL.createIndex(MAM_ALLOC_CTL_R.$fr_loc_cd, MAM_ALLOC_CTL_R.$itm_cd, MAM_ALLOC_CTL_R.$itm_sub1, MAM_ALLOC_CTL_R.$itm_sub2, MAM_ALLOC_CTL_R.$itm_sub3);

			for (OrdSendIf_IO_Gr_Srch01_RsltR r : rslt) {
				
				OrdSendIf_Srch01_RsltR ordR = ordL.getFirst(ordIdxKey, r.itm_ord_no());
				if (!isNull(ordR)) {
					continue;
				}

				if (!isNull(up0().loc_grp_cd()) && !isNegativePrio(allocCtlL, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), allocCtlItmKey)) {
					down0().add(r);
				}
			}
		}

		protected void setArg(OrdSendIf_Srch01_DtlR arg) {
			arg.wg_cd(up0().wg_cd());
			arg.loc_grp_cd(up0().loc_grp_cd());
			arg.site_cd(up0().site_cd());
			arg.mfg_loc_cd(up0().loc_cd());
			arg.dt_fr(up0().dt_fr());
			arg.dt_to(up0().dt_to());
			arg.include_unfirm_flg(false);
			arg.if_scheduler_typ(up0().if_scheduler_typ());
		}
	}
	/**
	 * OrdSendIf_IO_Gi_Srch01オペレーション.<p>
	 *
	 * 送信対象の出庫予定情報を検索する<br>
	 */
	public class OrdSendIf_IO_Gi_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_IO_Gi_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetIOGi();
		}
		
		protected void searchTargetIOGi(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> rslt = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> locIoGiL = srchTargetLocIoGi();
			rslt.addAll(locIoGiL);
			
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				MCList<OrdSendIf_IO_Gi_Srch01_RsltR> ordIoSchdL = srchTargetOrdIoSchd();
				rslt.addAll(ordIoSchdL);
				
				if (!isNull(up0().loc_grp_cd())) {
					MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlItmIoGiL = srchTargetAllocCtlItmIoGi();
					rslt.addAll(allocCtlItmIoGiL);
					
					MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlIoGiL = srchTargetAllocCtlIoGi();
					rslt.addAll(allocCtlIoGiL);
					
					MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlItmIoSchdL = srchTargetAllocCtlItmIoSchd();
					rslt.addAll(allocCtlItmIoSchdL);
					
					MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlIoSchdL = srchTargetAllocCtlIoSchd();
					rslt.addAll(allocCtlIoSchdL);
				}
			}
			
			setDown(rslt);
		}

		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetLocIoGi(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> locIoGiL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GI_R mrpIoSchdGi = MSVT_MRP_IO_SCHD_GI_R.create("MRP_IO_SCHD_GI");
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("ITM_ORDER");
			MCQueryApiBuilder mrpIoSchdGiBldr = MCQueryApiBuilder.create(mrpIoSchdGi);
			
			addLocConditionToQuery(mrpIoSchdGi, mrpIoSchdGiBldr);
			addItmConditionToQuery(mrpIoSchdGi, mrpIoSchdGiBldr);
			addDateTimeConditionToQuery(mrpIoSchdGi.schd_dt, mrpIoSchdGiBldr);
			
			mrpIoSchdGiBldr.setSelect(
					mrpIoSchdGi.wg_cd,
					mrpIoSchdGi.itm_ord_no,
					mrpIoSchdGi.io_schd_no,
					mrpIoSchdGi.io_schd_typ,
					mrpIoSchdGi.io_schd_sts_typ,
					mrpIoSchdGi.itm_cd,
					mrpIoSchdGi.itm_sub1,
					mrpIoSchdGi.itm_sub2,
					mrpIoSchdGi.itm_sub3,
					mrpIoSchdGi.loc_cd,
					mrpIoSchdGi.ver_no,
					mrpIoSchdGi.lot_no,
					mrpIoSchdGi.sublot_no,
					mrpIoSchdGi.base_unit_qty.as(OrdSendIf_IO_Gi_Srch01_RsltR.$qty),
					mrpIoSchdGi.gd_cd,
					mrpIoSchdGi.schd_dt,
					mrpIoSchdGi.sno1,
					mrpIoSchdGi.sno_typ1,
					mrpIoSchdGi.sno2,
					mrpIoSchdGi.sno_typ2,
					mrpIoSchdGi.sno3,
					mrpIoSchdGi.sno_typ3,
					mrpIoSchdGi.sno4,
					mrpIoSchdGi.sno_typ4,
					mrpIoSchdGi.alt_grp_cd,
					mrpIoSchdGi.alt_grp_seq,
					mrpIoSchdGi.oper_inst_no,
					mrpIoSchdGi.oper_ord_no,
					mrpIoSchdGi.alt_itm_typ,
					mrpIoSchdGi.alt_itm_ratio,
					mrpIoSchdGi.alt_alloc_prio,
					mrpIoSchdGi.oper_ptn,
					mrpIoSchdGi.oper_cd,
					mrpIoSchdGi.oper_seq,
					mrpIoSchdGi.inpt_ctl_typ,
					mrpIoSchdGi.alloc_flg
				);
			
			if (!isNull(up0().wg_cd())) {
				mrpIoSchdGiBldr.addInnerJoin(itmOrder, itmOrder.itm_ord_no.eq(mrpIoSchdGi.itm_ord_no));
				mrpIoSchdGiBldr.addWhereWithAnd(itmOrder.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.WG_XFR.value())));
			}
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S01", locIoGiL, mrpIoSchdGiBldr, up0());
			
			return locIoGiL;
		}

		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetOrdIoSchd(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> ordIoSchdL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MST_ORD_IO_SCHD_R ordIoSchd = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD");
			MCQueryApiBuilder ordIoSchdGiBldr = MCQueryApiBuilder.create(ordIoSchd);
			MCTempView ordQtyView = createTempView("ORD_QTY_VIEW");
			MCTempView instQtyView = createTempView("INST_QTY_VIEW");
			MST_ORD_IO_SCHD_R ordIoSchdOrdQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_ORD_QTY");
			MST_ORD_IO_SCHD_R ordIoSchdInstQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_INST_QTY");
			
			addLocConditionToQuery(ordIoSchd, ordIoSchdGiBldr);
			addItmConditionToQuery(ordIoSchd, ordIoSchdGiBldr);
			addDateTimeConditionToQuery(ordIoSchd.schd_dt, ordIoSchdGiBldr);
			
			ordIoSchdGiBldr.setSelect(
					ordIoSchd.wg_cd,
					ordIoSchd.io_schd_pr_no.as(OrdSendIf_IO_Gi_Srch01_RsltR.$itm_ord_no),
					ordIoSchd.io_schd_no,
					ordIoSchd.io_schd_typ,
					ordIoSchd.io_schd_sts_typ,
					ordIoSchd.itm_cd,
					ordIoSchd.itm_sub1,
					ordIoSchd.itm_sub2,
					ordIoSchd.itm_sub3,
					ordIoSchd.loc_cd,
					ordIoSchd.ver_no,
					ordIoSchd.lot_no,
					ordIoSchd.sublot_no,
					decode(
						ordIoSchd.alt_grp_cd,
						nullValue(),
						ordIoSchd.base_unit_qty,
						decode(
							instQtyView.pr("inst_base_unit_qty"),
							nullValue(),
							ordQtyView.pr("ord_base_unit_qty"),
							instQtyView.pr("inst_base_unit_qty")
						)
					).as("qty"),
					ordIoSchd.gd_cd,
					ordIoSchd.schd_dt,
					ordIoSchd.sno1,
					decode(
						ordIoSchd.sno1_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ1"),
					ordIoSchd.sno2,
					decode(
						ordIoSchd.sno2_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ2"),
					ordIoSchd.sno3,
					decode(
						ordIoSchd.sno3_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ3"),
					ordIoSchd.sno4,
					decode(
						ordIoSchd.sno4_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ4"),
					ordIoSchd.alt_grp_cd,
					ordIoSchd.alt_grp_seq,
					ordIoSchd.oper_inst_no,
					ordIoSchd.oper_ord_no,
					ordIoSchd.alt_itm_typ,
					ordIoSchd.alt_itm_ratio,
					ordIoSchd.alt_alloc_prio,
					nullValue().as("oper_ptn"),
					nullValue().as("oper_cd"),
					nullValue().as("oper_seq"),
					ordIoSchd.inpt_ctl_typ,
					ordIoSchd.alloc_flg
				);
			ordIoSchdGiBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no,
						sum(ordIoSchdOrdQty.base_unit_qty).as("ord_base_unit_qty")
					)
					.from(ordIoSchdOrdQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdOrdQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdOrdQty.oper_ord_no.isNotNull())
					)
					.groupBy(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no
					).view(ordQtyView), 
					bracket(
						ordIoSchd.alt_grp_cd.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_seq)))
						.and(ordIoSchd.oper_ord_no.eq(ordQtyView.pr(ordIoSchdOrdQty.oper_ord_no)))
					));
			ordIoSchdGiBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no,
						sum(ordIoSchdInstQty.base_unit_qty).as("inst_base_unit_qty")
					)
					.from(ordIoSchdInstQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdInstQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdInstQty.oper_inst_no.isNotNull())
					)
					.groupBy(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no
					).view(instQtyView), 
					bracket(
						ordIoSchd.alt_grp_cd.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_seq)))
						.and(ordIoSchd.oper_inst_no.eq(instQtyView.pr(ordIoSchdInstQty.oper_inst_no)))
					));
			ordIoSchdGiBldr.addWhereWithAnd(ordIoSchd.io_typ.eq(value(MSC_IO_TYP.GI.value())));
			ordIoSchdGiBldr.addWhereWithAnd(ordIoSchd.io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())));
			ordIoSchdGiBldr.addWhereWithAnd(ordIoSchd.wg_cd.eq(ordIoSchd.org_wg_cd));
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S02", ordIoSchdL, ordIoSchdGiBldr, up0());
			
			return ordIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetAllocCtlItmIoSchd(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlItmIoSchdL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MST_ORD_IO_SCHD_R ordIoSchd = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD");
			MCQueryApiBuilder ordIoSchdBldr = MCQueryApiBuilder.create(ordIoSchd);
			MCTempView ordQtyView = createTempView("ORD_QTY_VIEW");
			MCTempView instQtyView = createTempView("INST_QTY_VIEW");
			MST_ORD_IO_SCHD_R ordIoSchdOrdQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_ORD_QTY");
			MST_ORD_IO_SCHD_R ordIoSchdInstQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_INST_QTY");
			
			addAllocCtlItmConditionToQuery(ordIoSchd, ordIoSchdBldr);
			addItmConditionToQuery(ordIoSchd, ordIoSchdBldr);
			addDateTimeConditionToQuery(ordIoSchd.schd_dt, ordIoSchdBldr);
			
			ordIoSchdBldr.setDistinct();
			ordIoSchdBldr.setSelect(
					ordIoSchd.wg_cd,
					ordIoSchd.io_schd_pr_no.as(OrdSendIf_IO_Gi_Srch01_RsltR.$itm_ord_no),
					ordIoSchd.io_schd_no,
					ordIoSchd.io_schd_typ,
					ordIoSchd.io_schd_sts_typ,
					ordIoSchd.itm_cd,
					ordIoSchd.itm_sub1,
					ordIoSchd.itm_sub2,
					ordIoSchd.itm_sub3,
					ordIoSchd.loc_cd,
					ordIoSchd.ver_no,
					ordIoSchd.lot_no,
					ordIoSchd.sublot_no,
					decode(
						ordIoSchd.alt_grp_cd,
						nullValue(),
						ordIoSchd.base_unit_qty,
						decode(
							instQtyView.pr("inst_base_unit_qty"),
							nullValue(),
							ordQtyView.pr("ord_base_unit_qty"),
							instQtyView.pr("inst_base_unit_qty")
						)
					).as("qty"),
					ordIoSchd.gd_cd,
					ordIoSchd.schd_dt,
					ordIoSchd.sno1,
					decode(
						ordIoSchd.sno1_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ1"),
					ordIoSchd.sno2,
					decode(
						ordIoSchd.sno2_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ2"),
					ordIoSchd.sno3,
					decode(
						ordIoSchd.sno3_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ3"),
					ordIoSchd.sno4,
					decode(
						ordIoSchd.sno4_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ4"),
					ordIoSchd.alt_grp_cd,
					ordIoSchd.alt_grp_seq,
					ordIoSchd.oper_inst_no,
					ordIoSchd.oper_ord_no,
					ordIoSchd.alt_itm_typ,
					ordIoSchd.alt_itm_ratio,
					ordIoSchd.alt_alloc_prio,
					nullValue().as("oper_ptn"),
					nullValue().as("oper_cd"),
					nullValue().as("oper_seq"),
					ordIoSchd.inpt_ctl_typ,
					ordIoSchd.alloc_flg
				);
			ordIoSchdBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no,
						sum(ordIoSchdOrdQty.base_unit_qty).as("ord_base_unit_qty")
					)
					.from(ordIoSchdOrdQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdOrdQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdOrdQty.oper_ord_no.isNotNull())
					)
					.groupBy(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no
					).view(ordQtyView),
					bracket(
						ordIoSchd.alt_grp_cd.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_seq)))
						.and(ordIoSchd.oper_ord_no.eq(ordQtyView.pr(ordIoSchdOrdQty.oper_ord_no)))
					));
			ordIoSchdBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no,
						sum(ordIoSchdInstQty.base_unit_qty).as("inst_base_unit_qty")
					)
					.from(ordIoSchdInstQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdInstQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdInstQty.oper_inst_no.isNotNull())
					)
					.groupBy(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no
					).view(instQtyView),
					bracket(
						ordIoSchd.alt_grp_cd.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_seq)))
						.and(ordIoSchd.oper_inst_no.eq(instQtyView.pr(ordIoSchdInstQty.oper_inst_no)))
					));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.io_typ.eq(value(MSC_IO_TYP.GI.value())));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.wg_cd.eq(ordIoSchd.org_wg_cd));
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S05", allocCtlItmIoSchdL, ordIoSchdBldr, up0());
			
			return allocCtlItmIoSchdL;
		}
		
		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetAllocCtlIoSchd(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlIoSchdL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MST_ORD_IO_SCHD_R ordIoSchd = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD");
			MCQueryApiBuilder ordIoSchdBldr = MCQueryApiBuilder.create(ordIoSchd);
			MCTempView ordQtyView = createTempView("ORD_QTY_VIEW");
			MCTempView instQtyView = createTempView("INST_QTY_VIEW");
			MST_ORD_IO_SCHD_R ordIoSchdOrdQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_ORD_QTY");
			MST_ORD_IO_SCHD_R ordIoSchdInstQty = MST_ORD_IO_SCHD_R.create("ORD_IO_SCHD_INST_QTY");
			
			addAllocCtlConditionToQuery(ordIoSchd, ordIoSchdBldr);
			addItmConditionToQuery(ordIoSchd, ordIoSchdBldr);
			addDateTimeConditionToQuery(ordIoSchd.schd_dt, ordIoSchdBldr);
			
			ordIoSchdBldr.setDistinct();
			ordIoSchdBldr.setSelect(
					ordIoSchd.wg_cd,
					ordIoSchd.io_schd_pr_no.as(OrdSendIf_IO_Gi_Srch01_RsltR.$itm_ord_no),
					ordIoSchd.io_schd_no,
					ordIoSchd.io_schd_typ,
					ordIoSchd.io_schd_sts_typ,
					ordIoSchd.itm_cd,
					ordIoSchd.itm_sub1,
					ordIoSchd.itm_sub2,
					ordIoSchd.itm_sub3,
					ordIoSchd.loc_cd,
					ordIoSchd.ver_no,
					ordIoSchd.lot_no,
					ordIoSchd.sublot_no,
					decode(
						ordIoSchd.alt_grp_cd,
						nullValue(),
						ordIoSchd.base_unit_qty,
						decode(
							instQtyView.pr("inst_base_unit_qty"),
							nullValue(),
							ordQtyView.pr("ord_base_unit_qty"),
							instQtyView.pr("inst_base_unit_qty")
						)
					).as("qty"),
					ordIoSchd.gd_cd,
					ordIoSchd.schd_dt,
					ordIoSchd.sno1,
					decode(
						ordIoSchd.sno1_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ1"),
					ordIoSchd.sno2,
					decode(
						ordIoSchd.sno2_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ2"),
					ordIoSchd.sno3,
					decode(
						ordIoSchd.sno3_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ3"),
					ordIoSchd.sno4,
					decode(
						ordIoSchd.sno4_null_flg,
						value(true),
						value(MAC_SNO_TYP.EXTND_NULL.value()),
						value(MAC_SNO_TYP.EXTND.value())
					).as("sno_typ4"),
					ordIoSchd.alt_grp_cd,
					ordIoSchd.alt_grp_seq,
					ordIoSchd.oper_inst_no,
					ordIoSchd.oper_ord_no,
					ordIoSchd.alt_itm_typ,
					ordIoSchd.alt_itm_ratio,
					ordIoSchd.alt_alloc_prio,
					nullValue().as("oper_ptn"),
					nullValue().as("oper_cd"),
					nullValue().as("oper_seq"),
					ordIoSchd.inpt_ctl_typ,
					ordIoSchd.alloc_flg
				);
			ordIoSchdBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no,
						sum(ordIoSchdOrdQty.base_unit_qty).as("ord_base_unit_qty")
					)
					.from(ordIoSchdOrdQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdOrdQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdOrdQty.oper_ord_no.isNotNull())
					)
					.groupBy(
						ordIoSchdOrdQty.alt_grp_cd,
						ordIoSchdOrdQty.alt_grp_seq,
						ordIoSchdOrdQty.oper_ord_no
					).view(ordQtyView),
					bracket(
						ordIoSchd.alt_grp_cd.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(ordQtyView.pr(ordIoSchdOrdQty.alt_grp_seq)))
						.and(ordIoSchd.oper_ord_no.eq(ordQtyView.pr(ordIoSchdOrdQty.oper_ord_no)))
					));
			ordIoSchdBldr.addLeftOuterJoin(
				subQuery()
					.select(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no,
						sum(ordIoSchdInstQty.base_unit_qty).as("inst_base_unit_qty")
					)
					.from(ordIoSchdInstQty)
					.where(
						value(0).eq(value(0))
						.and(ordIoSchdInstQty.alt_grp_cd.isNotNull())
						.and(ordIoSchdInstQty.oper_inst_no.isNotNull())
					)
					.groupBy(
						ordIoSchdInstQty.alt_grp_cd,
						ordIoSchdInstQty.alt_grp_seq,
						ordIoSchdInstQty.oper_inst_no
					).view(instQtyView),
					bracket(
						ordIoSchd.alt_grp_cd.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_cd))
						.and(ordIoSchd.alt_grp_seq.eq(instQtyView.pr(ordIoSchdInstQty.alt_grp_seq)))
						.and(ordIoSchd.oper_inst_no.eq(instQtyView.pr(ordIoSchdInstQty.oper_inst_no)))
					));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.io_typ.eq(value(MSC_IO_TYP.GI.value())));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value())));
			ordIoSchdBldr.addWhereWithAnd(ordIoSchd.wg_cd.eq(ordIoSchd.org_wg_cd));
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S06", allocCtlIoSchdL, ordIoSchdBldr, up0());
			
			return allocCtlIoSchdL;
		}

		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetAllocCtlItmIoGi(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlItmIoGiL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GI_R mrpIoSchdGi = MSVT_MRP_IO_SCHD_GI_R.create("MRP_IO_SCHD_GI");
			MCQueryApiBuilder ioSchdGiBldr = MCQueryApiBuilder.create(mrpIoSchdGi);
			
			addAllocCtlItmConditionToQuery(mrpIoSchdGi, ioSchdGiBldr);
			addItmConditionToQuery(mrpIoSchdGi, ioSchdGiBldr);
			addDateTimeConditionToQuery(mrpIoSchdGi.schd_dt, ioSchdGiBldr);
			
			ioSchdGiBldr.setDistinct();
			ioSchdGiBldr.setSelect(
					mrpIoSchdGi.wg_cd,
					mrpIoSchdGi.itm_ord_no,
					mrpIoSchdGi.io_schd_no,
					mrpIoSchdGi.io_schd_typ,
					mrpIoSchdGi.io_schd_sts_typ,
					mrpIoSchdGi.itm_cd,
					mrpIoSchdGi.itm_sub1,
					mrpIoSchdGi.itm_sub2,
					mrpIoSchdGi.itm_sub3,
					mrpIoSchdGi.loc_cd,
					mrpIoSchdGi.ver_no,
					mrpIoSchdGi.lot_no,
					mrpIoSchdGi.sublot_no,
					mrpIoSchdGi.base_unit_qty.as(OrdSendIf_IO_Gi_Srch01_RsltR.$qty),
					mrpIoSchdGi.gd_cd,
					mrpIoSchdGi.schd_dt,
					mrpIoSchdGi.sno1,
					mrpIoSchdGi.sno_typ1,
					mrpIoSchdGi.sno2,
					mrpIoSchdGi.sno_typ2,
					mrpIoSchdGi.sno3,
					mrpIoSchdGi.sno_typ3,
					mrpIoSchdGi.sno4,
					mrpIoSchdGi.sno_typ4,
					mrpIoSchdGi.alt_grp_cd,
					mrpIoSchdGi.alt_grp_seq,
					mrpIoSchdGi.oper_inst_no,
					mrpIoSchdGi.oper_ord_no,
					mrpIoSchdGi.alt_itm_typ,
					mrpIoSchdGi.alt_itm_ratio,
					mrpIoSchdGi.alt_alloc_prio,
					mrpIoSchdGi.oper_ptn,
					mrpIoSchdGi.oper_cd,
					mrpIoSchdGi.oper_seq,
					mrpIoSchdGi.inpt_ctl_typ,
					mrpIoSchdGi.alloc_flg
				);
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S03", allocCtlItmIoGiL, ioSchdGiBldr, up0());
			
			return allocCtlItmIoGiL;
		}
		
		protected MCList<OrdSendIf_IO_Gi_Srch01_RsltR> srchTargetAllocCtlIoGi(){
			MCList<OrdSendIf_IO_Gi_Srch01_RsltR> allocCtlIoGiL = MCList.create(OrdSendIf_IO_Gi_Srch01_RsltR.class);
			
			MSVT_MRP_IO_SCHD_GI_R mrpIoSchdGi = MSVT_MRP_IO_SCHD_GI_R.create("MRP_IO_SCHD_GI");
			MCQueryApiBuilder ioSchdGiBldr = MCQueryApiBuilder.create(mrpIoSchdGi);
			
			addAllocCtlConditionToQuery(mrpIoSchdGi, ioSchdGiBldr);
			addItmConditionToQuery(mrpIoSchdGi, ioSchdGiBldr);
			addDateTimeConditionToQuery(mrpIoSchdGi.schd_dt, ioSchdGiBldr);
			
			ioSchdGiBldr.setDistinct();
			ioSchdGiBldr.setSelect(
					mrpIoSchdGi.wg_cd,
					mrpIoSchdGi.itm_ord_no,
					mrpIoSchdGi.io_schd_no,
					mrpIoSchdGi.io_schd_typ,
					mrpIoSchdGi.io_schd_sts_typ,
					mrpIoSchdGi.itm_cd,
					mrpIoSchdGi.itm_sub1,
					mrpIoSchdGi.itm_sub2,
					mrpIoSchdGi.itm_sub3,
					mrpIoSchdGi.loc_cd,
					mrpIoSchdGi.ver_no,
					mrpIoSchdGi.lot_no,
					mrpIoSchdGi.sublot_no,
					mrpIoSchdGi.base_unit_qty.as(OrdSendIf_IO_Gi_Srch01_RsltR.$qty),
					mrpIoSchdGi.gd_cd,
					mrpIoSchdGi.schd_dt,
					mrpIoSchdGi.sno1,
					mrpIoSchdGi.sno_typ1,
					mrpIoSchdGi.sno2,
					mrpIoSchdGi.sno_typ2,
					mrpIoSchdGi.sno3,
					mrpIoSchdGi.sno_typ3,
					mrpIoSchdGi.sno4,
					mrpIoSchdGi.sno_typ4,
					mrpIoSchdGi.alt_grp_cd,
					mrpIoSchdGi.alt_grp_seq,
					mrpIoSchdGi.oper_inst_no,
					mrpIoSchdGi.oper_ord_no,
					mrpIoSchdGi.alt_itm_typ,
					mrpIoSchdGi.alt_itm_ratio,
					mrpIoSchdGi.alt_alloc_prio,
					mrpIoSchdGi.oper_ptn,
					mrpIoSchdGi.oper_cd,
					mrpIoSchdGi.oper_seq,
					mrpIoSchdGi.inpt_ctl_typ,
					mrpIoSchdGi.alloc_flg
				);
			
			dbSelect("MSLAL9310_MRP_IO_SCHD_GI_S04", allocCtlIoGiL, ioSchdGiBldr, up0());
			
			return allocCtlIoGiL;
		}

		protected void setDown(MCList<OrdSendIf_IO_Gi_Srch01_RsltR> rslt) {

			if (MSC_IF_SCHEDULER_TYP.isGP(up0().if_scheduler_typ())) {
				down0().addAll(rslt);
				return;
			}

			MSLAL_OrdSendIfService.OrdSendIf_Srch01 ordSrch01Serv = MSLAL_OrdSendIfService.crtOrdSendIf_Srch01();
			setArg(ordSrch01Serv.up0());
			ordSrch01Serv.exec();
			MCList<OrdSendIf_Srch01_RsltR> ordL = MCList.create(OrdSendIf_Srch01_RsltR.class);
			ordL.addAll(ordSrch01Serv.down0());

			MCIndexKey ordIdxKey = ordL.createIndex(OrdSendIf_Srch01_RsltR.$itm_ord_no);
			MCList<MAM_ALLOC_CTL_R> allocCtlL = getAllocCtl(up0().loc_grp_cd(), up0().site_cd(), up0().loc_cd());
			MCIndexKey allocCtlItmKey = allocCtlL.createIndex(MAM_ALLOC_CTL_R.$fr_loc_cd, MAM_ALLOC_CTL_R.$itm_cd, MAM_ALLOC_CTL_R.$itm_sub1, MAM_ALLOC_CTL_R.$itm_sub2, MAM_ALLOC_CTL_R.$itm_sub3);

			for (OrdSendIf_IO_Gi_Srch01_RsltR r: rslt) {

				OrdSendIf_Srch01_RsltR ordR = ordL.getFirst(ordIdxKey, r.itm_ord_no());
				if (!isNull(ordR)) {
					continue;
				}

				if (!isNull(up0().loc_grp_cd()) && !isNegativePrio(allocCtlL, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), allocCtlItmKey)) {
					down0().add(r);
				}
			}
		}

		protected void setArg(OrdSendIf_Srch01_DtlR arg) {
			arg.wg_cd(up0().wg_cd());
			arg.loc_grp_cd(up0().loc_grp_cd());
			arg.site_cd(up0().site_cd());
			arg.mfg_loc_cd(up0().loc_cd());
			arg.dt_fr(up0().dt_fr());
			arg.dt_to(up0().dt_to());
			arg.include_unfirm_flg(false);
			arg.if_scheduler_typ(up0().if_scheduler_typ());
		}
	}
	/**
	 * OrdSendIf_Dly_Dmnd_Srch01オペレーション.<p>
	 *
	 * 送信対象の日次需要情報を検索する<br>
	 */
	public class OrdSendIf_Dly_Dmnd_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Dly_Dmnd_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {	
			super.doSearchMain();
			
			searchTargetDly_Dmnd();
		}
		
		protected void searchTargetDly_Dmnd(){
			MCList<OrdSendIf_Dly_Dmnd_Srch01_RsltR> rslt = MCList.create(OrdSendIf_Dly_Dmnd_Srch01_RsltR.class);
			
			MSVT_MRP_DLY_DMND_R dlyDmndL_t1 = MSVT_MRP_DLY_DMND_R.create("T1");
			MCQueryApiBuilder dlyDmndL_bldr = MCQueryApiBuilder.create(dlyDmndL_t1);
			
			addItmConditionToQuery(dlyDmndL_t1,dlyDmndL_bldr);
			addLocConditionToQuery(dlyDmndL_t1.strg_loc_cd,dlyDmndL_bldr);
			addDateTimeConditionToQuery(dlyDmndL_t1.due_dt, dlyDmndL_bldr);
			
			dlyDmndL_bldr.setSelect(
					dlyDmndL_t1.wg_cd,
					dlyDmndL_t1.rqmt_no.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$dly_dmnd_no),
					dlyDmndL_t1.itm_cd,
					dlyDmndL_t1.itm_sub1,
					dlyDmndL_t1.itm_sub2,
					dlyDmndL_t1.itm_sub3,
					dlyDmndL_t1.due_dt,
					dlyDmndL_t1.strg_loc_cd.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$dmnd_loc_cd),
					dlyDmndL_t1.rqmt_qty,
					dlyDmndL_t1.dmnd_typ,
					dlyDmndL_t1.sno1,
					dlyDmndL_t1.sno1_typ.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$sno_typ1),
					dlyDmndL_t1.sno2,
					dlyDmndL_t1.sno2_typ.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$sno_typ2),
					dlyDmndL_t1.sno3,
					dlyDmndL_t1.sno3_typ.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$sno_typ3),
					dlyDmndL_t1.sno4,
					dlyDmndL_t1.sno4_typ.as(OrdSendIf_Dly_Dmnd_Srch01_RsltR.$sno_typ4)
				);
			
			dbSelect("MSLAL9310_MRP_DLY_DMND_S01",rslt, dlyDmndL_bldr, up0());
			
			down0().addAll(rslt);
		}
	}

	protected void addLocConditionToQuery(MCDBContainer mainTable,
			MCQueryApiBuilder bldr) {

		addLocConditionToQuery(
				(MCStringPermColumn) mainTable.getColumn$(MAM_LOC_R.$loc_cd), bldr, MAM_LOC_R.$loc_cd);
	}

	protected void addLocConditionToQuery(MCStringPermColumn loc_cd_name,
			MCQueryApiBuilder bldr) {
		addLocConditionToQuery(loc_cd_name, bldr, MAM_LOC_R.$loc_cd);
	}

	protected void addLocConditionToQuery(MCStringPermColumn loc_cd_name,
			MCQueryApiBuilder bldr, String bindName) {
		MAM_LOC_R locL_t1 = MAM_LOC_R.create("LOC_T1");
		bldr.addLeftOuterJoin(locL_t1, (loc_cd_name).eq(locL_t1.loc_cd));
		bldr.addWhereWithCutOffAnd(locL_t1.site_cd.eq(bind(MAM_LOC_R.$site_cd)));
		bldr.addWhereWithCutOffAnd(locL_t1.loc_cd.eq(bind(bindName)));
		bldr.addWhereWithCutOffAnd(locL_t1.loc_grp_cd.eq(bind(MAM_LOC_R.$loc_grp_cd)));
	}

	protected void addItmConditionToQuery(MCDBContainer mainTable,
			MCQueryApiBuilder bldr) {

		addItmConditionToQuery(mainTable,
				(MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$itm_cd),
				(MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$itm_sub1),
				(MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$itm_sub2),
				(MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$itm_sub3),
				(MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$wg_cd), bldr);
	}

	protected void addItmConditionToQuery(MCDBContainer mainTable, MCStringPermColumn itm_cd_name,
			MCStringPermColumn itm_sub1_name, MCStringPermColumn itm_sub2_name,
			MCStringPermColumn itm_sub3_name, MCStringPermColumn wg_cd_name, MCQueryApiBuilder bldr) {

		MSVM_MRP_ITM_R itmL_t1 = MSVM_MRP_ITM_R.create("ITM_T1");
		bldr.addInnerJoin(itmL_t1,
				(itm_cd_name).eq(itmL_t1.itm_cd).and((itm_sub1_name).eq(itmL_t1.itm_sub1))
						.and((itm_sub2_name).eq(itmL_t1.itm_sub2))
						.and((itm_sub3_name).eq(itmL_t1.itm_sub3))
						.and((wg_cd_name).eq(itmL_t1.wg_cd)));
		bldr.addWhereWithAnd(itmL_t1.release_flg.eq(value(true)));
		bldr.addWhereWithAnd(itmL_t1.sch_flg.eq(value(true)));
		bldr.addWhereWithCutOffAnd(((MCStringPermColumn) mainTable.getColumn$(MSVM_MRP_ITM_R.$wg_cd)).eq(bind(MSVM_MRP_ITM_R.$wg_cd)));
	}

	protected void addDateTimeConditionToQuery(MCDatePermColumn dt_name, MCQueryApiBuilder bldr) {
		bldr.addWhereWithCutOffAnd(dt_name.gte(bind(OrdSendIf_Dly_Dmnd_Srch01_CndR.$dt_fr))); 
		bldr.addWhereWithCutOffAnd(dt_name.lte(bind(OrdSendIf_Dly_Dmnd_Srch01_CndR.$dt_to)));
	}

	protected void addAllocCtlItmConditionToQuery(MCDBContainer mainTable, MCQueryApiBuilder bldr) {
		MAM_LOC_R allocLoc = MAM_LOC_R.create("ALLOC_LOC");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ALLOC_CTL_R allocCtl = MAM_ALLOC_CTL_R.create("ALLOC_CTL");
		MCTempView allocLocView = createTempView("ALLOC_LOC_VIEW");
		MCStringPermColumn locCdCol = (MCStringPermColumn) mainTable.getColumn$("loc_cd");
		MCStringPermColumn itmCdCol = (MCStringPermColumn) mainTable.getColumn$("itm_cd");
		MCStringPermColumn itmSub1Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub1");
		MCStringPermColumn itmSub2Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub2");
		MCStringPermColumn itmSub3Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub3");
		
		bldr.addLeftOuterJoin(loc, locCdCol.eq(loc.loc_cd));
		bldr.addWhereWithCutOffAnd(loc.site_cd.neq(bind("site_cd")));
		bldr.addWhereWithCutOffAnd(loc.loc_cd.neq(bind("loc_cd")));
		bldr.addWhereWithCutOffAnd(loc.loc_grp_cd.neq(bind(MAM_LOC_R.$loc_grp_cd)));
		bldr.addLeftOuterJoin(
				subQuery()
					.selectDistinct(
						allocLoc.loc_grp_cd,
						allocLoc.site_cd,
						allocLoc.loc_cd,
						allocCtl.itm_cd,
						allocCtl.itm_sub1,
						allocCtl.itm_sub2,
						allocCtl.itm_sub3,
						allocCtl.fr_loc_cd
					)
					.from(
						allocCtl
						.innerJoin(allocLoc).on(
							bracket(
								allocLoc.loc_cd.eq(allocCtl.to_loc_cd)
							)
						)
					)
					.where(
						allocCtl.prio.gte(value(0))
						.and(allocCtl.itm_cd.isNotNull())
						.and(allocCtl.del_flg.eq(value(false)))
					).view(allocLocView), bracket(
						locCdCol.eq(allocLocView.pr(allocCtl.fr_loc_cd))
						.and(itmCdCol.eq(allocLocView.pr(allocCtl.itm_cd)))
						.and(itmSub1Col.eq(allocLocView.pr(allocCtl.itm_sub1)))
						.and(itmSub2Col.eq(allocLocView.pr(allocCtl.itm_sub2)))
						.and(itmSub3Col.eq(allocLocView.pr(allocCtl.itm_sub3)))
					));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.loc_grp_cd).eq(bind(MAM_LOC_R.$loc_grp_cd)));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.site_cd).eq(bind("site_cd")));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.loc_cd).eq(bind("loc_cd")));
	}

	protected void addAllocCtlConditionToQuery(MCDBContainer mainTable, MCQueryApiBuilder bldr) {
		MAM_LOC_R allocLoc = MAM_LOC_R.create("ALLOC_LOC");
		MAM_LOC_R loc = MAM_LOC_R.create("LOC");
		MAM_ALLOC_CTL_R allocCtl = MAM_ALLOC_CTL_R.create("ALLOC_CTL");
		MAM_ALLOC_CTL_R allocCtlItm = MAM_ALLOC_CTL_R.create("ALLOC_CTL_ITM");
		MAM_ALLOC_CTL_R ctlItm = MAM_ALLOC_CTL_R.create("CTL_ITM");
		MAM_LOC_R locItm = MAM_LOC_R.create("LOC_ITM");
		MCTempView allocLocView = createTempView("ALLOC_LOC_VIEW");
		MCStringPermColumn locCdCol = (MCStringPermColumn) mainTable.getColumn$("loc_cd");
		MCStringPermColumn itmCdCol = (MCStringPermColumn) mainTable.getColumn$("itm_cd");
		MCStringPermColumn itmSub1Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub1");
		MCStringPermColumn itmSub2Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub2");
		MCStringPermColumn itmSub3Col = (MCStringPermColumn) mainTable.getColumn$("itm_sub3");
		
		bldr.addLeftOuterJoin(loc, locCdCol.eq(loc.loc_cd));
		bldr.addWhereWithCutOffAnd(loc.site_cd.neq(bind("site_cd")));
		bldr.addWhereWithCutOffAnd(loc.loc_cd.neq(bind("loc_cd")));
		bldr.addWhereWithCutOffAnd(loc.loc_grp_cd.neq(bind(MAM_LOC_R.$loc_grp_cd)));
		bldr.addLeftOuterJoin(
				subQuery()
					.selectDistinct(
						allocLoc.loc_grp_cd,
						allocLoc.site_cd,
						allocLoc.loc_cd,
						allocCtl.itm_cd,
						allocCtl.itm_sub1,
						allocCtl.itm_sub2,
						allocCtl.itm_sub3,
						allocCtl.fr_loc_cd
					)
					.from(
						allocCtl
						.innerJoin(allocLoc).on(
							bracket(
								allocLoc.loc_cd.eq(allocCtl.to_loc_cd)
							)
						)
					)
					.where(
						allocCtl.prio.gte(value(0))
						.and(allocCtl.itm_cd.isNull())
						.and(allocCtl.del_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value(1))
								.from(allocCtlItm)
								.where(
									allocLoc.loc_cd.eq(allocCtlItm.to_loc_cd)
									.and(allocCtlItm.itm_cd.isNotNull())
									.and(allocCtlItm.prio.gte(value(0)))
									.and(allocCtlItm.del_flg.eq(value(false)))
								)
							)
						)
					).view(allocLocView), bracket(
						locCdCol.eq(allocLocView.pr(allocCtl.fr_loc_cd))
					));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.loc_grp_cd).eq(bind(MAM_LOC_R.$loc_grp_cd)));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.site_cd).eq(bind("site_cd")));
		bldr.addWhereWithCutOffAnd(allocLocView.pr(allocLoc.loc_cd).eq(bind("loc_cd")));
		bldr.addWhereWithAnd(notExists(
								subQuery()
								.select(value(1))
								.from(
									ctlItm
									.innerJoin(locItm).on(
										bracket(
											locItm.loc_cd.eq(ctlItm.to_loc_cd)
										)
									)
								)
								.where(
									ctlItm.prio.gte(value(0))
									.and(ctlItm.itm_cd.isNotNull())
									.and(ctlItm.del_flg.eq(value(false)))
									.and(locCdCol.eq(ctlItm.fr_loc_cd))
									.and(itmCdCol.eq(ctlItm.itm_cd))
									.and(itmSub1Col.eq(ctlItm.itm_sub1))
									.and(itmSub2Col.eq(ctlItm.itm_sub2))
									.and(itmSub3Col.eq(ctlItm.itm_sub3))
									.and(locItm.loc_grp_cd.eq(bind(MAM_LOC_R.$loc_grp_cd)))
									.cutoff$and(locItm.site_cd.eq(bind("site_cd")))
									.cutoff$and(locItm.loc_cd.eq(bind("loc_cd")))
								)
							));
	}

	protected MCList<MAM_ALLOC_CTL_R> getAllocCtl(String locGrpCd, String siteCd, String locCd) {
		MCList<MAM_ALLOC_CTL_R> allocCtlL = MCList.create(MAM_ALLOC_CTL_R.class);
		MAM_ALLOC_CTL_R allocCtlR = MAM_ALLOC_CTL_R.create("ALLOC_CTL");
		MAM_LOC_R locToR = MAM_LOC_R.create("LOC_TO");
		MAM_LOC_R locFrR = MAM_LOC_R.create("LOC_FR");
		MCQueryApiBuilder allocCtlLBldr = MCQueryApiBuilder.create(allocCtlR);
		
		allocCtlLBldr.setSelect(
				locToR.loc_grp_cd,
				min(allocCtlR.prio).as("prio"),
				locToR.site_cd,
				allocCtlR.itm_cd,
				allocCtlR.itm_sub1,
				allocCtlR.itm_sub2,
				allocCtlR.itm_sub3,
				allocCtlR.to_loc_cd,
				allocCtlR.fr_loc_cd.as("loc_cd")
			);
		allocCtlLBldr.addInnerJoin(locToR, locToR.loc_cd.eq(allocCtlR.to_loc_cd));
		allocCtlLBldr.addInnerJoin(locFrR, locFrR.loc_cd.eq(allocCtlR.fr_loc_cd));
		allocCtlLBldr.setWhere(allocCtlR.del_flg.eq(value(false)));
		allocCtlLBldr.addWhereWithAnd(allocCtlR.prio.lt(value(0)));
		allocCtlLBldr.addWhereWithAnd(locToR.loc_grp_cd.eq(bind("1")), locGrpCd);
		allocCtlLBldr.addWhereWithAnd(locFrR.loc_grp_cd.neq(bind("1")), locGrpCd);
		if (!isNull(siteCd)) {
			allocCtlLBldr.addWhereWithAnd(locToR.site_cd.eq(bind("1")), siteCd);
			allocCtlLBldr.addWhereWithAnd(locFrR.site_cd.neq(bind("1")), siteCd);
		}
		if (!isNull(locCd)) {
			allocCtlLBldr.addWhereWithAnd(locToR.loc_cd.eq(bind("1")), locCd);
			allocCtlLBldr.addWhereWithAnd(locFrR.loc_cd.neq(bind("1")), locCd);
		}
		allocCtlLBldr.addGroupBy(locToR.loc_grp_cd, locToR.site_cd, allocCtlR.itm_cd,
				allocCtlR.itm_sub1, allocCtlR.itm_sub2, allocCtlR.itm_sub3,
				allocCtlR.to_loc_cd, allocCtlR.fr_loc_cd);
		dbSelect("MSLAL9310_MAM_ALLOC_CTL_S01", allocCtlL, allocCtlLBldr);
		
		return allocCtlL;
	}

	protected boolean isNegativePrio(MCList<MAM_ALLOC_CTL_R> allocCtlL, String locCd, String itmCd, String itmSub1, String itmSub2, String itmSub3, MCIndexKey allocCtlItmKey) {

		return  allocCtlL.contains(allocCtlItmKey, locCd, itmCd, itmSub1, itmSub2, itmSub3) 
				|| allocCtlL.contains(allocCtlItmKey, locCd, null, null, null, null);
	}

	protected MCList<MAM_UNIT_R> getUnitL(MCList<?> actL) {
		MCList<MAM_UNIT_R> unitL = MCList.create(MAM_UNIT_R.class);
		MAM_UNIT_R unitR = MAM_UNIT_R.create("UNIT");
		MCQueryApiBuilder unitBldr = MCQueryApiBuilder.create(unitR);
		unitBldr.setWhere(unitR.unit_cd.eq(bind("base_unit_cd")));
		dbSelect("MSLAL9310_MAM_UNIT_S01", unitL, unitBldr, actL);

		return unitL;
	}

	/**
	 * OrdSendIf_Itm_Dtl_Bom_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目詳細マスタおよびＢＯＭマスタを検索する<br>
	 */
	public class OrdSendIf_Itm_Dtl_Bom_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Itm_Dtl_Bom_Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			MCList<MSVM_MRP_ITM_DTL_R> itmDtlL = searchTargetItmDtl(up0());
			MCList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> itmDtlBomL= createDownInfo(itmDtlL);
			setDown(itmDtlBomL);
		}
		
		protected void setDown(MCList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> itmDtlBomL) {
			down0().addAll(itmDtlBomL);	
		}
		
		protected MCQueryApiBuilder createItmDtlBldr() {
			MSVM_MRP_ITM_DTL_R itmDtlMst1 = MSVM_MRP_ITM_DTL_R.create("ITM_DTL");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MAM_ITM_OPER_R itmOperR = MAM_ITM_OPER_R.create("ITM_OPER");
			
			MCQueryApiBuilder itmMstBom_bldr = MCQueryApiBuilder.create(itmDtlMst1);
			itmMstBom_bldr.addSelect(itmOperR.oper_cd);

			addItmConditionToQuery(itmDtlMst1, itmMstBom_bldr);
			itmMstBom_bldr.addLeftOuterJoin(mfgLocR, itmDtlMst1.mfg_loc_cd.eq(mfgLocR.loc_cd));
			itmMstBom_bldr.addWhereWithCutOffAnd(itmDtlMst1.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmMstBom_bldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmMstBom_bldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));

			itmMstBom_bldr.addWhereWithAnd(itmDtlMst1.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value())));

			itmMstBom_bldr.addWhereWithCutOffAnd(bind(OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR.$master_dt).between(itmDtlMst1.st_dt, itmDtlMst1.end_dt));
			itmMstBom_bldr.addLeftOuterJoin(itmOperR, bracket( itmDtlMst1.itm_cd.eq(itmOperR.itm_cd)
					.and(itmDtlMst1.itm_sub1.eq(itmOperR.itm_sub1))
					.and(itmDtlMst1.itm_sub2.eq(itmOperR.itm_sub2))
					.and(itmDtlMst1.itm_sub3.eq(itmOperR.itm_sub3))
					.and(itmDtlMst1.mfg_loc_cd.eq(itmOperR.loc_cd))
					.and(itmDtlMst1.oper_ptn.eq(itmOperR.oper_ptn))
					.and(itmDtlMst1.sno1.eq(itmOperR.sno1)
							.or(itmOperR.sno1.isNull()))
					.and(itmDtlMst1.sno2.eq(itmOperR.sno2)
							.or(itmOperR.sno2.isNull()))
					.and(itmDtlMst1.sno3.eq(itmOperR.sno3)
							.or(itmOperR.sno3.isNull()))
					.and(itmDtlMst1.st_dt.gte(itmOperR.st_dt))
					.and(itmDtlMst1.end_dt.lte(itmOperR.end_dt))
					.and(itmOperR.del_flg.eq(value(false)))
					));
			
			return itmMstBom_bldr;
		}
		
		protected MCList<MSVM_MRP_ITM_DTL_R> searchTargetItmDtl(OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR arg) {
			
			MCList<MSVM_MRP_ITM_DTL_R> itmDtlL = MCList.create(MSVM_MRP_ITM_DTL_R.class);
			MCQueryApiBuilder itmMstBom_bldr = createItmDtlBldr();
			
			dbSelect("MSLAL9310_MAM_ITM_DTL_BOM_S01", itmDtlL, itmMstBom_bldr, arg);
			
			return itmDtlL;
		}
		
		protected MCList<MAW_BOM_EX_R> searchTargetBom(MSVM_MRP_ITM_DTL_R itmDtlR) {
			itmDtlR.addDateColumn("DT", up0().master_dt());
			
			itmDtlR.addBooleanColumn("PH_EX_FLG", true);
			itmDtlR.addBooleanColumn("BOM_PTN_FLG", false);
			itmDtlR.addNumberColumn("MAX_HRRCHY", MCNumber.valueOf(1));

			
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, itmDtlR, null,
					":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
							+ ":BOM_PTN, :WG_CD, :DT, "
							+ ":PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY, "
							+ ":SNO1, :SNO2, :SNO3, :SNO4");
			
			MCList<MAW_BOM_EX_R> bomExL = MCList.create(MAW_BOM_EX_R.class);
			MAW_BOM_EX_R bomEx = MAW_BOM_EX_R.create("BOM_EX");
			MCQueryApiBuilder bomExL_bldr = MCQueryApiBuilder.create(bomEx);
			bomExL_bldr.addWhereWithAnd(bomEx.bom_lvl.neq(value(0)));
			bomExL_bldr.addWhereWithAnd(bomEx.byprod_flg.eq(value(false)));
			bomExL_bldr.addWhereWithAnd(bomEx.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			dbSelect("MSLAL9030_MAW_BOM_EX_S01", bomExL, bomExL_bldr);
			
			return bomExL;
		}
		
		protected MCList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> createDownInfo(MCList<MSVM_MRP_ITM_DTL_R> itmDtlL) {
	
			
			MCList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> itmDtlBomL = MCList.create(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class);
			
			//デフォルト工程の内製品は連携対象外のため、BOM展開処理を行わない
			MCList<MSVM_MRP_ITM_DTL_R> tgtItmDtrL =itmDtlL.subList(
					r -> ((!isOutsrc(r) && !isNullOrNullVal(r.oper_ptn())) || isOutsrc(r)));
			
			for (MSVM_MRP_ITM_DTL_R itmDtlR : tgtItmDtrL) {
				MCList<MAW_BOM_EX_R> bomExL = searchTargetBom(itmDtlR);
				if (isNull(bomExL)) {
					itmDtlR.wg_cd(MAC_STR.NULL_VAL.value());
					bomExL = searchTargetBom(itmDtlR);
				}
				MCList<MAW_BOM_EX_R> tgtBomExL = MCList.create(MAW_BOM_EX_R.class);
				if (isOutsrc(itmDtlR)) {
					tgtBomExL.addAll(bomExL);
				}
				else {
					tgtBomExL = bomExL.subList(r -> isSame(itmDtlR.getStringNE("oper_cd"), r.oper_cd()));
				}
				MCList<MAW_BOM_EX_R> updBomExL = MCList.create(MAW_BOM_EX_R.class);
				for (MCList<MAW_BOM_EX_R> upL : tgtBomExL.groupList(MAW_BOM_EX_R.$itm_cd,
						MAW_BOM_EX_R.$itm_sub1, MAW_BOM_EX_R.$itm_sub2, MAW_BOM_EX_R.$itm_sub3)) {
					MAW_BOM_EX_R r = MAW_BOM_EX_R.create();
					MCRow.copyall(r, upL.get(0));
					r.par_inst_qty(calcParInstQty(upL));
					r.chd_rqmt_qty(calcChdRqmtQty(upL,r.par_inst_qty()));
					r.fxd_chd_rqmt_qty(upL.sum(MAW_BOM_EX_R.$fxd_chd_rqmt_qty));
					updBomExL.add(r);
				}
				MapItmDtlBom<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR, MAW_BOM_EX_R, MSVM_MRP_ITM_DTL_R> itmDtlBomMpr = createMapItmDtlBom();
				itmDtlBomMpr.setWith(itmDtlR);
				addAll(itmDtlBomL, updBomExL, itmDtlBomMpr);
			}
			
			return itmDtlBomL;
		}
		
		protected MCNumber calcParInstQty(MCList<MAW_BOM_EX_R> upL) {
			MCNumber parInstQty = MCNumber.ONE;
			MCList<MAW_BOM_EX_R> parInstQtyL = upL.groupBy(MAW_BOM_EX_R.$par_inst_qty);
			for (MAW_BOM_EX_R r : parInstQtyL) {
				parInstQty = r.par_inst_qty().multiply(parInstQty);
			}
			return parInstQty;
		}
		
		protected MCNumber calcChdRqmtQty(MCList<MAW_BOM_EX_R> upL, MCNumber parInstQty) {
			MCNumber chdRqmtQty = MCNumber.ZERO;
			for (MAW_BOM_EX_R r : upL) {
				chdRqmtQty = chdRqmtQty.add(r.chd_rqmt_qty().multiply(parInstQty).divide(r.par_inst_qty()));
			}
			return chdRqmtQty;
		}
		
		protected MapItmDtlBom<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR,MAW_BOM_EX_R,MSVM_MRP_ITM_DTL_R> createMapItmDtlBom() {
			return new MapItmDtlBom<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR, MAW_BOM_EX_R,MSVM_MRP_ITM_DTL_R>();
		}

		public class MapItmDtlBom<D extends OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR, S extends MAW_BOM_EX_R, W extends MSVM_MRP_ITM_DTL_R>  extends FXUCC_RowMapperWith<D,S,W>{
			protected W _itmDtlR;
			@Override
			public void setWith(W itmDtlR){
				this._itmDtlR = itmDtlR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$wg_cd, MAW_BOM_EX_R.$wg_cd);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno1, MAW_BOM_EX_R.$sno1);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno2, MAW_BOM_EX_R.$sno2);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno3, MAW_BOM_EX_R.$sno3);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno4, MAW_BOM_EX_R.$sno4);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$oper_cd, MAW_BOM_EX_R.$oper_cd);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$oper_seq, MAW_BOM_EX_R.$oper_seq);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_cd, MAW_BOM_EX_R.$itm_cd);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub1, MAW_BOM_EX_R.$itm_sub1);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub2, MAW_BOM_EX_R.$itm_sub2);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_itm_sub3, MAW_BOM_EX_R.$itm_sub3);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$ver_no, MAW_BOM_EX_R.$ver_no);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$alt_grp_cd, MAW_BOM_EX_R.$alt_grp_cd);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$alt_itm_typ, MAW_BOM_EX_R.$alt_itm_typ);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$alt_itm_ratio, MAW_BOM_EX_R.$alt_itm_ratio);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$alt_alloc_prio, MAW_BOM_EX_R.$alt_alloc_prio);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$par_inst_qty, MAW_BOM_EX_R.$par_inst_qty);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$chd_rqmt_qty, MAW_BOM_EX_R.$chd_rqmt_qty);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$fxd_chd_rqmt_qty, MAW_BOM_EX_R.$fxd_chd_rqmt_qty);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno_typ1, MAW_BOM_EX_R.$sno_typ1);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno_typ2, MAW_BOM_EX_R.$sno_typ2);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno_typ3, MAW_BOM_EX_R.$sno_typ3);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$sno_typ4, MAW_BOM_EX_R.$sno_typ4);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$in_offst_typ, MAW_BOM_EX_R.$in_offst_typ);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$in_offst, MAW_BOM_EX_R.$in_offst);
				addColumnPathMap(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.$inpt_ctl_typ, MAW_BOM_EX_R.$inpt_ctl_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				//外注品はデフォルト工程とみなす
				if(isOutsrc(_itmDtlR)) {
					dest.oper_ptn(MAC_STR.NULL_VAL.value());
					dest.oper_cd(null);
					dest.oper_seq(MCNumber.ONE);
				}
				dest.par_itm_cd(_itmDtlR.itm_cd());
				dest.par_itm_sub1(_itmDtlR.itm_sub1());
				dest.par_itm_sub2(_itmDtlR.itm_sub2());
				dest.par_itm_sub3(_itmDtlR.itm_sub3());
				dest.bom_ptn(_itmDtlR.bom_ptn());
				dest.mfg_loc_cd(_itmDtlR.mfg_loc_cd());
				dest.itm_dtl_st_dt(_itmDtlR.st_dt());
				dest.itm_dtl_end_dt(_itmDtlR.end_dt());
				dest.oper_ptn(_itmDtlR.oper_ptn());
				dest.mfg_lt(_itmDtlR.mfg_lt());
				dest.mfg_lt_add_qty(_itmDtlR.mfg_lt_add_qty());
				dest.purc_lt(_itmDtlR.purc_lt());
				dest.purc_lt_add_qty(_itmDtlR.purc_lt_add_qty());
				dest.accpt_insp_lt(_itmDtlR.accpt_insp_lt());
				dest.buf_lt(_itmDtlR.buf_lt());
				dest.sz_day_week_typ(_itmDtlR.sz_day_week_typ());
				dest.lot_sz_pd(_itmDtlR.lot_sz_pd());
				dest.sz_week(_itmDtlR.sz_week());
				dest.min_lot_qty (_itmDtlR.min_lot_qty());
				dest.batch_lot_qty(_itmDtlR.batch_lot_qty());
				dest.max_lot_qty(_itmDtlR.max_lot_qty());
				dest.max_order(_itmDtlR.max_order());
				dest.prio(_itmDtlR.prio());
				dest.order_ratio(_itmDtlR.order_ratio());
				dest.yield_schd_qty(_itmDtlR.yield_schd_qty());
				dest.mfg_inst_qty(_itmDtlR.mfg_inst_qty());
				dest.fxd_rqmt_qty (_itmDtlR.fxd_rqmt_qty());
			}
		}	
	}
	
	protected boolean isOutsrc(MSVM_MRP_ITM_DTL_R itmDtlR) {
		if(isNull(itmDtlR.purc_lt())) {
			return false;
		}
		return true;
	}

	/**
	 * OrdSendIf_Oper_InstAct_Srch01オペレーション.<p>
	 *
	 * 送信対象の工程指図・実績を検索する<br>
	 */
	public class OrdSendIf_Oper_InstAct_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Oper_InstAct_Srch01 {
		protected MCList<MST_ARR_ACT_R> _arrActCache;
		protected MCIndexKey _idxArrActCache = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			searchOperInstAct();
		}

		protected void searchOperInstAct() {

			MCList<OrdSendIf_Oper_InstAct_Srch01_RsltR> operInstActL = MCList.create(OrdSendIf_Oper_InstAct_Srch01_RsltR.class);
			dbSelect("MSLAL9310_MST_OPER_INST_S01", operInstActL, createOperInstActBldr(), up0());

			setDown(operInstActL);
		}

		protected MCQueryApiBuilder createOperInstActBldr() {

			MST_OPER_ORDER_R operOdrR = MST_OPER_ORDER_R.create("OPER_ODR");
			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ODR");
			MST_OPER_INST_R operInstR = MST_OPER_INST_R.create("OPER_INST");
			MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create("OPER_ACT");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);
			MCTempView operActViewR = createTempView("OPER_ACT_VIEW");

			addItmConditionToQuery(itmOdrR, itmOdrBldr);

			itmOdrBldr.setGroupBy(operOdrR.oper_ord_no);
			itmOdrBldr.addGroupFunc(max(itmOdrR.ext_itm_ord_no),"ext_itm_ord_no");
			itmOdrBldr.addGroupFunc(max(itmOdrR.itm_ord_sts_typ),"itm_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(itmOdrR.mfg_st_schd_dt),"mfg_st_schd_dt");
			itmOdrBldr.addGroupFunc(max(itmOdrR.mfg_end_schd_dt),"mfg_end_schd_dt");
			itmOdrBldr.addGroupFunc(max(operOdrR.ext_oper_ord_no),"ext_oper_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.wg_cd),"wg_cd");
			itmOdrBldr.addGroupFunc(max(operOdrR.itm_ord_no),"itm_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.oper_ord_sts_typ),"oper_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(operOdrR.st_schd_tm),"st_schd_tm");
			itmOdrBldr.addGroupFunc(max(operOdrR.end_schd_tm),"end_schd_tm");
			itmOdrBldr.addGroupFunc(max(operOdrR.oper_schd_qty),"oper_schd_qty");
			itmOdrBldr.addGroupFunc(sum(operInstR.base_unit_qty),"oper_inst_schd_qty");
			itmOdrBldr.addGroupFunc(max(operInstR.itm_mfg_inst_no),"itm_mfg_inst_no");
			itmOdrBldr.addGroupFunc(min(operInstR.st_schd_tm),"inst_st_schd_tm");
			itmOdrBldr.addGroupFunc(max(operInstR.end_schd_tm),"inst_end_schd_tm");
			itmOdrBldr.addGroupFunc(max(operActViewR.pr("base_unit_cd")),"base_unit_cd");
			itmOdrBldr.addGroupFunc(sum(operActViewR.pr("oper_act_qty")),"oper_act_qty");
			itmOdrBldr.addGroupFunc(min(operActViewR.pr("act_st_tm")),"act_st_tm");
			itmOdrBldr.addGroupFunc(max(operActViewR.pr("act_end_tm")),"act_end_tm");
			itmOdrBldr.addInnerJoin(operOdrR, bracket(itmOdrR.itm_ord_no.eq(operOdrR.itm_ord_no)));
			itmOdrBldr.addLeftOuterJoin(operInstR, bracket(operOdrR.oper_ord_no.eq(operInstR.oper_ord_no)));
			itmOdrBldr.addLeftOuterJoin(subQuery()
					.select(
							operActR.oper_inst_no,
							max(operActR.base_unit_cd).as("base_unit_cd"),
							sum(operActR.base_unit_qty).as("oper_act_qty"),
							min(operActR.st_act_tm).as("act_st_tm"),
							max(operActR.end_act_tm).as("act_end_tm")
						)
						.from(operActR)
						.where(
							value(0).eq(value(0))
						)
						.groupBy(operActR.oper_inst_no).view(operActViewR), bracket(operInstR.oper_inst_no.eq(operActViewR.pr(operActR.oper_inst_no))));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));

			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from"))); 
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(operInstR.can_flg.eq(value(false)));
			itmOdrBldr.addWhereWithAnd(operInstR.oper_ord_no.isNotNull());
			itmOdrBldr.addWhereWithAnd(
					itmOdrR.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.FIX.value()))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.PART_INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.CMPL.value()))));

			return itmOdrBldr;
		}

		protected void setDown(MCList<OrdSendIf_Oper_InstAct_Srch01_RsltR> operInstActL) {
			crtArrActCache(operInstActL);
			complOperInstAct(operInstActL);
			down0().addAll(operInstActL);
		}

		protected void crtArrActCache(MCList<OrdSendIf_Oper_InstAct_Srch01_RsltR> operInstActL) {
			_arrActCache = MCList.create(MST_ARR_ACT_R.class);
			MST_ITM_MFG_INST_R itmMfgInstR = MST_ITM_MFG_INST_R.create("ITM_MFG_INST");
			MST_MFG_INST_R mfgInstR = MST_MFG_INST_R.create("MFG_INST");
			MST_ARR_SCHD_R arrSchdR = MST_ARR_SCHD_R.create("ARR_SCHD");
			MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create("ARR_ACT");
			MCQueryApiBuilder arrActBldr = MCQueryApiBuilder.create(arrActR);
			arrActBldr.setSelect(arrActR.ac_dt);
			arrActBldr.addSelect(itmMfgInstR.itm_mfg_inst_no);
			arrActBldr.addInnerJoin(arrSchdR, bracket(arrActR.arr_schd_no.eq(arrSchdR.arr_schd_no)));
			arrActBldr.addInnerJoin(mfgInstR, bracket(arrSchdR.mfg_inst_no.eq(mfgInstR.mfg_inst_no)));
			arrActBldr.addInnerJoin(itmMfgInstR, bracket(mfgInstR.itm_mfg_inst_no.eq(itmMfgInstR.itm_mfg_inst_no)));
			arrActBldr.setWhere(itmMfgInstR.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			arrActBldr.addWhereWithAnd(mfgInstR.can_flg.eq(value(false)));
			arrActBldr.addWhereWithAnd(itmMfgInstR.can_flg.eq(value(false)));
			arrActBldr.addWhereWithAnd(arrActR.can_flg.eq(value(false)));
			arrActBldr.addWhereWithAnd(itmMfgInstR.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
			dbSelect("MSLAL9310_MST_ARR_ACT_S01", _arrActCache, arrActBldr, operInstActL.groupBy(OrdSendIf_Oper_InstAct_Srch01_RsltR.$itm_mfg_inst_no));
			_idxArrActCache = _arrActCache.createIndex("itm_mfg_inst_no");
		}

		protected void complOperInstAct(MCList<OrdSendIf_Oper_InstAct_Srch01_RsltR> operInstActL) {
			MCList<MAM_UNIT_R> unitL = getUnitL(operInstActL);
			MCIndexKey idxUnit = unitL.createIndex(MAM_UNIT_R.$unit_cd);

			for (OrdSendIf_Oper_InstAct_Srch01_RsltR r : operInstActL) {
				MAM_UNIT_R unitR = unitL.getFirst(idxUnit, r.base_unit_cd());
				if (!isNull(unitR)) {
					r.base_unit_nm(unitR.unit_nm());
				}
				MCList<MST_ARR_ACT_R> arrActL =_arrActCache.subList(_idxArrActCache, r.getStringNE("itm_mfg_inst_no"));
				if (!arrActL.isEmpty()) {
					r.act_end_tm((MCDate)arrActL.max(MST_ARR_ACT_R.$ac_dt));
				}
			}
		}
	}
	/**
	 * OrdSendIf_Ord_Lnk_Srch01オペレーション.<p>
	 *
	 * 送信対象のオーダ引当を検索する<br>
	 */
	public class OrdSendIf_Ord_Lnk_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Ord_Lnk_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			searchOrdLnk();
		}

		protected void searchOrdLnk() {

			MCList<OrdSendIf_Ord_Lnk_Srch01_RsltR> ordLnkL = MCList.create(OrdSendIf_Ord_Lnk_Srch01_RsltR.class);
			MCList<OrdSendIf_Ord_Lnk_Srch01_RsltR> parOrdLnkL = MCList.create(OrdSendIf_Ord_Lnk_Srch01_RsltR.class);
			dbSelect("MSLAL9310_MST_ITM_LNK_S01", ordLnkL, createItmLnkBldr(), up0());
			dbSelect("MSLAL9310_MST_ITM_LNK_S02", parOrdLnkL, createParItmLnkBldr(), up0());

			setDown(ordLnkL, parOrdLnkL);
		}

		protected MCQueryApiBuilder createItmLnkBldr() {

			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ODR");
			MST_ITM_LNK_R itmLnkR = MST_ITM_LNK_R.create("ITM_LNK");
			MAM_LOC_R locR = MAM_LOC_R.create("LOC");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create("ITM_DTL");
			MAM_CO_R coR = MAM_CO_R.create();
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);

			addItmConditionToQuery(itmOdrR, itmOdrBldr);
			itmOdrBldr.setSelect(itmLnkR.wg_cd);
			itmOdrBldr.addSelect(itmOdrR.itm_ord_typ);
			itmOdrBldr.addSelect(itmLnkR.itm_ord_no);
			itmOdrBldr.addSelect(itmLnkR.par_itm_ord_no);
			itmOdrBldr.addSelect(itmLnkR.par_oper_ord_no);
			itmOdrBldr.addSelect(itmLnkR.oper_ptn);
			itmOdrBldr.addSelect(itmLnkR.oper_cd);
			itmOdrBldr.addSelect(itmLnkR.oper_seq);
			itmOdrBldr.addSelect(itmOdrR.itm_cd);
			itmOdrBldr.addSelect(itmOdrR.itm_sub1);
			itmOdrBldr.addSelect(itmOdrR.itm_sub2);
			itmOdrBldr.addSelect(itmOdrR.itm_sub3);
			itmOdrBldr.addSelect(itmOdrR.xfr_lt);
			itmOdrBldr.addSelect(itmOdrR.insp_lt);
			itmOdrBldr.addSelect(itmOdrR.insp_offst);
			itmOdrBldr.addSelect(itmOdrR.xfr_lt);
			itmOdrBldr.addSelect(itmOdrR.accpt_insp_lt);
			itmOdrBldr.addSelect(
					nvl(
						locR.cal_cd,
						bracket(
							bracket(
								subQuery()
								.select(coR.std_cal_cd)
								.from(coR)
							)
						)
					).as("cal_cd"));
			itmOdrBldr.addInnerJoin(itmLnkR, bracket(itmOdrR.itm_ord_no.eq(itmLnkR.itm_ord_no).and(itmOdrR.wg_cd.eq(itmLnkR.wg_cd))));
			itmOdrBldr.addLeftOuterJoin(locR, bracket(itmOdrR.strg_loc_cd.eq(locR.loc_cd)));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));
			itmOdrBldr.addLeftOuterJoin(itmDtlR, itmOdrR.itm_cd.eq(itmDtlR.itm_cd)
					.and(itmOdrR.itm_sub1.eq(itmDtlR.itm_sub1))
					.and(itmOdrR.itm_sub2.eq(itmDtlR.itm_sub2))
					.and(itmOdrR.itm_sub3.eq(itmDtlR.itm_sub3))
					.and(itmOdrR.mfg_loc_cd.eq(itmDtlR.mfg_loc_cd))
					.and(itmOdrR.bom_ptn.eq(itmDtlR.bom_ptn))
					.and(itmOdrR.wg_cd.eq(itmDtlR.wg_cd))
					.and(itmOdrR.master_dt.gte(itmDtlR.st_dt))
					.and(itmOdrR.master_dt.lte(itmDtlR.end_dt)));

			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(
					itmOdrR.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.SAV.value()))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.FIX.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.PART_INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.CMPL.value()))));

			return itmOdrBldr;
		}

		protected MCQueryApiBuilder createParItmLnkBldr() {

			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ODR");
			MST_ITM_LNK_R itmLnkR = MST_ITM_LNK_R.create("ITM_LNK");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);

			addItmConditionToQuery(itmOdrR, itmOdrBldr);
			itmOdrBldr.setSelect(itmLnkR.wg_cd);
			itmOdrBldr.addSelect(itmLnkR.itm_ord_no);

			itmOdrBldr.addInnerJoin(itmLnkR, bracket(itmOdrR.itm_ord_no.eq(itmLnkR.par_itm_ord_no).and(itmOdrR.wg_cd.eq(itmLnkR.wg_cd))));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));

			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(
					itmOdrR.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.SAV.value()))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.FIX.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.PART_INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.CMPL.value()))));

			return itmOdrBldr;
		}

		protected void setDown(MCList<OrdSendIf_Ord_Lnk_Srch01_RsltR> ordLnkL, MCList<OrdSendIf_Ord_Lnk_Srch01_RsltR> parOrdLnkL) {
			MCIndexKey parOrdLnkIdxKey = parOrdLnkL.createIndex(OrdSendIf_Ord_Lnk_Srch01_RsltR.$itm_ord_no, OrdSendIf_Ord_Lnk_Srch01_RsltR.$wg_cd);

			for (OrdSendIf_Ord_Lnk_Srch01_RsltR r: ordLnkL) {

				OrdSendIf_Ord_Lnk_Srch01_RsltR parOrdLnkR = parOrdLnkL.getFirst(parOrdLnkIdxKey, r.itm_ord_no(), r.wg_cd());
				if (!isNull(parOrdLnkR)) {
					down0().add(r);
				}
			}
		}
	}
	/**
	 * OrdSendIf_Schd_ActQty_Srch01オペレーション.<p>
	 *
	 * 送信対象の実績数量を検索する<br>
	 */
	public class OrdSendIf_Schd_ActQty_Srch01 extends MSLAL_OrdSendIfService_MC_A.OrdSendIf_Schd_ActQty_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {	
			super.doSearchMain();

			searchSchdActQty();
		}

		protected void searchSchdActQty(){
			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> schdActQtyL = MCList.create(OrdSendIf_Schd_ActQty_Srch01_RsltR.class);

			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> inptActQtyL = srchInptActQty();
			schdActQtyL.addAll(inptActQtyL);

			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> yieldActQtyL = srchYieldActQty();
			schdActQtyL.addAll(yieldActQtyL);

			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> noInptYieldActQtyL = srchNoInptYieldActQty();
			schdActQtyL.addAll(noInptYieldActQtyL);

			setDown(schdActQtyL);
		}

		protected MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> srchInptActQty(){
			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> yieldActQtyL = MCList.create(OrdSendIf_Schd_ActQty_Srch01_RsltR.class);

			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ORDER");
			MST_OPER_ORDER_R operOdrR= MST_OPER_ORDER_R.create("OPER_ORDER");
			MST_OPER_INST_R operInstR = MST_OPER_INST_R.create("OPER_INST");
			MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create("OPER_ACT");
			MST_INPT_ACT_R inptActR = MST_INPT_ACT_R.create("INPT_ACT");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);

			addItmConditionToQuery(itmOdrR, itmOdrBldr);

			itmOdrBldr.setSelect(inptActR.itm_cd, inptActR.itm_sub1, inptActR.itm_sub2, inptActR.itm_sub3);
			itmOdrBldr.setGroupBy(operOdrR.oper_ord_no, inptActR.itm_cd, inptActR.itm_sub1, inptActR.itm_sub2, inptActR.itm_sub3);
			itmOdrBldr.addGroupFunc(max(itmOdrR.ext_itm_ord_no),"ext_itm_ord_no");
			itmOdrBldr.addGroupFunc(max(itmOdrR.itm_ord_sts_typ),"itm_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(operOdrR.ext_oper_ord_no),"ext_oper_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.wg_cd),"wg_cd");
			itmOdrBldr.addGroupFunc(max(operOdrR.itm_ord_no),"itm_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.oper_ord_sts_typ),"oper_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(inptActR.base_unit_cd),"base_unit_cd");
			itmOdrBldr.addGroupFunc(sum(inptActR.base_unit_inpt_qty.add(inptActR.base_unit_fxd_loss_qty)),"act_qty");
			itmOdrBldr.addInnerJoin(operOdrR, operOdrR.itm_ord_no.eq(itmOdrR.itm_ord_no));
			itmOdrBldr.addInnerJoin(operInstR, operInstR. oper_ord_no .eq(operOdrR. oper_ord_no ));
			itmOdrBldr.addInnerJoin(operActR, operActR.oper_inst_no.eq(operInstR.oper_inst_no));
			itmOdrBldr.addInnerJoin(inptActR, inptActR.oper_act_no.eq(operActR.oper_act_no));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(operInstR.can_flg.eq(value(false)));
			itmOdrBldr.addWhereWithAnd(
					itmOdrR.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.PART_INST.value()))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.CMPL.value()))));

			dbSelect("MSLAL9310_MST_INPT_ACT_S01", yieldActQtyL, itmOdrBldr, up0());

			return yieldActQtyL;
		}

		protected MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> srchYieldActQty(){
			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> yieldActQtyL = MCList.create(OrdSendIf_Schd_ActQty_Srch01_RsltR.class);

			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ORDER");
			MST_OPER_ORDER_R operOdrR= MST_OPER_ORDER_R.create("OPER_ORDER");
			MST_OPER_INST_R operInstR = MST_OPER_INST_R.create("OPER_INST");
			MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create("OPER_ACT");
			MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create("YIELD_ACT");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);

			addItmConditionToQuery(itmOdrR, itmOdrBldr);

			itmOdrBldr.setSelect(yieldActR.itm_cd, yieldActR.itm_sub1, yieldActR.itm_sub2, yieldActR.itm_sub3);
			itmOdrBldr.setGroupBy(operOdrR.oper_ord_no, yieldActR.itm_cd, yieldActR.itm_sub1, yieldActR.itm_sub2, yieldActR.itm_sub3);
			itmOdrBldr.addGroupFunc(max(itmOdrR.ext_itm_ord_no),"ext_itm_ord_no");
			itmOdrBldr.addGroupFunc(max(itmOdrR.itm_ord_sts_typ),"itm_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(operOdrR.ext_oper_ord_no),"ext_oper_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.wg_cd),"wg_cd");
			itmOdrBldr.addGroupFunc(max(operOdrR.itm_ord_no),"itm_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.oper_ord_sts_typ),"oper_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(yieldActR.base_unit_cd),"base_unit_cd");
			itmOdrBldr.addGroupFunc(sum(yieldActR.base_unit_qty),"act_qty");
			itmOdrBldr.addInnerJoin(operOdrR, operOdrR.itm_ord_no.eq(itmOdrR.itm_ord_no));
			itmOdrBldr.addInnerJoin(operInstR, operInstR. oper_ord_no .eq(operOdrR. oper_ord_no ));
			itmOdrBldr.addInnerJoin(operActR, operActR.oper_inst_no.eq(operInstR.oper_inst_no));
			itmOdrBldr.addInnerJoin(yieldActR, yieldActR.oper_act_no.eq(operActR.oper_act_no));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(operInstR.can_flg.eq(value(false)));
			itmOdrBldr.addWhereWithAnd(
					itmOdrR.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.PART_INST.value()))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.INST.value())))
							.or(itmOdrR.itm_ord_sts_typ
									.eq(value(MSC_ITM_ORD_STS_TYP.CMPL.value()))));

			dbSelect("MSLAL9310_MST_INPT_ACT_S02", yieldActQtyL, itmOdrBldr, up0());

			return yieldActQtyL;
		}

		protected MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> srchNoInptYieldActQty(){
			MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> noInptYieldActQtyL = MCList.create(OrdSendIf_Schd_ActQty_Srch01_RsltR.class);

			MST_ITM_ORDER_R itmOdrR = MST_ITM_ORDER_R.create("ITM_ORDER");
			MST_OPER_ORDER_R operOdrR= MST_OPER_ORDER_R.create("OPER_ORDER");
			MST_OPER_INST_R operInstR = MST_OPER_INST_R.create("OPER_INST");
			MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create("OPER_ACT");
			MST_OPER_ACT_R inptOperActR = MST_OPER_ACT_R.create("INPT_OPER_ACT");
			MST_INPT_ACT_R inptActR = MST_INPT_ACT_R.create("INPT_ACT");
			MST_OPER_ACT_R yieldOperActR = MST_OPER_ACT_R.create("YIELD_OPER_ACT");
			MST_YIELD_ACT_R yieldActR = MST_YIELD_ACT_R.create("YIELD_ACT");
			MAM_LOC_R mfgLocR = MAM_LOC_R.create("MFG_LOC");
			MCQueryApiBuilder itmOdrBldr = MCQueryApiBuilder.create(itmOdrR);

			addItmConditionToQuery(itmOdrR, itmOdrBldr);

			itmOdrBldr.setSelect(nullValue().as("itm_cd"), nullValue().as("itm_sub1"), nullValue().as("itm_sub2"), nullValue().as("itm_sub3"));
			itmOdrBldr.setGroupBy(operOdrR.oper_ord_no);
			itmOdrBldr.addGroupFunc(max(itmOdrR.ext_itm_ord_no),"ext_itm_ord_no");
			itmOdrBldr.addGroupFunc(max(itmOdrR.itm_ord_sts_typ),"itm_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(operOdrR.ext_oper_ord_no),"ext_oper_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.wg_cd),"wg_cd");
			itmOdrBldr.addGroupFunc(max(operOdrR.itm_ord_no),"itm_ord_no");
			itmOdrBldr.addGroupFunc(max(operOdrR.oper_ord_sts_typ),"oper_ord_sts_typ");
			itmOdrBldr.addGroupFunc(max(operActR.base_unit_cd),"base_unit_cd");
			itmOdrBldr.addGroupFunc(sum(operActR.base_unit_qty),"act_qty");
			itmOdrBldr.addInnerJoin(operOdrR, operOdrR.itm_ord_no.eq(itmOdrR.itm_ord_no));
			itmOdrBldr.addInnerJoin(operInstR, operInstR. oper_ord_no .eq(operOdrR. oper_ord_no ));
			itmOdrBldr.addInnerJoin(operActR, operActR.oper_inst_no.eq(operInstR.oper_inst_no));
			itmOdrBldr.addLeftOuterJoin(mfgLocR, itmOdrR.mfg_loc_cd.eq(mfgLocR.loc_cd));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.loc_grp_cd.eq(bind("mfg_loc_grp_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(mfgLocR.site_cd.eq(bind("site_cd")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_st_schd_dt.gte(bind("term_from")));
			itmOdrBldr.addWhereWithCutOffAnd(itmOdrR.mfg_end_schd_dt.lte(bind("term_to")));
			itmOdrBldr.addWhereWithAnd(operInstR.can_flg.eq(value(false)));
			itmOdrBldr.addWhereWithAnd(operOdrR.oper_ord_sts_typ.eq(value(MSC_OPER_ORD_STS_TYP.CMPL.value())));
			itmOdrBldr.addWhereWithAnd(notExists(
					subQuery()
					.select(value(1))
					.from(
						inptOperActR
						.innerJoin(inptActR).on(
							bracket(
								inptActR.oper_act_no.eq(inptOperActR.oper_act_no)
							)
						)
					)
					.where(
						inptOperActR.oper_act_no.eq(operActR.oper_act_no)
					)
				));
			itmOdrBldr.addWhereWithAnd(notExists(
					subQuery()
					.select(value(1))
					.from(
						yieldOperActR
						.innerJoin(yieldActR).on(
							bracket(
								yieldActR.oper_act_no.eq(yieldOperActR.oper_act_no)
							)
						)
					)
					.where(
						yieldOperActR.oper_act_no.eq(operActR.oper_act_no)
					)
				));

			dbSelect("MSLAL9310_MST_INPT_ACT_S03", noInptYieldActQtyL, itmOdrBldr, up0());

			return noInptYieldActQtyL;
		}

		protected void setDown(MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> schdActQtyL) {
			complSchdActQty(schdActQtyL);
			down0().addAll(schdActQtyL);
		}

		protected void complSchdActQty(MCList<OrdSendIf_Schd_ActQty_Srch01_RsltR> schdActQtyL) {
			MCList<MAM_UNIT_R> unitL = getUnitL(schdActQtyL);
			MCIndexKey idxUnit = unitL.createIndex(MAM_UNIT_R.$unit_cd);

			for (OrdSendIf_Schd_ActQty_Srch01_RsltR r : schdActQtyL) {
				MAM_UNIT_R unitR = unitL.getFirst(idxUnit, r.base_unit_cd());
				if (!isNull(unitR)) {
					r.base_unit_nm(unitR.unit_nm());
				}
			}
		}
	}

	//FMCB CUSTOM END
}