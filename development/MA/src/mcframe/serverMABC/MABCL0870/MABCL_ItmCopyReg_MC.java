package mcframe.serverMABC.MABCL0870;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0870.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverMAUC.MAUCL6010.MAUCL_StEndUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.queryapi.IFMCFMSQL.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmCopyReg_MC extends MABCL_ItmCopyReg_MC_A{
	//FMCB CUSTOM START
	protected static final String TNAME = "TNAME";

	protected static final String SRCH02_OPE = "Srch02";
	protected static final String INLINE_ALIAS_PREFIX = "M";
	protected static final String COL_ALIAS_SUFFIX = "_CNT";
	protected static final String ITM_CD = MAM_ITM__R.$itm_cd;
	protected static final String ITM_SUB1 = MAM_ITM__R.$itm_sub1;
	protected static final String ITM_SUB2 = MAM_ITM__R.$itm_sub2;
	protected static final String ITM_SUB3 = MAM_ITM__R.$itm_sub3;
	protected static final String ST_DT = "st_dt";
	protected static final String END_DT = "end_dt";

	// ＢＯＭマスタ（親）のサブオペレーション番号
	protected static final int PAR_BOM_SUB_OPE_NUM = 15;
	// 品目構成マスタ（主品目）のサブオペレーション番号
	protected static final int CORE_ITM_COMP_SUB_OPE_NUM = 27;
	// 品揃マスタ（代表品目）のサブオペレーション番号
	protected static final int MAIN_SET_ITM_SUB_OPE_NUM = 39;


	protected boolean _updFlg = false;
	protected boolean _parBomFlg = false;
	protected boolean _coreCompFlg = false;
	protected boolean _mainSetFlg = false;
	protected boolean _aplFlg = false;
	// ロット継承マスタ（親）のサブオペレーション番号
	protected static final int PAR_LOT_INH_SRC_OPE_NUM = 23;
	protected boolean _parLotFlg = false;
	protected boolean _delSrcFlg = false;
	
	/**
	 * ItmCopy_UpdChk01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録前のチェックを行います。<br>
	 */
	public class ItmCopy_UpdChk01 extends MABCL_ItmCopyReg_MC_A.ItmCopy_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			doCache();
			doCheck(msgList);
			
			return msgList;
		}
		protected void doCache() {
			MCList<ItmCopy_UpdChk01_DtlR> bindL = MCList.create(ItmCopy_UpdChk01_DtlR.class);
			bindL.addAll(up0());
			for (ItmCopy_UpdChk01_DtlR r : up0()) {
				ItmCopy_UpdChk01_DtlR bindR = ItmCopy_UpdChk01_DtlR.create();
				bindR.itm_cd(r.dest_itm_cd());
				bindR.itm_sub1(r.dest_itm_sub1());
				bindR.itm_sub2(r.dest_itm_sub2());
				bindR.itm_sub3(r.dest_itm_sub3());
				bindL.add(bindR);
			}
			bindL.addStringColumn(MAM_ITM_COM_R.$co_cd, getCo().co_cd());
			initItmCache(bindL);
			initItmComCache(bindL);
			initItmCmnUpdCache(bindL);
		}

		protected void doCheck(MCMessageList msgList) {
			for (ItmCopy_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.dest_itm_cd())){
					msgList.add(new MCMessage(r, ItmCopy_UpdChk01_DtlR.$dest_itm_cd, MABCL0306, 
									getLabel(r, ItmCopy_UpdChk01_DtlR.$dest_itm_cd), r.dest_itm_cd(), toDispGUIIndex(r)));
					continue;
				}

				// 元先で同一品目は指定できない
				if (isSame(r.itm_cd(), r.dest_itm_cd())
				 && isSame(r.itm_sub1(), r.dest_itm_sub1())
				 && isSame(r.itm_sub2(), r.dest_itm_sub2())
				 && isSame(r.itm_sub3(), r.dest_itm_sub3())) {
					msgList.add(new MCMessage(r, ItmCopy_UpdChk01_DtlR.$dest_itm_cd, MABCL0265, toDispGUIIndex(r)));
				}
				
				// コピー元品目が存在しない
				MAM_ITM_COM_R itmComR = getItmComR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3());
				if (isNull(itmComR.itm_cd())) {
					msgList.add(new MCMessage(MABCL0263,
							getTableLocaleName(itmComR.tableName()), toDispItm(r.itm_cd(),
									r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispGUIIndex(r)));
				}
				// コピー先品目が既に存在する
				itmComR = getItmComR(r.dest_itm_cd(), r.dest_itm_sub1(),
						r.dest_itm_sub2(), r.dest_itm_sub3());
				MAM_ITM_CMN_UPD_R itmCmnUpdR = getItmCmnUpdR(r.dest_itm_cd(),
						r.dest_itm_sub1(), r.dest_itm_sub2(), r.dest_itm_sub3());
				if (!isNull(itmCmnUpdR.itm_cd())) {
					if (isNull(itmComR.itm_cd())) {
						msgList.add(new MCMessage(r, ItmCopy_UpdChk01_DtlR.$dest_itm_cd,
								MABCL0264,
								toDispItm(r.dest_itm_cd(), r.dest_itm_sub1(),
										r.dest_itm_sub2(), r.dest_itm_sub3()),
								toDispGUIIndex(r)));
					}
					else {
						if (!checkAttributes(r)) {
							msgList.add(new MCMessage(MABCL0266,
									toDispItm(r.dest_itm_cd(), r.dest_itm_sub1(),
											r.dest_itm_sub2(), r.dest_itm_sub3()),
									toDispItm(r.itm_cd(), r.itm_sub1(),
											r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
						}
					}
				}
			}
		}
		/**
		 * 属性一致チェック
		 */
		protected boolean checkAttributes(ItmCopy_UpdChk01_DtlR r) {
			MAM_ITM__R src = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAM_ITM__R dest = getItmR(r.dest_itm_cd(), r.dest_itm_sub1(), r.dest_itm_sub2(), r.dest_itm_sub3());
			return isSame(src.stk_mng_typ(), dest.stk_mng_typ())
					&& isSame(src.asset_mng_typ(), dest.asset_mng_typ())
					&& isSame(src.lot_mng_typ(), dest.lot_mng_typ())
					&& isSame(src.sublot_mng_typ(), dest.sublot_mng_typ())
					&& isSame(src.ver_flg(), dest.ver_flg())
					&& isSame(src.cont_fctr_flg(), dest.cont_fctr_flg())
					&& isSame(src.unit_cd(), dest.unit_cd())
					&& isSame(src.comp_core_itm_flg(), dest.comp_core_itm_flg());
		}
	}
	/**
	 * ItmCopy_Upd01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録を行います。<br>
	 */
	public class ItmCopy_Upd01 extends MABCL_ItmCopyReg_MC_A.ItmCopy_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		protected MAM_ITM_COM_R _updInfo = MAM_ITM_COM_R.create();

		@Override
		protected void doIt() {
			for (ItmCopy_UpdChk01_DtlR r : up0()) {
				// ロット継承は元と先をセットで行う
				r.lot_inh_src_flg(r.lot_inh_dest_flg());
			}
			_updFlg = true;
			selectUpdInfo(_updInfo);
			doCopyItm();
			if (!up1().ex_on_del_flg()) {
				setDelFlgCtl(false);
			}
			try {
				doCopyOth();
			}
			finally {
				setDelFlgCtl(true);
			}
		}
		protected void doCopyItm() {
			MCList<MAM_ITM_COM_R> itmComL = MCList.create(MAM_ITM_COM_R.class);
			MCQueryApiBuilder itmComL_bldr = MCQueryApiBuilder.create(MAM_ITM_COM_R.create("T"));
			itmComL_bldr.removeValues(
					MAM_ITM_COM_R.$ext_sys_no_itm,
					MAM_ITM_COM_R.$chng_no,
					MAM_ITM_COM_R.$sls_input_flg,
					MAM_ITM_COM_R.$mfg_input_flg,
					MAM_ITM_COM_R.$purc_input_flg,
					MAM_ITM_COM_R.$insp_input_flg,
					MAM_ITM_COM_R.$release_flg,
					MAM_ITM_COM_R.$release_usr_cd,
					MAM_ITM_COM_R.$release_tm);
			addValuesUpdInfo(itmComL_bldr);

			MCList<MAM_ITM_CMN_UPD_R> itmCmnUpdL = MCList.create(MAM_ITM_CMN_UPD_R.class);
			MCQueryApiBuilder itmCmnUpdL_bldr = MCQueryApiBuilder.create(MAM_ITM_CMN_UPD_R.create("T2"));
			itmCmnUpdL_bldr.removeValues(MAM_ITM_CMN_UPD_R.$th_image);
			addValuesUpdInfo(itmCmnUpdL_bldr);

			for (ItmCopy_UpdChk01_DtlR r : up0()) {
				MAM_ITM_COM_R itmComR = getItmComR(r.dest_itm_cd(), r.dest_itm_sub1(), r.dest_itm_sub2(), r.dest_itm_sub3());
				if (isNull(itmComR.itm_cd())) {
					itmComR = getItmComR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					itmComR.itm_cd(r.dest_itm_cd());
					itmComR.itm_sub1(r.dest_itm_sub1());
					itmComR.itm_sub2(r.dest_itm_sub2());
					itmComR.itm_sub3(r.dest_itm_sub3());
					itmComR.memo1(r.memo1());
					itmComR.memo2(r.memo2());
					itmComR.memo3(r.memo3());
					copyUpdInfo(itmComR);
					itmComL.add(itmComR);
				}
				MAM_ITM_CMN_UPD_R itmCmnUpdR = getItmCmnUpdR(r.dest_itm_cd(), r.dest_itm_sub1(), r.dest_itm_sub2(), r.dest_itm_sub3());
				if (isNull(itmCmnUpdR.itm_cd())) {
					itmCmnUpdR = getItmCmnUpdR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					itmCmnUpdR.itm_cd(r.dest_itm_cd());
					itmCmnUpdR.itm_sub1(r.dest_itm_sub1());
					itmCmnUpdR.itm_sub2(r.dest_itm_sub2());
					itmCmnUpdR.itm_sub3(r.dest_itm_sub3());
					itmCmnUpdR.itm_nm(r.dest_itm_nm());
					copyUpdInfo(itmCmnUpdR);
					itmCmnUpdL.add(itmCmnUpdR);
				}
			}
			dbInsertEx("MABCL0870_MAM_ITM_COM_I01", itmComL, itmComL_bldr);
			dbInsertEx("MABCL0870_MAM_ITM_CMN_UPD_I01", itmCmnUpdL, itmCmnUpdL_bldr);
		}
		protected void doCopyOth() {
			Map<String, String> map = ItmCopy_UpdChk01_DtlR.create().getExtMap(TNAME);
			for (Map.Entry<String, String> e : map.entrySet()) {
				doCopyOth(e.getKey(), e.getValue());
			}
		}
		protected void doCopyOth(String flgStr, String tabStr) {
			MCList<MCDBContainer> dbc = getDbc(flgStr);
			if (dbc == null) {
				return;
			}

			// フラグ＝オンのレコード抽出
			MCList<ItmCopy_UpdChk01_DtlR> list = up0().subList(flgStr, true);

			// データキャッシュ
			MCList<MCDBContainer> cache = dbc.createInstance();
			MCIndexKey idxkey = getCache(cache, list, flgStr);

			MCList<MCDBContainer> insL = dbc.createInstance();
			MCDBContainer t = insL.createRow();
			t.setAlias("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			addValuesUpdInfo(bldr);

			for(ItmCopy_UpdChk01_DtlR r : list) {
				MCDBContainer tmpR = cache.getFirst(idxkey, r.dest_itm_cd(), r.dest_itm_sub1(), r.dest_itm_sub2(), r.dest_itm_sub3());
				// コピー先にデータがあった場合、何もしない
				if (tmpR != null) {
					continue;
				}
				for (MCDBContainer rec : cache.subList(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					MCDBContainer insR = rec.clone();
					setItmVals(insR, r, flgStr);
					copyUpdInfo(insR);
					insL.add(insR);
				}
			}
			// コピーしない項目を除去
			if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_par_flg)) {
				bldr.removeValues(MAM_BOM_R.$chng_no, MAM_BOM_R.$ext_sys_no_bom);
			}
			dbInsertEx(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "I50"), insL, bldr);
		}
		protected MCIndexKey getCache(MCList<MCDBContainer> dbc, MCList<ItmCopy_UpdChk01_DtlR> list, String flgStr) {
			MCDBContainer t = dbc.createRow();
			t.setAlias("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			
			MCList<ItmCopy_UpdChk01_DtlR> bindL = list.createInstance();
			bindL.addAll(list);
			for (ItmCopy_UpdChk01_DtlR r : list) {
				ItmCopy_UpdChk01_DtlR bindR = r.createInstance();
				bindR.itm_cd(r.dest_itm_cd());
				bindR.itm_sub1(r.dest_itm_sub1());
				bindR.itm_sub2(r.dest_itm_sub2());
				bindR.itm_sub3(r.dest_itm_sub3());
				bindL.add(bindR);
			}
			setWhere(bldr, flgStr);
			if (!isNull(up1().ex_past_end_dt())) {
				setWhereEndDt(bldr, flgStr);
			}
			if ((up1().ex_on_del_flg())) {
				setWhereDelFlg(bldr);
			}
			dbSelect(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S50"), dbc, bldr, bindL);
			return dbc.createIndex(getItmCols(flgStr));
		}
		protected void setItmVals(MCDBContainer dest, ItmCopy_UpdChk01_DtlR src, String flgStr) {
			String[] dbcCols = getItmCols(flgStr);
			dest.setString(dbcCols[0], src.dest_itm_cd());
			dest.setString(dbcCols[1], src.dest_itm_sub1());
			dest.setString(dbcCols[2], src.dest_itm_sub2());
			dest.setString(dbcCols[3], src.dest_itm_sub3());

			// 構成表はBOM_KEYを発番
			if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_par_flg)
					|| isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_chd_flg)) {
				dest.setString(MAM_BOM_R.$bom_key, getStrSeq(MAC_NUM_SYS_TYP.BOM_KEY));
			}
		}
		protected String[] getDestItmCols() {
			return new String[] {
					ItmCopy_UpdChk01_DtlR.$dest_itm_cd,
					ItmCopy_UpdChk01_DtlR.$dest_itm_sub1,
					ItmCopy_UpdChk01_DtlR.$dest_itm_sub2,
					ItmCopy_UpdChk01_DtlR.$dest_itm_sub3
			};
		}
		protected void copyUpdInfo(MCDBContainer dest) {
			dest.setStringNE(_ins_usr_id, _updInfo.ins_usr_id());
			dest.setStringNE(_ins_usr_nm, _updInfo.ins_usr_nm());
			dest.setStringNE(_ins_func_id, _updInfo.ins_func_id());
			dest.setStringNE(_upd_srv_req_no, _updInfo.upd_srv_req_no());
			dest.setStringNE(_upd_usr_id, _updInfo.upd_usr_id());
			dest.setStringNE(_upd_usr_nm, _updInfo.upd_usr_nm());
			dest.setStringNE(_upd_func_id, _updInfo.upd_func_id());
		}
		protected void setWhereEndDt(MCQueryApiBuilder bldr, String flgStr) {
			if (MAUCL_StEndUtil.isStEndDt(bldr.getBaseDbc())){
				MCDBContainer t = bldr.getBaseDbc();
				bldr.addWhereWithAnd(((MCDateExpr)t.getColumn$("end_dt")).gte(bind("1")), up1().ex_past_end_dt());
			}
		}
		protected void setWhereDelFlg(MCQueryApiBuilder bldr) {
			MCDBContainer t = bldr.getBaseDbc();
			bldr.addWhereWithAnd(((MCBooleanExpr)t.getColumn$("del_flg")).eq(value(false)));
		}
	}

	/**
	 * ItmCopy_DelChk01オペレーション.<p>
	 *
	 * 品目系マスタの削除前のチェックを行います。<br>
	 */
	public class ItmCopy_DelChk01 extends MABCL_ItmCopyReg_MC_A.ItmCopy_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			MCList<MAM_PURC_UPRI_APL_R> purcL = MCList.create(MAM_PURC_UPRI_APL_R.class);
			MCList<MAM_PROC_UPRI_APL_R> procL = MCList.create(MAM_PROC_UPRI_APL_R.class);
			MCList<MAM_PROV_UPRI_APL_R> provL = MCList.create(MAM_PROV_UPRI_APL_R.class);
			MCList<MAM_STD_SLS_UPRI_APL_R> stdL = MCList.create(MAM_STD_SLS_UPRI_APL_R.class);
			MCList<MAM_ITM_SLS_UPRI_APL_R> itmL = MCList.create(MAM_ITM_SLS_UPRI_APL_R.class);
			MCList<MAM_CST_SLS_UPRI_APL_R> cstL = MCList.create(MAM_CST_SLS_UPRI_APL_R.class);
			MCIndexKey purcKey = doSelectAprv(purcL);
			MCIndexKey procKey = doSelectAprv(procL);
			MCIndexKey provKey = doSelectAprv(provL);
			MCIndexKey stdKey = doSelectAprv(stdL);
			MCIndexKey itmKey = doSelectAprv(itmL);
			MCIndexKey cstKey = doSelectAprv(cstL);

			for(ItmCopy_DelChk01_DtlR r : up0()){
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 削除対象のデータに未承認、一部承認のデータがないかチェック
				Comparable<?>[] binds = new Comparable<?>[4];
				binds[0] = r.itm_cd();
				binds[1] = r.itm_sub1();
				binds[2] = r.itm_sub2();
				binds[3] = r.itm_sub3();

				if (purcL.getFirst(purcKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0294, toDispGUIIndex(r)));
				}
				if (procL.getFirst(procKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0295, toDispGUIIndex(r)));
				}
				if (provL.getFirst(provKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0296, toDispGUIIndex(r)));
				}
				if (stdL.getFirst(stdKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0297, toDispGUIIndex(r)));
				}
				if (itmL.getFirst(itmKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0298, toDispGUIIndex(r)));
				}
				if (cstL.getFirst(cstKey, binds) != null) {
					msgList.add(new MCMessage(r, null, MABCL0299, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
		/**
		 * 未承認、一部承認データの取得、インデックスキーの作成
		 */
		protected <R extends MCDBContainer, L extends MCList<R>> MCIndexKey doSelectAprv(L dbc) {
			MCDBContainer t = dbc.createRow();
			t.setAlias("T");
			MAVT_APRV_R aprv1 = MAVT_APRV_R.create("APRV1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_cd),
					t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub1),
					t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub2),
					t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub3));
			bldr.setDistinct();
			bldr.setWhere(value(0).eq(value(0)));
			bldr.addWhereWithAnd(((MCStringExpr)t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_cd)).eq(bind("itm_cd")));
			bldr.addWhereWithAnd(((MCStringExpr)t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub1)).eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(((MCStringExpr)t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub2)).eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(((MCStringExpr)t.getColumn$(MAM_PURC_UPRI_APL_R.$itm_sub3)).eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(((MCBooleanExpr)t.getColumn$(MAM_PURC_UPRI_APL_R.$del_flg)).eq(value(false)));
			bldr.addInnerJoin(aprv1,
					aprv1.aprv_no.eq((MCStringExpr) t.getColumn$("aprv_no"))
							.and(aprv1.can_flg.eq(value(false)))
							.and(aprv1.aprv_sts_typ.in(
									value(MAC_APRV_STS_TYP.OPN.value()),
									value(MAC_APRV_STS_TYP.FIX.value()))));

			dbSelect(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S51"), dbc, bldr, up0());
			return dbc.createIndex(MAM_PURC_UPRI_APL_R.$itm_cd, MAM_PURC_UPRI_APL_R.$itm_sub1,
					MAM_PURC_UPRI_APL_R.$itm_sub2, MAM_PURC_UPRI_APL_R.$itm_sub3);
		}
	}
	/**
	 * ItmCopy_Del01オペレーション.<p>
	 *
	 * 品目系マスタの削除を行います。<br>
	 */
	public class ItmCopy_Del01 extends MABCL_ItmCopyReg_MC_A.ItmCopy_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			_updFlg = false;
			doDeleteItm();
			setDelFlgCtl(false);
			try {
				doDelete();
			}
			finally {
				setDelFlgCtl(true);
			}
		}
		protected void doDeleteItm() {
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			for (ItmCopy_DelChk01_DtlR r : up0()) {
				MAM_ITM_R itmR = MAM_ITM_R.create();
				itmR.itm_cd(r.itm_cd());
				itmR.itm_sub1(r.itm_sub1());
				itmR.itm_sub2(r.itm_sub2());
				itmR.itm_sub3(r.itm_sub3());
				itmL.add(itmR);
			}
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T").getPkWorkDbc("W"));
			dbInsert("MABCL0870_MAM_ITM_I01", itmL, bldr);

			// プロシージャで削除
			String procId = "MAPA_ITM$P_DEL_ITM";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, null, null, null);
		}

		protected void doDelete() {
			Map<String, String> map = ItmCopy_UpdChk01_DtlR.create().getExtMap(TNAME);
			for (Map.Entry<String, String> e : map.entrySet()) {
				doDelete(e.getKey(), e.getValue());

				if (MCCollectionUtil.contains(e.getKey(), ItmCopy_UpdChk01_DtlR.$proc_upri_flg,
						ItmCopy_UpdChk01_DtlR.$prov_upri_flg, ItmCopy_UpdChk01_DtlR.$purc_upri_flg,
						ItmCopy_UpdChk01_DtlR.$std_sls_upri_flg, ItmCopy_UpdChk01_DtlR.$itm_sls_upri_flg,
						ItmCopy_UpdChk01_DtlR.$cst_sls_upri_flg)) {

					_aplFlg = true;
					doDelete(e.getKey(), e.getValue());
					_aplFlg = false;
				}
				if (MCCollectionUtil.contains(e.getKey(), ItmCopy_UpdChk01_DtlR.$lot_inh_dest_flg)) {
					_delSrcFlg = true;
					doDelete(e.getKey(), e.getValue());
					_delSrcFlg = false;
				}
			}
		}

		protected void doDelete(String flgStr, String tabStr) {
			MCList<MCDBContainer> dbc = getDbc(flgStr);
			if (dbc == null) {
				return;
			}
			// フラグ＝オンのレコード抽出（各単価マスタ（申請）は全レコード）
			MCList<ItmCopy_DelChk01_DtlR> list = _aplFlg ? up0() : up0().subList(flgStr, true);

			// データキャッシュ
			MCList<MCDBContainer> delL = dbc.createInstance();
			getCache(delL, list, flgStr);
			
			dbDeleteKey(createSqlId(LOGIC_ID, dbc.createRow(), "D50"), delL, dbc.createRow());
		}
		protected MCIndexKey getCache(MCList<MCDBContainer> dbc, MCList<ItmCopy_DelChk01_DtlR> list, String flgStr) {
			MCDBContainer t = dbc.createRow();
			t.setAlias("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			MCList<ItmCopy_DelChk01_DtlR> bindL = list.createInstance();
			bindL.addAll(list);
			setWhere(bldr, flgStr);
			dbSelect(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S52"), dbc, bldr, bindL);
			return dbc.createIndex(getItmCols(flgStr));
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目系マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmCopyReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		@Override
		protected void downColumnsData() {
			super.downColumnsData();
			
			setFlgVals(down0());
			down0().sort(getSortCols());
		}

		/**
		 * ソート用のカラム名を取得する。
		 * 
		 * @return
		 */
		protected String[] getSortCols() {
			String[] cols = {
					Srch01_RsltR.$itm_cd 
					,Srch01_RsltR.$itm_sub1
					,Srch01_RsltR.$itm_sub2
					,Srch01_RsltR.$itm_sub3};
			return cols;
		}
		
		/**
		 * ＤＢコンテナをカスタマイズする。
		 * 
		 * @param dbc 品目マスタコンテナ
		 */
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			addItmColSql(builder, up0(), getOperationID(), builder.getBaseDbcAlias(), rslt);
			addCntSelectSql(builder, getSubOpes(PI), builder.getBaseDbcAlias());
			addReleaseWhere(builder, up0());
		}

		@SuppressWarnings("rawtypes")
		@Override
		public MCRowMapper createMap_down_SELECT_c0_0() {
			return new Map_down_SELECT_c0_0();
		}
		
		public class Map_down_SELECT_c0_0 extends MABCL_ItmCopyReg_MC_A.Srch01.Map_down_SELECT_c0_0 {
			@Override
			protected void setupColumnPathMap() {
				super.setupColumnPathMap();

				addColumnPathMap(Srch01_RsltR.$itm_cnt, "MAM_ITM__CNT");
				addColumnPathMap(Srch01_RsltR.$itm_sub_cnt, "MAM_ITM_SUB_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_unit_cnt, "MAM_ITM_UNIT__CNT");
				addColumnPathMap(Srch01_RsltR.$attach_info_cnt, "MAM_ATTACH_INFO_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_stop_cnt, "MAM_ITM_STOP_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_not_fix_cnt, "MAM_ITM_NOT_FIX_CNT");
				addColumnPathMap(Srch01_RsltR.$stdcost_cnt, "MAM_STDCOST__CNT");
				addColumnPathMap(Srch01_RsltR.$sundry_itm_cnt, "MAM_SUNDRY_ITM_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_strg_cnt, "MAM_ITM_STRG_CNT");
				addColumnPathMap(Srch01_RsltR.$alloc_ctl_cnt, "MAM_ALLOC_CTL_CNT");
				addColumnPathMap(Srch01_RsltR.$stk_rpl_cnt, "MAM_STK_RPL_CNT");
				addColumnPathMap(Srch01_RsltR.$alt_itm_cnt, "MAM_ALT_ITM_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_wg_cnt, "MAM_ITM_WG__CNT");
				addColumnPathMap(Srch01_RsltR.$itm_dtl_cnt, "MAM_ITM_DTL__CNT");
				addColumnPathMap(Srch01_RsltR.$itm_oper_cnt, "MAM_ITM_OPER_CNT");
				addColumnPathMap(Srch01_RsltR.$bom_par_cnt, "MAM_BOMPAR_CNT");
				addColumnPathMap(Srch01_RsltR.$bom_chd_cnt, "MAM_BOMCHD_CNT");
				addColumnPathMap(Srch01_RsltR.$oper_wk_cost_cnt, "MAM_OPER_WK_COST_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_insp_ptn_cnt, "MAM_ITM_INSP_PTN_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_insp_cnt, "MAM_ITM_INSP_CNT");
				addColumnPathMap(Srch01_RsltR.$insp_spec_cnt, "MAM_INSP_SPEC_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_site_cnt, "MAM_ITM_SITE_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_ver_cnt, "MAM_ITM_VER_CNT");
				addColumnPathMap(Srch01_RsltR.$lot_inh_dest_cnt, "MAM_LOT_INH_DEST_CNT");
				addColumnPathMap(Srch01_RsltR.$lot_inh_src_cnt, "MAM_LOT_INH_SRC_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_spec_cnt, "MAM_ITM_SPEC_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_spec_desc_cnt, "MAM_ITM_SPEC_DESC_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_comp_core_cnt, "MAM_ITM_COMPCORE_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_comp_comp_cnt, "MAM_ITM_COMPCOMP_CNT");
				addColumnPathMap(Srch01_RsltR.$mps_itm_cnt, "MAM_MPS_ITM__CNT");
				addColumnPathMap(Srch01_RsltR.$spln_itm_conf_cnt, "MAM_SPLN_ITM_CONF_CNT");
				addColumnPathMap(Srch01_RsltR.$purc_ddlv_lt_cnt, "MAM_PURC_DDLV_LT_CNT");
				addColumnPathMap(Srch01_RsltR.$bp_itm_cnt, "MAM_BP_ITM_CNT");
				addColumnPathMap(Srch01_RsltR.$proc_upri_cnt, "MAM_PROC_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$prov_upri_cnt, "MAM_PROV_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$purc_upri_cnt, "MAM_PURC_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$std_sls_upri_cnt, "MAM_STD_SLS_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$itm_sls_upri_cnt, "MAM_ITM_SLS_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$cst_sls_upri_cnt, "MAM_CST_SLS_UPRI__CNT");
				addColumnPathMap(Srch01_RsltR.$set_itm_main_cnt, "MAM_SET_ITMMAIN_CNT");
				addColumnPathMap(Srch01_RsltR.$set_itm_set_cnt, "MAM_SET_ITMSET_CNT");
				addColumnPathMap(Srch01_RsltR.$if_x_cnt, "MAM_IF_X_CNT");
				addColumnPathMap(Srch01_RsltR.$ctg_config_cnt, "MAM_CTG_CONFIG_CNT");
				addColumnPathMap(Srch01_RsltR.$jnl_ptn_cnt, "MAM_JNL_PTN_CNT");
				addColumnPathMap(Srch01_RsltR.$coef_config_cnt, "MAM_COEF_CONFIG_CNT");
				addColumnPathMap(Srch01_RsltR.$alc_expns_cnt, "MAM_ALC_EXPNS_CNT");
				addColumnPathMap(Srch01_RsltR.$alc_inpt_cnt, "MAM_ALC_INPT_CNT");
				addColumnPathMap(Srch01_RsltR.$cost_itm_out_cnt, "MAM_COST_ITM_OUT_CNT");
				addColumnPathMap(Srch01_RsltR.$xpns_purc_alc_cnt, "MAM_XPNS_PURC_ALC_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_lg_grp_cnt, "MAM_ITM_LG_GRP_CNT");
				addColumnPathMap(Srch01_RsltR.$itm_str_ln_cnt, "MAM_ITM_STR_LN_CNT");
			}
		}

		/**
		 * 下り電文のフラグ項目を設定する。
		 * 
		 * @param down0
		 */
		protected void setFlgVals(MCList<Srch01_RsltR> down0) {
			
			for (Srch01_RsltR downR : down0) {
				// 品目はオン固定
				downR.itm_flg(true);

				// 新規登録時コピー不可
				if (isSame(up0().ope(), "0")) {
					downR.attach_info_flg(false);
					downR.sundry_itm_flg(false);
					downR.alt_itm_flg(false);
					downR.bom_chd_flg(false);
					downR.itm_comp_comp_flg(false);
					downR.itm_not_fix_flg(false);
					downR.itm_sls_upri_flg(false);
					downR.lot_inh_src_flg(false);
					downR.proc_upri_flg(false);
					downR.prov_upri_flg(false);
					downR.purc_upri_flg(false);
					downR.set_itm_set_flg(false);
					downR.std_sls_upri_flg(false);
					downR.cst_sls_upri_flg(false);
					downR.jnl_ptn_flg(false);
					downR.alc_expns_flg(false);
					downR.if_x_flg(false);
				}
				else {
					downR.attach_info_flg(!isNull(downR.attach_info_cnt()));
					downR.sundry_itm_flg(!isNull(downR.sundry_itm_cnt()));
					downR.alt_itm_flg(!isNull(downR.alt_itm_cnt()));
					downR.bom_chd_flg(!isNull(downR.bom_chd_cnt()));
					downR.itm_comp_comp_flg(!isNull(downR.itm_comp_comp_cnt()));
					downR.itm_not_fix_flg(!isNull(downR.itm_not_fix_cnt()));
					downR.itm_sls_upri_flg(!isNull(downR.itm_sls_upri_cnt()));
					downR.lot_inh_src_flg(!isNull(downR.lot_inh_src_cnt()));
					downR.proc_upri_flg(!isNull(downR.proc_upri_cnt()));
					downR.prov_upri_flg(!isNull(downR.prov_upri_cnt()));
					downR.purc_upri_flg(!isNull(downR.purc_upri_cnt()));
					downR.set_itm_set_flg(!isNull(downR.set_itm_set_cnt()));
					downR.std_sls_upri_flg(!isNull(downR.std_sls_upri_cnt()));
					downR.cst_sls_upri_flg(!isNull(downR.cst_sls_upri_cnt()));
					downR.jnl_ptn_flg(!isNull(downR.jnl_ptn_cnt()));
					downR.alc_expns_flg(!isNull(downR.alc_expns_cnt()));
					downR.if_x_flg(!isNull(downR.if_x_cnt()));
				}
				downR.itm_sub_flg(!isNull(downR.itm_sub_cnt()));
				downR.itm_unit_flg(!isNull(downR.itm_unit_cnt()));
				downR.itm_stop_flg(!isNull(downR.itm_stop_cnt()));
				downR.stdcost_flg(!isNull(downR.stdcost_cnt()));
				downR.itm_strg_flg(!isNull(downR.itm_strg_cnt()));
				downR.alloc_ctl_flg(!isNull(downR.alloc_ctl_cnt()));
				downR.stk_rpl_flg(!isNull(downR.stk_rpl_cnt()));
				downR.itm_wg_flg(!isNull(downR.itm_wg_cnt()));
				downR.itm_dtl_flg(!isNull(downR.itm_dtl_cnt()));
				downR.itm_oper_flg(!isNull(downR.itm_oper_cnt()));
				downR.bom_par_flg(!isNull(downR.bom_par_cnt()));
				downR.oper_wk_cost_flg(!isNull(downR.oper_wk_cost_cnt()));
				downR.itm_insp_ptn_flg(!isNull(downR.itm_insp_ptn_cnt()));
				downR.itm_insp_flg(!isNull(downR.itm_insp_cnt()));
				downR.insp_spec_flg(!isNull(downR.insp_spec_cnt()));
				downR.itm_site_flg(!isNull(downR.itm_site_cnt()));
				downR.itm_ver_flg(!isNull(downR.itm_ver_cnt()));
				downR.lot_inh_dest_flg(!isNull(downR.lot_inh_dest_cnt()));
				downR.itm_spec_flg(!isNull(downR.itm_spec_cnt()));
				downR.itm_spec_desc_flg(!isNull(downR.itm_spec_desc_cnt()));
				downR.itm_comp_core_flg(!isNull(downR.itm_comp_core_cnt()));
				downR.mps_itm_flg(!isNull(downR.mps_itm_cnt()));
				downR.spln_itm_conf_flg(!isNull(downR.spln_itm_conf_cnt()));
				downR.purc_ddlv_lt_flg(!isNull(downR.purc_ddlv_lt_cnt()));
				downR.bp_itm_flg(!isNull(downR.bp_itm_cnt()));
				downR.set_itm_main_flg(!isNull(downR.set_itm_main_cnt()));
				downR.ctg_config_flg(!isNull(downR.ctg_config_cnt()));
				downR.coef_config_flg(!isNull(downR.coef_config_cnt()));
				downR.alc_inpt_flg(!isNull(downR.alc_inpt_cnt()));
				downR.cost_itm_out_flg(!isNull(downR.cost_itm_out_cnt()));
				downR.xpns_purc_alc_flg(!isNull(downR.xpns_purc_alc_cnt()));
				downR.itm_lg_grp_flg(!isNull(downR.itm_lg_grp_cnt()));
				downR.itm_str_ln_flg(!isNull(downR.itm_str_ln_cnt()));
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目系マスタ（参照品目）の検索を行います。<br>
	 */
	public class Srch02 extends MABCL_ItmCopyReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeSub(builder, rslt);
				rslt.addBooleanColumn("ref_del_flg");
			}
		}
		
		@Override
		protected void downColumnsData() {
			super.downColumnsData();
			
			setFlgVals(down0());
			down0().sort(getSortCols());
		}

		/**
		 * ソート用のカラム名を取得する。
		 * 
		 * @return
		 */
		protected String[] getSortCols() {
			String[] cols = {
					Srch02_RsltR.$ref_itm_cd 
					,Srch02_RsltR.$ref_itm_sub1
					,Srch02_RsltR.$ref_itm_sub2
					,Srch02_RsltR.$ref_itm_sub3};
			return cols;
		}
		
		/**
		 * ＤＢコンテナをカスタマイズする。
		 * 
		 * @param dbc 品目マスタコンテナ
		 */
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			addItmColSql(builder, up0(), getOperationID(), "REFITM", rslt);
			addCntSelectSql(builder, getSubOpes(PI), "REFITM");
			addReleaseWhere(builder, up0());
		}
		
		@SuppressWarnings("rawtypes")
		@Override
		public MCRowMapper createMap_down_SELECT_c0_0() {
			return new Map_down_SELECT_c0_0();
		}
		
		public class Map_down_SELECT_c0_0 extends MABCL_ItmCopyReg_MC_A.Srch02.Map_down_SELECT_c0_0 {
			@Override
			protected void setupColumnPathMap() {
				super.setupColumnPathMap();

				addColumnPathMap(Srch02_RsltR.$itm_cnt, "MAM_ITM__CNT");
				addColumnPathMap(Srch02_RsltR.$itm_sub_cnt, "MAM_ITM_SUB_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_unit_cnt, "MAM_ITM_UNIT__CNT");
				addColumnPathMap(Srch02_RsltR.$attach_info_cnt, "MAM_ATTACH_INFO_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_stop_cnt, "MAM_ITM_STOP_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_not_fix_cnt, "MAM_ITM_NOT_FIX_CNT");
				addColumnPathMap(Srch02_RsltR.$stdcost_cnt, "MAM_STDCOST__CNT");
				addColumnPathMap(Srch02_RsltR.$sundry_itm_cnt, "MAM_SUNDRY_ITM_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_strg_cnt, "MAM_ITM_STRG_CNT");
				addColumnPathMap(Srch02_RsltR.$alloc_ctl_cnt, "MAM_ALLOC_CTL_CNT");
				addColumnPathMap(Srch02_RsltR.$stk_rpl_cnt, "MAM_STK_RPL_CNT");
				addColumnPathMap(Srch02_RsltR.$alt_itm_cnt, "MAM_ALT_ITM_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_wg_cnt, "MAM_ITM_WG__CNT");
				addColumnPathMap(Srch02_RsltR.$itm_dtl_cnt, "MAM_ITM_DTL__CNT");
				addColumnPathMap(Srch02_RsltR.$itm_oper_cnt, "MAM_ITM_OPER_CNT");
				addColumnPathMap(Srch02_RsltR.$bom_par_cnt, "MAM_BOMPAR_CNT");
				addColumnPathMap(Srch02_RsltR.$bom_chd_cnt, "MAM_BOMCHD_CNT");
				addColumnPathMap(Srch02_RsltR.$oper_wk_cost_cnt, "MAM_OPER_WK_COST_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_insp_ptn_cnt, "MAM_ITM_INSP_PTN_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_insp_cnt, "MAM_ITM_INSP_CNT");
				addColumnPathMap(Srch02_RsltR.$insp_spec_cnt, "MAM_INSP_SPEC_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_site_cnt, "MAM_ITM_SITE_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_ver_cnt, "MAM_ITM_VER_CNT");
				addColumnPathMap(Srch02_RsltR.$lot_inh_dest_cnt, "MAM_LOT_INH_DEST_CNT");
				addColumnPathMap(Srch02_RsltR.$lot_inh_src_cnt, "MAM_LOT_INH_SRC_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_spec_cnt, "MAM_ITM_SPEC_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_spec_desc_cnt, "MAM_ITM_SPEC_DESC_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_comp_core_cnt, "MAM_ITM_COMPCORE_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_comp_comp_cnt, "MAM_ITM_COMPCOMP_CNT");
				addColumnPathMap(Srch02_RsltR.$mps_itm_cnt, "MAM_MPS_ITM__CNT");
				addColumnPathMap(Srch02_RsltR.$spln_itm_conf_cnt, "MAM_SPLN_ITM_CONF_CNT");
				addColumnPathMap(Srch02_RsltR.$purc_ddlv_lt_cnt, "MAM_PURC_DDLV_LT_CNT");
				addColumnPathMap(Srch02_RsltR.$bp_itm_cnt, "MAM_BP_ITM_CNT");
				addColumnPathMap(Srch02_RsltR.$proc_upri_cnt, "MAM_PROC_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$prov_upri_cnt, "MAM_PROV_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$purc_upri_cnt, "MAM_PURC_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$std_sls_upri_cnt, "MAM_STD_SLS_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$itm_sls_upri_cnt, "MAM_ITM_SLS_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$cst_sls_upri_cnt, "MAM_CST_SLS_UPRI__CNT");
				addColumnPathMap(Srch02_RsltR.$set_itm_main_cnt, "MAM_SET_ITMMAIN_CNT");
				addColumnPathMap(Srch02_RsltR.$set_itm_set_cnt, "MAM_SET_ITMSET_CNT");
				addColumnPathMap(Srch02_RsltR.$if_x_cnt, "MAM_IF_X_CNT");
				addColumnPathMap(Srch02_RsltR.$ctg_config_cnt, "MAM_CTG_CONFIG_CNT");
				addColumnPathMap(Srch02_RsltR.$jnl_ptn_cnt, "MAM_JNL_PTN_CNT");
				addColumnPathMap(Srch02_RsltR.$coef_config_cnt, "MAM_COEF_CONFIG_CNT");
				addColumnPathMap(Srch02_RsltR.$alc_expns_cnt, "MAM_ALC_EXPNS_CNT");
				addColumnPathMap(Srch02_RsltR.$alc_inpt_cnt, "MAM_ALC_INPT_CNT");
				addColumnPathMap(Srch02_RsltR.$cost_itm_out_cnt, "MAM_COST_ITM_OUT_CNT");
				addColumnPathMap(Srch02_RsltR.$xpns_purc_alc_cnt, "MAM_XPNS_PURC_ALC_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_lg_grp_cnt, "MAM_ITM_LG_GRP_CNT");
				addColumnPathMap(Srch02_RsltR.$itm_str_ln_cnt, "MAM_ITM_STR_LN_CNT");
			}
		}		
		
		/**
		 * 下り電文のフラグ項目を設定する。
		 * 
		 * @param down0
		 */
		protected void setFlgVals(MCList<Srch02_RsltR> down0) {
			
			for (Srch02_RsltR downR : down0) {
				// 品目はオン固定				
				downR.itm_flg(true);


				// 参照登録時コピー不可
				if (isSame(up0().ope(), "9")) {
					downR.attach_info_flg(false);
					downR.sundry_itm_flg(false);
					downR.alt_itm_flg(false);
					downR.bom_chd_flg(false);
					downR.itm_comp_comp_flg(false);
					downR.itm_not_fix_flg(false);
					downR.itm_sls_upri_flg(false);
					downR.lot_inh_src_flg(false);
					downR.proc_upri_flg(false);
					downR.prov_upri_flg(false);
					downR.purc_upri_flg(false);
					downR.set_itm_set_flg(false);
					downR.std_sls_upri_flg(false);
					downR.cst_sls_upri_flg(false);
					downR.jnl_ptn_flg(false);
					downR.alc_expns_flg(false);
					downR.if_x_flg(false);
				}
				else {
					downR.attach_info_flg(!isNull(downR.attach_info_cnt()));
					downR.sundry_itm_flg(!isNull(downR.sundry_itm_cnt()));
					downR.alt_itm_flg(!isNull(downR.alt_itm_cnt()));
					downR.bom_chd_flg(!isNull(downR.bom_chd_cnt()));
					downR.itm_comp_comp_flg(!isNull(downR.itm_comp_comp_cnt()));
					downR.itm_not_fix_flg(!isNull(downR.itm_not_fix_cnt()));
					downR.itm_sls_upri_flg(!isNull(downR.itm_sls_upri_cnt()));
					downR.lot_inh_src_flg(!isNull(downR.lot_inh_src_cnt()));
					downR.proc_upri_flg(!isNull(downR.proc_upri_cnt()));
					downR.prov_upri_flg(!isNull(downR.prov_upri_cnt()));
					downR.purc_upri_flg(!isNull(downR.purc_upri_cnt()));
					downR.set_itm_set_flg(!isNull(downR.set_itm_set_cnt()));
					downR.std_sls_upri_flg(!isNull(downR.std_sls_upri_cnt()));
					downR.cst_sls_upri_flg(!isNull(downR.cst_sls_upri_cnt()));
					downR.jnl_ptn_flg(!isNull(downR.jnl_ptn_cnt()));
					downR.alc_expns_flg(!isNull(downR.alc_expns_cnt()));
					downR.if_x_flg(!isNull(downR.if_x_cnt()));
				}
				downR.itm_sub_flg(!isNull(downR.itm_sub_cnt()));
				downR.itm_unit_flg(!isNull(downR.itm_unit_cnt()));
				downR.itm_stop_flg(!isNull(downR.itm_stop_cnt()));
				downR.stdcost_flg(!isNull(downR.stdcost_cnt()));
				downR.itm_strg_flg(!isNull(downR.itm_strg_cnt()));
				downR.alloc_ctl_flg(!isNull(downR.alloc_ctl_cnt()));
				downR.stk_rpl_flg(!isNull(downR.stk_rpl_cnt()));
				downR.itm_wg_flg(!isNull(downR.itm_wg_cnt()));
				downR.itm_dtl_flg(!isNull(downR.itm_dtl_cnt()));
				downR.itm_oper_flg(!isNull(downR.itm_oper_cnt()));
				downR.bom_par_flg(!isNull(downR.bom_par_cnt()));
				downR.oper_wk_cost_flg(!isNull(downR.oper_wk_cost_cnt()));
				downR.itm_insp_ptn_flg(!isNull(downR.itm_insp_ptn_cnt()));
				downR.itm_insp_flg(!isNull(downR.itm_insp_cnt()));
				downR.insp_spec_flg(!isNull(downR.insp_spec_cnt()));
				downR.itm_site_flg(!isNull(downR.itm_site_cnt()));
				downR.itm_ver_flg(!isNull(downR.itm_ver_cnt()));
				downR.lot_inh_dest_flg(!isNull(downR.lot_inh_dest_cnt()));
				downR.itm_spec_flg(!isNull(downR.itm_spec_cnt()));
				downR.itm_spec_desc_flg(!isNull(downR.itm_spec_desc_cnt()));
				downR.itm_comp_core_flg(!isNull(downR.itm_comp_core_cnt()));
				downR.mps_itm_flg(!isNull(downR.mps_itm_cnt()));
				downR.spln_itm_conf_flg(!isNull(downR.spln_itm_conf_cnt()));
				downR.purc_ddlv_lt_flg(!isNull(downR.purc_ddlv_lt_cnt()));
				downR.bp_itm_flg(!isNull(downR.bp_itm_cnt()));
				downR.set_itm_main_flg(!isNull(downR.set_itm_main_cnt()));
				downR.ctg_config_flg(!isNull(downR.ctg_config_cnt()));
				downR.coef_config_flg(!isNull(downR.coef_config_cnt()));
				downR.alc_inpt_flg(!isNull(downR.alc_inpt_cnt()));
				downR.cost_itm_out_flg(!isNull(downR.cost_itm_out_cnt()));
				downR.xpns_purc_alc_flg(!isNull(downR.xpns_purc_alc_cnt()));
				downR.itm_lg_grp_flg(!isNull(downR.itm_lg_grp_cnt()));
				downR.itm_str_ln_flg(!isNull(downR.itm_str_ln_cnt()));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_ItmCopyReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目系マスタの削除を行います。（マスタ画面用）<br>
	 */
	public class Del01 extends MABCL_ItmCopyReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	/**
	 * 品目関連項目を追加します。<p>
	 * 
	 * @param builder 品目マスタのビルダ
	 * @param up 上り電文（検索条件）
	 * @param ope オペレーションＩＤ
	 */
	protected <R extends MCDBContainer> void addItmColSql(MCQueryApiBuilder builder, Srch01_CndR up, String ope, String mainAlias, MCList<R> rslt){
		MAM_ITM__R t = (MAM_ITM__R) builder.getBaseDbc();

		if (isSame(SRCH02_OPE, ope)) {
			MAM_ITM__R refitm = MAM_ITM__R.create(mainAlias);
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			builder.addInnerJoin(refitm, t.ref_itm_cd.eq(refitm.itm_cd)
					.and(t.ref_itm_sub1.eq(refitm.itm_sub1))
					.and(t.ref_itm_sub2.eq(refitm.itm_sub2))
					.and(t.ref_itm_sub3.eq(refitm.itm_sub3)));
			builder.addLeftOuterJoin(itmtypd2, refitm.itm_typ.eq(itmtypd2.itm_typ)
					.and(refitm.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd)));

			rslt.addBooleanColumn("ref_del_flg");

			builder.addSelect("ref_itm_nm", refitm.itm_nm);
			builder.addSelect("ref_base_itm_nm", refitm.base_itm_nm);
			builder.addSelect("ref_itm_typ", refitm.itm_typ);
			builder.addSelect("ref_itm_typ_d_cd", refitm.itm_typ_d_cd);
			builder.addSelect("ref_memo1", refitm.memo1);
			builder.addSelect("ref_memo2", refitm.memo2);
			builder.addSelect("ref_memo3", refitm.memo3);
			builder.addSelect("ref_del_flg", refitm.del_flg);
			builder.addSelect("ref_itm_typ_d_nm", itmtypd2.itm_typ_d_nm);
		}
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		builder.addLeftOuterJoin(itmtypd1, t.itm_typ.eq(itmtypd1.itm_typ)
				.and(t.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
		builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm )));
		builder.addSelect(itmtypd1.itm_typ_d_nm);

		if(!isNull(up.itm_grp_nm1())) {
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
		}
		if(!isNull(up.itm_grp_nm2())) {
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
		}
		if(!isNull(up.itm_grp_nm3())) {
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
		}
		if(!isNull(up.itm_grp_nm4())) {
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
		}
		if(!isNull(up.itm_grp_nm5())) {
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
		}
		if(!isNull(up.itm_grp_nm6())) {
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
		}
		if(!isNull(up.itm_grp_nm7())) {
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
		}
		if(!isNull(up.itm_grp_nm8())) {
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
		}
		if(!isNull(up.itm_grp_nm9())) {
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
		}
		if(!isNull(up.itm_grp_nm10())) {
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
		}
	}
	
	/**
	 * リリースフラグの検索条件を追加します。<p>
	 * 
	 * @param builder 品目マスタのビルダ
	 * @param up 上り電文（検索条件）
	 */
	protected void addReleaseWhere(MCQueryApiBuilder builder, Srch01_CndR up){
		MAM_ITM__R t = (MAM_ITM__R) builder.getBaseDbc();
		if (up.release_flg_on() && !up.release_flg_off()) {
			builder.addWhereWithAnd(t.release_flg.eq(value(true)));
		}
		if (!up.release_flg_on() && up.release_flg_off()) {
			builder.addWhereWithAnd(t.release_flg.eq(value(false)));
		}
	}
	
	/**
	 * マスタレコード件数用のSQLを追加する。
	 * 
	 * @param builder 品目マスタのビルダ
	 * @param PI サブオペレーションリスト 
	 */
	protected void addCntSelectSql(MCQueryApiBuilder builder, List<MCController> PI, String mainAlias){
		
		int i = 0;
		
		for (MCController ctrl : PI) {
			if (ctrl instanceof MCDBSubOperation<?>) {
				if (isSame(i, PAR_BOM_SUB_OPE_NUM)) {
					_parBomFlg = true;
				}
				else {
					_parBomFlg = false;
				}
				
				if (isSame(i, CORE_ITM_COMP_SUB_OPE_NUM)) {
					_coreCompFlg = true;
				}
				else {
					_coreCompFlg = false;
				}
				
				if (isSame(i, MAIN_SET_ITM_SUB_OPE_NUM)) {
					_mainSetFlg = true;
				}
				else {
					_mainSetFlg = false;
				}
				if (isSame(i, PAR_LOT_INH_SRC_OPE_NUM)) {
					_parLotFlg = true;
				}
				else {
					_parLotFlg = false;
				}

				MCDBSubOperation<?> subOpe = (MCDBSubOperation<?>) ctrl;
				addInlineView(builder, subOpe.dbc(), String.valueOf(i), mainAlias);
				i++;
			}
		}
	}
	
	/**
	 * インラインビュー用のSQLを追加する。<p>
	 * 例）<br>
	 * SELECT句：M0.CNT MAM_ITM_DTL_CNT<br>
	 * FROM句：LEFT OUTER JOIN ( <br>
	 * 	　　　　　　　SELECT <br>
	 * 	　　　　　　　　　T.ITM_CD <br>
	 * 	　　　　　　　　　,T.ITM_SUB1 <br>
	 * 	　　　　　　　　　,T.ITM_SUB2 <br>
	 *	　　　　　　　　　,T.ITM_SUB3 <br>
	 *	　　　　　　　　　,COUNT(T.ITM_CD) CNT <br>
	 * 	　　　　　　　FROM <br>
	 * 	　　　　　　　　　MAM_ITM_DTL T <br>
	 * 	　　　　　　　GROUP BY T.ITM_CD, T.ITM_SUB1, T.ITM_SUB2, T.ITM_SUB3) M0 <br>
	 * 	　　　　　ON (T.ITM_CD = M0.itm_cd AND T.ITM_SUB1 = M0.itm_sub1 AND T.ITM_SUB2 = M0.itm_sub2 AND T.ITM_SUB3 = M0.itm_sub3)
	 * 
	 * @param builder 品目マスタのビルダ
	 * @param r カウント対象のマスタのＤＢコンテナ
	 * @param i ビュー名の接頭辞の後ろにつける連番
	 */
	protected void addInlineView(MCQueryApiBuilder builder, MCDBContainer r, String i,
			String mainAlias) {
		MCTempView view = createTempView("M" + i);

		builder.addLeftOuterJoin(
				subQuery().select(getInlineCols(r)).from(r).where(getInlineWhere(r))
						.groupBy(getInlineGroupBy(r)).view(view),
				getInlineOn(r, view, mainAlias));
		builder.addSelect(getSelectFromInlineView(r, i), view.pr("CNT"));
	}
	/** インラインビューのSELECT句 */
	protected MCFMEDColumnGroup[] getInlineCols(MCDBContainer r) {
		List<MCFMEDColumnGroup> l = new ArrayList<MCFMEDColumnGroup>();
		for (Map.Entry<String, String> itmColNm : getItmColsNm(r).entrySet()) {
			l.add(r.getColumn$(itmColNm.getValue()));
		}
		l.add(countAll().as("CNT"));
		return l.toArray(new MCFMEDColumnGroup[0]);
	}
	/** インラインビューのGROUP BY句 */
	protected MCFMEDExpr[] getInlineGroupBy(MCDBContainer r) {
		List<MCFMEDExpr> l = new ArrayList<MCFMEDExpr>();
		for (Map.Entry<String, String> itmColNm : getItmColsNm(r).entrySet()) {
			l.add(r.getColumn$(itmColNm.getValue()));
		}
		return l.toArray(new MCFMEDExpr[0]);
	}
	/** インラインビューのWHERE句 */
	protected MCPredicate getInlineWhere(MCDBContainer r) {
		MCPredicate where = value(0).eq(value(0));
		if (MAUCL_StEndUtil.isStEndDt(r)){
			where = addStEndDtWhere(where, r);
		}
		return where;
	}
	/** インラインビューとの結合条件 */
	protected MCPredicate getInlineOn(MCDBContainer r, MCTempView view,
			String mainAlias) {
		MAM_ITM__R t = MAM_ITM__R.create(mainAlias);

		MCPredicate where = null;
		for (Map.Entry<String, String> itmColNm : getItmColsNm(r).entrySet()) {
			if (null == where) {
				where = MCQueryApiBuilder.makeEq(t.getColumn$(itmColNm.getKey()), view.pr(itmColNm.getValue()));
			}
			else {
				where = where.and(MCQueryApiBuilder.makeEq(t.getColumn$(itmColNm.getKey()), view.pr(itmColNm.getValue())));
			}
		}
		return where;
	}
	
	/**
	 * カウントの別名を返す<p>
	 * 例） MAM_ITM_DTL_CNT
	 * 
	 * @param dbc 検索対象マスタコンテナ
	 * @param i ビュー名の接頭辞の後ろにつける連番
	 */
	protected String getSelectFromInlineView(MCDBContainer dbc, String i){
		String str = dbc.tableName();
		if (dbc instanceof MAM_BOM_R && _parBomFlg) {
			str = str.concat("PAR");
		}
		else if (dbc instanceof MAM_BOM_R && !_parBomFlg) {
			str = str.concat("CHD");
		}
		else if (dbc instanceof MAM_ITM_COMP_R && _coreCompFlg) {
			str = str.concat("CORE");
		}
		else if (dbc instanceof MAM_ITM_COMP_R && !_coreCompFlg) {
			str = str.concat("COMP");
		}
		else if (dbc instanceof MAM_SET_ITM_R && _mainSetFlg) {
			str = str.concat("MAIN");
		}
		else if (dbc instanceof MAM_SET_ITM_R && !_mainSetFlg) {
			str = str.concat("SET");
		}
		else if (dbc instanceof MAM_LOT_INH_SRC_R && _parLotFlg) {
			str = "MAM_LOT_INH_DEST";
		}
		str = str.concat(COL_ALIAS_SUFFIX);
		return str;
	}
	
	/**
	 * 品目ＣＤ、枝番１、枝番２、枝番３のカラム名を取得する。<br>
	 * マスタの品目ＣＤ、枝番１、枝番２、枝番３のカラムが別名の場合、その別名を取得する。<br>
	 * （デフォルトは、品目ＣＤ：itm_cd, 枝番１：itm_sub1, 枝番２：itm_sub2, 枝番３：itm_sub3）
	 * 
	 * @param dbc 検索対象マスタコンテナ
	 * @return 品目カラム配列
	 */
	protected HashMap<String, String> getItmColsNm(MCDBContainer dbc){
		
		HashMap<String, String> colsNm = new HashMap<String, String>();
		colsNm.put(ITM_CD, ITM_CD);
		colsNm.put(ITM_SUB1, ITM_SUB1);
		colsNm.put(ITM_SUB2, ITM_SUB2);
		colsNm.put(ITM_SUB3, ITM_SUB3);
		
		if (dbc instanceof MAM_BOM_R && _parBomFlg) {
			colsNm.put(ITM_CD, MAM_BOM_R.$par_itm_cd);
			colsNm.put(ITM_SUB1, MAM_BOM_R.$par_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_BOM_R.$par_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_BOM_R.$par_itm_sub3);
		}
		else if (dbc instanceof MAM_BOM_R && !_parBomFlg) {
			colsNm.put(ITM_CD, MAM_BOM_R.$chd_itm_cd);
			colsNm.put(ITM_SUB1, MAM_BOM_R.$chd_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_BOM_R.$chd_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_BOM_R.$chd_itm_sub3);
		}
		else if (dbc instanceof MAM_IF_X_R) {
			colsNm.put(ITM_CD, MAM_IF_X_R.$if_itm_cd);
			colsNm.put(ITM_SUB1, MAM_IF_X_R.$if_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_IF_X_R.$if_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_IF_X_R.$if_itm_sub3);
		}
		else if (dbc instanceof MAM_ALT_ITM_R) {
			colsNm.put(ITM_CD, MAM_ALT_ITM_R.$chd_itm_cd);
			colsNm.put(ITM_SUB1, MAM_ALT_ITM_R.$chd_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_ALT_ITM_R.$chd_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_ALT_ITM_R.$chd_itm_sub3);
		}
		else if (dbc instanceof MAM_ITM_COMP_R && _coreCompFlg) {
			colsNm.put(ITM_CD, MAM_ITM_COMP_R.$core_itm_cd);
			colsNm.put(ITM_SUB1, MAM_ITM_COMP_R.$core_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_ITM_COMP_R.$core_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_ITM_COMP_R.$core_itm_sub3);
		}
		else if (dbc instanceof MAM_ITM_COMP_R && !_coreCompFlg) {
			colsNm.put(ITM_CD, MAM_ITM_COMP_R.$comp_itm_cd);
			colsNm.put(ITM_SUB1, MAM_ITM_COMP_R.$comp_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_ITM_COMP_R.$comp_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_ITM_COMP_R.$comp_itm_sub3);
		}
		else if (dbc instanceof MAM_LOT_INH_SRC_R && _parLotFlg) {
			colsNm.put(ITM_CD, MAM_LOT_INH_DEST_R.$par_itm_cd);
			colsNm.put(ITM_SUB1, MAM_LOT_INH_DEST_R.$par_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_LOT_INH_DEST_R.$par_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_LOT_INH_DEST_R.$par_itm_sub3);
		}
		else if (dbc instanceof MAM_LOT_INH_SRC_R && !_parLotFlg) {
			colsNm.put(ITM_CD, MAM_LOT_INH_SRC_R.$chd_itm_cd);
			colsNm.put(ITM_SUB1, MAM_LOT_INH_SRC_R.$chd_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_LOT_INH_SRC_R.$chd_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_LOT_INH_SRC_R.$chd_itm_sub3);
		}
		else if (dbc instanceof MAM_SET_ITM_R && _mainSetFlg) {
			colsNm.put(ITM_CD, MAM_SET_ITM_R.$main_itm_cd);
			colsNm.put(ITM_SUB1, MAM_SET_ITM_R.$main_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_SET_ITM_R.$main_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_SET_ITM_R.$main_itm_sub3);
		}
		else if (dbc instanceof MAM_SET_ITM_R && !_mainSetFlg) {
			colsNm.put(ITM_CD, MAM_SET_ITM_R.$set_itm_cd);
			colsNm.put(ITM_SUB1, MAM_SET_ITM_R.$set_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_SET_ITM_R.$set_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_SET_ITM_R.$set_itm_sub3);
		}
		else if (dbc instanceof MAM_XPNS_PURC_ALC_R) {
			colsNm.put(ITM_CD, MAM_XPNS_PURC_ALC_R.$xpns_itm_cd);
			colsNm.put(ITM_SUB1, MAM_XPNS_PURC_ALC_R.$xpns_itm_sub1);
			colsNm.put(ITM_SUB2, MAM_XPNS_PURC_ALC_R.$xpns_itm_sub2);
			colsNm.put(ITM_SUB3, MAM_XPNS_PURC_ALC_R.$xpns_itm_sub3);
		}
		
		return colsNm;
	}
	
	/**
	 * 適用開始日、適用終了日のカットオフのWhere句を追加する。
	 */
	protected MCPredicate addStEndDtWhere(MCPredicate where, MCDBContainer dbc){
		where = where.cutoff$and(((MCDateExpr)dbc.getColumn$(ST_DT)).gte(bind(Srch01_CndR.$st_dt_fr)));
		where = where.cutoff$and(((MCDateExpr)dbc.getColumn$(ST_DT)).lte(bind(Srch01_CndR.$st_dt_to)));
		where = where.cutoff$and(((MCDateExpr)dbc.getColumn$(END_DT)).gte(bind(Srch01_CndR.$end_dt_fr)));
		where = where.cutoff$and(((MCDateExpr)dbc.getColumn$(END_DT)).lte(bind(Srch01_CndR.$end_dt_to)));
		return where;
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////
	
	protected static final Class<MABCL_ItmCopyReg> CLAZZ = MABCL_ItmCopyReg.class;

	/**
	 * MAM_ITM_キャッシュ
	 */
	protected static void initItmCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM__R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_ITM__R.create("T"));
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM__R>(bldr, dtlL,
				MAM_ITM__R.$itm_cd,
				MAM_ITM__R.$itm_sub1,
				MAM_ITM__R.$itm_sub2,
				MAM_ITM__R.$itm_sub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM__R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM__R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * MAM_ITM_COMキャッシュ
	 */
	protected static void initItmComCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmComCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_COM_R> _itmComCache = null;
	protected void _initItmComCache(MCList<?> dtlL) {
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_ITM_COM_R.create("T"));
		_itmComCache = new FXUCL_MCDbcCache<MAM_ITM_COM_R>(bldr, dtlL,
				MAM_ITM_COM_R.$itm_cd,
				MAM_ITM_COM_R.$itm_sub1,
				MAM_ITM_COM_R.$itm_sub2,
				MAM_ITM_COM_R.$itm_sub3,
				MAM_ITM_COM_R.$co_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_COM_R> getItmComCache() {
		if (object(CLAZZ)._itmComCache == null) {
			object(CLAZZ)._initItmComCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmComCache;
	}
	protected static MAM_ITM_COM_R getItmComR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmComCache().get(itmCd, itmSub1, itmSub2, itmSub3, getCo().co_cd());
	}
	
	/**
	 * MAM_ITM_CMN_UPDキャッシュ
	 */
	protected static void initItmCmnUpdCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCmnUpdCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_CMN_UPD_R> _itmCmnUpdCache = null;
	protected void _initItmCmnUpdCache(MCList<?> dtlL) {
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MAM_ITM_CMN_UPD_R.create("T"));
		_itmCmnUpdCache = new FXUCL_MCDbcCache<MAM_ITM_CMN_UPD_R>(bldr, dtlL,
				MAM_ITM_CMN_UPD_R.$itm_cd,
				MAM_ITM_CMN_UPD_R.$itm_sub1,
				MAM_ITM_CMN_UPD_R.$itm_sub2,
				MAM_ITM_CMN_UPD_R.$itm_sub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_CMN_UPD_R> getItmCmnUpdCache() {
		if (object(CLAZZ)._itmCmnUpdCache == null) {
			object(CLAZZ)._initItmCmnUpdCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCmnUpdCache;
	}
	protected static MAM_ITM_CMN_UPD_R getItmCmnUpdR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCmnUpdCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// ユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	protected String getTableLocaleName(String tableName) {
		String t = getDBLabel(tableName, null, getUsrLocale());
		if (t != null) {
			return t;
		}
		return tableName;
	}
	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////


	/**
	 * フラグ名に対応するＤＢコンテナを返す<br>
	 */
	@SuppressWarnings("unchecked")
	protected <R extends MCDBContainer, L extends MCList<R>> L getDbc(String flgStr) {
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_flg)) {
			// 品目は別処理
			return null;
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_sub_flg)) {
			return (L) MCList.create(MAM_ITM_SUB_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_unit_flg)) {
			return (L) MCList.create(MAM_ITM_UNIT__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$attach_info_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_ATTACH_INFO_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_stop_flg)) {
			return (L) MCList.create(MAM_ITM_STOP_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_not_fix_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_ITM_NOT_FIX_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$stdcost_flg)) {
			return (L) MCList.create(MAM_STDCOST__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$sundry_itm_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_SUNDRY_ITM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_strg_flg)) {
			return (L) MCList.create(MAM_ITM_STRG_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$alloc_ctl_flg)) {
			return (L) MCList.create(MAM_ALLOC_CTL_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$stk_rpl_flg)) {
			return (L) MCList.create(MAM_STK_RPL_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$alt_itm_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_ALT_ITM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_wg_flg)) {
			return (L) MCList.create(MAM_ITM_WG__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_dtl_flg)) {
			return (L) MCList.create(MAM_ITM_DTL__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_oper_flg)) {
			return (L) MCList.create(MAM_ITM_OPER_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_par_flg)) {
			return (L) MCList.create(MAM_BOM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_chd_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_BOM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$oper_wk_cost_flg)) {
			return (L) MCList.create(MAM_OPER_WK_COST_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_insp_ptn_flg)) {
			return (L) MCList.create(MAM_ITM_INSP_PTN_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_insp_flg)) {
			return (L) MCList.create(MAM_ITM_INSP_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$insp_spec_flg)) {
			return (L) MCList.create(MAM_INSP_SPEC_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_site_flg)) {
			return (L) MCList.create(MAM_ITM_SITE_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_ver_flg)) {
			return (L) MCList.create(MAM_ITM_VER_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$lot_inh_dest_flg)) {
			if (_delSrcFlg) {
				return (L) MCList.create(MAM_LOT_INH_SRC_R.class);
			}
			return (L) MCList.create(MAM_LOT_INH_DEST_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$lot_inh_src_flg)) {
			return (L) MCList.create(MAM_LOT_INH_SRC_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_spec_flg)) {
			return (L) MCList.create(MAM_ITM_SPEC_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_spec_desc_flg)) {
			return (L) MCList.create(MAM_ITM_SPEC_DESC_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_comp_core_flg)) {
			return (L) MCList.create(MAM_ITM_COMP_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_comp_comp_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_ITM_COMP_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$mps_itm_flg)) {
			return (L) MCList.create(MAM_MPS_ITM__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$spln_itm_conf_flg)) {
			return (L) MCList.create(MAM_SPLN_ITM_CONF_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$purc_ddlv_lt_flg)) {
			return (L) MCList.create(MAM_PURC_DDLV_LT_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bp_itm_flg)) {
			return (L) MCList.create(MAM_BP_ITM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$proc_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			else if (_aplFlg) {
				return (L) MCList.create(MAM_PROC_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_PROC_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$prov_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			else if (_aplFlg) {
				return (L) MCList.create(MAM_PROV_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_PROV_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$purc_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			else if (_aplFlg) {
				return (L) MCList.create(MAM_PURC_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_PURC_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$std_sls_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			else if (_aplFlg) {
				return (L) MCList.create(MAM_STD_SLS_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_STD_SLS_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_sls_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			else if (_aplFlg) {
				return (L) MCList.create(MAM_ITM_SLS_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_ITM_SLS_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$cst_sls_upri_flg)) {
			if (_updFlg) {
				return null;
			}
			if (_aplFlg) {
				return (L) MCList.create(MAM_CST_SLS_UPRI_APL_R.class);
			}
			return (L) MCList.create(MAM_CST_SLS_UPRI__R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$set_itm_main_flg)) {
			return (L) MCList.create(MAM_SET_ITM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$set_itm_set_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_SET_ITM_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$if_x_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_IF_X_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$ctg_config_flg)) {
			return (L) MCList.create(MAM_CTG_CONFIG_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$jnl_ptn_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_JNL_PTN_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$coef_config_flg)) {
			return (L) MCList.create(MAM_COEF_CONFIG_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$alc_expns_flg)) {
			if (_updFlg) {
				return null;
			}
			return (L) MCList.create(MAM_ALC_EXPNS_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$alc_inpt_flg)) {
			return (L) MCList.create(MAM_ALC_INPT_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$cost_itm_out_flg)) {
			return (L) MCList.create(MAM_COST_ITM_OUT_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$xpns_purc_alc_flg)) {
			return (L) MCList.create(MAM_XPNS_PURC_ALC_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_lg_grp_flg)) {
			return (L) MCList.create(MAM_ITM_LG_GRP_R.class);
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_str_ln_flg)) {
			return (L) MCList.create(MAM_ITM_STR_LN_R.class);
		}
		return null;
	}
	/**
	 * マスタに対応する品目ＣＤ・枝番１～３のカラム名の配列を返す<br>
	 */
	protected String[] getItmCols(String flgStr){
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$if_x_flg)) {
			return new String[] {
					MAM_IF_X_R.$if_itm_cd,
					MAM_IF_X_R.$if_itm_sub1,
					MAM_IF_X_R.$if_itm_sub2,
					MAM_IF_X_R.$if_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_par_flg)
				|| isSame(flgStr, ItmCopy_UpdChk01_DtlR.$lot_inh_src_flg) && _updFlg
				|| isSame(flgStr, ItmCopy_UpdChk01_DtlR.$lot_inh_dest_flg)) {
			return new String[] {
					MAM_BOM_R.$par_itm_cd,
					MAM_BOM_R.$par_itm_sub1,
					MAM_BOM_R.$par_itm_sub2,
					MAM_BOM_R.$par_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$bom_chd_flg)
				|| isSame(flgStr, ItmCopy_UpdChk01_DtlR.$alt_itm_flg)
				|| isSame(flgStr, ItmCopy_UpdChk01_DtlR.$lot_inh_src_flg) && !_updFlg) {
			return new String[] {
					MAM_BOM_R.$chd_itm_cd,
					MAM_BOM_R.$chd_itm_sub1,
					MAM_BOM_R.$chd_itm_sub2,
					MAM_BOM_R.$chd_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_comp_core_flg)) {
			return new String[] {
					MAM_ITM_COMP_R.$core_itm_cd,
					MAM_ITM_COMP_R.$core_itm_sub1,
					MAM_ITM_COMP_R.$core_itm_sub2,
					MAM_ITM_COMP_R.$core_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$itm_comp_comp_flg)) {
			return new String[] {
					MAM_ITM_COMP_R.$comp_itm_cd,
					MAM_ITM_COMP_R.$comp_itm_sub1,
					MAM_ITM_COMP_R.$comp_itm_sub2,
					MAM_ITM_COMP_R.$comp_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$set_itm_main_flg)) {
			return new String[] {
					MAM_SET_ITM_R.$main_itm_cd,
					MAM_SET_ITM_R.$main_itm_sub1,
					MAM_SET_ITM_R.$main_itm_sub2,
					MAM_SET_ITM_R.$main_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$set_itm_set_flg)) {
			return new String[] {
					MAM_SET_ITM_R.$set_itm_cd,
					MAM_SET_ITM_R.$set_itm_sub1,
					MAM_SET_ITM_R.$set_itm_sub2,
					MAM_SET_ITM_R.$set_itm_sub3
			};
		}
		if (isSame(flgStr, ItmCopy_UpdChk01_DtlR.$xpns_purc_alc_flg)) {
			return new String[] {
					MAM_XPNS_PURC_ALC_R.$xpns_itm_cd,
					MAM_XPNS_PURC_ALC_R.$xpns_itm_sub1,
					MAM_XPNS_PURC_ALC_R.$xpns_itm_sub2,
					MAM_XPNS_PURC_ALC_R.$xpns_itm_sub3
			};
		}
		return getItmCols();
	}
	protected String[] getItmCols() {
		return new String[] {
				MAM_ITM__R.$itm_cd,
				MAM_ITM__R.$itm_sub1,
				MAM_ITM__R.$itm_sub2,
				MAM_ITM__R.$itm_sub3
		};
	}
	protected void setWhere(MCQueryApiBuilder bldr, String flgStr) {
		MCDBContainer t = bldr.getBaseDbc();
		String[] dbcCols = getItmCols(flgStr);
		String[] bindCols = getItmCols();
		bldr.setWhere(value(0).eq(value(0)));
		for (int i = 0; i < dbcCols.length; i++) {
			bldr.addWhereWithAnd(((MCStringExpr)t.getColumn$(dbcCols[i])).eq(bind(bindCols[i])));
		}
	}

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ<p>
	 */
	protected void setDelFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		r.setStringNE("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId(LOGIC_ID, procid, "01"), procid, r, ":del_flg_ctl");
	}

	//FMCB CUSTOM END
}