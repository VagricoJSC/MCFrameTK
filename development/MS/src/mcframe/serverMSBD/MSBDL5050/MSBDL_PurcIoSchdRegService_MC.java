package mcframe.serverMSBD.MSBDL5050;

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
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcIoSchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcIoSchdRegService_MC extends MSBDL_PurcIoSchdRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PurcIoSchd_Upd01オペレーション.<p>
	 *
	 */
	public class PurcIoSchd_Upd01 extends MSBDL_PurcIoSchdRegService_MC_A.PurcIoSchd_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if(up0().isEmpty()){
				return;
			}

			initVal();
			
			//処理対象の入荷予定を取得
			srchArrSchd();
			
			// 予定が取得できない場合、更新対象の受払予定はなしとみなし処理を抜ける
			if (_arrSchdDbcL.size() == 0) {
				return;
			}
			
			// 処理対象の検査予定を取得
			srchInspSchd();

			//マスタキャッシュ
			selectMaster();

			//受払予定削除
			delIoSchd();

			//受払予定作成
			crtIoSchd();

		}

		protected void initVal(){
			initDbc();
		}
		
		protected void initDbc(){
			_arrSchdDbcL.addStringColumn("arr_act_no");
			_arrSchdDbcL.addStringColumn("arr_act_ver_no");
			_arrSchdDbcL.addStringColumn("arr_act_sppl_cd");
			_arrSchdDbcL.addStringColumn("arr_act_maker_cd");
			_arrSchdDbcL.addStringColumn("arr_pr_sppl_cd");
			_arrSchdDbcL.addDateColumn("arr_tm");
			_arrSchdDbcL.addStringColumn("rsn_cd");
			_arrSchdDbcL.addStringColumn("po_d_no");
			_arrSchdDbcL.addStringColumn("po_no");
			_arrSchdDbcL.addDateColumn("purc_schd_dt");
			_arrSchdDbcL.addStringColumn("purc_schd_no");
			_arrSchdDbcL.addStringColumn("prov_typ");
			_arrSchdDbcL.addStringColumn("sppl_cd");
			_arrSchdDbcL.addStringColumn("prov_basis_typ");
			_arrSchdDbcL.addStringColumn("purc_act_d_maker_cd");
			_arrSchdDbcL.addStringColumn("purc_act_io_ver_no");
			_arrSchdDbcL.addStringColumn("purc_act_io_no");
			_arrSchdDbcL.addStringColumn("purc_act_sppl_cd");
			_arrSchdDbcL.addStringColumn("itm_mfg_inst_no");
			_arrSchdDbcL.addStringColumn("mfg_inst_unit_typ");
		}
		
		/** 処理対象の入荷予定 */
		protected MCList<MST_ARR_SCHD_R> _arrSchdDbcL = MCList.create(MST_ARR_SCHD_R.class);
		
		/** キャッシュ：品目単位マスタ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		
		/**
		 * 対応する入荷予定を取得します。
		 */
		protected void srchArrSchd() {

			//上り電文をバインド用に振り分け
			//入荷実績ＮＯ用
			MCList<PurcIoSchd_Upd01_DtlR> bind1L = up0().createInstance();

			//仕入実績明細ＮＯ用
			MCList<PurcIoSchd_Upd01_DtlR> bind2L = up0().createInstance();

			for (PurcIoSchd_Upd01_DtlR up0R : up0()) {

				if(MSC_FIX_NO_TYP.isARR_ACT_NO(up0R.fix_no_typ())){
					bind1L.add(up0R);
				}
				else if (MSC_FIX_NO_TYP.isPURC_ACT_IO_NO(up0R.fix_no_typ())){
					bind2L.add(up0R);
				}
			}

			if (!bind1L.isEmpty()) {
				// 入荷実績ＮＯから入荷予定を取得する。
				MST_ARR_ACT_R t1 = MST_ARR_ACT_R.create("T1");
				MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
				MST_PO_D_R t3 = MST_PO_D_R.create("T3");
				MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
				MST_PROV_SCHD_R t5 = MST_PROV_SCHD_R.create("T5");
				MST_MFG_INST_R t6 = MST_MFG_INST_R.create("T6");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				MAM_BP_R m2 = MAM_BP_R.create("M2");
				MCList<MST_ARR_SCHD_R> arrSchdDbcL = MCList.create(MST_ARR_SCHD_R.class);
				MST_ARR_SCHD_R arrSchdDbcL_t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder arrSchdDbcL_bldr = MCQueryApiBuilder.create(arrSchdDbcL_t);
				arrSchdDbcL_bldr.addSelect(t1.arr_act_no);
				arrSchdDbcL_bldr.addSelect(t1.ver_no.as("arr_act_ver_no"));//入荷実績の版ＮＯ
				arrSchdDbcL_bldr.addSelect(t1.arr_tm);
				arrSchdDbcL_bldr.addSelect(t1.sppl_cd.as("arr_act_sppl_cd"));//入荷実績の発注先
				arrSchdDbcL_bldr.addSelect(t1.maker_cd.as("arr_act_maker_cd"));//入荷実績のメーカー
				arrSchdDbcL_bldr.addSelect(t1.rsn_cd);
				arrSchdDbcL_bldr.addSelect(t2.po_d_no);
				arrSchdDbcL_bldr.addSelect(t2.sppl_cd.as("arr_pr_sppl_cd"));//入荷進捗の発注先
				arrSchdDbcL_bldr.addSelect(t3.po_no);
				arrSchdDbcL_bldr.addSelect(t4.purc_schd_dt);
				arrSchdDbcL_bldr.addSelect(t4.purc_schd_no);
				arrSchdDbcL_bldr.addSelect(t5.prov_typ);
				arrSchdDbcL_bldr.addSelect(m1.sppl_cd);
				arrSchdDbcL_bldr.addSelect(m2.prov_basis_typ);
				arrSchdDbcL_bldr.addSelect(t2.purc_ddlv_flg);
				arrSchdDbcL_bldr.addSelect(t6.itm_mfg_inst_no);
				arrSchdDbcL_bldr.addSelect(t6.mfg_inst_unit_typ);
				arrSchdDbcL.addStringColumn("purc_act_io_no");
				arrSchdDbcL.addBooleanColumn("purc_ddlv_flg");
				arrSchdDbcL_bldr.addLeftOuterJoin(t1, arrSchdDbcL_t.arr_schd_no.eq(t1.arr_schd_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t2, arrSchdDbcL_t.arr_pr_no.eq(t2.arr_pr_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t3, t2.po_d_no.eq(t3.po_d_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t4, arrSchdDbcL_t.arr_schd_no.eq(t4.arr_schd_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t5, arrSchdDbcL_t.arr_schd_no.eq(t5.prov_src_schd_no2)
						.and(t5.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value()))));
				arrSchdDbcL_bldr.addLeftOuterJoin(t6, arrSchdDbcL_t.mfg_inst_no.eq(t6.mfg_inst_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(m1, arrSchdDbcL_t.arr_loc_cd.eq(m1.loc_cd));
				arrSchdDbcL_bldr.addLeftOuterJoin(m2, m1.sppl_cd.eq(m2.bp_cd));
				arrSchdDbcL_bldr.addWhereWithAnd(t1.arr_act_no.eq(bind("fix_no")));
				dbSelect("MSBDL5050_MST_ARR_SCHD_S01", arrSchdDbcL, arrSchdDbcL_bldr,
						bind1L.groupBy(PurcIoSchd_Upd01_DtlR.$fix_no));

				_arrSchdDbcL.addAll(arrSchdDbcL);
			}

			if (!bind2L.isEmpty()) {
				// 仕入実績受払ＮＯから入荷予定を取得する。
				//処理対象の仕入実績明細の取得
				//※処理レコードが削除レコードの場合もあるため明細連番がMAXのレコードを取得する
				MCList<MST_PURC_ACT_IO_R> purcActIoDbcL = MCList
						.create(MST_PURC_ACT_IO_R.class);
				MST_PURC_ACT_IO_R purcActIoDbcL_t = MST_PURC_ACT_IO_R.create("T");
				MCQueryApiBuilder purcActIoDbcL_bldr = MCQueryApiBuilder.create(purcActIoDbcL_t);
				purcActIoDbcL_bldr.addSelect(purcActIoDbcL_t.purc_act_io_no);
				purcActIoDbcL_bldr.addMax(purcActIoDbcL_t.purc_act_io_seq, "purc_act_io_seq");
				purcActIoDbcL_bldr.addWhereWithAnd(purcActIoDbcL_t.purc_act_io_no.eq(bind("fix_no")));
				purcActIoDbcL_bldr.addGroupBy(purcActIoDbcL_t.purc_act_io_no);
				dbSelect("MSBDL5050_MST_PURC_ACT_IO_S01", purcActIoDbcL, purcActIoDbcL_bldr,
						bind2L.groupBy(PurcIoSchd_Upd01_DtlR.$fix_no));

				//処理対象の入荷予定の取得
				MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T1");
				MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
				MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");
				MST_ARR_PR_R t4 = MST_ARR_PR_R.create("T4");
				MST_PURC_ACT_R t5 = MST_PURC_ACT_R.create("T5");
				MST_PROV_SCHD_R t6 = MST_PROV_SCHD_R.create("T6");
				MST_MFG_INST_R t7 = MST_MFG_INST_R.create("T7");
				MAM_LOC_R m1 = MAM_LOC_R.create("M1");
				MCList<MST_ARR_SCHD_R> arrSchdDbcL = MCList.create(MST_ARR_SCHD_R.class);
				MST_ARR_SCHD_R arrSchdDbcL_t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder arrSchdDbcL_bldr = MCQueryApiBuilder.create(arrSchdDbcL_t);
				arrSchdDbcL_bldr.addSelect(nullValue().as("arr_act_no"));
				arrSchdDbcL_bldr.addSelect(t1.purc_schd_no);
				arrSchdDbcL_bldr.addSelect(t1.purc_schd_dt);
				arrSchdDbcL_bldr.addSelect(t1.base_unit_abort_qty);
				arrSchdDbcL_bldr.addSelect(t2.maker_cd.as("purc_act_d_maker_cd")); //仕入実績明細のメーカー
				arrSchdDbcL_bldr.addSelect(t2.rsn_cd);
				arrSchdDbcL_bldr.addSelect(t3.purc_act_io_no);
				arrSchdDbcL_bldr.addSelect(t3.ver_no.as("purc_act_io_ver_no")); //仕入実績受払の版ＮＯ
				arrSchdDbcL_bldr.addSelect(t4.sppl_cd.as("arr_pr_sppl_cd")); //入荷進捗の発注先
				arrSchdDbcL_bldr.addSelect(t4.po_d_no);
				arrSchdDbcL_bldr.addSelect(t5.sppl_cd.as("purc_act_sppl_cd")); //仕入実績の発注先
				arrSchdDbcL_bldr.addSelect(t5.po_no);
				arrSchdDbcL_bldr.addSelect(t6.prov_typ);
				arrSchdDbcL_bldr.addSelect(t7.itm_mfg_inst_no);
				arrSchdDbcL_bldr.addSelect(t7.mfg_inst_unit_typ);
				arrSchdDbcL_bldr.addSelect(t4.purc_ddlv_flg);
				arrSchdDbcL_bldr.addSelect(m1.sppl_cd);
				arrSchdDbcL.addBooleanColumn("purc_ddlv_flg");
				arrSchdDbcL_bldr.addLeftOuterJoin(t1, arrSchdDbcL_t.arr_schd_no.eq(t1.arr_schd_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t2, t1.purc_schd_no.eq(t2.purc_schd_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t3, t2.purc_act_d_no.eq(t3.purc_act_d_no)
						.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq)));
				arrSchdDbcL_bldr.addLeftOuterJoin(t4, t1.arr_pr_no.eq(t4.arr_pr_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(t5, t2.purc_act_no.eq(t5.purc_act_no)
						.and(t2.purc_act_seq.eq(t5.purc_act_seq)));
				arrSchdDbcL_bldr.addLeftOuterJoin(t6, arrSchdDbcL_t.arr_schd_no.eq(t6.prov_src_schd_no2)
						.and(t6.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value()))));
				arrSchdDbcL_bldr.addLeftOuterJoin(t7, arrSchdDbcL_t.mfg_inst_no.eq(t7.mfg_inst_no));
				arrSchdDbcL_bldr.addLeftOuterJoin(m1, arrSchdDbcL_t.arr_loc_cd.eq(m1.loc_cd));
				arrSchdDbcL_bldr.addWhereWithAnd(t3.purc_act_io_no.eq(bind("purc_act_io_no")));
				arrSchdDbcL_bldr.addWhereWithAnd(t3.purc_act_io_seq.eq(bind("purc_act_io_seq")));

				dbSelect("MSBDL5050_MST_ARR_SCHD_S02", arrSchdDbcL, arrSchdDbcL_bldr, purcActIoDbcL);

				_arrSchdDbcL.addAll(arrSchdDbcL);
			}
		}

		/** 処理対象の検査予定 */
		protected MCList<MST_INSP_SCHD_R> _inspSchdDbcL = MCList.create(MST_INSP_SCHD_R.class);
		protected MCIndexKey _inspSchdKey;

		protected void srchInspSchd() {
			//上り電文をバインド用に振り分け
			//入荷実績ＮＯ用
			MCList<PurcIoSchd_Upd01_DtlR> bind1L = up0().createInstance();

			for (PurcIoSchd_Upd01_DtlR up0R : up0()) {
				if(MSC_FIX_NO_TYP.isARR_ACT_NO(up0R.fix_no_typ())){
					bind1L.add(up0R);
				}
			}

			if (!bind1L.isEmpty()) {
				// 入荷実績ＮＯから検査予定を取得する。
				MCList<MST_INSP_SCHD_R> inspSchdDbcL = MCList.create(MST_INSP_SCHD_R.class);
				MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder inspSchdDbcL_bldr = MCQueryApiBuilder.create(t);
				inspSchdDbcL_bldr.setSelect(t.insp_schd_no);
				inspSchdDbcL_bldr.addSelect(t.src_no4);
				inspSchdDbcL_bldr.addSelect(t.in_prmt_insp_flg);
				inspSchdDbcL_bldr.setWhere(t.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())));
				inspSchdDbcL_bldr.addWhereWithAnd(t.src_no4.eq(bind("fix_no")));
				inspSchdDbcL_bldr.addWhereWithAnd(t.latest_flg.eq(value(true)));
				dbSelect("MSBDL5050_MST_INSP_SCHD_S01", inspSchdDbcL, inspSchdDbcL_bldr, bind1L.groupBy(PurcIoSchd_Upd01_DtlR.$fix_no));

				_inspSchdDbcL.addAll(inspSchdDbcL);
			}
			_inspSchdKey = _inspSchdDbcL.createIndex(MST_INSP_SCHD_R.$src_no4);
		}
		
		protected void selectMaster() {
			// 品目単位マスタ
			selectItmUnitL();
		}

		/**
		 * 品目単位マスタのキャッシュ
		 */
		protected void selectItmUnitL() {

			MCList<MAVM_ITM_UNIT_R> bindL = MCList.create(MAVM_ITM_UNIT_R.class);

			for(MST_ARR_SCHD_R arrSchdDbcR :_arrSchdDbcL){

				MAVM_ITM_UNIT_R addR = MAVM_ITM_UNIT_R.create();
				addR.itm_cd(arrSchdDbcR.itm_cd());
				addR.itm_sub1(arrSchdDbcR.itm_sub1());
				addR.itm_sub2(arrSchdDbcR.itm_sub2());
				addR.itm_sub3(arrSchdDbcR.itm_sub3());
				addR.unit_cd(arrSchdDbcR.trd_unit_cd());
				bindL.add(addR);

				if (!isSame(arrSchdDbcR.trd_unit_cd(), arrSchdDbcR.base_unit_cd())) {
					MAVM_ITM_UNIT_R add2R = addR.clone();
					add2R.unit_cd(arrSchdDbcR.base_unit_cd());
					bindL.add(add2R);
				}
			}

			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr, bindL,
					MAVM_ITM_UNIT_R.$itm_cd,
					MAVM_ITM_UNIT_R.$itm_sub1,
					MAVM_ITM_UNIT_R.$itm_sub2,
					MAVM_ITM_UNIT_R.$itm_sub3,
					MAVM_ITM_UNIT_R.$unit_cd
			);
		}

		/**
		 * 受払予定を削除する。<br>
		 * ・削除１：入荷予定に対応する受払予定の削除<br>
		 * ・削除２：前回実績に対応する受払予定の削除<br>
		 */
		protected void delIoSchd() {

			mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService.IoSchd_Del01 ioDelSrv
			= mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService.crtIoSchd_Del01();

			//削除１：入荷予定に対応する受払予定の削除
			ioDelSrv.up0().addAll(crtDelIoSchdListForArrSchd());

			//削除２：前回実績に対応する受払予定の削除
			ioDelSrv.up0().addAll(crtDelIoSchdListForUpList());

			ioDelSrv.exec();
		}

		/**
		 * 削除１：入荷予定に対応する受払予定の削除リストを作成する<br>
		 * @return retL
		 */
		protected MCList<MSW_IO_SCHD_DEL_R> crtDelIoSchdListForArrSchd() {

			MCList<MSW_IO_SCHD_DEL_R> retL = MCList.create(MSW_IO_SCHD_DEL_R.class);
			
			// 実績が分割されていた場合、予定行が重複するので１行に絞る。
			MCList<MST_ARR_SCHD_R>[] grpL = _arrSchdDbcL.groupList(MST_ARR_SCHD_R.$arr_schd_no); 
			for (MCList<MST_ARR_SCHD_R> arrSchdL : grpL) {
				MST_ARR_SCHD_R arrSchdDbcR = arrSchdL.get(0);
				if (!isNull(arrSchdDbcR.arr_schd_no())) {

					MSW_IO_SCHD_DEL_R addR = MSW_IO_SCHD_DEL_R.create();

					//通常購買
					if (MAC_PURC_ID_TYP.isPURC(arrSchdDbcR.purc_id_typ()) || MAC_PURC_ID_TYP.isONR_RCV(arrSchdDbcR.purc_id_typ())) {

						//受払予定区分：仕入入荷
						if (arrSchdDbcR.getBooleanNE("purc_ddlv_flg")) {
							addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());//仕入入庫（直送）
						}
						else if (isNull(arrSchdDbcR.getStringNE("sppl_cd"))) {
							addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());//仕入入荷
						}
						else {
							addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());//仕入入荷(支給)
						}
					}
					//VMI、無償受給
					else if (MAC_PURC_ID_TYP.isVMI(arrSchdDbcR.purc_id_typ())
							|| MAC_PURC_ID_TYP.isFFR_RCV(arrSchdDbcR.purc_id_typ())){

						//受払予定区分：入荷
						if (isNull(arrSchdDbcR.getStringNE("sppl_cd"))) {
							addR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());//入荷
						}
						else {
							addR.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());//入荷(支給)
						}
					}

					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					addR.io_schd_no(arrSchdDbcR.arr_schd_no());

					retL.add(addR);
				}
			}
			return retL;
		}

		/**
		 * 受払予定状況区分を返す
		 * @param arrSchdDbcR
		 * @return MSC_IO_SCHD_STS_TYP
		 */
		protected String getIoSchdStsTyp(MST_ARR_SCHD_R arrSchdDbcR) {

			if (isNull(arrSchdDbcR.dlv_inst_d_no())&&isNull(arrSchdDbcR.prms_rcpt_d_no())) {
				return MSC_IO_SCHD_STS_TYP.PO.value();//発注
			}
			//納期回答受領明細ＮＯあり
			else if(!isNull(arrSchdDbcR.prms_rcpt_d_no())){
				return MSC_IO_SCHD_STS_TYP.PRMS.value();//納期回答
			}
			//納入指示明細ＮＯあり
			else if (!isNull(arrSchdDbcR.dlv_inst_d_no())) {
				return MSC_IO_SCHD_STS_TYP.DLV_INST.value();//納入指示
			}

			return null;
		}

		/**
		 * 削除２：前回実績に対応する受払予定の削除リストを作成する<br>
		 * ※出庫に対応する入庫の受払予定は受払予定サービスで削除される。
		 * @return retL
		 */
		protected MCList<MSW_IO_SCHD_DEL_R> crtDelIoSchdListForUpList() {

			MCList<MSW_IO_SCHD_DEL_R> retL = MCList.create(MSW_IO_SCHD_DEL_R.class);

			if (_arrSchdDbcL.size() <= 0) {
				return retL;
			}

			MCIndexKey _arrSchdArrActKey = _arrSchdDbcL.createIndex("arr_act_no");
			MCIndexKey _arrSchdPurcActIoKey = _arrSchdDbcL.createIndex("purc_act_io_no");
						
			for (PurcIoSchd_Upd01_DtlR up0R : up0()) {

				//出庫用
				MSW_IO_SCHD_DEL_R addOutR = MSW_IO_SCHD_DEL_R.create();

				//確定ＮＯ：入荷実績ＮＯ
				if(MSC_FIX_NO_TYP.isARR_ACT_NO(up0R.fix_no_typ())){

					//対応する入荷予定の取得
					MST_ARR_SCHD_R arrSchdDbcR =_arrSchdDbcL.getFirst(_arrSchdArrActKey, up0R.fix_no());
					if (isNull(arrSchdDbcR)) {
						continue;
					}
					
					//1	在庫検査区分が検査待・検査中かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が自社場所
					//2	在庫検査区分が検査待・検査中かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が外注場所
					//3	在庫検査区分が検査済かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が自社場所
					//4	在庫検査区分が検査済かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が外注場所

					//1　在庫検査区分が検査待・検査中かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が自社場所の場合
					if((MSC_STK_INSP_TYP.isYET(up0R.stk_insp_typ())
								||MSC_STK_INSP_TYP.isING(up0R.stk_insp_typ())
								||MSC_STK_INSP_TYP.isWAIT_JUDG(up0R.stk_insp_typ()))
							&& isNull(arrSchdDbcR.getStringNE("sppl_cd"))){
						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI.value());//仕入出庫
						addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//入荷済
						addOutR.io_schd_no(up0R.fix_no());
						retL.add(addOutR);
					}
					//2　在庫検査区分が検査待・検査中かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が外注場所の場合
					else if((MSC_STK_INSP_TYP.isYET(up0R.stk_insp_typ())
								||MSC_STK_INSP_TYP.isING(up0R.stk_insp_typ())
								||MSC_STK_INSP_TYP.isWAIT_JUDG(up0R.stk_insp_typ()))
							&& !isNull(arrSchdDbcR.getStringNE("sppl_cd"))){
						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI_PROV.value());//仕入出庫(支給)
						addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//入荷済
						addOutR.io_schd_no(up0R.fix_no());
						retL.add(addOutR);
					}
					//3　在庫検査区分が検査済かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が自社場所の場合
					else if(MSC_STK_INSP_TYP.isFIN(up0R.stk_insp_typ())
							&& isNull(arrSchdDbcR.getStringNE("sppl_cd"))){
						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI.value());//仕入出庫
						MST_INSP_SCHD_R inspSchdR = _inspSchdDbcL.getFirst(_inspSchdKey, up0R.fix_no());
						if (!isNull(inspSchdR) && !inspSchdR.in_prmt_insp_flg()) {
							addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.INSP.value());//検査済							
						}
						else {
							addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//入荷済
						}
						addOutR.io_schd_no(up0R.fix_no());
						retL.add(addOutR);
					}
					//4　在庫検査区分が検査済かつ、確定ＮＯが入荷実績の場合、かつ対応する入荷予定の入荷場所が外注場所の場合
					else if(MSC_STK_INSP_TYP.isFIN(up0R.stk_insp_typ())
							&& !isNull(arrSchdDbcR.getStringNE("sppl_cd"))){
						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI_PROV.value());//仕入出庫(支給)
						MST_INSP_SCHD_R inspSchdR = _inspSchdDbcL.getFirst(_inspSchdKey, up0R.fix_no());
						if (!isNull(inspSchdR) && !inspSchdR.in_prmt_insp_flg()) {
							addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.INSP.value());//検査済							
						}
						else {
							addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//入荷済
						}
						addOutR.io_schd_no(up0R.fix_no());
						retL.add(addOutR);
					}
				}
				//確定ＮＯ：仕入実績受払ＮＯ
				else if (MSC_FIX_NO_TYP.isPURC_ACT_IO_NO(up0R.fix_no_typ())){

					//対応する入荷予定の取得
					MST_ARR_SCHD_R arrSchdDbcR =_arrSchdDbcL.getFirst(_arrSchdPurcActIoKey, up0R.fix_no());
					if (isNull(arrSchdDbcR)) {
						continue;
					}
					
					//5	確定ＮＯが仕入実績受払ＮＯの場合、かつ対応する入荷予定の入荷場所が自社場所
					//6	確定ＮＯが仕入実績受払ＮＯの場合、かつ対応する入荷予定の入荷場所が外注場所

					//5
					if(isNull(arrSchdDbcR.getStringNE("sppl_cd"))){

						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_XFR_OUT.value());//仕入転出
						addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PURC.value());//仕入済
						addOutR.io_schd_no(arrSchdDbcR.arr_schd_no());//入荷予定ＮＯ
						retL.add(addOutR);
					}
					//6
					else if(!isNull(arrSchdDbcR.getStringNE("sppl_cd"))){

						//出庫
						addOutR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV.value());//仕入転出(支給)
						addOutR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PURC.value());//仕入済
						addOutR.io_schd_no(arrSchdDbcR.arr_schd_no());//入荷予定ＮＯ
						retL.add(addOutR);
					}
				}
			}

			return retL;
		}

		/**
		 * 受払予定を識別するための区分のカラム名<br>
		 * 1.入荷予定に対応する受払予定<br>
		 * 2.上り電文(実績)に対応する受払予定<br>
		 * ※本オペレーションでのみ使用。
		 */
		protected String _col_is_row_typ = "is_row_typ";

		/** 入荷予定に対応する受払予定 */
		protected String _is_row_typ1 = "1";

		/** 上り電文(実績)に対応する受払予定 */
		protected String _is_row_typ2 = "2";

		/**
		 * 受払予定を作成する。<br>
		 * 追加１：入荷予定に対する受払予定作成(残数)<br>
		 * 追加２：今回処理実績(上り電文)に対する受払予定作成<br>
		 */
		protected void crtIoSchd() {

			mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService.IoSchd_Ins01 isSrv
			= mcframe.serverMSBE.MSBEL5020.MSBEL_IoSchdService.crtIoSchd_Ins01();

			MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> isSrvUp0L
			= isSrv.up0().createInstance();

			//追加１：入荷予定に対する受払予定作成(残数)
			isSrvUp0L.addAll(crtIoSchdListForArrSchd());

			//追加２：今回処理実績(上り電文)に対する受払予定作成
			isSrvUp0L.addAll(crtIoSchdListForUpList());

			//検査終了予定日の設定
			setInspCmplSchdDt(isSrvUp0L);

			isSrv.up0().setAll(isSrvUp0L);
			isSrv.exec();

		}

		/**
		 * 入荷予定に対する受払予定(残数)用の引数リストを作成する。
		 * @return retL
		 */
		protected MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> crtIoSchdListForArrSchd() {

			MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> retL = MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.class);
			
			// 実績が分割されていた場合、予定行が重複するので１行に絞る。
			MCList<MST_ARR_SCHD_R>[] grpL = _arrSchdDbcL.groupList(MST_ARR_SCHD_R.$arr_schd_no); 
			
			//ループ単位：上り電文単位ではなく、上り電文の確定ＮＯに対応する入荷予定単位でのループ
			//※計画外入荷は入荷予定はなく、処理対象の入荷予定のリストにも含まれないため対象外となる。
			for (MCList<MST_ARR_SCHD_R> arrSchdDbcL : grpL) {
				
				MST_ARR_SCHD_R arrSchdDbcR = arrSchdDbcL.get(0);
				
				mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR addR
				= mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.create();
				addR.addStringColumn(_col_is_row_typ,_is_row_typ1);
				//残数
				MCNumber bakQty = MCNumber.ZERO;

				//入荷実績ＮＯ
				if (!isNull(arrSchdDbcR.getStringNE("arr_act_no"))) {

					bakQty = arrSchdDbcR.base_unit_qty().subtract(arrSchdDbcR.arr_qty().add(arrSchdDbcR.abort_qty()));

					if(bakQty.lte(0)){
						continue;
					}
				}
				//仕入明細実績ＮＯ
				else if (!isNull(arrSchdDbcR.getStringNE("purc_act_io_no"))) {
					bakQty = arrSchdDbcR.base_unit_qty().subtract(arrSchdDbcR.purc_qty().add(arrSchdDbcR.getNumberNE("base_unit_abort_qty")));
					if(bakQty.lte(0)){
						continue;
					}
				}

				//1　仕入直送
				if (arrSchdDbcR.getBooleanNE("purc_ddlv_flg")) {
					//受払予定区分
					addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());//仕入入庫（直送）
					//受払予定状況区分
					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					//在庫検査区分
					addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					//在庫識別区分
					addR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				//2　対応する入荷予定の購買識別区分が通常購買であり、入荷場所が自社場所
				else if ((MAC_PURC_ID_TYP.isPURC(arrSchdDbcR.purc_id_typ()) || MAC_PURC_ID_TYP.isONR_RCV(arrSchdDbcR.purc_id_typ()))
					&& isNull(arrSchdDbcR.getStringNE("sppl_cd"))
				) {

					//受払予定区分
					addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());//仕入入荷
					//受払予定状況区分
					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					//在庫検査区分
					addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					//在庫識別区分
					addR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				//3-4-5 対応する入荷予定の購買識別区分が通常購買であり、入荷場所が外注場所。
				else if ((MAC_PURC_ID_TYP.isPURC(arrSchdDbcR.purc_id_typ()) || MAC_PURC_ID_TYP.isONR_RCV(arrSchdDbcR.purc_id_typ()))
					&& !isNull(arrSchdDbcR.getStringNE("sppl_cd"))){

					//3.支給単価マスタの支給区分が有償支給で、取引先マスタの支給計上区分が使用基準ではない。
					//4.支給単価マスタの支給区分が有償支給で、取引先マスタの支給計上区分が使用基準ではある。
					//5.支給単価マスタの支給区分が有償支給でない（自給またはマスタ存在なし）。

					String prov_typ = arrSchdDbcR.getStringNE("prov_typ");
					String prov_basis_typ = arrSchdDbcR.getStringNE("prov_basis_typ");

					//3.
					if(MAC_PROV_TYP.isONR_PROV(prov_typ)
							&& !MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)){

						//受払予定区分
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());//仕入入荷(支給)
						//受払予定状況区分
						addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
						//在庫検査区分
						addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
						//在庫識別区分
						addR.stk_id_typ(MSC_STK_ID_TYP.ONR_PROV.value());
					}
					//4.
					else if(MAC_PROV_TYP.isONR_PROV(prov_typ)
							&& MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ)){

						//受払予定区分
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());//仕入入荷(支給)
						//受払予定状況区分
						addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
						//在庫検査区分
						addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
						//在庫識別区分
						addR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
					//5.
					else if(isNull(prov_typ) || !MAC_PROV_TYP.isONR_PROV(prov_typ)){

						//受払予定区分
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());//仕入入荷(支給)
						//受払予定状況区分
						addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
						//在庫検査区分
						addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
						//在庫識別区分
						addR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
				}
				//6	対応する入荷予定の購買識別区分がＶＭＩである
				else if (MAC_PURC_ID_TYP.isVMI(arrSchdDbcR.purc_id_typ())){

					//受払予定区分
					addR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());//入荷
					//受払予定状況区分
					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					//在庫検査区分
					addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					//在庫識別区分
					addR.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());//VMI
				}
				//7	対応する入荷予定の購買識別区分が無償受給であり、入荷場所が自社場所。
				else if (MAC_PURC_ID_TYP.isFFR_RCV(arrSchdDbcR.purc_id_typ())
						&& isNull(arrSchdDbcR.getStringNE("sppl_cd"))){

					//受払予定区分
					addR.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());//入荷
					//受払予定状況区分
					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					//在庫検査区分
					addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					//在庫識別区分
					addR.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
				}
				//8	対応する入荷予定の購買識別区分が無償受給であり、入荷場所が外注場所。
				else if (MAC_PURC_ID_TYP.isFFR_RCV(arrSchdDbcR.purc_id_typ())
						&& !isNull(arrSchdDbcR.getStringNE("sppl_cd"))){

					//受払予定区分
					addR.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());//入荷(支給)
					//受払予定状況区分
					addR.io_schd_sts_typ(getIoSchdStsTyp(arrSchdDbcR));
					//在庫検査区分
					addR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					//在庫識別区分
					addR.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
				}

				//受払予定ＮＯ
				addR.io_schd_no(arrSchdDbcR.arr_schd_no());//入荷予定ＮＯ

				//受払予定予備ＮＯ１
				addR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.PO_NO.value());
				addR.io_schd_sub_no1(arrSchdDbcR.getStringNE("po_no"));//発注ＮＯ

				//受払予定予備ＮＯ２
				addR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value());
				addR.io_schd_sub_no2(arrSchdDbcR.getStringNE("po_d_no"));//発注明細ＮＯ

				//受払予定予備ＮＯ３
				if (!isNull(arrSchdDbcR.mfg_inst_no())) {
					addR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value());
					addR.io_schd_sub_no3(arrSchdDbcR.mfg_inst_no());//製造指図ＮＯ
					// 仕入入庫・仕入入庫（支給）のとき
					if ((MSC_IO_SCHD_TYP.isPURC_GR_PROV(addR.io_schd_typ())
							|| MSC_IO_SCHD_TYP.isPURC_GR(addR.io_schd_typ()))
							&& arrSchdDbcR.outsrc_flg()) {
						addR.itm_mfg_inst_no(arrSchdDbcR.getStringNE("itm_mfg_inst_no"));
						addR.mfg_inst_unit_typ(arrSchdDbcR.getStringNE("mfg_inst_unit_typ"));
					}
				}

				addR.io_schd_pr_no(arrSchdDbcR.io_schd_pr_no());//受払進捗管理ＮＯ
				addR.schd_dt(arrSchdDbcR.arr_schd_tm());

				//検収予定日
				addR.accpt_schd_dt(arrSchdDbcR.getDateNE("purc_schd_dt"));//仕入予定日

				//insp_cmpl_schd_dt	検査終了予定日はループの外で設定する

				addR.itm_cd(arrSchdDbcR.itm_cd());
				addR.itm_sub1(arrSchdDbcR.itm_sub1());
				addR.itm_sub2(arrSchdDbcR.itm_sub2());
				addR.itm_sub3(arrSchdDbcR.itm_sub3());
				addR.ver_no(arrSchdDbcR.ver_no());
				addR.loc_cd(arrSchdDbcR.arr_loc_cd());
				addR.str_ln_cd(arrSchdDbcR.str_ln_cd());
				addR.stk_arrv_bp_cd(arrSchdDbcR.stk_arrv_bp_cd());
				addR.lot_no(arrSchdDbcR.lot_no());
				addR.sublot_no(arrSchdDbcR.sublot_no());
				addR.sno1(arrSchdDbcR.sno1());
				addR.sno2(arrSchdDbcR.sno2());
				addR.sno3(arrSchdDbcR.sno3());
				addR.sno4(arrSchdDbcR.sno4());
				addR.rsn_cd(arrSchdDbcR.getStringNE("rsn_cd"));
				addR.trd_unit_cd(arrSchdDbcR.trd_unit_cd());
				addR.base_unit_cd(arrSchdDbcR.base_unit_cd());
				addR.base_unit_qty(bakQty);
				addR.gd_cd(arrSchdDbcR.gd_cd());
				addR.quality_typ(arrSchdDbcR.quality_typ());
				addR.stk_bp_cd(arrSchdDbcR.stk_bp_cd());
				addR.sppl_cd(arrSchdDbcR.getStringNE("arr_pr_sppl_cd"));//入荷進捗の発注先ＣＤ

				//品管サービス用の一時カラム
				addR.addStringColumn("maker_cd",arrSchdDbcR.maker_cd());//入荷予定のメーカーＣＤ

				retL.add(addR);
			}

			return retL;
		}

		/**
		 * 今回処理実績(上り電文)に対する受払予定リストを作成する<br>
		 * ※受払予定状況区分を設定する際は、
		 * @return retL
		 */
		protected MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> crtIoSchdListForUpList() {

			MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> retL = MCList.create(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.class);

			//今回処理実績(上り電文)に対する受払予定作成
			//ループ単位：上り電文
			MCIndexKey idxUp0 = up0().createIndex(PurcIoSchd_Upd01_DtlR.$fix_no_typ);
			MCList<PurcIoSchd_Upd01_DtlR> subL = up0().subList(idxUp0, MSC_FIX_NO_TYP.ARR_ACT_NO.value());
			subL.addAll(up0().subList(idxUp0, MSC_FIX_NO_TYP.PURC_ACT_IO_NO.value()));
			
			for(PurcIoSchd_Upd01_DtlR up0R : subL){ 
				
				// 削除時は予定を作成しない
				if(up0R.base_unit_qty().isZero()){
					continue;
				}
				
				mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR addR
				= mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.create();
				addR.addStringColumn(_col_is_row_typ,_is_row_typ2);

				//確定ＮＯに対応する対応する入荷予定
				MST_ARR_SCHD_R arrSchdDbcR = MST_ARR_SCHD_R.create();

				//入荷実績ＮＯ
				if(MSC_FIX_NO_TYP.isARR_ACT_NO(up0R.fix_no_typ())){
					if (!MSC_STK_ID_TYP.isPURC_PRE_ACCPT(up0R.stk_id_typ())) {
						// 確定ＮＯが入荷実績ＮＯであるのは、以下の通り
						// 1.入荷実績後検収前（在庫識別区分：仕入検収前）⇒受払予定を作る
						// 2.検収後検査待の在庫（在庫識別区分：自社在庫）⇒受払予定を作らない
						// 3.入荷実績後検収不良（在庫識別区分：検収不良）⇒受払予定を作らない
						// したがって、在庫識別区分が仕入検収前でない場合は実績に紐付く受払予定を作らない。
						continue;
					}

					arrSchdDbcR =_arrSchdDbcL.getFirst("arr_act_no", up0R.fix_no());
					//----------------
					// 受払予定区分
					//----------------
					if (isNull(arrSchdDbcR.getStringNE("sppl_cd"))) {
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI.value());//仕入出庫
					}
					else {
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GI_PROV.value());//仕入出庫(支給)
					}
					
					//----------------
					//　受払予定予備ＮＯ
					//----------------
					//　仕入予定ＮＯ
					addR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.PURC_SCHD_NO.value());
					addR.io_schd_sub_no1(arrSchdDbcR.getStringNE("purc_schd_no"));
					//　製造指図ＮＯ
					if (!isNull(arrSchdDbcR.mfg_inst_no())) {
						addR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value());
						addR.io_schd_sub_no3(arrSchdDbcR.mfg_inst_no());//製造指図ＮＯ
						addR.itm_mfg_inst_no(arrSchdDbcR.getStringNE("itm_mfg_inst_no"));
						addR.mfg_inst_unit_typ(arrSchdDbcR.getStringNE("mfg_inst_unit_typ"));
					}
					// 今回実績の格付ＣＤ
					addR.gr_gd_cd(up0R.gd_cd());
				}
				//仕入実績受払ＮＯ
				else if (MSC_FIX_NO_TYP.isPURC_ACT_IO_NO(up0R.fix_no_typ())){

					arrSchdDbcR =_arrSchdDbcL.getFirst("purc_act_io_no", up0R.fix_no());
					//----------------
					//　受払予定区分
					//----------------
					if (isNull(arrSchdDbcR.getStringNE("sppl_cd"))) {
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_XFR_OUT.value());//仕入転出
					}
					else {
						addR.io_schd_typ(MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV.value());//仕入転出（支給）
					}
					//----------------
					//　受払予定予備ＮＯ
					//----------------
					//　発注ＮＯ
					addR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.PO_NO.value());
					addR.io_schd_sub_no1(arrSchdDbcR.getStringNE("po_no"));
					//　発注明細ＮＯ
					addR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value());
					addR.io_schd_sub_no2(arrSchdDbcR.getStringNE("po_d_no"));//製造指図ＮＯ
					//　製造指図ＮＯ
					if (!isNull(arrSchdDbcR.mfg_inst_no())) {
						addR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value());
						addR.io_schd_sub_no3(arrSchdDbcR.mfg_inst_no());//製造指図ＮＯ	
					}
					// 入荷予定の格付ＣＤ
					addR.gr_gd_cd(arrSchdDbcR.gd_cd());
				}

				//io_schd_sts_typ 受払予定状況区分はループの外で設定する

				//受払予定ＮＯ
				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
				){
					addR.io_schd_no(up0R.fix_no());//確定ＮＯ
				}
				else if(MSC_IO_SCHD_TYP.isPURC_XFR_OUT(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(addR.io_schd_typ())
				){
					addR.io_schd_no(arrSchdDbcR.arr_schd_no());//入荷予定ＮＯ
				}

//				//受払予定予備ＮＯ１
//				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
//						|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
//				){
//					addR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.PURC_SCHD_NO.value());
//					addR.io_schd_sub_no1(arrSchdDbcR.getStringNE("purc_schd_no"));//仕入予定の仕入予定ＮＯ
//					addR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value());
//					addR.io_schd_sub_no3(arrSchdDbcR.mfg_inst_no());//製造指図ＮＯ
//				}

				addR.io_schd_pr_no(arrSchdDbcR.io_schd_pr_no());

				//予定日付
				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
				){

					addR.schd_dt(arrSchdDbcR.getDateNE("arr_tm"));//入荷実績の実績日時
				}
				else if(MSC_IO_SCHD_TYP.isPURC_XFR_OUT(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(addR.io_schd_typ())
				){

					addR.schd_dt(arrSchdDbcR.arr_schd_tm());//入荷予定の入荷予定日
				}

				//検収予定日
				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
				){
					addR.accpt_schd_dt(arrSchdDbcR.getDateNE("purc_schd_dt"));//仕入予定の仕入予定日
				}

				//insp_cmpl_schd_dt 検査終了予定日はループの外で設定する

				addR.itm_cd(up0R.itm_cd());
				addR.itm_sub1(up0R.itm_sub1());
				addR.itm_sub2(up0R.itm_sub2());
				addR.itm_sub3(up0R.itm_sub3());

				//版ＮＯ
				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
				){
					addR.ver_no(arrSchdDbcR.getStringNE("arr_act_ver_no"));//入荷実績の版ＮＯ
				}
				else if(MSC_IO_SCHD_TYP.isPURC_XFR_OUT(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(addR.io_schd_typ())
				){
					addR.ver_no(arrSchdDbcR.getStringNE("purc_act_io_ver_no"));//仕入実績の版ＮＯ
				}

				addR.loc_cd(up0R.loc_cd());
				addR.str_ln_cd(up0R.str_ln_cd());
				addR.stk_arrv_bp_cd(up0R.stk_arrv_bp_cd());
				if ((MSC_IO_SCHD_TYP.isPURC_XFR_OUT(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(addR.io_schd_typ()))
						&& MSC_PURC_UNFIX_STR.isUNFIXED(up0R.lot_no())) {
					addR.lot_no(arrSchdDbcR.lot_no());
					addR.sublot_no(arrSchdDbcR.sublot_no());
				} else {
					addR.lot_no(up0R.lot_no());
					addR.sublot_no(up0R.sublot_no());
				}
				addR.sno1(up0R.sno1());
				addR.sno1_null_flg(false);
				addR.sno2(up0R.sno2());
				addR.sno2_null_flg(false);
				addR.sno3(up0R.sno3());
				addR.sno3_null_flg(false);
				addR.sno4(up0R.sno4());
				addR.sno4_null_flg(false);

				addR.trd_unit_cd(up0R.pack_unit_cd());
				addR.trd_unit_qty(up0R.pack_unit_qty());
				addR.base_unit_cd(arrSchdDbcR.base_unit_cd());
				addR.base_unit_qty(up0R.base_unit_qty());
				addR.gd_cd(up0R.gd_cd());
				addR.quality_typ(up0R.quality_typ());
				addR.stk_insp_typ(up0R.stk_insp_typ());
				addR.stk_id_typ(up0R.stk_id_typ());
				addR.stk_bp_cd(up0R.stk_bp_cd());
				addR.rsn_cd(arrSchdDbcR.getStringNE("rsn_cd"));

				//発注先ＣＤ
				if(MSC_IO_SCHD_TYP.isPURC_GI(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(addR.io_schd_typ())
				){

					addR.sppl_cd(arrSchdDbcR.getStringNE("arr_act_sppl_cd"));//入荷実績の発注先ＣＤ
					//品管サービス用の一時カラム
					addR.addStringColumn("maker_cd",nvl(arrSchdDbcR.getStringNE("arr_act_maker_cd"),arrSchdDbcR.maker_cd()));//入荷実績のメーカーＣＤ
				}
				else if(MSC_IO_SCHD_TYP.isPURC_XFR_OUT(addR.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(addR.io_schd_typ())
				){

					addR.sppl_cd(arrSchdDbcR.getStringNE("purc_act_sppl_cd"));//仕入実績の発注先ＣＤ
					//品管サービス用の一時カラム
					addR.addStringColumn("maker_cd",nvl(arrSchdDbcR.getStringNE("purc_act_d_maker_cd"),arrSchdDbcR.maker_cd()));//仕入実績明細のメーカーＣＤ
				}
				//受払予定状況区分の設定
				setIoSchdStsTyp(addR, up0R);

				retL.add(addR);
			}

			return retL;
		}

		/**
		 * 受払予定状況区分を設定する
		 * @param dtlR
		 * @param up0R
		 */
		protected void setIoSchdStsTyp(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR dtlR, PurcIoSchd_Upd01_DtlR up0R) {

			//受払予定状況区分の設定

			//受払予定区分：仕入出庫の場合（未着の仕入登録でない場合）
			if(MSC_IO_SCHD_TYP.isPURC_GI(dtlR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_GI_PROV(dtlR.io_schd_typ())){

				//上り電文の在庫検査区分検査待・検査中・判定待
				if(MSC_STK_INSP_TYP.isYET(dtlR.stk_insp_typ())
					|| MSC_STK_INSP_TYP.isING(dtlR.stk_insp_typ())
					|| MSC_STK_INSP_TYP.isWAIT_JUDG(dtlR.stk_insp_typ())){
					dtlR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//受払予定状況区分：入荷済
				}
				//上り電文の在庫検査区分検査済
				else if(MSC_STK_INSP_TYP.isFIN(dtlR.stk_insp_typ())){
					MST_INSP_SCHD_R inspSchdR = _inspSchdDbcL.getFirst(_inspSchdKey, up0R.fix_no());
					// 検査対象
					if (!isNull(inspSchdR) && !inspSchdR.in_prmt_insp_flg()) {
						dtlR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.INSP.value());//受払予定状況区分：検査済
					}
					// 検査対象外
					else {
						dtlR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());//受払予定状況区分：入荷済							
					}						
				}
			}
			//受払予定区分：仕入転出の場合（未着の仕入登録の場合）
			else if(MSC_IO_SCHD_TYP.isPURC_XFR_OUT(dtlR.io_schd_typ())
					|| MSC_IO_SCHD_TYP.isPURC_XFR_OUT_PROV(dtlR.io_schd_typ())){
				dtlR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PURC.value());//受払予定状況区分：仕入済
			}
		}

		/**
		 * 検査終了予定日を設定を設定する
		 * @param isSrvUp0L
		 */
		protected void setInspCmplSchdDt(MCList<mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR> isSrvUp0L) {

			mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.InspSchd_Srch03 inspSrv
			= mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService.crtInspSchd_Srch03();

			setPegNo(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.$peg_no, isSrvUp0L);

			for(mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR isSrvUp0R : isSrvUp0L){


				mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR isCndR = inspSrv.up0().createRow();
				isCndR.peg_no(isSrvUp0R.peg_no());
				isCndR.insp_typ(MSC_INSP_TYP.ACCPT.value());
				isCndR.itm_cd(isSrvUp0R.itm_cd());
				isCndR.itm_sub1(isSrvUp0R.itm_sub1());
				isCndR.itm_sub2(isSrvUp0R.itm_sub2());
				isCndR.itm_sub3(isSrvUp0R.itm_sub3());
				isCndR.mfg_loc_cd();
				isCndR.sppl_cd(isSrvUp0R.sppl_cd());
				isCndR.maker_cd(isSrvUp0R.getStringNE("maker_cd"));
				isCndR.schd_gr_dt(isSrvUp0R.schd_dt());
				isCndR.to_loc_cd(isSrvUp0R.loc_cd());
				isCndR.insp_flg();
				inspSrv.up0().add(isCndR);
			}

			if (!inspSrv.up0().isEmpty()){
				inspSrv.exec();
			}

			String[] destCols = new String[]{
					mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt
			};
			String[] srcCols = new String[]{
					mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.$end_dt
			};

			copyByPegNo(isSrvUp0L, inspSrv.down0(), 
					mcframe.serverMSBE.MSBEL5020.IoSchd_Ins01_DtlR.$peg_no,
					destCols,
					mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.$peg_no,
					srcCols);
		}
	}

	//FMCB CUSTOM END
}