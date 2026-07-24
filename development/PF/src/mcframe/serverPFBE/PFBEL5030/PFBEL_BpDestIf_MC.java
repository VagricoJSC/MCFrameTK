package mcframe.serverPFBE.PFBEL5030;

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
import mcframe.commonPFBE.PFBER5030.*;
import mcframe.commonPFBE.PFBER5030.PFBER_BpDestPrnt;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBEL_BpDestIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBEL_BpDestIf_MC extends PFBEL_BpDestIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpDestIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpDestIf_Conv01 extends PFBEL_BpDestIf_MC_A.BpDestIf_Conv01 {
		/** 論理削除フラグの制御を行うテーブル名を指定します。 */
		protected String[] _delFlgTblNm = {MAM_BP_R.TABLE_NAME};

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
					MBT_BP_SND_IF_EXT_R.class);
			_IfRptSet.setReportSet(PFBER_BpDestPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_BP_SND_IF_EXT_R());
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
			MBT_BP_SND_IF_EXT_R t = MBT_BP_SND_IF_EXT_R.create("T");
			MAM_BP_R S1W = MAM_BP_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			// 前回のスキップのデータがあれば未処理に戻す
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.NOT_EXE.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.SKP.value())));
			dbUpdate("PFBEL5030_MBT_BP_SND_IF_EXT_U01", up0(), dbc_bldr);

			// スキップ設定
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.SKP.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.data_crud_typ.neq(bind("1")),
					MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
					.where(S1W.bp_cd.eq(t.bp_cd)
							.and(S1W.dest_flg.eq(value(true))))));
			dbUpdate("PFBEL5030_MBT_BP_SND_IF_EXT_U02", up0(), dbc_bldr);

		}

		@Override
		public void initCache(MCList<? extends MCDBContainer> ifL) {
			initBpCache((MCList<MBT_BP_SND_IF_EXT_R>)ifL);
		}

		public class DtlR_MBT_BP_SND_IF_EXT_R<D extends DtlR, S extends MBT_BP_SND_IF_EXT_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_crud_typ, MBT_BP_SND_IF_EXT_R.$data_crud_typ);
				addColumnPathMap(DtlR.$bp_cd, MBT_BP_SND_IF_EXT_R.$bp_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.co_cd(getCo().co_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}

				MAM_BP_R r = getBpR(dest.bp_cd());
				if (r == null) {
					return;
				}
				// 取引先マスタから
				dest.bp_nm(r.bp_nm());
				dest.bp_alt_nm1(r.bp_alt_nm1());
				dest.bp_alt_nm2(r.bp_alt_nm2());
				dest.bp_alt_nm3(r.bp_alt_nm3());
				dest.bp_alt_nm4(r.bp_alt_nm4());
				dest.ein(r.ein());
				dest.std_co_cd(r.std_co_cd());
				dest.cntry_cd(r.cntry_cd());
				dest.area_cd(r.area_cd());
				dest.cur_cd(r.cur_cd());
				dest.prnt_lcl_cd(r.prnt_lcl_cd());
				dest.bp_grp_cd1(r.bp_grp_cd1());
				dest.bp_grp_cd2(r.bp_grp_cd2());
				dest.bp_grp_cd3(r.bp_grp_cd3());
				dest.bp_grp_cd4(r.bp_grp_cd4());
				dest.bp_grp_cd5(r.bp_grp_cd5());
				dest.bp_grp_cd6(r.bp_grp_cd6());
				dest.bp_grp_cd7(r.bp_grp_cd7());
				dest.bp_grp_cd8(r.bp_grp_cd8());
				dest.bp_grp_cd9(r.bp_grp_cd9());
				dest.bp_grp_cd10(r.bp_grp_cd10());
				dest.memo1(r.memo1());
				dest.memo2(r.memo2());
				dest.memo3(r.memo3());
				dest.memo4(r.memo4());
				dest.memo5(r.memo5());
				dest.memo6(r.memo6());
				dest.memo7(r.memo7());
				dest.memo8(r.memo8());
				dest.memo9(r.memo9());
				dest.memo10(r.memo10());
				dest.memo11(r.memo11());
				dest.memo12(r.memo12());
				dest.memo13(r.memo13());
				dest.memo14(r.memo14());
				dest.memo15(r.memo15());
				dest.memo16(r.memo16());
				dest.memo17(r.memo17());
				dest.memo18(r.memo18());
				dest.memo19(r.memo19());
				dest.memo20(r.memo20());
				dest.del_flg(r.del_flg());
				// 取引先マスタロケールから
				dest.bp_nm_en(r.getRootRow().getString("bp_nm_en"));
				dest.bp_alt_nm1_en(r.getRootRow().getString("bp_alt_nm1_en"));
				dest.bp_alt_nm2_en(r.getRootRow().getString("bp_alt_nm2_en"));
				dest.bp_alt_nm3_en(r.getRootRow().getString("bp_alt_nm3_en"));
				dest.bp_alt_nm4_en(r.getRootRow().getString("bp_alt_nm4_en"));
				// ファンクションから
				dest.zip_cd(r.zip_cd());
				dest.addr1(r.addr1());
				dest.addr2(r.addr2());
				dest.addr3(r.addr3());
				dest.addr4(r.addr4());
				dest.tel(r.tel());
				dest.fax(r.fax());
				// 取引先マスタ送信IFテーブルから
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
	protected static final Class<PFBEL_BpDestIf> CLAZZ = PFBEL_BpDestIf.class;

	/**
	 * 「MAM_BP_」取得
	 */
	MCList<MAM_BP_R> _bpL;
	MCIndexKey _bpKey;

	protected void initBpCache(MCList<MBT_BP_SND_IF_EXT_R> ifL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MAM_BP_LCL_R lc = MAM_BP_LCL_R.create("LC");
		MBT_BP_SND_IF_EXT_R S1W1 = MBT_BP_SND_IF_EXT_R.create("W1");
		PFW_SDRV_IF_R S1W2 = PFW_SDRV_IF_R.create("W2");

		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd, t.bp_nm, t.bp_alt_nm1, t.bp_alt_nm2, t.bp_alt_nm3,
				t.bp_alt_nm4, t.ein, t.std_co_cd, t.cntry_cd, t.area_cd, t.cur_cd,
				t.prnt_lcl_cd, t.bp_grp_cd1, t.bp_grp_cd2, t.bp_grp_cd3, t.bp_grp_cd4,
				t.bp_grp_cd5, t.bp_grp_cd6, t.bp_grp_cd7, t.bp_grp_cd8, t.bp_grp_cd9,
				t.bp_grp_cd10, t.memo1, t.memo2, t.memo3, t.memo4, t.memo5, t.memo6, t.memo7, t.memo8, t.memo9, t.memo10, t.memo11, 
				t.memo12, t.memo13, t.memo14, t.memo15, t.memo16, t.memo17, t.memo18, t.memo19, t.memo20, t.del_flg);
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("today"),
				value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
		dbc_bldr.addSelect(lc.bp_nm.as("bp_nm_en"));
		dbc_bldr.addSelect(lc.bp_alt_nm1.as("bp_alt_nm1_en"));
		dbc_bldr.addSelect(lc.bp_alt_nm2.as("bp_alt_nm2_en"));
		dbc_bldr.addSelect(lc.bp_alt_nm3.as("bp_alt_nm3_en"));
		dbc_bldr.addSelect(lc.bp_alt_nm4.as("bp_alt_nm4_en"));
		dbc_bldr.addLeftOuterJoin(lc,
				bracket(lc.bp_cd.eq(t.bp_cd)
						.and(lc.lcl_cd.eq(value("en_US")))));
		dbc_bldr.setWhere(t.dest_flg.eq(value(true)));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
				.from(S1W1.innerJoin(S1W2).on(S1W2.data_no.eq(S1W1.data_no)))
				.where(S1W1.bp_cd.eq(t.bp_cd)
						.and(S1W1.ext_master_typ.eq(value(MAC_EXT_MASTER_TYP.DEST_BP.value())))
						.and(S1W1.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value()))))));
		dbc_bldr.addOrderByAsc(t.bp_cd);
		if(!isNull(ifL)) {
			MCList<MAW_BP_KEY_R> bpKeyL = MCList.create(MAW_BP_KEY_R.class);
			addAll(bpKeyL, ifL, createMap_MAW_BP_KEY_R_MBT_BP_SND_IF_EXT_R());
			
			MCQueryApiBuilder bpKeyL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("BP"));
			dbWkDelete("PFBEL5030_MAW_BP_KEY_D01", bpKeyL_bldr.getBaseDbc());
			dbWkInsert("PFBEL5030_MAW_BP_KEY_I01", bpKeyL, bpKeyL_bldr.getBaseDbc());
			
			MAW_BP_KEY_R bpKeyT = MAW_BP_KEY_R.create("BPKEY");
			dbc_bldr.addInnerJoin(bpKeyT, bpKeyT.bp_cd.eq(t.bp_cd));
		}
		MCRow bindR = MCRow.create();
		bindR.addDateColumn("TODAY", getToday());
		dbSelect("PFBEL5030_MAM_BP_S01", dbc, dbc_bldr, bindR);

		// インデックス作成
		object(CLAZZ)._bpL = dbc;
		object(CLAZZ)._bpKey = object(CLAZZ)._bpL.createIndex(MAM_BP_R.$bp_cd);

	}

	protected MAM_BP_R getBpR(String bpCd) {
		if (object(CLAZZ)._bpL == null) {
			initBpCache(null);
		}
		return object(CLAZZ)._bpL.getFirst(object(CLAZZ)._bpKey, bpCd);
	}

	protected Map_MAW_BP_KEY_R_MBT_BP_SND_IF_EXT_R<MAW_BP_KEY_R,MBT_BP_SND_IF_EXT_R> createMap_MAW_BP_KEY_R_MBT_BP_SND_IF_EXT_R() {
		return new Map_MAW_BP_KEY_R_MBT_BP_SND_IF_EXT_R<MAW_BP_KEY_R, MBT_BP_SND_IF_EXT_R>();
	}

	public class Map_MAW_BP_KEY_R_MBT_BP_SND_IF_EXT_R<D extends MAW_BP_KEY_R, S extends MBT_BP_SND_IF_EXT_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAW_BP_KEY_R.$bp_cd, MBT_BP_SND_IF_EXT_R.$bp_cd);

		}
	}

	//FMCB CUSTOM END
}