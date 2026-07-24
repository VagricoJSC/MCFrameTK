package mcframe.serverPFBE.PFBEL5210;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9020.*;
import mcframe.commonPFBE.PFBER5210.*;
import mcframe.commonPFBE.PFBER5210.PFBER_BpStopPrnt;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBEL_BpStopIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBEL_BpStopIf_MC extends PFBEL_BpStopIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpStopIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpStopIf_Conv01 extends PFBEL_BpStopIf_MC_A.BpStopIf_Conv01 {
		/** 論理削除フラグの制御を行うテーブル名を指定します。 */
		protected String[] _delFlgTblNm = {MAM_BP_STOP_R.TABLE_NAME};

		@Override
		protected void call() {
			MAUCL_ContextUtil.enableDelFlgOn(_delFlgTblNm);
			super.call();
			MAUCL_ContextUtil.unableDelFlgOn(_delFlgTblNm);
		}
		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class,
					MBT_BP_STOP_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBER_BpStopPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_BP_STOP_SND_IF_R());
			_IfRptSet.setConvClass(this);
		}

		@Override
		protected void preWrite() {
			super.preWrite();
			setExeStsSkp();
		}

		/**
		 * 対応する取引先マスタがない送信ＩＦデータの実行状況区分にスキップを設定
		 */
		protected void setExeStsSkp() {
			MBT_BP_STOP_SND_IF_R t = MBT_BP_STOP_SND_IF_R.create("T");
			MAM_BP_STOP_R S1W = MAM_BP_STOP_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			// 前回のスキップのデータがあれば未処理に戻す
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.NOT_EXE.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.SKP.value())));
			dbUpdate("PFBEL5210_MBT_BP_STOP_SND_IF_U01", up0(), dbc_bldr);

			// スキップ設定
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.SKP.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.data_crud_typ.neq(bind("1")),
					MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
					.where(S1W.bp_cd.eq(t.bp_cd))));
			dbUpdate("PFBEL5210_MBT_BP_STOP_SND_IF_U02", up0(), dbc_bldr);

		}

		@Override
		public void initCache(MCList<? extends MCDBContainer> ifL) {
			initBpStopCache((MCList<MBT_BP_STOP_SND_IF_R>)ifL);
		}

		public class DtlR_MBT_BP_STOP_SND_IF_R<D extends DtlR, S extends MBT_BP_STOP_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_crud_typ, MBT_BP_STOP_SND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$bp_cd, MBT_BP_STOP_SND_IF_R.$bp_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.co_cd(getCo().co_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}

				MAM_BP_STOP_R r = getBpStopR(dest.bp_cd());
				if (r == null) {
					return;
				}
				// 取引先禁止マスタから
				dest.slo_stop_dt(r.slo_stop_dt());
				dest.po_stop_dt(r.po_stop_dt());
				dest.sls_stop_dt(r.sls_stop_dt());
				dest.purc_stop_dt(r.purc_stop_dt());
				dest.order_stop_dt(r.order_stop_dt());
				dest.mfg_inst_stop_dt(r.mfg_inst_stop_dt());
				dest.ship_inst_stop_dt(r.ship_inst_stop_dt());
				dest.xfr_stop_dt(r.xfr_stop_dt());
				dest.memo1(r.memo1());
				dest.memo2(r.memo2());
				dest.memo3(r.memo3());
				dest.del_flg(r.del_flg());
				// 取引先禁止マスタ送信IFテーブルから
				dest.data_crud_typ(src.data_crud_typ());
				dest.bp_cd(src.bp_cd());
				dest.if_sub_char1(src.if_sub_char1());
				dest.if_sub_char2(src.if_sub_char2());
				dest.if_sub_char3(src.if_sub_char3());
				dest.if_sub_char4(src.if_sub_char4());
				dest.if_sub_char5(src.if_sub_char5());
				dest.if_sub_char6(src.if_sub_char6());
				dest.if_sub_char7(src.if_sub_char7());
				dest.if_sub_char8(src.if_sub_char8());
				dest.if_sub_char9(src.if_sub_char9());
				dest.if_sub_char10(src.if_sub_char10());
				dest.if_sub_char11(src.if_sub_char11());
				dest.if_sub_char12(src.if_sub_char12());
				dest.if_sub_char13(src.if_sub_char13());
				dest.if_sub_char14(src.if_sub_char14());
				dest.if_sub_char15(src.if_sub_char15());
				dest.if_sub_char16(src.if_sub_char16());
				dest.if_sub_char17(src.if_sub_char17());
				dest.if_sub_char18(src.if_sub_char18());
				dest.if_sub_char19(src.if_sub_char19());
				dest.if_sub_char20(src.if_sub_char20());
				dest.if_sub_char21(src.if_sub_char21());
				dest.if_sub_char22(src.if_sub_char22());
				dest.if_sub_char23(src.if_sub_char23());
				dest.if_sub_char24(src.if_sub_char24());
				dest.if_sub_char25(src.if_sub_char25());
				dest.if_sub_char26(src.if_sub_char26());
				dest.if_sub_char27(src.if_sub_char27());
				dest.if_sub_char28(src.if_sub_char28());
				dest.if_sub_char29(src.if_sub_char29());
				dest.if_sub_char30(src.if_sub_char30());
				dest.if_sub_num1(src.if_sub_num1());
				dest.if_sub_num2(src.if_sub_num2());
				dest.if_sub_num3(src.if_sub_num3());
				dest.if_sub_num4(src.if_sub_num4());
				dest.if_sub_num5(src.if_sub_num5());
				dest.if_sub_dt1(src.if_sub_dt1());
				dest.if_sub_dt2(src.if_sub_dt2());
				dest.if_sub_dt3(src.if_sub_dt3());
				dest.if_sub_dt4(src.if_sub_dt4());
				dest.if_sub_dt5(src.if_sub_dt5());
			}
		}
	}
	protected static final Class<PFBEL_BpStopIf> CLAZZ = PFBEL_BpStopIf.class;

	/**
	 * 「MAM_BP_STOP_」取得
	 */
	MCList<MAM_BP_STOP_R> _bpStopL;
	MCIndexKey _bpStopKey;

	protected void initBpStopCache(MCList<MBT_BP_STOP_SND_IF_R> ifL) {
		MAM_BP_STOP_R t = MAM_BP_STOP_R.create("T");
		MBT_BP_STOP_SND_IF_R S1W1 = MBT_BP_STOP_SND_IF_R.create("W1");
		PFW_SDRV_IF_R S1W2 = PFW_SDRV_IF_R.create("W2");

		MCList<MAM_BP_STOP_R> dbc = MCList.create(MAM_BP_STOP_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd, t.slo_stop_dt, t.po_stop_dt, t.sls_stop_dt,
				t.purc_stop_dt, t.order_stop_dt, t.mfg_inst_stop_dt, t.ship_inst_stop_dt,
				t.xfr_stop_dt, t.memo1, t.memo2, t.memo3, t.del_flg);
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
				.from(S1W1.innerJoin(S1W2).on(S1W2.data_no.eq(S1W1.data_no)))
				.where(S1W1.bp_cd.eq(t.bp_cd)
						.and(value(MAC_DATA_CRUD_TYP.DEL.value()).neq(S1W1.data_crud_typ)))));
		dbc_bldr.addOrderByAsc(t.bp_cd);
		if(!isNull(ifL)) {
			MCList<MAW_BP_KEY_R> bpKeyL = MCList.create(MAW_BP_KEY_R.class);
			addAll(bpKeyL, ifL, createMap_MAW_BP_KEY_R_MBT_BP_STOP_SND_IF_R());
			
			MCQueryApiBuilder bpKeyL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("BP"));
			dbWkDelete("PFBEL5210_MAW_BP_KEY_D01", bpKeyL_bldr.getBaseDbc());
			dbWkInsert("PFBEL5210_MAW_BP_KEY_I01", bpKeyL, bpKeyL_bldr.getBaseDbc());
			
			MAW_BP_KEY_R bpKeyT = MAW_BP_KEY_R.create("BPKEY");
			dbc_bldr.addInnerJoin(bpKeyT, bpKeyT.bp_cd.eq(t.bp_cd));
		}
		MCRow bindR = MCRow.create();
		bindR.addDateColumn("TODAY", getToday());
		dbSelect("PFBEL5210_MAM_BP_STOP_S01", dbc, dbc_bldr, bindR);

		// インデックス作成
		object(CLAZZ)._bpStopL = dbc;
		object(CLAZZ)._bpStopKey = object(CLAZZ)._bpStopL
				.createIndex(MAM_BP_STOP_R.$bp_cd);

	}

	protected MAM_BP_STOP_R getBpStopR(String bpCd) {
		if (object(CLAZZ)._bpStopL == null) {
			initBpStopCache(null);
		}
		return object(CLAZZ)._bpStopL.getFirst(object(CLAZZ)._bpStopKey, bpCd);
	}

	protected Map_MAW_BP_KEY_R_MBT_BP_STOP_SND_IF_R<MAW_BP_KEY_R,MBT_BP_STOP_SND_IF_R> createMap_MAW_BP_KEY_R_MBT_BP_STOP_SND_IF_R() {
		return new Map_MAW_BP_KEY_R_MBT_BP_STOP_SND_IF_R<MAW_BP_KEY_R, MBT_BP_STOP_SND_IF_R>();
	}

	public class Map_MAW_BP_KEY_R_MBT_BP_STOP_SND_IF_R<D extends MAW_BP_KEY_R, S extends MBT_BP_STOP_SND_IF_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAW_BP_KEY_R.$bp_cd, MBT_BP_STOP_SND_IF_R.$bp_cd);

		}
	}

	//FMCB CUSTOM END
}