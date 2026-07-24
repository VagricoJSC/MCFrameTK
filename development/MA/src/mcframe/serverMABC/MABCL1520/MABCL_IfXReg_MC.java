package mcframe.serverMABC.MABCL1520;

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
import mcframe.serverMABC.MABCL1520.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMABC.MABCL1520.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_IfXReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_IfXReg_MC extends MABCL_IfXReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * IfX_UpdChk01オペレーション.<p>
	 *
	 * ＩＦコード変換マスタを登録する前のチェックを行う<br>
	 */
	public class IfX_UpdChk01 extends MABCL_IfXReg_MC_A.IfX_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		MCList<IfX_UpdChk01_DtlR> _up0_1;
		MCList<IfX_UpdChk01_DtlR> _up0_2;

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			for(IfX_UpdChk01_DtlR row : up0()) {
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
				if (MAC_IF_COL_TYP.isITM(row.if_col_typ())) {
					if (!isNull(row.if_col_cd())) {
						msgL.add(new MCMessage(row, IfX_UpdChk01_DtlR.$if_col_cd, MABCL0501, toDispGUIIndex(row)));
						continue;
					}
				}
				else {
					if (!isNull(row.if_itm_cd())) {
						msgL.add(new MCMessage(row, IfX_UpdChk01_DtlR.$if_itm_cd, MABCL0502, toDispGUIIndex(row)));
						continue;
					}
					if (!isNull(row.conv_itm_sub1())) {
						msgL.add(new MCMessage(row, IfX_UpdChk01_DtlR.$conv_itm_sub1, MABCL0503, toDispGUIIndex(row)));
						continue;
					}
				}
				if (isNull(row.conv_itm_sub1()) && !isNull(row.conv_itm_sub2())) {
					msgL.add(new MCMessage(row, IfX_UpdChk01_DtlR.$conv_itm_sub2, MABCL0505, toDispGUIIndex(row)));
					continue;
				}
				if (isNull(row.conv_itm_sub2()) && !isNull(row.conv_itm_sub3())) {
					msgL.add(new MCMessage(row, IfX_UpdChk01_DtlR.$conv_itm_sub3, MABCL0506));
					continue;
				}
			}
			msgL.addAll(checkDuplicate1());
			msgL.addAll(checkDuplicate2());
			return msgL;
		}

		/**
		 * ＩＦ項目区分が「ITM.品目」以外の画面上の重複チェック
		 */
		protected MCMessageList checkDuplicate1() {
			MCMessageList msgL = new MCMessageList();
			String extSysCdCol = IfX_UpdChk01_DtlR.$ext_sys_cd;
			String ifColTypCol = IfX_UpdChk01_DtlR.$if_col_typ;
			String bpCdCol = IfX_UpdChk01_DtlR.$bp_cd;
			String ifColCdCol = IfX_UpdChk01_DtlR.$if_col_cd;
			String convCdCol = IfX_UpdChk01_DtlR.$conv_cd;
			MCList<IfX_UpdChk01_DtlR> noL =
					_up0_1.groupBy(extSysCdCol, ifColTypCol, bpCdCol, ifColCdCol, convCdCol).subList(
					r -> !MAC_IF_COL_TYP.isITM(r.if_col_typ()) && !isNull(r.if_col_cd()) && !isNull(r.conv_cd()));
			MCIndexKey key1 = noL.createIndex(extSysCdCol, ifColTypCol, bpCdCol, ifColCdCol);
			MCIndexKey key2 = noL.createIndex(extSysCdCol, ifColTypCol, bpCdCol, convCdCol);
			for (IfX_UpdChk01_DtlR up0R : _up0_1) {
				String extSysCd = up0R.ext_sys_cd();
				String ifColTyp = up0R.if_col_typ();
				String bpCd = up0R.bp_cd();
				String ifColCd = up0R.if_col_cd();
				String convCd = up0R.conv_cd();
				MCList<IfX_UpdChk01_DtlR> ifColCdL = noL.subList(key1, extSysCd, ifColTyp, bpCd, ifColCd);
				if (ifColCdL.size() > 1) {
					msgL.add(new MCMessage(up0R, null, MABCL0504, extSysCd, ifColTyp, bpCd, ifColCd, convCd, toDispGUIIndex(up0R)));
				}
				MCList<IfX_UpdChk01_DtlR> convCdL = noL.subList(key2, extSysCd, ifColTyp, bpCd, convCd);
				if (convCdL.size() > 1) {
					msgL.add(new MCMessage(up0R, null, MABCL0504, extSysCd, ifColTyp, bpCd, ifColCd, convCd, toDispGUIIndex(up0R)));
				}
			}
			return msgL;
		}

		/**
		 * ＩＦ項目区分が「ITM.品目」の画面上の重複チェック
		 */
		protected MCMessageList checkDuplicate2() {
			MCMessageList msgL = new MCMessageList();
			String extSysCdCol = IfX_UpdChk01_DtlR.$ext_sys_cd;
			String ifColTypCol = IfX_UpdChk01_DtlR.$if_col_typ;
			String bpCdCol = IfX_UpdChk01_DtlR.$bp_cd;
			String ifItmCdCol = IfX_UpdChk01_DtlR.$if_itm_cd;
			String ifItmSub1Col = IfX_UpdChk01_DtlR.$if_itm_sub1;
			String ifItmSub2Col = IfX_UpdChk01_DtlR.$if_itm_sub2;
			String ifItmSub3Col = IfX_UpdChk01_DtlR.$if_itm_sub3;
			String convCdCol = IfX_UpdChk01_DtlR.$conv_cd;
			String convItmSub1Col = IfX_UpdChk01_DtlR.$conv_itm_sub1;
			String convItmSub2Col = IfX_UpdChk01_DtlR.$conv_itm_sub2;
			String convItmSub3Col = IfX_UpdChk01_DtlR.$conv_itm_sub3;
			MCList<IfX_UpdChk01_DtlR> noL =
					_up0_2.groupBy(extSysCdCol, ifColTypCol, bpCdCol, ifItmCdCol,
							ifItmSub1Col, ifItmSub2Col, ifItmSub3Col,
							convCdCol, convItmSub1Col, convItmSub2Col, convItmSub3Col).subList(
									r -> MAC_IF_COL_TYP.isITM(r.if_col_typ()) && !isNull(r.if_itm_cd()) && !isNull(r.conv_cd()));
			MCIndexKey key1 = noL.createIndex(extSysCdCol, bpCdCol, ifItmCdCol, ifItmSub1Col, ifItmSub2Col, ifItmSub3Col);
			MCIndexKey key2 = noL.createIndex(extSysCdCol, bpCdCol, convCdCol, convItmSub1Col, convItmSub2Col, convItmSub3Col);
			for (IfX_UpdChk01_DtlR up0R : _up0_2) {
				String extSysCd = up0R.ext_sys_cd();
				String ifColTyp = up0R.if_col_typ();
				String bpCd = up0R.bp_cd();
				String ifItmCd = up0R.if_itm_cd();
				String ifItmSub1 = up0R.if_itm_sub1();
				String ifItmSub2 = up0R.if_itm_sub2();
				String ifItmSub3 = up0R.if_itm_sub3();
				String convCd = up0R.conv_cd();
				String convItmSub1 = up0R.conv_itm_sub1();
				String convItmSub2 = up0R.conv_itm_sub2();
				String convItmSub3 = up0R.conv_itm_sub3();
				MCList<IfX_UpdChk01_DtlR> ifItmCdL = noL.subList(key1, extSysCd, bpCd, ifItmCd, ifItmSub1, ifItmSub2, ifItmSub3);
				if (ifItmCdL.size() > 1) {
					msgL.add(new MCMessage(up0R, null, MABCL0507, extSysCd, ifColTyp, bpCd,
							toDispItm(ifItmCd, ifItmSub1, ifItmSub2, ifItmSub3),
							convCd, convItmSub1, convItmSub2, convItmSub3, toDispGUIIndex(up0R)));
				}
				MCList<IfX_UpdChk01_DtlR> convCdL = noL.subList(key2, extSysCd, bpCd, convCd, convItmSub1, convItmSub2, convItmSub3);
				if (convCdL.size() > 1) {
					msgL.add(new MCMessage(up0R, null, MABCL0507, extSysCd, ifColTyp, bpCd,
							toDispItm(ifItmCd, ifItmSub1, ifItmSub2, ifItmSub3),
							convCd, convItmSub1, convItmSub2, convItmSub3, toDispGUIIndex(up0R)));
				}
			}
			return msgL;
		}

		/**
		 * 重複チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			_up0_1 = up0().subList(r -> !r.del_flg() && !MAC_IF_COL_TYP.isITM(r.if_col_typ()));
			_up0_2 = up0().subList(r -> !r.del_flg() && MAC_IF_COL_TYP.isITM(r.if_col_typ()));

			if (!_up0_1.isEmpty()) {
				chkSub1(msgL);
				chkSub2(msgL);
			}

			if (!_up0_2.isEmpty()) {
				chkSub3(msgL);
				chkSub4(msgL);
			}
			return msgL;
		}

		/**
		 * ＩＦ項目区分が「ITM.品目」以外の登録済データとの重複チェック
		 */
		protected MCMessageList chkSub1(MCMessageList msgL) {
			MCIndexKey up0Key = up0().createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
					IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
			for (MAM_IF_X_R r : _up0_1) {
				MCList<MAM_IF_X_R> dbc = MCList.create(MAM_IF_X_R.class);
				MAM_IF_X_R t = MAM_IF_X_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelectAll();
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), r.ext_sys_cd());
				dbc_bldr.addWhereWithAnd(t.if_col_typ.eq(bind("1")), r.if_col_typ());
				dbc_bldr.addWhereWithAnd(t.bp_cd.eq(bind("1"))
						.or( t.bp_cd.isNull()
								.and(bind("1").isNull())), r.bp_cd());
				dbc_bldr.addWhereWithAnd(t.if_col_cd.eq(bind("1")), r.if_col_cd());
				dbSelect("MABCL1520_MAM_IF_X_S01", dbc, dbc_bldr);
				int cnt = 0;
				MCIndexKey dbcKey = dbc.createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
						IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
				MAM_IF_X_R dbcR = dbc.getFirst(dbcKey, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(),
						r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3());
				if (isNull(dbcR) && !r.del_flg()) {
					cnt++;
				}
				for (MAM_IF_X_R ifXR : dbc) {
					MAM_IF_X_R up0R = up0().getFirst(up0Key, ifXR.ext_sys_cd(), ifXR.if_col_typ(), ifXR.bp_cd(), ifXR.if_col_cd(),
							ifXR.if_itm_cd(), ifXR.if_itm_sub1(), ifXR.if_itm_sub2(), ifXR.if_itm_sub3());
					if (!isNull(up0R)) {
						if (!up0R.del_flg()) {
							cnt++;
						}
					}
					else if (!ifXR.del_flg()) {
						cnt++;
					}
				}
				if (cnt > 1) {
					msgL.add(new MCMessage(r, null, MABCL0504,
							r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(), r.conv_cd(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		protected MCMessageList chkSub2(MCMessageList msgL) {
			MCIndexKey up0Key = up0().createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
					IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
			for (MAM_IF_X_R r : _up0_1) {
				MCList<MAM_IF_X_R> dbc = MCList.create(MAM_IF_X_R.class);
				MAM_IF_X_R t = MAM_IF_X_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelectAll();
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), r.ext_sys_cd());
				dbc_bldr.addWhereWithAnd(t.if_col_typ.eq(bind("1")), r.if_col_typ());
				dbc_bldr.addWhereWithAnd(t.bp_cd.eq(bind("1"))
						.or( t.bp_cd.isNull()
								.and(bind("1").isNull())), r.bp_cd());
				dbc_bldr.addWhereWithAnd(t.conv_cd.eq(bind("1")), r.conv_cd());
				dbSelect("MABCL1520_MAM_IF_X_S02", dbc, dbc_bldr);
				int cnt = 0;
				MCIndexKey dbcKey = dbc.createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
						IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
				MAM_IF_X_R dbcR = dbc.getFirst(dbcKey, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(),
						r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3());
				if (isNull(dbcR) && !r.del_flg()) {
					cnt++;
				}
				for (MAM_IF_X_R ifXR : dbc) {
					MAM_IF_X_R up0R = up0().getFirst(up0Key, ifXR.ext_sys_cd(), ifXR.if_col_typ(), ifXR.bp_cd(), ifXR.if_col_cd(),
							ifXR.if_itm_cd(), ifXR.if_itm_sub1(), ifXR.if_itm_sub2(), ifXR.if_itm_sub3());
					if (!isNull(up0R)) {
						if (!up0R.del_flg() && isSame(up0R.conv_cd(), r.conv_cd())) {
							cnt++;
						}
					}
					else if (!ifXR.del_flg()) {
						cnt++;
					}
				}
				if (cnt > 1) {
					msgL.add(new MCMessage(r, null, MABCL0504,
							r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(), r.conv_cd(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		/**
		 * ＩＦ項目区分が「ITM.品目」の登録済データとの重複チェック
		 */
		protected MCMessageList chkSub3(MCMessageList msgL) {
			MCIndexKey up0Key = up0().createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
					IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
			for (MAM_IF_X_R r : _up0_2) {
				MCList<MAM_IF_X_R> dbc =  MCList.create(MAM_IF_X_R.class);
				MAM_IF_X_R t = MAM_IF_X_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

				dbc_bldr.setSelectAll();
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), r.ext_sys_cd());
				dbc_bldr.addWhereWithAnd(t.if_col_typ.eq(bind("1")), r.if_col_typ());
				dbc_bldr.addWhereWithAnd(t.bp_cd.eq(bind("1"))
						.or( t.bp_cd.isNull()
								.and(bind("1").isNull())), r.bp_cd());
				dbc_bldr.addWhereWithAnd(t.if_itm_cd.eq(bind("1")), r.if_itm_cd());
				dbc_bldr.addWhereWithAnd(t.if_itm_sub1.eq(bind("1")), r.if_itm_sub1());
				dbc_bldr.addWhereWithAnd(t.if_itm_sub2.eq(bind("1")), r.if_itm_sub2());
				dbc_bldr.addWhereWithAnd(t.if_itm_sub3.eq(bind("1")), r.if_itm_sub3());
				dbSelect("MABCL1520_MAM_IF_X_S03", dbc, dbc_bldr);
				int cnt = 0;
				MCIndexKey dbcKey = dbc.createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
						IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
				MAM_IF_X_R dbcR = dbc.getFirst(dbcKey, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(),
						r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3());
				if (isNull(dbcR) && !r.del_flg()) {
					cnt++;
				}
				for (MAM_IF_X_R ifXR : dbc) {
					MAM_IF_X_R up0R = up0().getFirst(up0Key, ifXR.ext_sys_cd(), ifXR.if_col_typ(), ifXR.bp_cd(), ifXR.if_col_cd(),
							ifXR.if_itm_cd(), ifXR.if_itm_sub1(), ifXR.if_itm_sub2(), ifXR.if_itm_sub3());
					if (!isNull(up0R)) {
						if (!up0R.del_flg()) {
							cnt++;
						}
					}
					else if (!ifXR.del_flg()) {
						cnt++;
					}
				}
				if (cnt > 1) {
					msgL.add(new MCMessage(r, null, MABCL0507, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(),
							toDispItm(r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3()),
							r.conv_cd(), r.conv_itm_sub1(), r.conv_itm_sub2(), r.conv_itm_sub3(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}

		protected MCMessageList chkSub4(MCMessageList msgL) {
			MCIndexKey up0Key = up0().createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd,
					IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);

			for (MAM_IF_X_R r : _up0_2) {
				MCList<MAM_IF_X_R> dbc = MCList.create(MAM_IF_X_R.class);
				MAM_IF_X_R t = MAM_IF_X_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelectAll();
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), r.ext_sys_cd());
				dbc_bldr.addWhereWithAnd(t.if_col_typ.eq(bind("1")), r.if_col_typ());
				dbc_bldr.addWhereWithAnd(t.bp_cd.eq(bind("1"))
						.or( t.bp_cd.isNull()
								.and(bind("1").isNull())), r.bp_cd());
				dbc_bldr.addWhereWithAnd(t.conv_cd.eq(bind("1")), r.conv_cd());
				dbc_bldr.addWhereWithAnd(t.conv_itm_sub1.eq(bind("1"))
						.or( t.conv_itm_sub1.isNull()
								.and(bind("1").isNull())), r.conv_itm_sub1());
				dbc_bldr.addWhereWithAnd(t.conv_itm_sub2.eq(bind("1"))
						.or( t.conv_itm_sub2.isNull()
								.and(bind("1").isNull())), r.conv_itm_sub2());
				dbc_bldr.addWhereWithAnd(t.conv_itm_sub3.eq(bind("1"))
						.or( t.conv_itm_sub3.isNull()
								.and(bind("1").isNull())), r.conv_itm_sub3());
				dbSelect("MABCL1520_MAM_IF_X_S04", dbc, dbc_bldr);
				int cnt = 0;
				MCIndexKey dbcKey = dbc.createIndex(IfX_UpdChk01_DtlR.$ext_sys_cd, IfX_UpdChk01_DtlR.$if_col_typ, IfX_UpdChk01_DtlR.$bp_cd, IfX_UpdChk01_DtlR.$if_col_cd, IfX_UpdChk01_DtlR.$if_itm_cd, IfX_UpdChk01_DtlR.$if_itm_sub1, IfX_UpdChk01_DtlR.$if_itm_sub2, IfX_UpdChk01_DtlR.$if_itm_sub3);
				MAM_IF_X_R dbcR = dbc.getFirst(dbcKey, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(), r.if_col_cd(), r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3());
				if (isNull(dbcR) && !r.del_flg()) {
					cnt++;
				}
				for (MAM_IF_X_R ifXR : dbc) {
					MAM_IF_X_R up0R = up0().getFirst(up0Key, ifXR.ext_sys_cd(), ifXR.if_col_typ(), ifXR.bp_cd(), ifXR.if_col_cd(),
							ifXR.if_itm_cd(), ifXR.if_itm_sub1(), ifXR.if_itm_sub2(), ifXR.if_itm_sub3());
					if (!isNull(up0R)) {
						if (!up0R.del_flg() && isSame(up0R.conv_cd(), r.conv_cd())
								&& isSame(up0R.conv_itm_sub1(), r.conv_itm_sub1())
								&& isSame(up0R.conv_itm_sub2(), r.conv_itm_sub2())
								&& isSame(up0R.conv_itm_sub3(), r.conv_itm_sub3())) {
							cnt++;
						}
					}
					else if (!ifXR.del_flg()) {
						cnt++;
					}
				}
				if (cnt > 1) {
					msgL.add(new MCMessage(r, null, MABCL0507, r.ext_sys_cd(), r.if_col_typ(), r.bp_cd(),
							toDispItm(r.if_itm_cd(), r.if_itm_sub1(), r.if_itm_sub2(), r.if_itm_sub3()),
							r.conv_cd(), r.conv_itm_sub1(), r.conv_itm_sub2(), r.conv_itm_sub3(), toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
	}
	/**
	 * IfX_Upd01オペレーション.<p>
	 *
	 * ＩＦコード変換マスタを登録する<br>
	 */
	public class IfX_Upd01 extends MABCL_IfXReg_MC_A.IfX_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * IfX_DelChk01オペレーション.<p>
	 *
	 * ＩＦコード変換マスタを削除する前のチェックを行う<br>
	 */
	public class IfX_DelChk01 extends MABCL_IfXReg_MC_A.IfX_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * IfX_Del01オペレーション.<p>
	 *
	 * ＩＦコード変換マスタを削除する<br>
	 */
	public class IfX_Del01 extends MABCL_IfXReg_MC_A.IfX_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＩＦコード変換マスタの検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_IfXReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_IF_X_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		/**
		 * 品目分類、取引先分類と結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {

			dbcCustomizeSubCommon(builder, up0());

		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 変換エラーの検索処理を行う。<br>
	 */
	public class Srch02 extends MABCL_IfXReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			executeQuery(down0(), MABCL1520_FCT_BATCH_LOG_S01(), up0());
		}

		@Override
		protected void down() {
			setConstNm(down0());
			setFuncNm(down0());

			for (Srch01_Rslt1R r : down0()) {
				r.setStatus(MCRow.CREATE);
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 取引先品目マスタの検索処理を行う。<br>
	 */
	public class Srch03 extends MABCL_IfXReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			executeQuery(down0(), MABCL1520_MAM_BP_ITM_S01(), up0());
			
			MCList<Srch01_Rslt1R> delL = MCList.create(Srch01_Rslt1R.class);
			MCIndexKey index = down0().createIndex(Srch01_Rslt1R.$bp_cd, Srch01_Rslt1R.$conv_cd, Srch01_Rslt1R.$del_flg);
			MCIndexKey indexItm = down0().createIndex(Srch01_Rslt1R.$bp_cd, Srch01_Rslt1R.$if_itm_cd,
					Srch01_Rslt1R.$if_itm_sub1, Srch01_Rslt1R.$if_itm_sub2, Srch01_Rslt1R.$if_itm_sub3);
			MCList<Srch01_Rslt1R> chkGroupL = down0().groupByNE(Srch01_Rslt1R.$bp_cd, Srch01_Rslt1R.$conv_cd);
			
			for (Srch01_Rslt1R chkGroupR : chkGroupL) {
				MCList<Srch01_Rslt1R> dispL = down0().subList(index, chkGroupR.bp_cd(), chkGroupR.conv_cd());
				
				if (!getBpCache(chkGroupR.bp_cd(), chkGroupL).cst_flg()) {
					for (Srch01_Rslt1R dispR : dispL) {
						if (dispR.del_flg() && isNull((dispR.upd_cntr()))) {
							delL.add(dispR);
						}
					}
					continue;
				}
				
				MCSortPolicy sp = crtSortVH();
				dispL.sort(sp);
				
				boolean getDefRow = false;
				for (Srch01_Rslt1R dispR : dispL) {
					if (!getDefRow && !dispR.del_flg()) {
						getDefRow = true;
					}
					else if (isNull(dispR.upd_cntr())) {
						delL.add(dispR);
					}
					else {
						down0().getFirst(indexItm, dispR.bp_cd(), dispR.if_itm_cd(),
								dispR.if_itm_sub1(), dispR.if_itm_sub2(), dispR.if_itm_sub3()).del_flg(true);
					}
				}
			}
			
			down0().removeAll(delL);
		}

		/** 取引先マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected MAM_BP_R getBpCache(String bpCd, MCList<Srch01_Rslt1R> bpL) {
			if (_cacheBp == null){
				_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("BP")), bpL, Srch01_Rslt1R.$bp_cd);
			}
			return _cacheBp.get(bpCd);
		}

		protected MCSortPolicy crtSortVH() {
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.DESC, "def_flg");
			sp.add(SortType.ASC_NULL_AHEAD, "if_itm_cd");
			sp.add(SortType.ASC_NULL_AHEAD, "if_itm_sub1");
			sp.add(SortType.ASC_NULL_AHEAD, "if_itm_sub2");
			sp.add(SortType.ASC_NULL_AHEAD, "if_itm_sub3");
			return sp;
		}

		@Override
		protected void down() {
			setConstNm(down0());
			setFuncNm(down0());

			for (Srch01_Rslt1R r : down0()) {
				if (isNull(r.upd_cntr())) {
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStatus(MCRow.MODIFY);
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_IfXReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_IfXReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected void dbcCustomizeSubCommon(MCQueryApiBuilder builder, Srch01_CndR up0) {

		MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_IF_X_R.$ITM1);

		builder.addSelect(itm1.itm_nm.as("if_itm_nm"));
		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itm_typ_d1.itm_typ_d_nm);
		builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
		builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
		builder.addWhereWithCutOffAnd(
				itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_nm.like(bind(Srch01_CndR.$if_itm_nm)));

		if (!isNull(up0.itm_grp_nm1())) {
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(
					ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
		}
		if (!isNull(up0.itm_grp_nm2())) {
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(
					ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
		}
		if (!isNull(up0.itm_grp_nm3())) {
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(
					ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
		}
		if (!isNull(up0.itm_grp_nm4())) {
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(
					ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
		}
		if (!isNull(up0.itm_grp_nm5())) {
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(
					ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
		}
		if (!isNull(up0.itm_grp_nm6())) {
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(
					ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
		}
		if (!isNull(up0.itm_grp_nm7())) {
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(
					ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
		}
		if (!isNull(up0.itm_grp_nm8())) {
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(
					ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
		}
		if (!isNull(up0.itm_grp_nm9())) {
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(
					ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
		}
		if (!isNull(up0.itm_grp_nm10())) {
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(
					ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
		}
		
		MAM_BP_R bp1 = MAM_BP_R.create(MAM_IF_X_R.$BP1);
		if (!isNull(up0.bp_grp_nm1())) {
			MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
			builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
					.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(
					bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
		}
		if (!isNull(up0.bp_grp_nm2())) {
			MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
			builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
					.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(
					bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
		}
		if (!isNull(up0.bp_grp_nm3())) {
			MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
			builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
					.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(
					bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
		}
		if (!isNull(up0.bp_grp_nm4())) {
			MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
			builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
					.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(
					bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
		}
		if (!isNull(up0.bp_grp_nm5())) {
			MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
			builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
					.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(
					bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
		}
		if (!isNull(up0.bp_grp_nm6())) {
			MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
			builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
					.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(
					bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
		}
		if (!isNull(up0.bp_grp_nm7())) {
			MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
			builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
					.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(
					bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
		}
		if (!isNull(up0.bp_grp_nm8())) {
			MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
			builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
					.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(
					bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
		}
		if (!isNull(up0.bp_grp_nm9())) {
			MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
			builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
					.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(
					bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
		}
		if (!isNull(up0.bp_grp_nm10())) {
			MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
			builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
					.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(
					bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
		}
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
		builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
	}

	//FMCB CUSTOM END
}