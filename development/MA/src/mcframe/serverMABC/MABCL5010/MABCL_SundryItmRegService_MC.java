package mcframe.serverMABC.MABCL5010;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMABC.MABCL5010.Query.*;
import mcframe.commonCore.sys.MCFactory;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SundryItmRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SundryItmRegService_MC extends MABCL_SundryItmRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * オブジェクト共有用のクラス
	 */
	protected static final Class<MABCL_SundryItmRegService> CLAZZ = MABCL_SundryItmRegService.class;

	/**
	 * 品目マスタ
	 */
	protected Map<List<Comparable<?>>, MAM_ITM_R> _itmMap = null;

	/**
	 * 品目マスタを取得します。
	 */
	protected static Map<List<Comparable<?>>, MAM_ITM_R> getItmMap() {
		return object(CLAZZ)._getItmMap();
	}

	/**
	 * 品目マスタを取得します。
	 */
	protected Map<List<Comparable<?>>, MAM_ITM_R> _getItmMap() {
		if (_itmMap == null) {
			_itmMap = new HashMap<>();
		}
		return _itmMap;
	}

	/**
	 * SundryItm_Chk01オペレーション.<p>
	 *
	 * 諸口品マスタに登録可能かどうかチェックする。<br>
	 */
	public class SundryItm_Chk01 extends MABCL_SundryItmRegService_MC_A.SundryItm_Chk01 {

		/**
		 * 上り電文
		 */
		MCList<SundryItm_Chk01_DtlR> _orgUp0L = up0().createInstance();

		@Override
		protected void call() {
			super.call();
			crtDown();
		}

		@Override
		protected void init() {
			super.init();
			crtItmInfo();
			editUp();
		}

		/**
		 * 品目情報を作成します。
		 */
		protected void crtItmInfo() {
			BiConsumer<MAM_ITM_R, SundryItm_Chk01_DtlR> itmCpy = (d, s) -> {
				d.itm_cd(s.itm_cd());
				d.itm_sub1(s.itm_sub1());
				d.itm_sub2(s.itm_sub2());
				d.itm_sub3(s.itm_sub3());
			};
			
			BiConsumer<MCDBContainer, MCQueryApiBuilder> itmCnd = (t, r_bldr) -> {
				r_bldr.setSelect(t.getColumn$("itm_cd"), t.getColumn$("itm_sub1"),
						t.getColumn$("itm_sub2"), t.getColumn$("itm_sub3"),
						t.getColumn$("stk_mng_typ"));
			};
			getItmMap().putAll(
					getMap(MAM_ITM_R.class, up0(), itmCpy, itmCnd));
		}

		/**
		 * 上り電文を編集します。
		 */
		protected void editUp() {
			_orgUp0L.setAll(up0());

			MCRowMatcher<SundryItm_Chk01_DtlR> tgtRM = r -> {
				MAM_ITM_R itmR = getMapVal(getItmMap(), r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR != null &&
						MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
					return true;
				}
				return false;
			};

			up0().setAll(up0().subList(tgtRM));
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<SundryItm_Chk01_DtlR> chkL = getChkList(up0(), MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);

			msgL.addAll(chkDataCrud(chkL));
			msgL.addAll(chkItmNmDup(chkL));
			msgL.addAll(chkItmNmDupDB(chkL));

			return msgL;
		}

		/**
		 * データ更新区分をチェックします。
		 */
		protected MCMessageList chkDataCrud(MCList<SundryItm_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCRowMatcher<SundryItm_Chk01_DtlR> delRM = r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ());

			for (SundryItm_Chk01_DtlR r : notErrL) {
				if (delRM.match(r)) {
					throw new MCAppException(
							new MCMessage(r, SundryItm_Chk01_DtlR.$data_crud_typ, MABCL0250, toDispGUIIndex(r)));
				}
			}

			return msgL;
		}

		/**
		 * 上り電文の品名の競合をチェックします。
		 */
		protected MCMessageList chkItmNmDup(MCList<SundryItm_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<SundryItm_Chk01_DtlR>[] grpLArr = up0().groupList(getUpKeyCols());

			for (MCList<SundryItm_Chk01_DtlR> grpL : grpLArr) {
				if (grpL.size() == 1) {
					continue;
				}
				if (grpL.groupBy(SundryItm_Chk01_DtlR.$itm_nm).size() > 1) {
					for (SundryItm_Chk01_DtlR r : grpL) {
						msgL.add(new MCMessage(r, SundryItm_Chk01_DtlR.$itm_nm, MABCL0251, toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 上り電文のキー項目を取得します。
		 */
		protected String[] getUpKeyCols() {
			return new String[] {
				  SundryItm_Chk01_DtlR.$itm_cd
				, SundryItm_Chk01_DtlR.$itm_sub1
				, SundryItm_Chk01_DtlR.$itm_sub2
				, SundryItm_Chk01_DtlR.$itm_sub3
				, SundryItm_Chk01_DtlR.$sno1
				, SundryItm_Chk01_DtlR.$sno2
				, SundryItm_Chk01_DtlR.$sno3
				, SundryItm_Chk01_DtlR.$sno4
			};
		}

		/**
		 * 上り電文とDBの品名の競合をチェックします。
		 */
		protected MCMessageList chkItmNmDupDB(MCList<SundryItm_Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			MCDBContainer wkTbl = getRegWk(MAM_SUNDRY_ITM_R.class, notErrL, getUpWkCpyMap());
			MCList<MAM_SUNDRY_ITM_R> wkL = MCList.create(MAM_SUNDRY_ITM_R.class);
			MAM_SUNDRY_ITM_R wkR = wkL.createRow();
			wkR.setAlias("T");
			MCQueryApiBuilder wkR_bldr = MCQueryApiBuilder.create(wkR);
			setSelWk(wkR, wkR_bldr, wkTbl, true);
			
			dbSelectForUpdateNoWait("MABCL5010_MAM_SUNDRY_ITM_S01", wkL, wkR_bldr, wkR);
			Map<List<Comparable<?>>, MAM_SUNDRY_ITM_R> wkMap = crtRowMap(wkL, wkR.getKeyColumn());

			MCRowMatcher<SundryItm_Chk01_DtlR> dupRM = r -> {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
				MAM_SUNDRY_ITM_R dbcR = getMapVal(wkMap, r.toArray(getUpKeyCols()));
				if (dbcR == null) {
					return false;
				}
				return !isSame(r.itm_nm(), dbcR.itm_nm());
			};

			for (SundryItm_Chk01_DtlR r : notErrL) {
				if (dupRM.match(r)) {
					msgL.add(new MCMessage(r, SundryItm_Chk01_DtlR.$itm_cd, MABCL0252,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()), toDispGUIIndex(r)));		
				}
			}
			return msgL;
		}

		/**
		 * 上り電文をワークテーブルに登録する際のマッピングを取得します。
		 */
		protected BiConsumer<MAM_SUNDRY_ITM_R, SundryItm_Chk01_DtlR> getUpWkCpyMap() {
			return (d, s) -> {
				d.itm_cd(s.itm_cd());
				d.itm_sub1(s.itm_sub1());
				d.itm_sub2(s.itm_sub2());
				d.itm_sub3(s.itm_sub3());
				d.sno1(s.sno1());
				d.sno2(s.sno2());
				d.sno3(s.sno3());
				d.sno4(s.sno4());
			};	
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			for (SundryItm_Chk01_DtlR r : _orgUp0L) {
				SundryItm_Chk01_DtlR downR = down0().createRow();
				downR.peg_no(r.peg_no());
				downR.err_flg(r.err_flg());
				down0().add(downR);
			}
		}

	}

	/**
	 * SundryItm_Upd01オペレーション.<p>
	 *
	 * 諸口品マスタを登録・更新する。<br>
	 */
	public class SundryItm_Upd01 extends MABCL_SundryItmRegService_MC_A.SundryItm_Upd01 {

		@Override
		protected void call() {
			editUp();
			reg();
		}

		/**
		 * 上り電文を編集します。
		 */
		protected void editUp() {
			MCRowMatcher<SundryItm_Upd01_DtlR> tgtRM = r -> {
				MAM_ITM_R itmR = getMapVal(getItmMap(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR != null && MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
					return true;
				}
				return false;
			};
			up0().setAll(up0().subList(tgtRM));
		}

		/**
		 * データを登録します。
		 */
		protected void reg() {
			MCList<SundryItm_Upd01_DtlR> regL = getRegL();
			regL.addBooleanColumn("upd_flg", false);
			MCIndexKey idxRegL = regL.createIndex(
					SundryItm_Upd01_DtlR.$itm_cd
					, SundryItm_Upd01_DtlR.$itm_sub1
					, SundryItm_Upd01_DtlR.$itm_sub2
					, SundryItm_Upd01_DtlR.$itm_sub3
					, SundryItm_Upd01_DtlR.$sno1
					, SundryItm_Upd01_DtlR.$sno2
					, SundryItm_Upd01_DtlR.$sno3
					, SundryItm_Upd01_DtlR.$sno4);
			MCList<MAM_SUNDRY_ITM_R> wkL = MCList.create(MAM_SUNDRY_ITM_R.class);
			MCQueryApiBuilder wkLBldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));
			dbWkDelete("MABCL5010_MAW_SUNDRY_ITM_D01", wkLBldr.getBaseDbc());
			
			for (SundryItm_Upd01_DtlR regR : regL) {
				MAM_SUNDRY_ITM_R wkR = MAM_SUNDRY_ITM_R.create();
				wkR.itm_cd(regR.itm_cd());
				wkR.itm_sub1(regR.itm_sub1());
				wkR.itm_sub2(regR.itm_sub2());
				wkR.itm_sub3(regR.itm_sub3());
				wkR.sno1(regR.sno1());
				wkR.sno2(regR.sno2());
				wkR.sno3(regR.sno3());
				wkR.sno4(regR.sno4());
				wkL.add(wkR);
			}
			dbWkInsert("MABCL5010_MAW_SUNDRY_ITM_I01", wkL, wkLBldr.getBaseDbc());
			
			MCList<MAM_SUNDRY_ITM_R> dbcL = MCList.create(MAM_SUNDRY_ITM_R.class);
			executeQuery(dbcL, MABCL5010_MAM_SUNDRY_ITM_S01());
			dbWkDelete("MABCL5010_MAW_SUNDRY_ITM_D02", wkLBldr.getBaseDbc());
			
			MCList<MAM_SUNDRY_ITM_R> updL = MCList.create(MAM_SUNDRY_ITM_R.class);
			for(MAM_SUNDRY_ITM_R r : dbcL) {
				SundryItm_Upd01_DtlR regR = regL.getFirst(
						idxRegL
						, r.itm_cd()
						, r.itm_sub1()
						, r.itm_sub2()
						, r.itm_sub3()
						, r.sno1()
						, r.sno2()
						, r.sno3()
						, r.sno4()
						);
				regR.setBooleanNE("upd_flg", true);
				
				if (!isSame(r.itm_nm(), regR.itm_nm())) {
					MAM_SUNDRY_ITM_R updR = MAM_SUNDRY_ITM_R.create();
					MCRow.copyall(updR, r);
					updR.itm_nm(regR.itm_nm());
					updL.add(updR);
				}
			}
			if (!updL.isEmpty()) {
				MAM_SUNDRY_ITM_R sundryItmUpdR = MAM_SUNDRY_ITM_R.create("T");
				MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(sundryItmUpdR);
				updLBldr.setSet(sundryItmUpdR.itm_nm);
				dbUpdateKey("MABCL5010_MAM_SUNDRY_ITM_U01", updL, updLBldr);
			}
			
			MCList<MAM_SUNDRY_ITM_R> insL = MCList.create(MAM_SUNDRY_ITM_R.class);
			for (SundryItm_Upd01_DtlR r : regL.subList("upd_flg", false)) {
				MAM_SUNDRY_ITM_R insR = MAM_SUNDRY_ITM_R.create();
				insR.itm_cd(r.itm_cd());
				insR.itm_sub1(r.itm_sub1());
				insR.itm_sub2(r.itm_sub2());
				insR.itm_sub3(r.itm_sub3());
				insR.sno1(r.sno1());
				insR.sno2(r.sno2());
				insR.sno3(r.sno3());
				insR.sno4(r.sno4());
				insR.itm_nm(r.itm_nm());
				insL.add(insR);
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insLBldr = MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T"));
				dbInsert("MABCL5010_MAM_SUNDRY_ITM_I01", insL, insLBldr);
			}
		}

		/**
		 * 登録対象のデータを取得します。
		 */
		protected MCList<SundryItm_Upd01_DtlR> getRegL() {
			MCList<SundryItm_Upd01_DtlR> ret = up0().createInstance();
			String[] cols = new String[] {
				  SundryItm_Upd01_DtlR.$itm_cd
				, SundryItm_Upd01_DtlR.$itm_sub1
				, SundryItm_Upd01_DtlR.$itm_sub2
				, SundryItm_Upd01_DtlR.$itm_sub3
				, SundryItm_Upd01_DtlR.$sno1
				, SundryItm_Upd01_DtlR.$sno2
				, SundryItm_Upd01_DtlR.$sno3
				, SundryItm_Upd01_DtlR.$sno4
			};
			MCList<SundryItm_Upd01_DtlR>[] grpLArr = up0().groupList(cols);
			for (MCList<SundryItm_Upd01_DtlR> grpL : grpLArr) {
				ret.add(grpL.get(0));
			}
			return ret;
		}

	}

	// **********************************************************************

	/**
	 * テーブルのデータを検索するマップを取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> Map<List<Comparable<?>>, D> getMap(Class<D> clazz,
			MCList<S> bindL, BiConsumer<D, S> cpy, BiConsumer<MCDBContainer, MCQueryApiBuilder> cnd, String... cols) {

		MCDBContainer wkTbl = getRegWk(clazz, bindL, cpy);
		if (wkTbl == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D dbcR = dbcL.createRow();
		dbcR.setAlias("T");
		MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(dbcR);
		
		if (cnd != null) {
			cnd.accept(dbcR, dbcR_bldr);
		}
		
		setSelWk(dbcR, dbcR_bldr, wkTbl, false);
		dbcR_bldr.buildSelect(createSqlId(LOGIC_ID, dbcR_bldr.getBaseDbc(), "S51")).executeQuery(dbcL);
		
		String[] keyCols = (cols == null || cols.length == 0 ? dbcR.getKeyColumn() : cols);
		return crtRowMap(dbcL, keyCols);
	}

	/**
	 * ワークテーブルにデータを登録し、当ワークテーブルの名称を取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> MCDBContainer getRegWk(Class<D> clazz, MCList<S> bindL,
			BiConsumer<D, S> cpy) {
		if (clazz == null || bindL == null || cpy == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D protoR = dbcL.createRow();
		
		//ワークテーブルのＤＢコンテナを作成する
		MCDBContainer wkTbl = protoR.getPkWorkDbc("W");
		if (wkTbl == null) {
			return null;
		}
		MCQueryApiBuilder wK_bldr = MCQueryApiBuilder.create(wkTbl);
		
		//ワークテーブルをクリアする
		execDbWkDelete(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "D51"), wkTbl);
		
		//VALUES句の項目をDBContainerのカラム名で設定する
		wK_bldr.setValues(wK_bldr.getBaseDbc().getKeyColumn$());
		
		//登録データリストを作成する
		for (S bindR : bindL) {
			D dbcR = dbcL.createRow();
			cpy.accept(dbcR, bindR);
			dbcL.add(dbcR);
		}

		//ワークテーブルにデータを登録する
		wK_bldr.buildInsert(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "I51")).executeBatchUpdate(dbcL);
		
		return wkTbl;
	}

	/**
	 * ワークテーブルに紐付く検索を行う設定を施します。
	 */
	protected <D extends MCDBContainer> D setSelWk(D dbcR, MCQueryApiBuilder dbcR_bldr, MCDBContainer wkTbl, boolean lock, String... cols) {
		if (dbcR == null) {
			return null;
		}
		
		MCDBContainer selWkTbl = (wkTbl == null ? dbcR.getPkWorkDbc("W") : wkTbl);
		if (selWkTbl == null) {
			return dbcR;
		}
		String[] joinCols = (cols == null || cols.length == 0 ? dbcR.getKeyColumn() : cols);
		if (joinCols.length == 0) {
			return dbcR;
		}
		
		MCPredicate condition = null;
		for (String col : joinCols) {
			MCPermColumn mainCol = dbcR.getColumn$(col);
			MCPermColumn wkCol = selWkTbl.getColumn$(col);
			MCPredicate c = MCQueryApiBuilder.makeEq(mainCol, wkCol);
			if (dbcR.isNullableColumn(col)) {
				c = c.or(MCQueryApiBuilder.makeIsNull(mainCol)
						.and(MCQueryApiBuilder.makeIsNull(wkCol)));
			}
			condition = (condition == null) ? c : condition.and(c);
		}
		dbcR_bldr.addInnerJoin(selWkTbl, condition);
		
		if (lock) {
			dbcR_bldr.setOrderByAsc(dbcR_bldr.getBaseDbc().getKeyColumn$());
			dbcR_bldr.setLockTable(dbcR.getColumn$(joinCols[0]));
		}
		return dbcR;
	}

	/**
	 * コンテナを取得するマップを作成します。
	 */
	protected <T extends MCRow> Map<List<Comparable<?>>, T> crtRowMap(MCList<T> tgtL, String... cols) {
		Map<List<Comparable<?>>, T> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(cols);
		for (MCList<T> tgtGL : tgtGLArr) {
			// tgtGL.size() == 1 を想定
			for (T tgtGR : tgtGL) {
				Comparable<?>[] vals = tgtGR.toArray(cols);
				ret.put(Arrays.asList(vals), tgtGR);
			}
		}
		return ret;
	}

	/**
	 * マップから値を取得します。
	 */
	protected <T> T getMapVal(Map<List<Comparable<?>>, T> map, Comparable<?>... vals) {
		return map.get(Arrays.asList(vals));
	}

	//FMCB CUSTOM END
}