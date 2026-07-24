package mcframe.serverMSBC.MSBCL6040;

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
import mcframe.serverMSBC.MSBCL6040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.commonFXUC.FXUCC0030.IfDivideProp;
import java.util.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5200.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_LotPropService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_LotPropService_MC extends MSBCL_LotPropService_MC_A{
	//FMCB CUSTOM START

	/**
	 * LotProp_Sprt01オペレーション.<p>
	 *
	 * 渡された製造品、投入品の情報から、使用可能なロットの情報を取得する。製造指図時に呼ばれる。<br>
	 */
	public class LotProp_Sprt01 extends MSBCL_LotPropService_MC_A.LotProp_Sprt01 {

		/**
		 * 投入品の品目マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL;
		
		/**
		 * 投入場所の場所マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up1().isEmpty()) {
				return;
			}

			cacheItm();
			
			editUp();
			
			if (up0().exec_prop_btn_flg()) {
				lotPropWithRollback();
			}
			else {
				lotProp();
			}
		}

		/**
		 * 投入品の品目マスタをキャッシュする
		 */
		protected void cacheItm() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.lot_mng_typ);
			dbcItmL_bldr.addSelect(t.sublot_mng_typ);
			dbcItmL_bldr.addSelect(t.gi_alloc_flg);
			dbcItmL_bldr.addSelect(t.minus_stk_flg);
			_cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, up1(), new String[] {
					Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, Srch_RsltR.$itm_sub3
			});		
		}
		
		/**
		 * 投入品の場所マスタをキャッシュする
		 */
		protected void cacheLoc(MCList<?> dbL) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R m = MAM_BP_R.create("M");
			dbcL_bldr.setSelect(t.wg_cd, t.sppl_cd, t.gi_vmi_flg, t.site_cd, t.loc_mng_typ, m.repurc_obli_flg);
			dbcL_bldr.addLeftOuterJoin(m, bracket(t.sppl_cd.eq(m.bp_cd)));
			
			_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dbL, "inpt_loc_cd");
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 各投入について、ロット提案対象となる数量の合計値を算出する
			for (LotProp_Sprt01_Dtl1R up1R : up1()) {
				if (up0().act_flg()) {
					// 実績時、投入数量＋ロス数量＋固定ロス数量がロット提案対象の数量
					if (isNull(up1R.base_unit_qty())) {
						up1R.base_unit_qty(
								sum(up1R.inpt_qty(), nvl(up1R.loss_qty(), MCNumber.ZERO),
										nvl(up1R.fxd_loss_qty(), MCNumber.ZERO)));
					}
					if (up1R.cont_fctr_flg() && isNull(up1R.cont_qty())) {
						up1R.cont_qty(sum(up1R.cont_inpt_qty(),
								nvl(up1R.cont_loss_qty(), MCNumber.ZERO),
								nvl(up1R.cont_fxd_loss_qty(), MCNumber.ZERO)));
					}
				}
				else {
					// 指図時、必要数量＋固定必要数量がロット提案対象の数量
					if (isNull(up1R.base_unit_qty())) {
						up1R.base_unit_qty(sum(up1R.rqmt_qty(), nvl(up1R.fxd_rqmt_qty(), MCNumber.ZERO)));
					}
					if (up1R.cont_fctr_flg() && isNull(up1R.cont_qty())) {
						up1R.cont_qty(sum(up1R.cont_rqmt_qty(), nvl(up1R.cont_fxd_rqmt_qty(), MCNumber.ZERO)));
					}
				}
				
				up1R.up_oper_inst_no(up1R.oper_inst_no());
				if (isNull(up1R.oper_inst_no()) || up0().act_flg()) {
					// ・指図未登録時など工程指図ＮＯがまだ発番されていない場合
					// ・実績から呼ばれた場合
					// 工程紐付けＮＯを文字列化して設定する
					// ※実績から呼ばれた場合、工程実績が行コピーされて登録されたときに、
					// それぞれの工程実績ごとに代替グループの提案を行う必要があるため
					up1R.oper_inst_no(up1R.oper_peg_no().toString());
				}
			}
			
			// 代替品目指定をしている場合、代替としてロット提案処理は行わない仕様のため
			// 代替品目指定をしている行が存在しない場合のみ代替ＦＬＧをオンにする
			for (MCList<LotProp_Sprt01_Dtl1R> altGL : up1().groupList(
					LotProp_Sprt01_Dtl1R.$oper_inst_no, LotProp_Sprt01_Dtl1R.$alt_grp_cd,
					LotProp_Sprt01_Dtl1R.$alt_grp_seq)) {
				if (isNull(altGL.get(0).alt_grp_cd())) {
					continue;
				}
				
				// 代替品目指定フラグがオンとオフのレコードに分別
				for (LotProp_Sprt01_Dtl1R altR : altGL) {
					if (isNull(altGL.getFirst(LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg, true))) {
						altR.alt_flg(true);
					}
					else {
						altR.alt_flg(false);
					}
				}
			}
		}
		
		/**
		 * ロット提案を行い、処理終了後にロールバックを実施する。
		 */
		protected void lotPropWithRollback() {
			// 以降の処理で受払予定の削除・追加等を行うため、セーブポイントを設定し、処理終了後にここまでロールバックする
			MCSavepoint sp = dbTran().setSavepoint();
			
			try {
				// 受払予定、移動・移送予定の削除
				callDelIoSchdAndXfrSrv();
				// ロット提案
				lotProp();
			}
			finally {
				// 例外発生の有無にかからわず、常にセーブポイントまでロールバックする
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * 受払予定、移動・移送予定を削除する。
		 */
		protected void callDelIoSchdAndXfrSrv() {
			// 削除対象の投入の取得
			MCList<LotProp_Sprt01_Dtl1R> delL = getDelL();
			if (delL.isEmpty()) {
				return;
			}

			if (!up0().act_flg()) {
				// 移動・移送予定サービスの削除を実行
				// ※移動・移送予定のロットが他の実績に使用され、そのロットの在庫がなくなってしまった場合などに
				// 再度ロット提案しなおすために移動・移送予定が削除可能であれば削除する
				MCList<MST_XFR_SCHD_R> dbXfrRqstL = getXfrRqstL(delL);
				if (!dbXfrRqstL.isEmpty()) {
					// チェック処理を実行
					MCIndexKey xfrIdxKey = dbXfrRqstL.createIndex(MST_XFR_SCHD_R.$inpt_schd_no);
					MSBEL_XfrSchdService.XfrSchd_Chk04 xfrChk = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
					for (LotProp_Sprt01_Dtl1R upR : delL) {
						// 投入予定に紐付く移動・移送予定が存在する場合は、チェックサービスを呼び出す
						for (MST_XFR_SCHD_R xfrR : dbXfrRqstL.subList(xfrIdxKey, upR.inpt_schd_no())) {
							XfrSchdChk04_DtlR srvR = XfrSchdChk04_DtlR.create(); 
							copy(srvR, upR, createMap_XfrSchdChk04_DtlR_LotProp_Sprt01_Dtl1R());
							srvR.xfr_schd_no(xfrR.xfr_schd_no());
							xfrChk.up0().add(srvR);
						}
					}
					MCMessageList bfrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
					xfrChk.exec();
					MCMessagePool.clear();
					MCMessagePool.addAll(bfrMsgL);
	
					//　削除可能なデータのみ削除処理を実行
					MSBEL_XfrSchdService.XfrSchd_Upd01 xfrUpd01 = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
					for (XfrSchdChk04_DtlR xfrChkDownR : xfrChk.down0()) {
						if (!xfrChkDownR.err_flg()) {
							XfrSchd_DtlR xfrUpdUpR = XfrSchd_DtlR.create();
							xfrUpdUpR.peg_no(xfrChkDownR.peg_no());
							xfrUpdUpR.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
							xfrUpdUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							xfrUpdUpR.xfr_schd_no(xfrChkDownR.xfr_schd_no());
							xfrUpd01.up0().add(xfrUpdUpR);
						}
					}
					if (!xfrUpd01.up0().isEmpty()) {
						xfrUpd01.exec();
					}
				}
			}
			// 受払予定サービスの削除を実行
			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			addAll(o.up0(), delL, createMap_MSW_IO_SCHD_DEL_R_LotProp_Sprt01_Dtl1R());
			o.exec();
		}

		protected MCList<MST_XFR_SCHD_R> getXfrRqstL(
				MCList<LotProp_Sprt01_Dtl1R> xfrChkL) {
			MCList<MST_XFR_SCHD_R> dbXfrL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder dbXfrL_bldr = MCQueryApiBuilder.create(t);
			dbXfrL_bldr.setSelect(t.inpt_schd_no, t.xfr_schd_no);
			dbXfrL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			dbXfrL_bldr.setOrderByAsc(dbXfrL_bldr.getBaseDbc().getKeyColumn$());
			if (!xfrChkL.isEmpty()) {
				dbSelectForUpdate("MSBCL6040_MST_XFR_SCHD_S01", dbXfrL, dbXfrL_bldr, xfrChkL);
			}
			return dbXfrL;
		}
		
		protected Map_XfrSchdChk04_DtlR_LotProp_Sprt01_Dtl1R<XfrSchdChk04_DtlR,LotProp_Sprt01_Dtl1R> createMap_XfrSchdChk04_DtlR_LotProp_Sprt01_Dtl1R() {
			return new Map_XfrSchdChk04_DtlR_LotProp_Sprt01_Dtl1R<XfrSchdChk04_DtlR, LotProp_Sprt01_Dtl1R>();
		}

		public class Map_XfrSchdChk04_DtlR_LotProp_Sprt01_Dtl1R<D extends XfrSchdChk04_DtlR, S extends LotProp_Sprt01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, LotProp_Sprt01_Dtl1R.$peg_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * 受払予定の削除対象を取得する。
		 * 削除対象となるのは、ロット提案対象かつ、投入予定の引当フラグがオンのレコード
		 */
		protected MCList<LotProp_Sprt01_Dtl1R> getDelL() {
			MCList<LotProp_Sprt01_Dtl1R> retL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			// 投入予定ＮＯが設定されているレコードが存在しない場合は終了
			MCList<LotProp_Sprt01_Dtl1R> bindL = up1().subList(r -> !isNull(r.inpt_schd_no()));
			if (bindL.isEmpty()) {
				return retL;
			}

			// 投入予定が引当済のレコードのみが削除対象
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MSVT_MFG_INST_PR_R t2 = MSVT_MFG_INST_PR_R.create("T2");

			MCList<MST_INPT_SCHD_R> dbcL = MCList.create(MST_INPT_SCHD_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.inpt_schd_no);
			dbcL_bldr.addSelect(t2.mfg_sts_typ);
			dbcL_bldr.addInnerJoin(t2, t.mfg_inst_no.eq(t2.mfg_inst_no));
			dbcL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			dbcL_bldr.addWhereWithAnd(t.alloc_flg.eq(value(true)));
			dbcL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6040_MST_INPT_SCHD_S01", dbcL, dbcL_bldr,
					bindL.groupBy(LotProp_Sprt01_Dtl1R.$inpt_schd_no));

			// 引当済の投入予定が存在しない場合は終了
			if (dbcL.isEmpty()) {
				return retL;
			}
			
			MCIndexKey idxkey = dbcL.createIndex(MST_INPT_SCHD_R.$inpt_schd_no);
			for (LotProp_Sprt01_Dtl1R bindR : bindL) {
				MST_INPT_SCHD_R dbcR = dbcL.getFirst(idxkey, bindR.inpt_schd_no());
				if (!isNull(dbcR)) {
					bindR.inpt_schd_no(dbcR.inpt_schd_no());
					bindR.mfg_sts_typ(dbcR.getString("mfg_sts_typ"));
					retL.add(bindR);
				}
			}
			return retL;
		}
		
		/**
		 * 受払予定削除対象の上り電文から受払予定サービス（削除）へのマッピング
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_LotProp_Sprt01_Dtl1R<MSW_IO_SCHD_DEL_R,LotProp_Sprt01_Dtl1R> createMap_MSW_IO_SCHD_DEL_R_LotProp_Sprt01_Dtl1R() {
			return new Map_MSW_IO_SCHD_DEL_R_LotProp_Sprt01_Dtl1R<MSW_IO_SCHD_DEL_R, LotProp_Sprt01_Dtl1R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_LotProp_Sprt01_Dtl1R<D extends MSW_IO_SCHD_DEL_R, S extends LotProp_Sprt01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INPT_SCHD_R.$inpt_schd_no); //受払予定ＮＯに投入予定ＮＯを設定
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分に「投入」を設定
				
				String hdrMfgStsTyp = src.mfg_sts_typ();
				if (MSC_MFG_STS_TYP.isYET(hdrMfgStsTyp) || MSC_MFG_STS_TYP.isSAV(hdrMfgStsTyp)) {
					// テーブルの製造状況が「未指図」または「指図保存」の場合、受払予定状況に「製造保存」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isORD(src.mfg_sts_typ())) {
					// テーブルの製造状況が「指図済」の場合、受払予定状況に「指図済」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				}
				else if (MSC_MFG_STS_TYP.isSTT(src.mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(src.mfg_sts_typ())) {
					// テーブルの製造状況が「着手中」または「完了」の場合、受払予定状況に「着手中」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}
			}
		}
		
		/**
		 * ロット提案を実行し、下り電文を追加する
		 */
		protected void lotProp() {
			// 引当管理サービスの実行及び、下り電文（down0,down1,down2）の追加
			callAllocMngSrvAndAddDown();
		}
		
		/**
		 * 引当管理サービスのロット提案を実行し、下り電文に追加する
		 */
		protected void callAllocMngSrvAndAddDown() {
			// ロット提案対象の取得
			MCList<LotProp_Sprt01_Dtl1R> lotPropTgtL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			MCList<LotProp_Sprt01_Dtl1R> notLotPropTgtL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			for (LotProp_Sprt01_Dtl1R upR : up1()) {
				if (isLotPropTgt(upR)) {
					lotPropTgtL.add(upR);
				}
				else {
					// ロット提案対象外の場合は、上り電文をそのまま下り電文に追加
					upR.oper_inst_no(upR.up_oper_inst_no());
					notLotPropTgtL.add(upR);
				}
			}
			
			if (!lotPropTgtL.isEmpty()) {
				MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();
	
				// ロット提案サービスの上り電文の設定
				// ヘッダ
				o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value()); //不足時処理区分は1:継続
				o.up0().nm_srch_flg(up0().exec_prop_btn_flg()); //名称検索ＦＬＧはロット提案ボタン実行時のみオン
	
				// 実績用ソートキーにデフォルト値「1」を設定
				lotPropTgtL.addNumberColumn("act_sortkey", MCNumber.ONE);
				MCList<MST_INPT_ACT_R> dbL = MCList.create(MST_INPT_ACT_R.class);

				if (up0().act_flg()) {
					dbSelectKey("MSBCL6040_MST_INPT_ACT_S01", dbL,
							MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T")),
							up1().groupBy(LotProp_Sprt01_Dtl1R.$inpt_act_no));
					MCIndexKey idx = dbL.createIndex(LotProp_Sprt01_Dtl1R.$inpt_act_no);

					for (LotProp_Sprt01_Dtl1R lotPropTgtR : lotPropTgtL) {
						MST_INPT_ACT_R dbR = dbL.getFirst(idx, lotPropTgtR.inpt_act_no());
						if (!isNull(dbR)) {
							// 投入実績が登録済の場合、実績用ソートキーに「0」を設定
							lotPropTgtR.setNumberNE("act_sortkey", MCNumber.ZERO);
							// 後続処理の判定用に、投入実績が登録済の場合、在庫情報を取得
							lotPropTgtR.setStringNE("tmp_inpt_loc_cd", dbR.inpt_loc_cd());
							lotPropTgtR.setStringNE("tmp_inpt_str_ln_cd", dbR.inpt_str_ln_cd());
							lotPropTgtR.setStringNE("tmp_quality_typ", dbR.quality_typ());
							lotPropTgtR.setStringNE("tmp_stk_insp_typ", dbR.stk_insp_typ());
							lotPropTgtR.setStringNE("tmp_stk_id_typ", dbR.stk_id_typ());
							lotPropTgtR.setStringNE("tmp_stk_bp_cd", dbR.stk_bp_cd());
							lotPropTgtR.setStringNE("tmp_stk_arrv_bp_cd", dbR.stk_arrv_bp_cd());
							lotPropTgtR.setStringNE("tmp_gd_cd", dbR.gd_cd());
							lotPropTgtR.setStringNE("tmp_lot_no", dbR.lot_no());
							lotPropTgtR.setStringNE("tmp_sublot_no", dbR.sublot_no());
							lotPropTgtR.setStringNE("tmp_sno1", dbR.sno1());
							lotPropTgtR.setStringNE("tmp_sno2", dbR.sno2());
							lotPropTgtR.setStringNE("tmp_sno3", dbR.sno3());
							lotPropTgtR.setStringNE("tmp_sno4", dbR.sno4());
						}
					}
				}
	
				// 投入
				MCSortPolicy sp = new MCSortPolicy();
	
				// 実績時のロット提案で、投入実績が登録済のものを優先的に引き当てる
				// ※投入実績が登録済の場合、一旦フリー在庫に戻してからロット提案するが、その際に自身が戻した在庫を他にとられないようにするため
				sp.add(MCList.SortType.ASC, "act_sortkey");
	
				// 出庫日が直近のものに対して優先して引当するために、日付でソートする
				sp.add(MCList.SortType.ASC, LotProp_Sprt01_Dtl1R.$inpt_dt);
				// 一度ロット提案してロットが割れたデータに対して再提案した場合に、提案前のロットを極力優先して引き当てたいので、提案前のロットから求めた引当の優先順でソートする
				sp.add(MCList.SortType.ASC, LotProp_Sprt01_Dtl1R.$vld_dt);
				sp.add(MCList.SortType.ASC, LotProp_Sprt01_Dtl1R.$first_gr_dt);
				sp.add(MCList.SortType.ASC, LotProp_Sprt01_Dtl1R.$lot_seq);
				sp.add(MCList.SortType.ASC, LotProp_Sprt01_Dtl1R.$inpt_schd_no);
				lotPropTgtL.sort(sp);
	
				addAll(o.up1(), lotPropTgtL, createMap_Srch_TgtR_LotProp_Sprt01_Dtl1R());
	
				Map<String, Boolean> altGroupStkAllocFlgMap = new HashMap<String, Boolean>();
				MCList<Srch_TgtR> tempL = o.up1().subList(r -> !isNull(r.alt_grp_cd()));
				for (Srch_TgtR r : tempL) {
					String altGrpCd = r.alt_grp_cd();
					boolean stkAllocFlg = r.stk_alloc_flg();
					if (altGroupStkAllocFlgMap.containsKey(altGrpCd)) {
						if (altGroupStkAllocFlgMap.get(altGrpCd) && !stkAllocFlg) {
							// 同一代替Gの代替品間でstk_alloc_flgオン／オフが混在しているときはオフに寄せてマップに保持する
							altGroupStkAllocFlgMap.put(altGrpCd, stkAllocFlg);
						}
					} else {
						altGroupStkAllocFlgMap.put(altGrpCd, stkAllocFlg);
					}
				}
				for (Srch_TgtR r : tempL) {
					// 寄せたほうのstk_alloc_flgを設定しなおす
					String altGrpCd = r.alt_grp_cd();
					if (altGroupStkAllocFlgMap.containsKey(altGrpCd)) {
						r.stk_alloc_flg(altGroupStkAllocFlgMap.get(r.alt_grp_cd()));
					}
				}
				// 在庫情報（出来高実績、副産品実績分の在庫を増やす）
				if (!up2().isEmpty()) {
					addAll(o.up2(), up2(), createMap_Srch_StkR_LotProp_Sprt01_Dtl3R());
				}
	
				// 在庫情報（投入実績登録済の分の在庫を復活させる。また他勘定振替数量の増減も行う）
				if (up0().act_flg()) {
					MCList<Srch_StkR> inptActL = getInptAct(dbL);
					if (!inptActL.isEmpty()) {
						o.up2().addAll(inptActL);
					}
				}

				//マイナス在庫確認
				if (up0().act_flg() && !up0().exec_prop_btn_flg()) {
					o.up0().addBooleanColumn("minus_stk_chk_flg", true);
				}

				// ロット提案サービスを実行
				o.exec();
				
				o.down0().sort(LotProp_Sprt01_Dtl1R.$vld_dt, LotProp_Sprt01_Dtl1R.$first_gr_dt, LotProp_Sprt01_Dtl1R.$lot_seq);
				
				// ロット提案対象としたレコードを下り電文に追加
				addLotPropTgtDown(lotPropTgtL, o.down0(), o.down1());
				
				// ロット提案結果、棚ラインがnull値で返ってきたものを棚ラインNULL文字(*)に戻す
				for (LotProp_Sprt01_Dtl1R r : down0()) {
					if (r.set_stk_str_ln_flg()) {
						if (isSame(r.inpt_loc_cd(), r.stk_loc_cd())) {
							r.inpt_str_ln_cd(r.stk_str_ln_cd());
						}
					}
					if (isNull(r.inpt_str_ln_cd())) {
						r.inpt_str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}
				
			}
			
			// ロット提案対象外の行を下り電文に追加
			down0().addAll(notLotPropTgtL);
			
			//訂正レコード且つ、ロット提案でエラーとなったリストを作成
			MCList<LotProp_Sprt01_Dtl1R> errL = down0().subList(r -> MCNumber.ZERO.eq(r.getNumberNE("act_sortkey")) && r.err_flg());
			//同一在庫キーを持つ他の投入実績判定用Index
			MCIndexKey key = down0().createIndex(LotProp_Sprt01_Dtl1R.$itm_cd, LotProp_Sprt01_Dtl1R.$itm_sub1, LotProp_Sprt01_Dtl1R.$itm_sub2, 
					LotProp_Sprt01_Dtl1R.$itm_sub3, LotProp_Sprt01_Dtl1R.$quality_typ, LotProp_Sprt01_Dtl1R.$stk_insp_typ, 
					LotProp_Sprt01_Dtl1R.$gd_cd, LotProp_Sprt01_Dtl1R.$lot_no, LotProp_Sprt01_Dtl1R.$sublot_no, 
					LotProp_Sprt01_Dtl1R.$sno1, LotProp_Sprt01_Dtl1R.$sno2, LotProp_Sprt01_Dtl1R.$sno3, LotProp_Sprt01_Dtl1R.$sno4, 
					LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd, LotProp_Sprt01_Dtl1R.$stk_id_typ, LotProp_Sprt01_Dtl1R.$stk_bp_cd, 
					LotProp_Sprt01_Dtl1R.$stk_loc_cd, LotProp_Sprt01_Dtl1R.$stk_str_ln_cd);
			
			//同一在庫キーを持つ他の投入実績のエラーフラグをオンにする
			for (LotProp_Sprt01_Dtl1R errLR : errL) {
				down0().subList(key, errLR.itm_cd(), errLR.itm_sub1(), errLR.itm_sub2(), 
						errLR.itm_sub3(), errLR.getStringNE("tmp_quality_typ"), errLR.getStringNE("tmp_stk_insp_typ"), 
						errLR.getStringNE("tmp_gd_cd"), errLR.getStringNE("tmp_lot_no"), errLR.getStringNE("tmp_sublot_no"), 
						errLR.getString("tmp_sno1"), errLR.getString("tmp_sno2"), errLR.getString("tmp_sno3"), errLR.getString("tmp_sno4"), 
						errLR.getStringNE("tmp_stk_arrv_bp_cd"), errLR.getStringNE("tmp_stk_id_typ"), errLR.getStringNE("tmp_stk_bp_cd"), 
						errLR.getStringNE("tmp_inpt_loc_cd"), errLR.getStringNE("tmp_inpt_str_ln_cd")).setBoolean(LotProp_Sprt01_Dtl1R.$err_flg, true);
			}
			
			// 提案結果の数量を各数量に案分
			divideInptQty();
			
			if (!up0().act_flg()) {
				// 指図から呼ばれた場合、down0を投入予定単位で集約（資産の情報や在庫場所を無視して集約）し、down1に設定する
				addInptSchdDown();
			}
			else {
				// 実績から呼ばれた場合、ロス実績数を案分して、down2に設定する
				addLossDown();
			}
		}

		/**
		 * ロット提案対象の上り電文か否か
		 * @return
		 */
		protected boolean isLotPropTgt(LotProp_Sprt01_Dtl1R upR) {
			if (isQtyNullOrZero(upR)) {
				// 数量０またはNULLのレコードはロット提案対象外
				return false;
			}
			
			if (isNull(upR.alt_grp_cd())) {
				// 代替でない場合はロット提案対象
				return true;
			}
			else {
				// 代替の場合
				if (upR.alt_flg()) {
					// 代替グループとしてロット提案する場合はロット提案対象
					return true;
				}
				else {
					// 代替グループとしてロット提案しない場合は、代替品目指定がオンの行のみロット提案対象
					if (upR.alt_itm_fix_flg()) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		
		protected boolean isQtyNullOrZero(LotProp_Sprt01_Dtl1R upR) {
			if (upR.cont_fctr_flg()) {
				if (isNull(upR.cont_qty()) || upR.cont_qty().isZero()) {
					return true;
				}
			}
			else {
				if (isNull(upR.base_unit_qty()) || upR.base_unit_qty().isZero()) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 実績のロット提案時、すでに登録済の実績を取得し、在庫とみなす。また他勘定振替数量も在庫数量として加味する。
		 * ※登録済の投入実績を更新する場合、登録分はすでに在庫から落とされているため、在庫として復活させないと引当ができないため
		 * @return
		 */
		protected MCList<Srch_StkR> getInptAct(MCList<MST_INPT_ACT_R> dbL) {
			MCList<Srch_StkR> retL = MCList.create(Srch_StkR.class);

			// 投入実績を取得
			// 投入実績の取得処理はメソッド外に移動
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder bizRsnL_bldr = MCQueryApiBuilder.create(t);
			bizRsnL_bldr.setSelect(t.acxfr_gi_flg);
			FXUCL_MCDbcCache<MAM_BIZ_RSN_R> bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(
					bizRsnL_bldr, up1(), LotProp_Sprt01_Dtl1R.$acxfr_rsn_cd);
			
			// dbLのレコードを元に場所マスタをキャッシュ
			cacheLoc(dbL);
			
			// ロット提案前の投入実績をselectし、在庫とみなす
			// ※投入実績が取り消され、在庫が増えるため数量は正の数とする。
			for (MST_INPT_ACT_R inptR : dbL) {
				Srch_StkR stkR = Srch_StkR.create();
				stkR.itm_cd(inptR.itm_cd());
				stkR.itm_sub1(inptR.itm_sub1());
				stkR.itm_sub2(inptR.itm_sub2());
				stkR.itm_sub3(inptR.itm_sub3());
				stkR.loc_cd(inptR.inpt_loc_cd());
				stkR.str_ln_cd(inptR.inpt_str_ln_cd());
				stkR.stk_arrv_bp_cd(inptR.stk_arrv_bp_cd());
				stkR.lot_no(inptR.lot_no());
				stkR.sublot_no(inptR.sublot_no());
				stkR.sno1(inptR.sno1());
				stkR.sno2(inptR.sno2());
				stkR.sno3(inptR.sno3());
				stkR.sno4(inptR.sno4());
				stkR.pack_unit_cd(inptR.base_unit_cd());
				stkR.gd_cd(inptR.gd_cd());
				stkR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value()); //積送品区分：通常
				stkR.quality_typ(inptR.quality_typ());
				if (!MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ())) {
					MAM_LOC_R locR = _cacheLocL.getEx(inptR.inpt_loc_cd());
					if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(inptR.stk_id_typ())
								&& isSame(locR.getStringNE(MAM_BP_R.$repurc_obli_flg), "1")) {
						stkR.asst_typ(MAC_ASST_TYP.CO_PROD.value()); //資産区分：自社（生産）
					}
					else {
						stkR.asst_typ(MAC_ASST_TYP.OTH.value()); //資産区分：他社
					}
				}
				else {
					stkR.asst_typ(MAC_ASST_TYP.CO_PROD.value()); //資産区分：自社（生産）
				}
				stkR.stk_insp_typ(inptR.stk_insp_typ());
				stkR.stk_id_typ(inptR.stk_id_typ());
				stkR.stk_bp_cd(inptR.stk_bp_cd());
				stkR.pack_unit_qty(sum(inptR.base_unit_inpt_qty(), inptR.base_unit_loss_qty(), inptR.base_unit_fxd_loss_qty()));
				stkR.base_unit_qty(sum(inptR.base_unit_inpt_qty(), inptR.base_unit_loss_qty(), inptR.base_unit_fxd_loss_qty()));
				retL.add(stkR);
				
				// 単票画面でロット提案ボタンより実行された場合は、他勘定振替数量を在庫とみなさない
				// ※在庫の情報は、ロット提案の結果決まるものであるため
				if (!up0().exec_prop_btn_flg() && !isNull(inptR.acxfr_qty()) && !isNull(inptR.acxfr_rsn_cd())) {
					if (bizRsnCache.get(inptR.acxfr_rsn_cd()).acxfr_gi_flg()) {
						// 他勘定出庫の場合（既に登録済みの実績の取消のため、出庫の数量は正の数）
						Srch_StkR giR = stkR.clone();
						giR.pack_unit_qty(inptR.acxfr_qty());
						giR.base_unit_qty(inptR.acxfr_qty());
						retL.add(giR);
					}
					else {
						Srch_StkR gRR = stkR.clone();
						// 他勘定入庫の場合
						gRR.pack_unit_qty(inptR.acxfr_qty().negate());
						gRR.base_unit_qty(inptR.acxfr_qty().negate());
						retL.add(gRR);
					}
				}
			}
			
			// 上り電文のレコードを元に場所マスタをキャッシュ
			cacheLoc(up1());
			
			// 上り電文の他勘定振替数量を元に在庫を作成する
			for (LotProp_Sprt01_Dtl1R upR : up1()) {
				if (isAcXfrAdd(upR)) {
					Srch_StkR stkR = Srch_StkR.create();
					stkR.itm_cd(upR.itm_cd());
					stkR.itm_sub1(upR.itm_sub1());
					stkR.itm_sub2(upR.itm_sub2());
					stkR.itm_sub3(upR.itm_sub3());
					stkR.loc_cd(upR.inpt_loc_cd());
					stkR.str_ln_cd(upR.inpt_str_ln_cd());
					stkR.stk_arrv_bp_cd(upR.stk_arrv_bp_cd());
					stkR.lot_no(upR.lot_no());
					stkR.sublot_no(upR.sublot_no());
					stkR.sno1(upR.rqst_sno1());
					stkR.sno2(upR.rqst_sno2());
					stkR.sno3(upR.rqst_sno3());
					stkR.sno4(upR.rqst_sno4());
					stkR.pack_unit_cd(upR.base_unit_cd());
					stkR.gd_cd(upR.gd_cd());
					stkR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value()); //積送品区分：通常
					stkR.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分：良品
					if (!MSC_STK_ID_TYP.isCOSTK(upR.stk_id_typ())) {
						MAM_LOC_R locR = _cacheLocL.getEx(upR.inpt_loc_cd());
						if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(upR.stk_id_typ())
									&& isSame(locR.getStringNE(MAM_BP_R.$repurc_obli_flg), "1")) {
							stkR.asst_typ(MAC_ASST_TYP.CO_PROD.value()); //資産区分：自社（生産）
						}
						else {
							stkR.asst_typ(MAC_ASST_TYP.OTH.value()); //資産区分：他社
						}
					}
					else {
						stkR.asst_typ(MAC_ASST_TYP.CO_PROD.value()); //資産区分：自社（生産）
					}
					stkR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分：検査済
					stkR.stk_id_typ(upR.stk_id_typ());
					stkR.stk_bp_cd(upR.stk_bp_cd());
					
					if (bizRsnCache.get(upR.acxfr_rsn_cd()).acxfr_gi_flg()) {
						// 他勘定出庫の場合（これから登録する数量なので、出庫の数量を反転する）
						stkR.pack_unit_qty(upR.acxfr_qty().negate());
						stkR.base_unit_qty(upR.acxfr_qty().negate());
						retL.add(stkR);
					}
					else {
						// 他勘定入庫の場合
						stkR.pack_unit_qty(upR.acxfr_qty());
						stkR.base_unit_qty(upR.acxfr_qty());
						retL.add(stkR);
					}
				}
			}
			return retL;
		}
		
		protected boolean isAcXfrAdd(LotProp_Sprt01_Dtl1R upR) {
			if (!up0().exec_prop_btn_flg()) {
				if (!isNull(upR.acxfr_qty()) && !isNull(upR.acxfr_rsn_cd())
						&& !isNull(upR.stk_id_typ()) && !isNull(upR.stk_bp_cd())
						&& !isNull(upR.stk_arrv_bp_cd())) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 上り電文の投入予定から引当管理サービス（ロット提案）へのマッピング
		 * @return
		 */
		protected Map_Srch_TgtR_LotProp_Sprt01_Dtl1R<Srch_TgtR,LotProp_Sprt01_Dtl1R> createMap_Srch_TgtR_LotProp_Sprt01_Dtl1R() {
			return new Map_Srch_TgtR_LotProp_Sprt01_Dtl1R<Srch_TgtR, LotProp_Sprt01_Dtl1R>();
		}

		public class Map_Srch_TgtR_LotProp_Sprt01_Dtl1R<D extends Srch_TgtR, S extends LotProp_Sprt01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, LotProp_Sprt01_Dtl1R.$peg_no);
				addColumnPathMap(Srch_TgtR.$inpt_schd_dt, LotProp_Sprt01_Dtl1R.$inpt_dt);
				addColumnPathMap(Srch_TgtR.$itm_cd, LotProp_Sprt01_Dtl1R.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, LotProp_Sprt01_Dtl1R.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, LotProp_Sprt01_Dtl1R.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, LotProp_Sprt01_Dtl1R.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, LotProp_Sprt01_Dtl1R.$ver_no);
				addColumnPathMap(Srch_TgtR.$alt_flg, LotProp_Sprt01_Dtl1R.$alt_flg);
				addColumnPathMap(Srch_TgtR.$alt_grp_cd, LotProp_Sprt01_Dtl1R.$alt_grp_cd);
				addColumnPathMap(Srch_TgtR.$alt_grp_seq, LotProp_Sprt01_Dtl1R.$alt_grp_seq);
				addColumnPathMap(Srch_TgtR.$oper_inst_no, LotProp_Sprt01_Dtl1R.$oper_inst_no);
				addColumnPathMap(Srch_TgtR.$alt_itm_typ, LotProp_Sprt01_Dtl1R.$alt_itm_typ);
				addColumnPathMap(Srch_TgtR.$alt_alloc_prio, LotProp_Sprt01_Dtl1R.$alt_alloc_prio);
				// 入庫場所、入庫棚・ラインは設定不要（設定するとその場所にある在庫は提案されないようになるが、投入品に対しては特に考慮する必要はない）
				addColumnPathMap(Srch_TgtR.$gd_cd, LotProp_Sprt01_Dtl1R.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, LotProp_Sprt01_Dtl1R.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, LotProp_Sprt01_Dtl1R.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1_null_flg, LotProp_Sprt01_Dtl1R.$sno1_null_flg);
				addColumnPathMap(Srch_TgtR.$sno2_null_flg, LotProp_Sprt01_Dtl1R.$sno2_null_flg);
				addColumnPathMap(Srch_TgtR.$sno3_null_flg, LotProp_Sprt01_Dtl1R.$sno3_null_flg);
				addColumnPathMap(Srch_TgtR.$sno4_null_flg, LotProp_Sprt01_Dtl1R.$sno4_null_flg);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, LotProp_Sprt01_Dtl1R.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, LotProp_Sprt01_Dtl1R.$base_unit_qty);
				addColumnPathMap(Srch_TgtR.$cont_qty, LotProp_Sprt01_Dtl1R.$cont_qty);
				addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, LotProp_Sprt01_Dtl1R.$not_lot_fix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, LotProp_Sprt01_Dtl1R.$inpt_dt); //有効期限ＦＲＯＭには投入予定日を設定
				addColumnPathMap(Srch_TgtR.$cont_fctr_flg, LotProp_Sprt01_Dtl1R.$cont_fctr_flg);
				addColumnPathMap(Srch_TgtR.$std_cont_fctr, LotProp_Sprt01_Dtl1R.$std_cont_fctr);
				addColumnPathMap(Srch_TgtR.$cont_fctr_rnd_typ, LotProp_Sprt01_Dtl1R.$cont_fctr_rnd_typ);
				addColumnPathMap(Srch_TgtR.$cont_fctr_dec_place, LotProp_Sprt01_Dtl1R.$cont_fctr_dec_place);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分は投入
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は良品

				// 手配ＮＯがnullの場合はnull文字を補完
				dest.sno1(nvl(src.rqst_sno1(), MAC_STR.NULL_VAL.value()));
				dest.sno2(nvl(src.rqst_sno2(), MAC_STR.NULL_VAL.value()));
				dest.sno3(nvl(src.rqst_sno3(), MAC_STR.NULL_VAL.value()));
				dest.sno4(nvl(src.rqst_sno4(), MAC_STR.NULL_VAL.value()));

				// ロット混在不可、サブロット混在不可ＦＬＧ
				// ロット混在、サブロット混在ＦＬＧを反転
				dest.not_lot_mix_flg(!src.lot_mix_flg());
				dest.not_sublot_mix_flg(!src.sublot_mix_flg());

				// 実績時
				if (up0().act_flg()) {
					// 在庫提案ＦＬＧの設定
					dest.stk_flg(getActStkFlg(src));
					// 在庫優先引当ＦＬＧの設定
					if (!dest.stk_flg()) {
						// 在庫提案FLGがfalseの場合は、入庫予定を参照する必要があるため在庫優先引当FLGはfalse
						dest.stk_alloc_flg(false);
					}
					else {
						dest.stk_alloc_flg(getActStkAllocFlg(src));
					}
					// 投入場所・棚ラインはnull（同一製造場所Ｇ、経路の在庫を引当しない）
					dest.inpt_loc_cd(null);
					dest.inpt_str_ln_cd(null);
					// 出庫場所・棚ラインに投入場所を設定（投入場所の在庫のみを引当する）
					dest.gi_loc_cd(src.inpt_loc_cd());
					dest.gi_str_ln_cd(src.inpt_str_ln_cd());
					// 在庫識別区分・在庫取引先・在庫着荷先の設定
					dest.stk_id_typ(src.stk_id_typ());
					dest.stk_bp_cd(src.stk_bp_cd());
					dest.gi_stk_arrv_bp_cd(src.stk_arrv_bp_cd());
					
					dest.pack_unit_qty(src.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
				// 指図時
				else {
					// 在庫提案ＦＬＧはfalse
					dest.stk_flg(false);
					// 在庫優先引当ＦＬＧはfalse
					dest.stk_alloc_flg(false);
					// 投入場所・棚ラインに投入場所を設定（同一製造場所Ｇ、経路の在庫を引当する）
					dest.inpt_loc_cd(src.inpt_loc_cd());
					dest.inpt_str_ln_cd(src.inpt_str_ln_cd());
					// 出庫場所・棚ラインはnull（投入場所の在庫のみの引当はしない）
					dest.gi_loc_cd(null);
					dest.gi_str_ln_cd(null);
				}
				// 製造実績登録画面での登録時または投入実績受信IFデータの取込時、「期限チェックしない」がオンの場合は期限を無視する
				if (src.not_pd_chk_flg()) {
					dest.vld_dt_fr(null);
				}
			}
		}
		
		/**
		 * 実績時の在庫優先引当フラグを取得します。
		 * @param r
		 * @return
		 */
		protected boolean getActStkAllocFlg(LotProp_Sprt01_Dtl1R r) {
			// 在庫優先引当フラグがオンであれば、引当可能数計算が不要なので、引当処理は入庫予定・出庫予定を取得しない。
			// よってパフォーマンス上のメリットがあるため、以下の条件にマッチする場合は、在庫引当優先フラグをオンにする（OR 条件）
			// １．自分自身の投入予定の引当フラグがオン（指図時に引当済）の場合
			//   ※自分自身以外の出庫予定が存在しても無視して使用するため、多めに投入すると他の出庫予定が在庫不足となる可能性があるが、パフォーマンスを優先する
			//
			// ２．ＢＯＭマスタの引当制御区分が「引当対象外」の場合
			//   ※同じ品目でもＢＯＭの設定によって引当対象／対象外を混在させることができるため、自分自身以外の出庫予定を無視して使用してしまう可能性がある
			//   この振る舞いがマッチしない場合は、品目マスタの出庫引当確認フラグをオンにする想定
			//
			
			// １．引当フラグ
			if (r.alloc_flg()) {
				return true;
			}
			
			// ２．引当制御区分
			if (MAC_ALLOC_CTL_TYP.isNO_ALLOC(r.alloc_ctl_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 実績時の在庫提案FLGを取得します。
		 * @param r
		 * @return
		 */
		protected boolean getActStkFlg(LotProp_Sprt01_Dtl1R r) {
			// ・マイナス在庫を許容する場合、在庫だけでなく投入場所への入庫予定も加味する（在庫しか見ない場合、マイナス在庫が発生しないことになってしまうので）
			// ・マイナス在庫が発生した場合、引当処理やMRPはマイナス在庫分を出庫予定とみなして、使用可能在庫を計算する
			// ※マイナス在庫が発生したことによって、その投入予定の引当がはがれてはいけないので
			// ・マイナス在庫を使用するのは以下のような場合を想定している
			// 「実際に現場には在庫が存在するが、システム上現場への払出の入力が遅れていることが原因で、投入実績の入力ができないということを避けたい」
			
			// 上記を踏まえ、入庫予定が存在しない場合は、マイナス在庫を許可する品目であったとしてもエラーとする。
			// ※なお、仮に入庫予定を参照せずにマイナス在庫を発生させてしまった場合、マイナス在庫を元にしたオーダをMRPが発生させる可能性があるが、
			// 実際に現場に在庫があるため、投入しているのであり、マイナス在庫を元にしたオーダが発生するのは適切ではない
			MAM_ITM_R itmR = _cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (itmR.minus_stk_flg()) {
				return false;
			}
			return true;
		}

		/**
		 * 上り電文の出来高・副産品在庫情報から引当管理サービス（ロット提案）へのマッピング
		 * @return
		 */
		protected Map_Srch_StkR_LotProp_Sprt01_Dtl3R<Srch_StkR,LotProp_Sprt01_Dtl3R> createMap_Srch_StkR_LotProp_Sprt01_Dtl3R() {
			return new Map_Srch_StkR_LotProp_Sprt01_Dtl3R<Srch_StkR, LotProp_Sprt01_Dtl3R>();
		}

		public class Map_Srch_StkR_LotProp_Sprt01_Dtl3R<D extends Srch_StkR, S extends LotProp_Sprt01_Dtl3R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_StkR.$itm_cd, LotProp_Sprt01_Dtl3R.$itm_cd);
				addColumnPathMap(Srch_StkR.$itm_sub1, LotProp_Sprt01_Dtl3R.$itm_sub1);
				addColumnPathMap(Srch_StkR.$itm_sub2, LotProp_Sprt01_Dtl3R.$itm_sub2);
				addColumnPathMap(Srch_StkR.$itm_sub3, LotProp_Sprt01_Dtl3R.$itm_sub3);
				addColumnPathMap(Srch_StkR.$loc_cd, LotProp_Sprt01_Dtl3R.$loc_cd);
				addColumnPathMap(Srch_StkR.$str_ln_cd, LotProp_Sprt01_Dtl3R.$str_ln_cd);
				addColumnPathMap(Srch_StkR.$stk_arrv_bp_cd, LotProp_Sprt01_Dtl3R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_StkR.$lot_no, LotProp_Sprt01_Dtl3R.$lot_no);
				addColumnPathMap(Srch_StkR.$sublot_no, LotProp_Sprt01_Dtl3R.$sublot_no);
				addColumnPathMap(Srch_StkR.$sno1, LotProp_Sprt01_Dtl3R.$sno1);
				addColumnPathMap(Srch_StkR.$sno2, LotProp_Sprt01_Dtl3R.$sno2);
				addColumnPathMap(Srch_StkR.$sno3, LotProp_Sprt01_Dtl3R.$sno3);
				addColumnPathMap(Srch_StkR.$sno4, LotProp_Sprt01_Dtl3R.$sno4);
				addColumnPathMap(Srch_StkR.$quality_typ, LotProp_Sprt01_Dtl3R.$quality_typ);
				addColumnPathMap(Srch_StkR.$stk_id_typ, LotProp_Sprt01_Dtl3R.$stk_id_typ);
				addColumnPathMap(Srch_StkR.$stk_bp_cd, LotProp_Sprt01_Dtl3R.$stk_bp_cd);
				addColumnPathMap(Srch_StkR.$gd_cd, LotProp_Sprt01_Dtl3R.$gd_cd);
				addColumnPathMap(Srch_StkR.$base_unit_qty, LotProp_Sprt01_Dtl3R.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 荷姿ＦＬＧがオンの場合は取引単位、オフの場合は基準単位を荷姿に設定
				if (src.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(src.base_unit_cd());
					dest.pack_unit_qty(src.base_unit_qty());
				}
				
				// 以下の項目は固定値を設定
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
		}

		/**
		 * up1のpeg_noに対するインデックスキー
		 */
		MCIndexKey _up1Key;
		
		/**
		 * ロット提案結果を下り電文に追加する
		 * @param lotPropTgtL ロット提案対象の上り電文
		 * @param allocL ロット提案で一部数量でも引きあたった行（代替と代替でない場合の両方が格納されている）
		 * @param notAllocAltL 代替で一部数量でも未引当数量が残った行
		 */
		protected void addLotPropTgtDown(MCList<LotProp_Sprt01_Dtl1R> lotPropTgtL,
				MCList<Srch_RsltR> allocL, MCList<Alt_UnAvlR> notAllocAltL) {
			
			MCList<LotProp_Sprt01_Dtl1R> nrmlUpL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			MCList<LotProp_Sprt01_Dtl1R> altUpL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			// 代替としてロット提案した上り電文と通常でロット提案した上り電文に分別
			for (LotProp_Sprt01_Dtl1R upR : lotPropTgtL) {
				if (upR.alt_flg()) {
					altUpL.add(upR);
				}
				else {
					nrmlUpL.add(upR);
				}
			}
			
			// up1()のpeg_noに対するインデックスを作成
			// ※addNrmlDown、addAltDownから呼ばれるcompDownByUpの中で使用するため、ここで定義しておく
			_up1Key = up1().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
			
			// 代替以外のロット提案対象行を下り電文に追加
			addNrmlDown(nrmlUpL, allocL);
			
			// 代替のロット提案対象行を下り電文に追加
			addAltDown(altUpL, allocL, notAllocAltL);
			
			// 追加ＦＬＧの設定（ロット割れなどで上り電文が複数行になった場合にtrueを設定する）
			setAddFlg(down0(), LotProp_Sprt01_Dtl1R.$peg_no, LotProp_Sprt01_Dtl1R.$add_flg);
		}
		
		/**
		 * 代替以外のロット提案対象行を下り電文に追加
		 * @param nrmlUpL
		 * @param allocL
		 */
		protected void addNrmlDown(MCList<LotProp_Sprt01_Dtl1R> nrmlUpL,
				MCList<Srch_RsltR> allocL) {
			MCIndexKey allocIdxKey = allocL.createIndex(Srch_RsltR.$peg_no);
			MCIndexKey allocIdxUpdKey = allocL.createIndex(Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, 
					Srch_RsltR.$itm_sub3, Srch_RsltR.$quality_typ, Srch_RsltR.$stk_insp_typ, 
					Srch_RsltR.$gd_cd, Srch_RsltR.$lot_no, Srch_RsltR.$sublot_no, 
					Srch_RsltR.$sno1, Srch_RsltR.$sno2, Srch_RsltR.$sno3, Srch_RsltR.$sno4, 
					Srch_RsltR.$stk_arrv_bp_cd, Srch_RsltR.$stk_id_typ, Srch_RsltR.$stk_bp_cd, 
					Srch_RsltR.$stk_loc_cd, Srch_RsltR.$stk_str_ln_cd, Srch_RsltR.$oper_inst_no);
			MCList<MST_INPT_ACT_R> dbL = MCList.create(MST_INPT_ACT_R.class);
			dbSelectKey("MSBCL6040_MST_INPT_ACT_S02", dbL,
					MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T")),
					up1().groupBy(LotProp_Sprt01_Dtl1R.$inpt_act_no));
			MCIndexKey idx = dbL.createIndex(LotProp_Sprt01_Dtl1R.$inpt_act_no);
			
			for (LotProp_Sprt01_Dtl1R upR : nrmlUpL) {
				MCList<Srch_RsltR> allocSubL = allocL.subList(allocIdxKey, upR.peg_no());
				MST_INPT_ACT_R dbR = dbL.getFirst(idx, upR.inpt_act_no());
				if (!isNull(dbR)) {
					MCList<Srch_RsltR> allocUpdSubL = allocL.subList(allocIdxUpdKey, upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), 
							upR.itm_sub3(), upR.getStringNE("tmp_quality_typ"), upR.getStringNE("tmp_stk_insp_typ"), 
							upR.getStringNE("tmp_gd_cd"), upR.getStringNE("tmp_lot_no"), upR.getStringNE("tmp_sublot_no"), 
							upR.getString("tmp_sno1"), upR.getString("tmp_sno2"), upR.getString("tmp_sno3"), upR.getString("tmp_sno4"), 
							upR.getStringNE("tmp_stk_arrv_bp_cd"), upR.getStringNE("tmp_stk_id_typ"), upR.getStringNE("tmp_stk_bp_cd"), 
							upR.getStringNE("tmp_inpt_loc_cd"), upR.getStringNE("tmp_inpt_str_ln_cd"), upR.oper_inst_no());
					if (!allocUpdSubL.isEmpty()) {
						if (allocUpdSubL.size() == 1) {
							if (!isSame(upR.peg_no(), allocUpdSubL.get(0).peg_no())) {
								allocSubL = allocUpdSubL;
							}
						}
						else {
							MCList<Srch_RsltR> tgtL = MCList.create(Srch_RsltR.create());
							for (Srch_RsltR allocUpdSubR : allocUpdSubL) {
								if (isSame(upR.peg_no(), allocUpdSubR.peg_no())) {
									tgtL.add(allocUpdSubR);
								}
							}
							if (!tgtL.isEmpty()) {
								allocSubL = tgtL;
							}
						}
					}
				}
				if (allocSubL.isEmpty()) {
					// 引当結果がない場合
					LotProp_Sprt01_Dtl1R downR = upR.clone();
					editAllocFailVal(downR);
					down0().add(downR);
				}
				else {
					// 引当結果が存在する場合
					MCNumber notAllocQty = MCNumber.ZERO; // 未引当栖量
					if (upR.cont_fctr_flg()) {
						// 有効成分対象の場合は有効成分で計算
						notAllocQty = upR.cont_qty().subtract(allocSubL.sum(Srch_RsltR.$cont_qty));
					}
					else {
						// 有効成分対象外の場合は基準数量で計算
						notAllocQty = upR.base_unit_qty().subtract(allocSubL.sum(Srch_RsltR.$base_unit_qty));
					}
					
					// 一部引当（未引当数＞０）の場合
					if (notAllocQty.gt(MCNumber.ZERO)) {
						// 単票画面からロット提案ボタンから実行された場合は、一部引当の行と未引当行を追加
						// ※単票や一覧画面の登録処理からの実行の場合は、引当できなかったものとみなす
						// ＜以下、理由＞
						// 単票のロット提案ボタンの場合は、在庫不足によって投入予定が割れたことを登録前に確認できるが
						// 単票や一覧画面の登録処理からの実行の場合は確認できないため。
						// ※在庫や入庫予定の計上タイミングによって、ロットが割れたわけでもないのに、投入予定や投入実績が無駄に割れることは避けたい
						if (up0().exec_prop_btn_flg()) {
							// ロット提案ボタンから実行された場合

							// 一部引当の行を下り電文に追加
							MCList<LotProp_Sprt01_Dtl1R> allocDownL = MCList.create(LotProp_Sprt01_Dtl1R.class); 
							addAll(allocDownL, allocSubL, createMap_LotProp_Sprt01_Dtl1R_Srch_RsltR());
							compDownByUp(allocDownL);
							down0().addAll(allocDownL);

							// 未引当の行を下り電文に追加（数量は未引当数量で上書きする）
							LotProp_Sprt01_Dtl1R downR = upR.clone();
							if (downR.cont_fctr_flg()) {
								// 有効成分対象の場合、有効成分に未引当数を設定し、基準数量は有効成分を換算
								downR.cont_qty(notAllocQty);
								if (allocSubL.subList(r -> (!isSame(r.act_cont_fctr(), r.std_cont_fctr()))).isEmpty()) {
									downR.base_unit_qty(upR.base_unit_qty().subtract(allocSubL.sum(Srch_RsltR.$base_unit_qty)));
								}
								else {
									downR.base_unit_qty(convToBaseUnitFromContFctrUnit(
											notAllocQty, downR.std_cont_fctr(),
											downR.base_unit_dec_place(),
											downR.base_unit_rnd_typ()));
								}
							}
							else {
								// 有効成分対象外の場合、基準数量に未引当数を設定
								downR.base_unit_qty(notAllocQty);
								downR.cont_qty(null);
							}
							editAllocFailVal(downR);
							down0().add(downR);
						}
						else {
							// ロット提案ボタン以外から実行された場合
							
							// 全数未引当として下り電文に追加
							LotProp_Sprt01_Dtl1R downR = upR.clone();
							editAllocFailVal(downR);
							down0().add(downR);
						}

					}
					else {
						// 全て引当できた場合
						MCList<LotProp_Sprt01_Dtl1R> allocDownL = MCList.create(LotProp_Sprt01_Dtl1R.class); 
						addAll(allocDownL, allocSubL, createMap_LotProp_Sprt01_Dtl1R_Srch_RsltR());
						allocDownL.setNumber(LotProp_Sprt01_Dtl1R.$peg_no, upR.peg_no());
						compDownByUp(allocDownL);
						down0().addAll(allocDownL);
					}
				}
			}
		}
		
		protected void editAllocFailVal(LotProp_Sprt01_Dtl1R downR) {
			downR.oper_inst_no(downR.up_oper_inst_no());
			if (!up0().exec_prop_btn_flg()) {
				downR.alloc_flg(false);
				downR.not_lot_fix_flg(true);
			}
			clearLotVal(downR);
			downR.err_flg(true);
		}
		
		protected void clearLotVal(LotProp_Sprt01_Dtl1R downR) {
			downR.lot_no(null);
			downR.sublot_no(null);
			downR.act_cont_fctr(null);
			downR.vld_dt(null);
			downR.first_gr_dt(null);
			downR.lot_seq(null);
		}
		
		/**
		 * 上り電文の内容でロット提案結果から作成した下り電文を補完する
		 */
		protected void compDownByUp(MCList<LotProp_Sprt01_Dtl1R> allocDownL) {
			// ヘッダ紐付けＮＯ、小数部有効桁数、代替品目指定フラグ、有効成分対象フラグを補完
			for (LotProp_Sprt01_Dtl1R downR : allocDownL) {
				LotProp_Sprt01_Dtl1R upR = up1().getFirst(_up1Key, downR.peg_no());
				if (isNull(upR)) {
					continue;
				}
				downR.hdr_peg_no(upR.hdr_peg_no());
				downR.oper_inst_no(upR.up_oper_inst_no());
				downR.alloc_flg(upR.alloc_flg());
				downR.base_unit_dec_place(upR.base_unit_dec_place());
				downR.base_unit_rnd_typ(upR.base_unit_rnd_typ());
				downR.cont_fctr_flg(upR.cont_fctr_flg());
				downR.cont_fctr_dec_place(upR.cont_fctr_dec_place());
				downR.set_stk_str_ln_flg(upR.set_stk_str_ln_flg());
			}
		}
		
		/**
		 * 代替のロット提案対象行を下り電文に追加
		 * @param nrmlUpL
		 * @param allocL
		 */
		protected void addAltDown(MCList<LotProp_Sprt01_Dtl1R> altUpL,
				MCList<Srch_RsltR> allocL, MCList<Alt_UnAvlR> notAllocAltL) {
			
			MCIndexKey notAllocIdxKey = notAllocAltL.createIndex(Alt_UnAvlR.$alt_grp_cd,
					Alt_UnAvlR.$alt_grp_seq, Alt_UnAvlR.$oper_inst_no);
			MCIndexKey allocIdxKey = allocL.createIndex(Srch_RsltR.$peg_no);
			
			for (LotProp_Sprt01_Dtl1R upR : altUpL) {
				// 工程、代替Ｇ、代替Ｇ連番単位で、一部でも未引当の代替品が存在する場合、未引当行として下り電文を追加する
				// ※ロット提案ボタンから実行する場合であっても、一部引当の状態にはしない。
				// ＜以下、理由＞
				// 代替のロット提案には、引当だけでなく代替品目を決定する意味合いもあるため。
				// 混在不可の場合、古いロットで一部引き当てた後に、後から新しいロットが登録された場合は、新しいロットに切り替わるべきだが、
				// 一度引当を行ってしまうと、代替グループとしての必要数が分からなくなってしまうため、再展開なしでは新しいロットに切替えることができない。
				// そのため、一部引当をするような状態とはせず、全数満たした場合のみ代替品目を決定する仕様とする
				if (!isNull(notAllocAltL.getFirst(notAllocIdxKey, upR.alt_grp_cd(),
						upR.alt_grp_seq(), upR.oper_inst_no()))) {
					// 代替グループとして未引当がある場合
					
					// 全数未引当として下り電文に追加
					LotProp_Sprt01_Dtl1R downR = upR.clone();
					editAllocFailVal(downR);
					down0().add(downR);
				}
				else {
					// 代替グループとして未引当がない場合
					
					// pegNoでsubListする
					MCList<Srch_RsltR> allocSubL = allocL.subList(allocIdxKey, upR.peg_no());
					if (!allocSubL.isEmpty()) {
						// 選択された代替品目の場合
						// ロット提案結果を下り電文に設定する
						MCList<LotProp_Sprt01_Dtl1R> allocDownL = MCList.create(LotProp_Sprt01_Dtl1R.class); 
						addAll(allocDownL, allocSubL, createMap_LotProp_Sprt01_Dtl1R_Srch_RsltR());
						compDownByUp(allocDownL);
						down0().addAll(allocDownL);
					}
					else {
						// 選択されなかった代替品目の場合
						// ※peg_noでsubListして存在しないということは、選択されなかった代替品目ということなので、
						// 数量を0として、代替品目指定ＦＬＧ、引当ＦＬＧをfalseにする（err_flgはtrueにしない）

						LotProp_Sprt01_Dtl1R downR = upR.clone();
						downR.oper_inst_no(upR.up_oper_inst_no());
						downR.base_unit_qty(MCNumber.ZERO);
						if (downR.cont_fctr_flg()) {
							downR.cont_qty(MCNumber.ZERO);
						}
						downR.alt_itm_fix_flg(false);
						downR.not_lot_fix_flg(true);
						downR.alloc_flg(false);
						clearLotVal(downR);
						down0().add(downR);
					}
				}
			}
		}
		
		protected <T extends MCRow> void setAddFlg(MCList<T> downL, String pegNoCol, String addFlgCol) {
			// 同一紐付けＮＯで複数のレコードが存在する場合、２件目以降の追加フラグをオンにする
			for (MCList<T> l : downL.groupList(pegNoCol)) {
				if (l.size() > 1) {
					for (MCRow r : l) {
						if (l.indexOf(r) > 0) {
							r.setBoolean(addFlgCol, true);
						}
					}
				}
			}
		}
		
		/**
		 * 引当管理サービスのロット提案から下り電文へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl1R_Srch_RsltR<LotProp_Sprt01_Dtl1R,Srch_RsltR> createMap_LotProp_Sprt01_Dtl1R_Srch_RsltR() {
			return new Map_LotProp_Sprt01_Dtl1R_Srch_RsltR<LotProp_Sprt01_Dtl1R, Srch_RsltR>();
		}

		public class Map_LotProp_Sprt01_Dtl1R_Srch_RsltR<D extends LotProp_Sprt01_Dtl1R, S extends Srch_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$peg_no, Srch_RsltR.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_cd, Srch_RsltR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub1, Srch_RsltR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub2, Srch_RsltR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub3, Srch_RsltR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$ver_no, Srch_RsltR.$ver_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_cd, Srch_RsltR.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_seq, Srch_RsltR.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_inst_no, Srch_RsltR.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_loc_cd, Srch_RsltR.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd, Srch_RsltR.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_sppl_cd, Srch_RsltR.$inpt_sppl_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$quality_typ, Srch_RsltR.$quality_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_insp_typ, Srch_RsltR.$stk_insp_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_cd, Srch_RsltR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_nm, Srch_RsltR.$gd_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_no, Srch_RsltR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_no, Srch_RsltR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno1, Srch_RsltR.$rqst_sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1_null_flg, Srch_RsltR.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno2, Srch_RsltR.$rqst_sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2_null_flg, Srch_RsltR.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno3, Srch_RsltR.$rqst_sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3_null_flg, Srch_RsltR.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno4, Srch_RsltR.$rqst_sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4_null_flg, Srch_RsltR.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1, Srch_RsltR.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2, Srch_RsltR.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3, Srch_RsltR.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4, Srch_RsltR.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_qty, Srch_RsltR.$base_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_qty, Srch_RsltR.$cont_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$vld_dt, Srch_RsltR.$vld_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$first_gr_dt, Srch_RsltR.$first_gr_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_seq, Srch_RsltR.$lot_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_cd, Srch_RsltR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$act_cont_fctr, Srch_RsltR.$act_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd, Srch_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_nm, Srch_RsltR.$stk_arrv_bp_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_id_typ, Srch_RsltR.$stk_id_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_nm, Srch_RsltR.$stk_bp_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_loc_cd, Srch_RsltR.$stk_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gr_loc_cd, Srch_RsltR.$gr_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gr_str_ln_cd, Srch_RsltR.$gr_str_ln_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.add_flg(false);
				dest.err_flg(false);
				// 代替品の場合、引当結果が返ってきたら代替品目指定フラグをオンにする
				if (!isNull(src.alt_grp_cd())) {
					dest.alt_itm_fix_flg(true);
				}
				else {
					dest.alt_itm_fix_flg(false);
				}
			}
		}
		
		/**
		 * 投入予定単位にロット提案結果を集約し、down1に設定する
		 */
		protected void addInptSchdDown() {
			// 集約するためのキー
			String[] gbKey = {
					LotProp_Sprt01_Dtl1R.$oper_peg_no,
					LotProp_Sprt01_Dtl1R.$peg_no,
					LotProp_Sprt01_Dtl1R.$err_flg,
					LotProp_Sprt01_Dtl1R.$inpt_schd_no,
					LotProp_Sprt01_Dtl1R.$div_seq,
					LotProp_Sprt01_Dtl1R.$inpt_dt,
					LotProp_Sprt01_Dtl1R.$itm_cd,
					LotProp_Sprt01_Dtl1R.$itm_sub1,
					LotProp_Sprt01_Dtl1R.$itm_sub2,
					LotProp_Sprt01_Dtl1R.$itm_sub3,
					LotProp_Sprt01_Dtl1R.$ver_no,
					LotProp_Sprt01_Dtl1R.$alt_grp_cd,
					LotProp_Sprt01_Dtl1R.$alt_grp_seq,
					LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg,
					LotProp_Sprt01_Dtl1R.$oper_inst_no,
					LotProp_Sprt01_Dtl1R.$inpt_loc_cd,
					LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd,
					LotProp_Sprt01_Dtl1R.$inpt_sppl_cd,
					LotProp_Sprt01_Dtl1R.$quality_typ,
					LotProp_Sprt01_Dtl1R.$stk_insp_typ,
					LotProp_Sprt01_Dtl1R.$gd_cd,
					LotProp_Sprt01_Dtl1R.$gd_nm,
					LotProp_Sprt01_Dtl1R.$lot_no,
					LotProp_Sprt01_Dtl1R.$sublot_no,
					LotProp_Sprt01_Dtl1R.$rqst_sno1,
					LotProp_Sprt01_Dtl1R.$sno1_null_flg,
					LotProp_Sprt01_Dtl1R.$rqst_sno2,
					LotProp_Sprt01_Dtl1R.$sno2_null_flg,
					LotProp_Sprt01_Dtl1R.$rqst_sno3,
					LotProp_Sprt01_Dtl1R.$sno3_null_flg,
					LotProp_Sprt01_Dtl1R.$rqst_sno4,
					LotProp_Sprt01_Dtl1R.$sno4_null_flg,
					LotProp_Sprt01_Dtl1R.$sno1,
					LotProp_Sprt01_Dtl1R.$sno2,
					LotProp_Sprt01_Dtl1R.$sno3,
					LotProp_Sprt01_Dtl1R.$sno4,
					LotProp_Sprt01_Dtl1R.$not_lot_fix_flg,
					LotProp_Sprt01_Dtl1R.$vld_dt,
					LotProp_Sprt01_Dtl1R.$first_gr_dt,
					LotProp_Sprt01_Dtl1R.$lot_seq,
					LotProp_Sprt01_Dtl1R.$base_unit_cd,
					LotProp_Sprt01_Dtl1R.$act_cont_fctr,
					LotProp_Sprt01_Dtl1R.$alloc_flg
			};
			
			// 集約キーでロット提案結果をグループ化
			MCNumber pegNo = MCNumber.ZERO;
			for (MCList<LotProp_Sprt01_Dtl1R> gbL : down0().groupList(gbKey)) {
				LotProp_Sprt01_Dtl2R gbR = LotProp_Sprt01_Dtl2R.create();
				copy(gbR, gbL.get(0), createMap_LotProp_Sprt01_Dtl2R_LotProp_Sprt01_Dtl1R());
				gbR.base_unit_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$base_unit_qty));
				gbR.inpt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$inpt_qty));
				gbR.rqmt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$rqmt_qty));
				gbR.fxd_rqmt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty));
				gbR.cont_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$cont_qty));
				gbR.cont_inpt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$cont_inpt_qty));
				gbR.cont_rqmt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$cont_rqmt_qty));
				gbR.cont_fxd_rqmt_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty));
				gbR.not_alloc_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$not_alloc_qty));
				gbR.not_alloc_cont_qty(gbL.sum(LotProp_Sprt01_Dtl1R.$not_alloc_cont_qty));
				gbR.sum_peg_no(pegNo);
				down1().add(gbR);
				gbL.setNumber(LotProp_Sprt01_Dtl1R.$sum_peg_no, pegNo);
				pegNo = pegNo.add(MCNumber.ONE);
			}
			
			down1().sort(SortType.ASC, LotProp_Sprt01_Dtl2R.$peg_no, LotProp_Sprt01_Dtl2R.$add_flg);
			
			// 追加ＦＬＧの設定（ロット割れなどで上り電文が複数行になった場合にtrueを設定する）
			setAddFlg(down1(), LotProp_Sprt01_Dtl2R.$peg_no, LotProp_Sprt01_Dtl2R.$add_flg);
			
			down1().sort(SortType.ASC, LotProp_Sprt01_Dtl2R.$sum_peg_no);
		}
		
		/**
		 * 上り電文のロット提案対象ではない数量（投入数量、必要数量、固定必要数量、有効成分の左記項目）について、ロット提案結果に基づいて案分する
		 */
		protected void divideInptQty() {
			MCIndexKey downKey = down0().createIndex(LotProp_Sprt01_Dtl1R.$peg_no);
		
			for (LotProp_Sprt01_Dtl1R up1R : up1()) {
				// 上り電文の紐付けＮＯからロット提案結果を抽出
				MCList<LotProp_Sprt01_Dtl1R> retSubL = down0().subList(downKey, up1R.peg_no());
		
				// 存在しない場合は何もしない
				if (retSubL.isEmpty()) {
					continue;
				}
				
				if (up0().act_flg()) {
					// 実績時
					// 有効成分対象の場合
					if (up1R.cont_fctr_flg()) {
						// 投入数量、ロス数量、固定ロス数量の算出
						calcLossQty(retSubL, up1R.cont_inpt_qty(), up1R.cont_loss_qty(),
								up1R.cont_fxd_loss_qty(), LotProp_Sprt01_Dtl1R.$cont_qty,
								LotProp_Sprt01_Dtl1R.$cont_inpt_qty,
								LotProp_Sprt01_Dtl1R.$cont_loss_qty,
								LotProp_Sprt01_Dtl1R.$cont_fxd_loss_qty);
						// 有効成分から基準数を換算
						convContToBaseListAct(retSubL, up1R);
					}
					else {
						// 投入数量、ロス数量、固定ロス数量の算出
						calcLossQty(retSubL, up1R.inpt_qty(), up1R.loss_qty(), up1R.fxd_loss_qty(),
								LotProp_Sprt01_Dtl1R.$base_unit_qty,
								LotProp_Sprt01_Dtl1R.$inpt_qty, LotProp_Sprt01_Dtl1R.$loss_qty,
								LotProp_Sprt01_Dtl1R.$fxd_loss_qty);
					}
				}
				else {
					// 指図時
					// 有効成分対象の場合
					if (up1R.cont_fctr_flg()) {
						// 投入数量、必要数量、固定必要数量の算出
						if (up1R.alt_flg()) {
							calcAltRqmtQty(retSubL, up1R.cont_inpt_qty(), up1R.cont_rqmt_qty(),
									up1R.cont_fxd_rqmt_qty(), LotProp_Sprt01_Dtl1R.$cont_qty,
									LotProp_Sprt01_Dtl1R.$cont_inpt_qty,
									LotProp_Sprt01_Dtl1R.$cont_rqmt_qty,
									LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty, up1R.cont_fctr_dec_place());
						}
						else {
							calcRqmtQty(retSubL, up1R.cont_inpt_qty(), up1R.cont_rqmt_qty(),
									up1R.cont_fxd_rqmt_qty(), LotProp_Sprt01_Dtl1R.$cont_qty,
									LotProp_Sprt01_Dtl1R.$cont_inpt_qty,
									LotProp_Sprt01_Dtl1R.$cont_rqmt_qty,
									LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty);
						}

						// 有効成分から基準数を換算
						convContToBaseListInst(retSubL, up1R);
					}
					// 有効成分対象外の場合
					else {
						// 投入数量、必要数量、固定必要数量の算出
						if (up1R.alt_flg()) {
							calcAltRqmtQty(retSubL, up1R.inpt_qty(), up1R.rqmt_qty(), up1R.fxd_rqmt_qty(),
									LotProp_Sprt01_Dtl1R.$base_unit_qty,
									LotProp_Sprt01_Dtl1R.$inpt_qty, LotProp_Sprt01_Dtl1R.$rqmt_qty,
									LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty, up1R.base_unit_dec_place());
						}
						else {
							calcRqmtQty(retSubL, up1R.inpt_qty(), up1R.rqmt_qty(), up1R.fxd_rqmt_qty(),
									LotProp_Sprt01_Dtl1R.$base_unit_qty,
									LotProp_Sprt01_Dtl1R.$inpt_qty, LotProp_Sprt01_Dtl1R.$rqmt_qty,
									LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty);
						}
					}
				}
			}
		}
		
		/**
		 * ロット提案結果の有効成分を基準単位に換算します。
		 * @param rsltL ロット提案結果リスト
		 * @param inptR 上り電文の投入
		 */
		protected <T extends MCRow> void convContToBaseListInst(MCList<LotProp_Sprt01_Dtl1R> rsltL,
				LotProp_Sprt01_Dtl1R inptR) {

			for (LotProp_Sprt01_Dtl1R rsltR : rsltL) {
				// 固定必要数量の換算
				rsltR.fxd_rqmt_qty(convToBaseUnitFromContFctrUnit(
						rsltR.cont_fxd_rqmt_qty(), nvl(rsltR.act_cont_fctr(), inptR.std_cont_fctr()),
						inptR.base_unit_dec_place(), inptR.base_unit_rnd_typ()));
			}
			
			// 必要数量の換算
			calcRqmtQty(rsltL, null, 
					null,
					rsltL.sum(LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty),LotProp_Sprt01_Dtl1R.$base_unit_qty,
					null,LotProp_Sprt01_Dtl1R.$rqmt_qty,
					LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty);
			
			for (LotProp_Sprt01_Dtl1R rsltR : rsltL) {
				if (inptR.inpt_qty().gte(inptR.rqmt_qty())) {
					rsltR.inpt_qty(rsltR.rqmt_qty());
				}
				else {
					// 投入数量の換算
					rsltR.inpt_qty(convToBaseUnitFromContFctrUnit(
							rsltR.cont_inpt_qty(), nvl(rsltR.act_cont_fctr(), inptR.std_cont_fctr()),
							inptR.base_unit_dec_place(), inptR.base_unit_rnd_typ()));
				}
			}
		}
		
		/**
		 * ロット提案結果の有効成分を基準単位に換算します。
		 * @param rsltL ロット提案結果リスト
		 * @param inptR 上り電文の投入
		 */
		protected <T extends MCRow> void convContToBaseListAct(MCList<LotProp_Sprt01_Dtl1R> rsltL,
				LotProp_Sprt01_Dtl1R inptR) {

			for (LotProp_Sprt01_Dtl1R rsltR : rsltL) {
				// ロス数量の換算
				rsltR.loss_qty(convToBaseUnitFromContFctrUnit(
						rsltR.cont_loss_qty(), nvl(rsltR.act_cont_fctr(), inptR.std_cont_fctr()),
						inptR.base_unit_dec_place(), inptR.base_unit_rnd_typ()));
				// 固定ロス数量の換算
				rsltR.fxd_loss_qty(convToBaseUnitFromContFctrUnit(
						rsltR.cont_fxd_loss_qty(), nvl(rsltR.act_cont_fctr(), inptR.std_cont_fctr()),
						inptR.base_unit_dec_place(), inptR.base_unit_rnd_typ()));
			}
			
			// 投入数量の換算
			calcLossQty(rsltL,
					null,
					rsltL.sum(LotProp_Sprt01_Dtl1R.$loss_qty),
					rsltL.sum(LotProp_Sprt01_Dtl1R.$fxd_loss_qty),
					LotProp_Sprt01_Dtl1R.$base_unit_qty,
					LotProp_Sprt01_Dtl1R.$inpt_qty, LotProp_Sprt01_Dtl1R.$loss_qty,
					LotProp_Sprt01_Dtl1R.$fxd_loss_qty);
			
		}
		
		/**
		 * ロット提案結果の基準単位数量または有効成分を投入数量、必要数量、固定必要数量に案分します。
		 * @param rsltL ロット提案結果リスト
		 * @param inptQty 提案対象の投入数量または有効成分（投入数量）
		 * @param rqmtQty 提案対象の必要数量または有効成分（必要数量）
		 * @param fxdQty 提案対象の固定必要数量または有効成分（固定必要数量）
		 * @param sumQtyCol ロット提案結果の基準単位数量または有効成分が格納されたロット提案結果リストのカラム名
		 * @param inptQtyCol 案分した投入数量を格納するロット提案結果リストのカラム名
		 * @param rqmtQtyCol 案分した必要数量を格納するロット提案結果リストのカラム名
		 * @param fxdQtyCol 案分した固定必要数量を格納するロット提案結果リストのカラム名
		 */
		protected void calcRqmtQty(MCList<LotProp_Sprt01_Dtl1R> rsltL, MCNumber inptQty,
				MCNumber rqmtQty, MCNumber fxdQty, String sumQtyCol, String inptQtyCol,
				String rqmtQtyCol, String fxdQtyCol) {

			// 固定必要数量の残数には提案対象の固定必要数量を設定
			MCNumber remFxdQty = fxdQty;
			
			for (MCRow rsltR : rsltL) {
				MCNumber qty = rsltR.getNumber(sumQtyCol);
				
				//有効成分対象で固定ロス理由へ紐づかない場合は、0を設定
				if (isNull(remFxdQty)) {
					remFxdQty = MCNumber.ZERO;
				}
				if (remFxdQty.gt(MCNumber.ZERO)) {
					// 現時点での固定必要数量の残数＞０の場合
					if (qty.gte(remFxdQty)) {
						// 提案結果の数量＞＝現時点での固定必要数量の残数の場合、固定必要数量にすべて設定し、残数を０にする
						rsltR.setNumber(fxdQtyCol, remFxdQty);
						// 提案結果の数量から固定必要数量をマイナス（この後必要数量に設定される）
						qty = qty.subtract(remFxdQty);
						remFxdQty = MCNumber.ZERO;
					}
					else {
						// 上記以外の場合、提案結果の数量を固定必要数量に設定し、現時点での固定必要数量の残数から提案結果の数量をマイナス（次レコードの固定必要数量に回す）
						rsltR.setNumber(fxdQtyCol, qty);
						remFxdQty = remFxdQty.subtract(qty);
						qty = MCNumber.ZERO;
					}
				}
				else {
					// 現時点での固定必要数量＝０の場合、固定必要数量に０を設定
					rsltR.setNumber(fxdQtyCol, MCNumber.ZERO);
				}
				
				// 必要数量には提案結果の数量から固定必要数量をマイナスした値を設定
				rsltR.setNumber(rqmtQtyCol, qty);
				
			}
			if (!isNull(inptQty) && !isNull(inptQtyCol)) {
				// 投入数量は必要数量を超えないように割り当てる
				// ※ロット割れした場合、製造実績時に全ロットを使用するとは限らないため、全ての投入予定に対して案分する方式は採用していない。
				MCSortPolicy sp = new MCSortPolicy();
				sp.add(SortType.ASC, LotProp_Sprt01_Dtl1R.$err_flg); // 引当済みが優先
				sp.add(SortType.ASC, LotProp_Sprt01_Dtl1R.$vld_dt); // 先入先出
				sp.add(SortType.ASC, LotProp_Sprt01_Dtl1R.$first_gr_dt); // 先入先出
				sp.add(SortType.ASC, LotProp_Sprt01_Dtl1R.$lot_seq); // 先入先出
				sp.add(SortType.DESC, rqmtQtyCol); // 必要数量が多いほうが優先
				rsltL.sort(sp);
				FXUCC_Divide.inSeq(rsltL, inptQty, rqmtQtyCol, inptQtyCol);
			}
		}
		/**
		 * 代替品としての充足率（キーは工程指図ＮＯ、代替グループＣＤ、代替グループ連番のList）
		 */
		protected Map<List<Comparable<?>>, MCNumber> _altGrpAllocRate = new HashMap<List<Comparable<?>>, MCNumber>();
		
		/**
		 * 代替品としての充足率を取得する。
		 * @param operInstNo 工程指図ＮＯ
		 * @param altGrpCd 代替グループＣＤ
		 * @param altGrpSeq 代替グループ連番
		 * @return
		 */
		protected MCNumber getAltGrpAllocRate(String operInstNo, String altGrpCd, MCNumber altGrpSeq) {
			List<Comparable<?>> key = new ArrayList<Comparable<?>>();
			key.add(operInstNo);
			key.add(altGrpCd);
			key.add(altGrpSeq);
			
			if (_altGrpAllocRate.containsKey(key)) {
				return _altGrpAllocRate.get(key);
			}
			else {
				return MCNumber.ZERO;
			}
		}
		
		/**
		 * 代替品としての充足率を設定する。
		 * @param operInstNo 工程指図ＮＯ
		 * @param altGrpCd 代替グループＣＤ
		 * @param altGrpSeq 代替グループ連番
		 * @param rate 充足率
		 * @return
		 */
		protected void setAltGrpAllocRate(String operInstNo, String altGrpCd, MCNumber altGrpSeq, MCNumber rate) {
			List<Comparable<?>> key = new ArrayList<Comparable<?>>();
			key.add(operInstNo);
			key.add(altGrpCd);
			key.add(altGrpSeq);
			_altGrpAllocRate.put(key, rate);
		}

		/**
		 * ロット提案結果の基準単位数量または有効成分を投入数量、必要数量、固定必要数量に案分します（代替品目指定オフでロット提案した代替品用）。
		 */
		protected void calcAltRqmtQty(MCList<LotProp_Sprt01_Dtl1R> rsltL, MCNumber orgInptQty,
				MCNumber orgRqmtQty, MCNumber orgFxdQty, String sumQtyCol, String inptQtyCol,
				String rqmtQtyCol, String fxdQtyCol, MCNumber decPlace) {
			
			if (rsltL.isEmpty()) {
				return;
			}
			// ＜本処理の概要＞
			// 代替品の場合、ロット提案前の投入数量（orgInptQty）・必要数量（orgRqmtQty）・固定必要数量（orgFxdQty）は、
			// 代替元数相当の数量（１品目で所要を全数満たす場合に必要な数量）である。
			// そのため、ロット提案の結果、品目が混在した場合、投入数量や必要数量は、代替元数よりも少なくなる。
			// よって、ロット提案結果が返してきた数量をベースに投入数量・必要数量・固定必要数量を再計算する必要がある
			// ＜補足＞
			// 代替品のロット提案では一部引当（代替グループに対する所要を一部のみ満たした状態での引き当て）を許容していない
			// ※addAltDownメソッドで一部でも未引当が残っていたら、全数未引当とみなすようにしている。
			// そのため、本メソッドは代替グループに対して全数引当できた場合を前提としている。

			// ＜必要数量・固定必要数量の再計算処理ここから＞
			// ロット提案処理には、必要数量と固定必要数量の合計値（＝確保しなければならない数量）を渡している。
			// そのため合計値をもとに必要数量と固定必要数量を再計算する（元の値を比率として案分する）。
			MCNumber lotPropRsltSumQty = rsltL.sum(sumQtyCol);
			MCNumber newFxdQty; // 再計算後の固定必要数量
			MCNumber newRqmtQty; // 再計算後の必要数量
			if (!isSame(lotPropRsltSumQty, MCNumber.ZERO)) {
				IfDivideProp rslt = FXUCC_Divide.propNE(lotPropRsltSumQty,
						decPlace.intValue(), orgFxdQty, orgRqmtQty);
				MCNumber[] arr = rslt.allocArray();
				newFxdQty = arr[0];
				newRqmtQty = arr[1];
			}
			else {
				// 選択されなかった代替品の場合
				newFxdQty = MCNumber.ZERO;
				newRqmtQty = MCNumber.ZERO;
			}
			
			// ＜投入数量の再計算処理ここから＞
			MCNumber newInptQty = null; // 再計算後の投入数量
			if (isSame(orgRqmtQty, orgInptQty)) {
				// 元々の投入数量と必要数量に差異が無かった場合は、再計算後の必要数量を投入数量に設定する。
				newInptQty = newRqmtQty;
			}
			else {
				// 元々の投入数量と必要数量に差異があった場合は、必要数量＋固定必要数量の減少割合をもとに再計算する。
				// ※端数処理の結果、ＢＯＭで指定した投入数量よりも大きい値になり過ぎることを防ぐため、
				// 代替グループとしての充足率を加味しながら投入数量を再計算する
				MCNumber orgTtLRqmtQty = orgRqmtQty.add(orgFxdQty); // 元の必要数量＋固定必要数量
				MCNumber newTtlRqmtQty = newRqmtQty.add(newFxdQty); // 新しい必要数量＋固定必要数量
				MCNumber tmpNewInptQty = convRqmtQtyToInptQty(orgTtLRqmtQty, orgInptQty,
						newTtlRqmtQty, decPlace, MAC_RND_TYP.RNDOFF); // 仮の投入予定数量（ＭＲＰの代替品目比率によるオーダ生成と仕様を合わせて四捨五入）
				
				// 仮の投入予定数量が代替元数に占める割合を求める
				MCNumber currentRate = calcAltGrpRate(tmpNewInptQty, orgInptQty);
				
				// 代替品としてロット提案した場合、orgInptQtyは代替元数相当の数量である。
				// この数量をいくつ満たしたかをもとに代替グループとしての充足率を計算する。
				// ※一度代替品目指定した代替品の場合、orgInptQtyは代替元数相当ではないが、
				// 代替品目指定済みの代替品の場合は本処理を通らないため、このケースは考慮不要。
				LotProp_Sprt01_Dtl1R fr = rsltL.get(0);
				MCNumber altAllocRate = getAltGrpAllocRate(fr.oper_inst_no(),
						fr.alt_grp_cd(), fr.alt_grp_seq());
				MCNumber newRate = currentRate.add(altAllocRate);
				if (newRate.lte(1)) {
					// 代替グループとしての充足率が1に満たない場合、仮の投入予定数量を正式な投入予定数量として採用する。
					newInptQty = tmpNewInptQty;
				}
				else {
					// 代替グループとしての充足率が100を超える場合、切り捨てする
					newInptQty = convRqmtQtyToInptQty(orgTtLRqmtQty, orgInptQty,
							newTtlRqmtQty, decPlace, MAC_RND_TYP.CUTOFF);
					// 切り捨てで再計算した数量で充足率を再計算する。
					newRate = calcAltGrpRate(newInptQty, orgInptQty).add(altAllocRate);
				}
				// 充足率を置き換える
				setAltGrpAllocRate(fr.oper_inst_no(), fr.alt_grp_cd(),
						fr.alt_grp_seq(), newRate);
			}
			
			// 再計算した投入数量・必要数量・固定必要数量を使用して、通常品と同様の処理を実施する。
			calcRqmtQty(rsltL, newInptQty, newRqmtQty, newFxdQty, sumQtyCol, inptQtyCol,
					rqmtQtyCol, fxdQtyCol);
		}
		
		protected MCNumber convRqmtQtyToInptQty(MCNumber orgTtLRqmtQty,
				MCNumber orgInptQty, MCNumber newTtlRqmtQty, MCNumber decPlace,
				MAC_RND_TYP rndTyp) {
			if (orgTtLRqmtQty.gt(0)) {
				return orgInptQty.multiply(newTtlRqmtQty).divide(orgTtLRqmtQty,
						decPlace.intValue(), rndTyp.toMC());
			}
			else {
				return MCNumber.ZERO;
			}
		}
		
		protected MCNumber calcAltGrpRate(MCNumber tmpNewInptQty, MCNumber orgInptQty) {
			if (orgInptQty.gt(0)) {
				// tmpNewInptQtyがorgInptQtyに占める割合を計算する。
				// 桁数や端数処理区分として適切なものはないため、数量のメタの桁数と四捨五入を採用する。
				return tmpNewInptQty.divide(orgInptQty,
						MST_INPT_SCHD_R.base_unit_alt_qty_META.scale(),
						MAC_RND_TYP.RNDOFF.toMC());
			}
			else {
				return MCNumber.ZERO;
			}
		}
		
		/**
		 * ロット提案結果の基準単位数量または有効成分を投入数量、ロス数量、固定ロス数量に案分します。
		 * @param rsltL ロット提案結果リスト
		 * @param inptQty 提案対象の投入数量または有効成分（投入数量）
		 * @param rqmtQty 提案対象のロス数量または有効成分（ロス数量）
		 * @param fxdQty 提案対象の固定ロス数量または有効成分（固定ロス数量）
		 * @param sumQtyCol ロット提案結果の基準単位数量または有効成分が格納されたロット提案結果リストのカラム名
		 * @param inptQtyCol 案分した投入数量を格納するロット提案結果リストのカラム名
		 * @param rqmtQtyCol 案分したロス数量を格納するロット提案結果リストのカラム名
		 * @param fxdQtyCol 案分した固定ロス数量を格納するロット提案結果リストのカラム名
		 */
		protected <T extends MCRow> void calcLossQty(MCList<T> rsltL, MCNumber inptQty,
				MCNumber lossQty, MCNumber fxdQty, String sumQtyCol, String inptQtyCol,
				String lossQtyCol, String fxdQtyCol) {

			// 固定必要数量の残数には提案対象の固定必要数量を設定
			MCNumber remFxdQty = nvl(fxdQty, MCNumber.ZERO);
			// ロス数量の残数には提案対象のロス数量を設定
			MCNumber remLossQty = nvl(lossQty, MCNumber.ZERO);
			
			for (MCRow rsltR : rsltL) {
				MCNumber qty = rsltR.getNumber(sumQtyCol);

				// 固定ロス数量の設定
				if (remFxdQty.gt(MCNumber.ZERO)) {
					// 現時点での固定ロス数量の残数＞０の場合
					if (qty.gte(remFxdQty)) {
						// 提案結果の数量＞＝現時点での固定ロス数量の残数の場合、固定ロス数量に残数をすべて設定
						rsltR.setNumber(fxdQtyCol, remFxdQty);
						// 提案結果の数量から固定ロス数量をマイナス
						qty = qty.subtract(remFxdQty);
						// 残数を０にする
						remFxdQty = MCNumber.ZERO;
					}
					else {
						// 上記以外の場合、提案結果の数量を固定ロス数量に設定し、現時点での固定ロス数量の残数から提案結果の数量をマイナス（次レコードの固定ロス数量に回す）
						rsltR.setNumber(fxdQtyCol, qty);
						remFxdQty = remFxdQty.subtract(qty);
						qty = MCNumber.ZERO;
					}
				}
				else {
					// 現時点での固定ロス数量＝０の場合、固定ロス数量に０を設定
					rsltR.setNumber(fxdQtyCol, MCNumber.ZERO);
				}

				// ロス数量の設定
				if (remLossQty.gt(MCNumber.ZERO)) {
					// 現時点でのロス数量の残数＞０の場合
					if (qty.gte(remLossQty)) {
						// 提案結果の数量＞＝現時点でのロス数量の残数の場合、ロス数量に残数をすべて設定
						rsltR.setNumber(lossQtyCol, remLossQty);
						// 提案結果の数量から固定ロス数量をマイナス
						qty = qty.subtract(remLossQty);
						// 残数を０にする
						remLossQty = MCNumber.ZERO;
					}
					else {
						// 上記以外の場合、提案結果の数量をロス数量に設定し、現時点でのロス数量の残数から提案結果の数量をマイナス（次レコードのロス数量に回す）
						rsltR.setNumber(lossQtyCol, qty);
						remLossQty = remLossQty.subtract(qty);
						qty = MCNumber.ZERO;
					}
				}
				else {
					// 現時点でのロス数量＝０の場合、ロス数量に０を設定
					rsltR.setNumber(lossQtyCol, MCNumber.ZERO);
				}
				
				// 投入数量に提案結果の数量から固定ロス数量、ロス数量をマイナスした値を設定する
				rsltR.setNumber(inptQtyCol, qty);
			}
		}
		
		protected static final String PROP_COL_NM = "tmp_prop_col_nm";

		/**
		 * ロット提案結果のロス実績数をロス実績に対して案分し、down2に追加する
		 */
		protected void addLossDown() {
			// 下り電文の投入にロス実績用紐付けＮＯを設定
			setPegNo(LotProp_Sprt01_Dtl1R.$loss_peg_no, down0());
			
			// 下り電文からロス実績数＞０、固定ロス実績数＞０のレコードを抽出
			MCList<LotProp_Sprt01_Dtl1R> lossL = getLossInptL();
			MCList<LotProp_Sprt01_Dtl1R> fxdL = getFxdLossInptL();
			
			MCIndexKey idxKey = up3().createIndex(LotProp_Sprt01_Dtl4R.$inpt_peg_no, LotProp_Sprt01_Dtl4R.$fxd_loss_flg);
			
			// ロス実績の下り電文を作成
			for (LotProp_Sprt01_Dtl1R r : lossL) {
				
				// 投入紐付けＮＯから上り電文のロス実績を抽出
				MCList<LotProp_Sprt01_Dtl4R> subL = up3().subList(idxKey, r.peg_no(), false).clone();

				// 有効成分対象の場合
				if (r.cont_fctr_flg()) {
					// 有効成分（ロス実績数）を有効成分（ロス数量）の比率に基づき案分
					if (nvl(subL.sum(LotProp_Sprt01_Dtl4R.$cont_loss_qty), MCNumber.ZERO).isZero()) {
						// 全て0の場合はpropの例外回避のため1を設定
						subL.setNumberNE(PROP_COL_NM, MCNumber.ONE);
					}
					else {
						for (LotProp_Sprt01_Dtl4R subR : subL) {
							subR.setNumberNE(PROP_COL_NM, subR.cont_loss_qty());
						}
					}
					FXUCC_Divide.prop(subL, r.cont_loss_qty(), r.cont_fctr_dec_place().intValue(),
							PROP_COL_NM, LotProp_Sprt01_Dtl4R.$cont_loss_qty);
				}

				// ロス実績数をロス数量の比率に基づき案分
				if (nvl(subL.sum(LotProp_Sprt01_Dtl4R.$loss_qty), MCNumber.ZERO).isZero()) {
					// 全て0の場合はpropの例外回避のため1を設定
					subL.setNumberNE(PROP_COL_NM, MCNumber.ONE);
				}
				else {
					for (LotProp_Sprt01_Dtl4R subR : subL) {
						subR.setNumberNE(PROP_COL_NM, subR.loss_qty());
					}
				}
				FXUCC_Divide.prop(subL, r.loss_qty(), r.base_unit_dec_place().intValue(),
						PROP_COL_NM, LotProp_Sprt01_Dtl4R.$loss_qty);
				
				// ロス実績用紐付けＮＯ、追加行フラグを設定
				subL.setNumber(LotProp_Sprt01_Dtl4R.$loss_peg_no, r.loss_peg_no());
				subL.setBoolean(LotProp_Sprt01_Dtl4R.$add_flg, r.add_flg());
				
				// 下り電文に追加
				down2().addAll(subL);
			}
			
			// 固定ロス実績の下り電文を作成
			for (LotProp_Sprt01_Dtl1R r : fxdL) {
				// 投入紐付けＮＯから上り電文のロス実績を抽出
				MCList<LotProp_Sprt01_Dtl4R> subL = up3().subList(idxKey, r.peg_no(), true).clone();
				
				// 有効成分対象の場合
				if (r.cont_fctr_flg()) {
					// 有効成分（ロス実績数）を有効成分（ロス数量）の比率に基づき案分
					// 有効成分（ロス実績数）を有効成分（ロス数量）の比率に基づき案分
					if (nvl(subL.sum(LotProp_Sprt01_Dtl4R.$cont_loss_qty), MCNumber.ZERO).isZero()) {
						// 全て0の場合はpropの例外回避のため1を設定
						subL.setNumberNE(PROP_COL_NM, MCNumber.ONE);
					}
					else {
						for (LotProp_Sprt01_Dtl4R subR : subL) {
							subR.setNumberNE(PROP_COL_NM, subR.cont_loss_qty());
						}
					}
					FXUCC_Divide.prop(subL, r.cont_fxd_loss_qty(), r.cont_fctr_dec_place().intValue(),
							PROP_COL_NM, LotProp_Sprt01_Dtl4R.$cont_loss_qty);
					// 有効成分を基準単位に変換
					for (LotProp_Sprt01_Dtl4R subR : subL) {
						subR.loss_qty(convToBaseUnitFromContFctrUnit(subR.cont_loss_qty(),
								nvl(r.act_cont_fctr(), r.std_cont_fctr()), r.base_unit_dec_place(),
								r.base_unit_rnd_typ()));
					}
				}
				// 有効成分対象外の場合
				else {
					// 固定ロス実績数を固定ロス数量の比率に基づき案分
					if (nvl(subL.sum(LotProp_Sprt01_Dtl4R.$loss_qty), MCNumber.ZERO).isZero()) {
						// 全て0の場合はpropの例外回避のため1を設定
						subL.setNumberNE(PROP_COL_NM, MCNumber.ONE);
					}
					else {
						for (LotProp_Sprt01_Dtl4R subR : subL) {
							subR.setNumberNE(PROP_COL_NM, subR.loss_qty());
						}
					}
					FXUCC_Divide.prop(subL, r.fxd_loss_qty(),
							r.base_unit_dec_place().intValue(), PROP_COL_NM,
							LotProp_Sprt01_Dtl4R.$loss_qty);
				}

				
				// ロス実績用紐付けＮＯ、追加行フラグを設定
				subL.setNumber(LotProp_Sprt01_Dtl4R.$loss_peg_no, r.loss_peg_no());
				subL.setBoolean(LotProp_Sprt01_Dtl4R.$add_flg, r.add_flg());
				
				// 下り電文に追加
				down2().addAll(subL);
			}
		}

		/**
		 * ロット提案結果からロス実績数＞０の投入を抽出する
		 * @return
		 */
		protected MCList<LotProp_Sprt01_Dtl1R> getLossInptL() {
			MCList<LotProp_Sprt01_Dtl1R> retL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			for (LotProp_Sprt01_Dtl1R r : down0()) {
				if (r.cont_fctr_flg()) {
					// 有効成分対象
					if (!isNull(r.cont_loss_qty()) && r.cont_loss_qty().isPositive()) {
						retL.add(r);
					}
				}
				else {
					// 有効成分対象外
					if (!isNull(r.loss_qty()) && r.loss_qty().isPositive()) {
						retL.add(r);
					}
				}
			}
			return retL;
		}

		/**
		 * ロット提案結果から固定ロス実績数＞０の投入を抽出する
		 * @return
		 */
		protected MCList<LotProp_Sprt01_Dtl1R> getFxdLossInptL() {
			MCList<LotProp_Sprt01_Dtl1R> retL = MCList.create(LotProp_Sprt01_Dtl1R.class);
			for (LotProp_Sprt01_Dtl1R r : down0()) {
				if (r.cont_fctr_flg()) {
					// 有効成分対象
					if (!isNull(r.cont_fxd_loss_qty()) && r.cont_fxd_loss_qty().isPositive()) {
						retL.add(r);
					}
				}
				else {
					// 有効成分対象外
					if (!isNull(r.fxd_loss_qty()) && r.fxd_loss_qty().isPositive()) {
						retL.add(r);
					}
				}
			}
			return retL;
		}



		/**
		 * 下り電文のロット提案結果（集約なし）から、下り電文のロット提案結果（投入予定単位に集約）へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl2R_LotProp_Sprt01_Dtl1R<LotProp_Sprt01_Dtl2R,LotProp_Sprt01_Dtl1R> createMap_LotProp_Sprt01_Dtl2R_LotProp_Sprt01_Dtl1R() {
			return new Map_LotProp_Sprt01_Dtl2R_LotProp_Sprt01_Dtl1R<LotProp_Sprt01_Dtl2R, LotProp_Sprt01_Dtl1R>();
		}

		public class Map_LotProp_Sprt01_Dtl2R_LotProp_Sprt01_Dtl1R<D extends LotProp_Sprt01_Dtl2R, S extends LotProp_Sprt01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$oper_peg_no, LotProp_Sprt01_Dtl1R.$oper_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$peg_no, LotProp_Sprt01_Dtl1R.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$add_flg, LotProp_Sprt01_Dtl1R.$add_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$err_flg, LotProp_Sprt01_Dtl1R.$err_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_schd_no, LotProp_Sprt01_Dtl1R.$inpt_schd_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$div_seq, LotProp_Sprt01_Dtl1R.$div_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_dt, LotProp_Sprt01_Dtl1R.$inpt_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$itm_cd, LotProp_Sprt01_Dtl1R.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$itm_sub1, LotProp_Sprt01_Dtl1R.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$itm_sub2, LotProp_Sprt01_Dtl1R.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$itm_sub3, LotProp_Sprt01_Dtl1R.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$ver_no, LotProp_Sprt01_Dtl1R.$ver_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$alt_grp_cd, LotProp_Sprt01_Dtl1R.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$alt_grp_seq, LotProp_Sprt01_Dtl1R.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$alt_itm_fix_flg, LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$oper_inst_no, LotProp_Sprt01_Dtl1R.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$not_alloc_qty, LotProp_Sprt01_Dtl1R.$not_alloc_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$not_alloc_cont_qty, LotProp_Sprt01_Dtl1R.$not_alloc_cont_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_loc_cd, LotProp_Sprt01_Dtl1R.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_str_ln_cd, LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_sppl_cd, LotProp_Sprt01_Dtl1R.$inpt_sppl_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$quality_typ, LotProp_Sprt01_Dtl1R.$quality_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$stk_insp_typ, LotProp_Sprt01_Dtl1R.$stk_insp_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$gd_cd, LotProp_Sprt01_Dtl1R.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$gd_nm, LotProp_Sprt01_Dtl1R.$gd_nm);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$lot_no, LotProp_Sprt01_Dtl1R.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sublot_no, LotProp_Sprt01_Dtl1R.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$rqst_sno1, LotProp_Sprt01_Dtl1R.$rqst_sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno1_null_flg, LotProp_Sprt01_Dtl1R.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$rqst_sno2, LotProp_Sprt01_Dtl1R.$rqst_sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno2_null_flg, LotProp_Sprt01_Dtl1R.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$rqst_sno3, LotProp_Sprt01_Dtl1R.$rqst_sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno3_null_flg, LotProp_Sprt01_Dtl1R.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$rqst_sno4, LotProp_Sprt01_Dtl1R.$rqst_sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno4_null_flg, LotProp_Sprt01_Dtl1R.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno1, LotProp_Sprt01_Dtl1R.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno2, LotProp_Sprt01_Dtl1R.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno3, LotProp_Sprt01_Dtl1R.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$sno4, LotProp_Sprt01_Dtl1R.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$base_unit_qty, LotProp_Sprt01_Dtl1R.$base_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$cont_qty, LotProp_Sprt01_Dtl1R.$cont_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$not_lot_fix_flg, LotProp_Sprt01_Dtl1R.$not_lot_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$vld_dt, LotProp_Sprt01_Dtl1R.$vld_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$first_gr_dt, LotProp_Sprt01_Dtl1R.$first_gr_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$lot_seq, LotProp_Sprt01_Dtl1R.$lot_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$inpt_qty, LotProp_Sprt01_Dtl1R.$inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$rqmt_qty, LotProp_Sprt01_Dtl1R.$rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$fxd_rqmt_qty, LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$base_unit_cd, LotProp_Sprt01_Dtl1R.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$cont_inpt_qty, LotProp_Sprt01_Dtl1R.$cont_inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$cont_rqmt_qty, LotProp_Sprt01_Dtl1R.$cont_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$cont_fxd_rqmt_qty, LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$act_cont_fctr, LotProp_Sprt01_Dtl1R.$act_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl2R.$alloc_flg, LotProp_Sprt01_Dtl1R.$alloc_flg);
			}
		}

	}

	//FMCB CUSTOM END
}