package mcframe.serverPFBE.PFBEL5230;

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
import mcframe.commonPFBE.PFBER5230.*;
import mcframe.commonPFBE.PFBER5230.PFBER_ExCtrlPrnt;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBEL_ExCtrlIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBEL_ExCtrlIf_MC extends PFBEL_ExCtrlIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * ExCtrlIf_Conv01オペレーション.<p>
	 *
	 */
	public class ExCtrlIf_Conv01 extends PFBEL_ExCtrlIf_MC_A.ExCtrlIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class,
					MBT_EX_CTRL_SND_IF_R.class);
			_IfRptSet.setReportSet(PFBER_ExCtrlPrnt.create());
			_IfRptSet.setRowMapper(new DtlR_MBT_EX_CTRL_SND_IF_R());
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
			MBT_EX_CTRL_SND_IF_R t = MBT_EX_CTRL_SND_IF_R.create("T");
			MAM_EX_CTRL_R S1W = MAM_EX_CTRL_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			// 前回のスキップのデータがあれば未処理に戻す
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.NOT_EXE.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.SKP.value())));
			dbUpdate("PFBEL5230_MBT_EX_CTRL_SND_IF_U01", up0(), dbc_bldr);

			// スキップ設定
			dbc_bldr.setSet("exe_sts_typ", t.getColumn$("exe_sts_typ"), value(MAC_EXE_STS_TYP.SKP.value()));
			dbc_bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbc_bldr.addWhereWithAnd(t.data_crud_typ.neq(bind("1")),
					MAC_DATA_CRUD_TYP.DEL.value());
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X")).from(S1W)
					.where(S1W.hs_cd.eq(t.hs_cd)
							.and(S1W.cntry_cd.eq(t.cntry_cd))
							.and(S1W.st_dt.eq(t.st_dt)))));
			dbUpdate("PFBEL5230_MBT_EX_CTRL_SND_IF_U02", up0(), dbc_bldr);

		}

		@Override
		public void initCache(MCList<? extends MCDBContainer> ifL) {
			initExCtrlCache((MCList<MBT_EX_CTRL_SND_IF_R>)ifL);
		}

		public class DtlR_MBT_EX_CTRL_SND_IF_R<D extends DtlR, S extends MBT_EX_CTRL_SND_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_crud_typ, MBT_EX_CTRL_SND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$hs_cd, MBT_EX_CTRL_SND_IF_R.$hs_cd);
				addColumnPathMap(DtlR.$cntry_cd, MBT_EX_CTRL_SND_IF_R.$cntry_cd);
				addColumnPathMap(DtlR.$st_dt, MBT_EX_CTRL_SND_IF_R.$st_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.co_cd(getCo().co_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					return;
				}

				MAM_EX_CTRL_R r = getExCtrlR(dest.hs_cd(), dest.cntry_cd(), dest.st_dt());
				if (r == null) {
					return;
				}
				// 輸出規制マスタから
				dest.end_dt(r.end_dt());
				dest.memo1(r.memo1());
				dest.memo2(r.memo2());
				dest.memo3(r.memo3());
				dest.del_flg(r.del_flg());
				// 輸出規制マスタ送信IFテーブルから
				dest.data_crud_typ(src.data_crud_typ());
				dest.hs_cd(src.hs_cd());
				dest.cntry_cd(src.cntry_cd());
				dest.st_dt(src.st_dt());
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
	protected static final Class<PFBEL_ExCtrlIf> CLAZZ = PFBEL_ExCtrlIf.class;

	/**
	 * 「MAM_EX_CTRL_」取得
	 */
	MCList<MAM_EX_CTRL_R> _exCtrlL;
	MCIndexKey _exCtrlKey;

	protected void initExCtrlCache(MCList<MBT_EX_CTRL_SND_IF_R> ifL) {
		MAM_EX_CTRL_R t = MAM_EX_CTRL_R.create("T");
		MBT_EX_CTRL_SND_IF_R S1W1 = MBT_EX_CTRL_SND_IF_R.create("W1");
		PFW_SDRV_IF_R S1W2 = PFW_SDRV_IF_R.create("W2");

		MCList<MAM_EX_CTRL_R> dbc = MCList.create(MAM_EX_CTRL_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.hs_cd, t.cntry_cd, t.st_dt, t.end_dt, t.memo1, t.memo2,
				t.memo3, t.del_flg);
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X"))
				.from(S1W1.innerJoin(S1W2).on(S1W2.data_no.eq(S1W1.data_no)))
				.where(S1W1.hs_cd.eq(t.hs_cd)
						.and(S1W1.cntry_cd.eq(t.cntry_cd))
						.and(S1W1.st_dt.eq(t.st_dt))
						.and(value(MAC_DATA_CRUD_TYP.DEL.value()).neq(S1W1.data_crud_typ)))));
		dbc_bldr.addOrderByAsc(t.hs_cd);
		dbc_bldr.addOrderByAsc(t.cntry_cd);
		dbc_bldr.addOrderByAsc(t.st_dt);
		if(!isNull(ifL)) {
			MCList<MAW_EX_CTRL_KEY_R> exCtrlL = MCList.create(MAW_EX_CTRL_KEY_R.class);
			addAll(exCtrlL, ifL, createMap_MAW_EX_CTRL_KEY_R_MBT_EX_CTRL_SND_IF_R());
			
			MCQueryApiBuilder exCtrlL_bldr = MCQueryApiBuilder.create(MAM_EX_CTRL_R.create("EXCTRL"));
			dbWkDelete("PFBEL5230_MAW_EX_CTRL_KEY_D01", exCtrlL_bldr.getBaseDbc());
			dbWkInsert("PFBEL5230_MAW_EX_CTRL_KEY_I01", exCtrlL, exCtrlL_bldr.getBaseDbc());
			
			MAW_EX_CTRL_KEY_R exCtrlT = MAW_EX_CTRL_KEY_R.create("EXCTRLKEY");
			dbc_bldr.addInnerJoin(exCtrlT, 
				bracket(exCtrlT.hs_cd.eq(t.hs_cd)
						.and(exCtrlT.cntry_cd.eq(t.cntry_cd))
						.and(exCtrlT.st_dt.eq(t.st_dt))
						)
				);
		}
		MCRow bindR = MCRow.create();
		bindR.addDateColumn("TODAY", getToday());
		dbSelect("PFBEL5230_MAM_EX_CTRL_S01", dbc, dbc_bldr, bindR);

		// インデックス作成
		object(CLAZZ)._exCtrlL = dbc;
		object(CLAZZ)._exCtrlKey = object(CLAZZ)._exCtrlL.createIndex(
				MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd, MAM_EX_CTRL_R.$st_dt);

	}

	protected MAM_EX_CTRL_R getExCtrlR(String hs_cd, String cntry_cd, MCDate st_dt) {
		if (object(CLAZZ)._exCtrlL == null) {
			initExCtrlCache(null);
		}
		return object(CLAZZ)._exCtrlL.getFirst(object(CLAZZ)._exCtrlKey, hs_cd, cntry_cd, st_dt);
	}

	protected Map_MAW_EX_CTRL_KEY_R_MBT_EX_CTRL_SND_IF_R<MAW_EX_CTRL_KEY_R,MBT_EX_CTRL_SND_IF_R> createMap_MAW_EX_CTRL_KEY_R_MBT_EX_CTRL_SND_IF_R() {
		return new Map_MAW_EX_CTRL_KEY_R_MBT_EX_CTRL_SND_IF_R<MAW_EX_CTRL_KEY_R, MBT_EX_CTRL_SND_IF_R>();
	}

	public class Map_MAW_EX_CTRL_KEY_R_MBT_EX_CTRL_SND_IF_R<D extends MAW_EX_CTRL_KEY_R, S extends MBT_EX_CTRL_SND_IF_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAW_EX_CTRL_KEY_R.$hs_cd, MBT_EX_CTRL_SND_IF_R.$hs_cd);
			addColumnPathMap(MAW_EX_CTRL_KEY_R.$cntry_cd, MBT_EX_CTRL_SND_IF_R.$cntry_cd);
			addColumnPathMap(MAW_EX_CTRL_KEY_R.$st_dt, MBT_EX_CTRL_SND_IF_R.$st_dt);

		}
	}

	//FMCB CUSTOM END
}