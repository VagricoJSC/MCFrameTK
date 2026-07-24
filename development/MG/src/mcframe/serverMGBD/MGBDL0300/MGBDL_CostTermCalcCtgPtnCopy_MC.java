package mcframe.serverMGBD.MGBDL0300;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL0300.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonFS.constant.FSC_MODULE_ID;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.queryapi.IFMCFMSQL.*;
import mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;
import mcframe.serverMAUD.MAUDL5010.MAUDL_Operation;
import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverMGBD.MGBDL0300.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CostTermCalcCtgPtnCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CostTermCalcCtgPtnCopy_MC extends MGBDL_CostTermCalcCtgPtnCopy_MC_A{
	//FMCB CUSTOM START
	protected static final String COUNT = "CNT";
	protected static final String CACL_CTG_CD = "calc_ctg_cd";
	protected static final String TERM = "term";
	protected static final String BIND_PREFIX = "to_";
	protected static final String YM = "ym";
	protected static final String WG_CD = "wg_cd";

	/**原価コピー対象区分のキーと定数のマッピング*/
	protected Map<String, MGC_COST_COPY_TYP> _keyTypMap = new HashMap<String, MGC_COST_COPY_TYP>();
	/** 論理削除フラグ＝オンのレコードを見られるようにするテーブル */
	protected List<String> _tnameL = new ArrayList<String>();
	protected MAM_ITM_COM_R _dbc;
	protected String[] _upd_info_col ;
	protected MCList<MCRow> _cost_copy_cols;
	protected MCIndexKey _cost_copy_k;

	protected MCNumber _fetchSize = getPgmSettingNumber(this, "fetch_size");

	/**
	 * Chk01オペレーション.<p>
	 *
	 * データ作成前のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Chk01 {
		/**
		 * 呼出元
		 */
		protected MAUDL_Operation _caller = null;
		/**
		 * コピー元のデータを保持するコンテナ（上り電文にWG_CDのデータを追加したもの）
		 */
		protected MCList<DtlR> _frWgUp1;
		/**
		 * コピー先の削除対象データを保持するコンテナ（上り電文に削除対象のWG_CDのデータを追加したもの）
		 */
		protected MCList<DtlR> _toWgUp1;

		/**
		 * 呼出元を設定する。
		 */
		protected void setCaller(MAUDL_Operation c) {
			_caller = c;
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList ml = super.doServerCheckBase();

			ml.addAll(checkBase());

			return ml;
		}

		protected MCMessageList checkBase() {
			MCMessageList ml = new MCMessageList();

			if (_caller instanceof MGBDL_CostTermCalcCtgPtnCopy.Ins01) {
				chkBaseIns01(ml);
			}
			if (_caller instanceof MGBDL_CostTermCalcCtgPtnCopy.Ins02) {
				chkBaseIns02(ml);
			}
			if (_caller instanceof MGBDL_CostTermCalcCtgPtnCopy.Ins03) {
				chkBaseIns03(ml);
			}
			if (_caller instanceof MGBDL_CostTermCalcCtgPtnCopy.Ins04) {
				chkBaseIns04(ml);
			}

			if (ml.size() > 0) {
				return ml;
			}

			chkDac(ml);

			return ml;
		}

		protected void chkBaseIns01(MCMessageList ml) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_fr, rv));
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_to, rv));
			ml.addAll(check(up0(),HdrR.$term_fr, rv));
			ml.addAll(check(up0(),HdrR.$term_to, rv));
			HdrR r = up0();
			if (!isNullOr(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
				if (isSame(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
					ml.add(new MCMessage(r, HdrR.$calc_ctg_cd_to, MGBDL0035));
				}
			}
		}

		protected void chkBaseIns02(MCMessageList ml) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_fr, rv));
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_to, rv));
			ml.addAll(check(up0(),HdrR.$term_fr, rv));
			ml.addAll(check(up0(),HdrR.$term_to, rv));
			HdrR r = up0();
			if (!isNullOr(r.term_fr(), r.term_to())) {
				if (isSame(r.term_fr(), r.term_to())) {
					ml.add(new MCMessage(r, HdrR.$term_to, MGBDL0036));
				}
			}
		}

		protected void chkBaseIns03(MCMessageList ml) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_fr, rv));
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_to, rv));
			ml.addAll(check(up0(),HdrR.$ym_fr, rv));
			ml.addAll(check(up0(),HdrR.$ym_to, rv));
			chkCtgAndYm(ml);
		}

		protected void chkBaseIns04(MCMessageList ml) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_fr, rv));
			ml.addAll(check(up0(),HdrR.$calc_ctg_cd_to, rv));
			ml.addAll(check(up0(),HdrR.$ym_fr, rv));
			ml.addAll(check(up0(),HdrR.$ym_to, rv));
			chkCtgAndYm(ml);
		}

		protected void chkCtgAndYm(MCMessageList ml) {
			HdrR r = up0();
			if (!isNullOr(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
				if (isSame(r.calc_ctg_cd_fr(), r.calc_ctg_cd_to())) {
					if (!isNullOr(r.ym_fr(), r.ym_to())) {
						if (isSame(r.ym_fr(), r.ym_to())) {
							ml.add(new MCMessage(r, HdrR.$calc_ctg_cd_to,
									MGBDL0037));
						}
					}
				}
			}
		}

		/**
		 * 上り電文にWG_CDを追加したコンテナを作成し、ＤＡＣチェックを行う。
		 */
		protected void chkDac(MCMessageList ml) {
			_frWgUp1 = up1().shallowClone();
			_toWgUp1 = up1().shallowClone();
			mergeWg(true, _frWgUp1);
			mergeWg(false, _toWgUp1);
			MCList<DtlR> tgt = up1().createInstance();
			tgt.addAll(_frWgUp1);
			tgt.addAll(_toWgUp1);
			tgt = tgt.groupBy(DtlR.$wg_cd);
			ml.addAll(checkWritableWgCdDac(tgt.subList(r -> !isNull(r.wg_cd()) && !MAC_STR.isNULL_VAL(r.wg_cd())), DtlR.$wg_cd));
		}

		/**
		 * 引数のコンテナにwg_cdを設定する。
		 * @param isFr コピー元のwg_cdを設定するかどうか
		 * @param up1 設定対象
		 */
		protected void mergeWg(boolean isFr, MCList<DtlR> up1) {
			MCList<DtlR> rsltAll = createDtlL();
			up1.forEach(r -> {
				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				if (hasWgCd(up1, typ)) {
					//wg_cdを持つ場合はwg_cd分複製する
					MCList<DtlR> rslt = createDtlL();
					MCRow b = MCRow.create();

					if (isFr) {
						convFrBind(up0(), r, b);
					}
					else {
						convToBind(up0(), r, b);
					}

					MCDBContainer T = createDbc(typ.value(), "T");
					sql(createSqlId(LOGIC_ID, T, "mergeWg_select")).mainQuery()
							.selectDistinct(T.getColumn$("wg_cd")).from(T)
							.where(getWhere(T, typ, r, true, true)).executeQuery(b, rslt);

					if (isNull(rslt)) {
						rsltAll.add(r);
						return;
					}
					rslt.forEach(w-> {
						DtlR cr = r.clone();
						cr.wg_cd(w.wg_cd());
						rsltAll.add(cr);
					});
				}
				else {
					rsltAll.add(r);
				}
			});
			up1.setAll(rsltAll);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();

			ml.addAll(chkSub());
			compSub();
			return ml;
		}

		protected MCMessageList chkSub() {
			MCMessageList ml = new MCMessageList();
			// コピー先の確定チェック
			fixChk(ml, up0(), _toWgUp1);
			return ml;
		}

		/**
		 * コピー先の確定チェック
		 */
		protected void fixChk(MCMessageList ml, HdrR h, MCList<DtlR> d) {

			for(MCList<DtlR> dg : d.groupList(DtlR.$cost_copy_typ_key)) {

				DtlR r0 = dg.get(0);
				MGC_COST_COPY_TYP typ = getCostCopyTyp(r0.cost_copy_typ_key());

				//WG_CDが不要なチェック
				if (MGC_COST_COPY_TYP.isMGT_CUR_XRATE(typ)) {
					chkFixStdUpriEx(ml, h, r0, null, typ);
				}
				else if (MGC_COST_COPY_TYP.isMAM_ALC_EXPNS(typ)) {
					chkFixAlcEx(ml, h, r0, "MGPA_FIX_CHK.F_ALC_EXPNS_M", typ);
				}
				else if (MGC_COST_COPY_TYP.isMAM_ALC_INPT(typ)) {
					chkFixAlcEx(ml, h, r0, "MGPA_FIX_CHK.F_ALC_INPT_M", typ);
				}
				else if (MGC_COST_COPY_TYP.isMAM_ALC_OTHER(typ)) {
					chkFixAlcEx(ml, h, r0, "MGPA_FIX_CHK.F_ALC_OTHER_M", typ);
				}
				else if (MGC_COST_COPY_TYP.isMAM_ALC_RULE(typ)) {
					chkFixAlcEx(ml, h, r0, "MGPA_FIX_CHK.F_ALC_RULE_M", typ);
				}
				else if (MGC_COST_COPY_TYP.isMAM_ALC_WK(typ)) {
					chkFixAlcEx(ml, h, r0, "MGPA_FIX_CHK.F_ALC_WK_M", typ);
				}

				else {
					//WG_CDが必要なチェック
					for(DtlR r : dg) {
						if (MGC_COST_COPY_TYP.isMGT_STD_ALC_RATE(typ)) {
							chkFixAlcEx(ml, h, r, "MGPA_FIX_CHK.F_ALC_RATE_M",typ);
						}
						//以降標準単価確定チェック
						else if (MGC_COST_COPY_TYP.isMGT_ITM(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_ITM_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_BOM(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_BOM_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_DTL(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_DTL_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_FIX(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_FIX_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_OPER(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_OPER_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_PROV(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_PROV_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_PROC(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_PROC_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_PURC(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_PURC_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ITM_WK(typ)) {
							chkFixStdUpriEx(ml, h, r, "MGPA_FIX_CHK.F_WK_M", typ);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_ALC_AMT(typ)) {
							execChkCalcNoFixActAmt(ml, h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_INPT(typ)) {
							execChkCalcNoFixAct(ml, "i_inpt", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_INST_WIP(typ)) {
							execChkCalcNoFixAct(ml, "i_inst_wip", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_INST_WK(typ)) {
							execChkCalcNoFixAct(ml, "i_inst_wk", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_IO(typ)) {
							execChkCalcNoFixAct(ml, "i_io", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_OTHER_WK(typ)) {
							execChkCalcNoFixAct(ml, "i_other_wk", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_MFG(typ)) {
							execChkCalcNoFixAct(ml, "i_mfg", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_PURC(typ)) {
							execChkCalcNoFixAct(ml, "i_purc", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_SLS(typ)) {
							execChkCalcNoFixAct(ml, "i_sls", h, r);
						}
						else if (MGC_COST_COPY_TYP.isMGT_ACT_STK(typ)) {
							execChkCalcNoFixAct(ml, "i_stk", h, r);
						}
					}
				}
			}
		}

		/**
		 * 標準配賦率確定チェックとエラー処理
		 */
		protected void chkFixAlcEx(MCMessageList ml, HdrR h, DtlR r, String funcNm, MGC_COST_COPY_TYP typ) {
			MCRow row = MCRow.create();
			String boo = "boo";
			row.addBooleanColumn(boo);
			MCBooleanValue func;

			if (MGC_COST_COPY_TYP.isMGT_STD_ALC_RATE(typ)) {
				Class<?>[] params = new Class[] {
						MCFMAGDateExpr.class, MCFMAGStringExpr.class,
						MCFMAGStringExpr.class
				};
				Object[] args = new Object[] {
						value(h.term_to()), value(h.calc_ctg_cd_to()), value(r.wg_cd())
				};
				func = (MCBooleanValue) MCFactory.invokeStatic(MGFunction.class,
						funcNm.replace(".", "$"), params, args);
			}
			else {
				Class<?>[] params = new Class[] {
						MCFMAGDateExpr.class
				};
				Object[] args = new Object[] {
						value(h.term_to())
				};
				func = (MCBooleanValue) MCFactory.invokeStatic(MGFunction.class,
						funcNm.replace(".", "$"), params, args);
			}

			sql(createSqlId(LOGIC_ID, funcNm, "chkFixAlcEx_select")).mainQuery()
					.select(func.as(boo)).executeQuery(row);

			chkFixEx(ml, row.getBoolean(boo), r, MGBDL0009, typ);
		}

		/**
		 * 単価確定チェックとエラー処理
		 */
		protected void chkFixStdUpriEx(MCMessageList ml, HdrR h, DtlR r, String funcNm, MGC_COST_COPY_TYP typ) {
			if (MGC_COST_COPY_TYP.isMGT_CUR_XRATE(typ)) {
				MGT_CUR_XRATE_R T = MGT_CUR_XRATE_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(T);
				builder.addCount(value("X"), COUNT);
				builder.addWhereWithAnd(T.term.eq(value(h.term_to())));
				builder.addWhereWithAnd(T.fix_flg.eq(value(true)));
				dbSelect(createSqlId(LOGIC_ID, T, "chkFixStdUpriEx_select1"), T, builder);

				if (T.getNumber(COUNT).gt(0)) {
					chkFixEx(ml, true, r, MGBDL0009, typ);
				}
			}
			else {
				MCRow row = MCRow.create();
				String boo = "boo";
				row.addBooleanColumn(boo);
				MCBooleanValue func;

				if (MGC_COST_COPY_TYP.isMGT_ITM(typ)) {
					Class<?>[] params = new Class[] {
							MCFMAGDateExpr.class, MCFMAGStringExpr.class,
							MCFMAGStringExpr.class, MCFMAGStringExpr.class,
							MCFMAGStringExpr.class, MCFMAGStringExpr.class,
							MCFMAGStringExpr.class
					};
					Object[] args = new Object[] {
							value(h.term_to()), value(h.calc_ctg_cd_to()),
							value(r.wg_cd()), value((String) null), value((String) null),
							value((String) null), value((String) null)
					};
					func = (MCBooleanValue) MCFactory.invokeStatic(MGFunction.class,
							funcNm.replace(".", "$"), params, args);
				}
				else {
					Class<?>[] params = new Class[] {
							MCFMAGDateExpr.class, MCFMAGStringExpr.class,
							MCFMAGStringExpr.class
					};
					Object[] args = new Object[] {
							value(h.term_to()), value(h.calc_ctg_cd_to()),
							value(r.wg_cd())
					};
					func = (MCBooleanValue) MCFactory.invokeStatic(MGFunction.class,
							funcNm.replace(".", "$"), params, args);
				}

				sql(createSqlId(LOGIC_ID, funcNm, "chkFixStdUpriEx_select2"))
						.mainQuery().select(func.as(boo)).executeQuery(row);

				chkFixEx(ml, row.getBoolean(boo), r, MGBDL0010, typ);
			}
		}

		/**
		 * エラー処理
		 */
		protected void chkFixEx(MCMessageList ml, Boolean boo, MCRow r, String msgId, MGC_COST_COPY_TYP typ) {
			if (boo) {
				// コピー先に~が確定しているデータがあるのでコピーできません。対象：{1}
				throw new MCAppException(r, null, msgId, typ.value());
			}
		}

		protected void execChkCalcNoFixActAmt(MCMessageList ml, HdrR h, DtlR r) {
			h.addStringColumn("i_wg_cd", r.wg_cd());
			try {
				String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT_AMT";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, h, null, ":calc_ctg_cd_to, :i_wg_cd, :ym_to");
			}
			finally {
				h.setString("i_wg_cd", null);
			}
		}

		/**
		 * 実績確定チェック
		 */
		protected void execChkCalcNoFixAct(MCMessageList ml, String inpt, HdrR h, DtlR r) {
			h.addBooleanColumn(inpt, true);
			h.addStringColumn("i_wg_cd", r.wg_cd());
			try {
				String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, h, null, ":calc_ctg_cd_to,:i_wg_cd, :ym_to, :i_mfg, :i_purc, :i_inpt, :i_inst_wk,"
								+ " :i_other_wk, :i_inst_wip, :i_io, :i_sls, :i_stk");
			}
			finally {
				h.setBoolean(inpt, false);
				h.setString("i_wg_cd", null);
			}
		}

		protected void compSub() {
			up1().setAll(_frWgUp1);
			down0().setAll(_frWgUp1);
			down1().setAll(_toWgUp1);
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 計算カテゴリ違いのデータを作成する。<br>
	 */
	public class Ins01 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Ins01 {

		protected MCList<DtlR> _del = createDtlL();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				MAUCL_ContextUtil.unableDelFlgOn(_tnameL.toArray(new String[] {}));
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			cacheCols(up1());
			callThisChk(this, up0(), up1(), _del);
			throwErr(msgOpeErr());
			ins();
		}

		protected void ins() {
			HdrR hdrR = up0();
			MCList<DtlR> dtlL = up1();
			sortForCopy(dtlL);

			MCIndexKey delk = _del.createIndex(DtlR.$cost_copy_typ_key);
			String befCckey = null;
			for (DtlR r : dtlL) {
				befCckey = deleteDest(befCckey, hdrR, r, _del, delk);

				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				MCRow bind = MCRow.create();
				//select句の固定値
				bind.addStringColumn(BIND_PREFIX + getCalcCtgColNm(typ),
						hdrR.calc_ctg_cd_to());

				// select_insert
				insert(hdrR, r, bind, getCalcCtgColNm(typ));
			}
		}
	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * 期違いのデータを作成する。<br>
	 */
	public class Ins02 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Ins02 {

		protected MCList<DtlR> _del = createDtlL();

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				MAUCL_ContextUtil.unableDelFlgOn(_tnameL.toArray(new String[] {}));
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			cacheCols(up1());
			callThisChk(this, up0(), up1(), _del);
			throwErr(msgOpeErr());
			ins();
		}

		protected void ins() {
			HdrR hdrR = up0();
			MCList<DtlR> dtlL = up1();
			sortForCopy(dtlL);

			MCIndexKey delk = _del.createIndex(DtlR.$cost_copy_typ_key);
			String befCckey = null;
			for (DtlR r : dtlL) {
				befCckey = deleteDest(befCckey, hdrR, r, _del, delk);

				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				MCRow bind = MCRow.create();
				//select句の固定値
				bind.addDateColumn(BIND_PREFIX + getTermColNm(typ), hdrR.term_to());

				// select_insert
				insert(hdrR, r, bind, getTermColNm(typ));

				chkExists(hdrR, r, bind);
			}
		}
	}

	/**
	 * Ins03オペレーション.<p>
	 *
	 * 計画データに対してパタン、年月違いのデータを作成する。<br>
	 */
	public class Ins03 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Ins03 {

		protected MCList<DtlR> _del = createDtlL();

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				MAUCL_ContextUtil.unableDelFlgOn(_tnameL.toArray(new String[] {}));
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			cacheCols(up1());
			callThisChk(this, up0(), up1(), _del);
			throwErr(msgOpeErr());
			ins();
		}

		protected void ins() {
			HdrR hdrR = up0();
			MCList<DtlR> dtlL = up1();
			sortForCopy(dtlL);

			MCIndexKey delk = _del.createIndex(DtlR.$cost_copy_typ_key);
			String befCckey = null;
			for (DtlR r : dtlL) {
				befCckey = deleteDest(befCckey, hdrR, r, _del, delk);

				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				MCRow bind = MCRow.create();
				//select句の固定値
				bind.addStringColumn(BIND_PREFIX + getCalcCtgColNm(typ),
						hdrR.calc_ctg_cd_to());
				bind.addDateColumn(BIND_PREFIX + getYmColNm(typ), hdrR.ym_to());

				// select_insert
				insert(hdrR, r, bind, getCalcCtgColNm(typ), getYmColNm(typ));
			}
		}
	}

	/**
	 * Ins04オペレーション.<p>
	 *
	 * 実績データに対してパタン、年月違いのデータを作成する。<br>
	 */
	public class Ins04 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Ins04 {

		protected MCList<DtlR> _del = createDtlL();

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				MAUCL_ContextUtil.unableDelFlgOn(_tnameL.toArray(new String[] {}));
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			cacheCols(up1());
			callThisChk(this, up0(), up1(), _del);
			throwErr(msgOpeErr());
			ins();
		}

		protected void ins() {
			HdrR hdrR = up0();
			MCList<DtlR> dtlL = up1();
			sortForCopy(dtlL);

			MCIndexKey delk = _del.createIndex(DtlR.$cost_copy_typ_key);
			String befCckey = null;
			for (DtlR r : dtlL) {
				befCckey = deleteDest(befCckey, hdrR, r, _del, delk);

				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				MCRow bind = MCRow.create();
				//select句の固定値
				bind.addStringColumn(BIND_PREFIX + getCalcCtgColNm(typ),
						hdrR.calc_ctg_cd_to());
				bind.addDateColumn(BIND_PREFIX + getYmColNm(typ), hdrR.ym_to());

				// select_insert
				insert(hdrR, r, bind, getCalcCtgColNm(typ), getYmColNm(typ));
			}
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * コピー元、コピー先の件数を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CostTermCalcCtgPtnCopy_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			cacheCols(up1());
			down0().addAll(select(up0(), up1()));
			MAUCL_ContextUtil.unableDelFlgOn(_tnameL.toArray(new String[] {}));
		}

		protected MCList<DtlR> select(HdrR hdrR, MCList<DtlR> dtlL) {
			for (DtlR dtlR : dtlL) {
				selectCount(hdrR, dtlR);
			}
			return dtlL;
		}
		protected void selectCount(HdrR h, DtlR r) {
			MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
			MCDBContainer T = createDbc(typ.value(), "T");
			MCMainQuery select = sql(createSqlId(LOGIC_ID, T, "selectCount_select")).mainQuery()
					.select(count(value("X")).as(COUNT)).from(T).where(getWhere(T, typ, r, false, true));

			MCRow bind = MCRow.create();
			MCRow rslt = MCRow.create();
			rslt.addNumberColumn(COUNT);

			// コピー元
			convFrBind(h, r, bind);
			select.executeQuery(bind, rslt);
			r.cnt_fr(rslt.getNumberNE(COUNT));

			// コピー先
			convToBind(h, r, bind);
			select.executeQuery(bind, rslt);
			r.cnt_to(rslt.getNumberNE(COUNT));
		}
	}

	public class MGBDL_SeqTgt {
		protected final IfNumSysTyp _typ;
		protected final String _col;
		protected final MCMeta _meta;

		public MGBDL_SeqTgt(IfNumSysTyp typ, String col, MCMeta meta) {
			super();
			_typ = typ;
			_col = col;
			_meta = meta;
		}

	}

	/**
	 *  MGT_ACT_SLS、MGT_ACT_IO、MGT_ACT_INPTを費目別情報とともにコピーするためのクラスです。
	 *
	 * @param <DR> 実績DBコンテナ
	 * @param <DRE> 費目別情報ＤＢコンテナ
	 */
	public class MGBDL_InsActExpns<DR extends MCDBContainer, DRE extends MCDBContainer> {
		/**
		 * 登録対象上り
		 */
		protected MCList<DR> _base;

		/**
		 * 登録に使用するＤＢコンテナ
		 */
		protected MCList<DR> _tgt;

		/**
		 * EXPNSの登録に使用するＤＢコンテナ
		 */
		protected MCList<DRE> _tgt_expns;

		/**
		 * キー項目
		 */
		protected String _id;

		/**
		 * 枝番項目
		 */
		protected String _idSub;

		/**
		 * コピー先ＩＤの接頭辞
		 */
		protected String _newIdPre;

		/**
		 * 対象の発番システム区分
		 */
		protected MGC_NUM_SYS_TYP _nstyp;

		/**
		 * キーを発番する
		 */
		protected String getNewId() {
			// 実績IDは接頭辞「MG-」を付与する
			return FSC_MODULE_ID.CostManagement.value() + MGC_STR.ACT_ID_DLM.value()
					+ getStrSeq(_nstyp).toString();
		}

		/**
		 * _tgtを使用して登録する。
		 * @param hr 上り電文ヘッダ
		 * @param map
		 */
		protected void insert(HdrR hr) {
			MCList<DR>[] gl = _base.groupList(_id);
			doSeqCache(_nstyp, gl.length);
			HashMap<String, List<String>> map = new HashMap<>();

			//元テーブル更新
			for (MCList<DR> l : gl) {
				// コピー対象の実績IDで枝番違いのレコードを抽出
				List<String> lst = new ArrayList<String>();
				//発番
				String newId = getNewId();
				lst.add(newId);
				// コピー先IDと枝番を保持
				for (DR subR : l) {
					lst.add(subR.getStringNE(_idSub));
					// コピー先情報に更新
					DR insR = (DR) subR.clone();
					insR.setString(_id, newId);
					insR.setString("calc_ctg_cd", hr.calc_ctg_cd_to());
					insR.setDate("ym", hr.ym_to());
					_tgt.add(insR);
				}
				map.put(l.get(0).getString(_id), lst);
			}

			MCQueryApiBuilder builder = MCQueryApiBuilder.create(_tgt.createRow());
			dbInsert(createSqlId(LOGIC_ID, builder.getBaseDbc(), "insert_insert1"), _tgt, builder);

			//EXPNSテーブル更新
			DRE expnsR = _tgt_expns.createRow();
			MCStringPermColumn idCol = (MCStringPermColumn) expnsR.getColumn$(_id);
			MCStringPermColumn idSubCol = (MCStringPermColumn) expnsR.getColumn$(_idSub);
			builder = MCQueryApiBuilder.create(expnsR);
			builder.setWhere(idCol.eq(bind(_id)));
			builder.addWhereWithAnd(idSubCol.eq(bind(_idSub)));

			for (Entry<String, List<String>> oldEntry : map.entrySet()) {
				List<String> l = oldEntry.getValue();
				expnsR.setString(_id, oldEntry.getKey());
				for (int i = 0; i < l.size() - 1; i++) {
					expnsR.setString(_idSub, l.get(i + 1));
					// コピー元と同じ入出庫実績ID,枝番を条件として検索
					int cnt = dbSelect(createSqlId(LOGIC_ID, builder.getBaseDbc(), "insert_select"),
							_tgt_expns, builder, expnsR);
					if (0 < cnt) {
						// キーを更新してINSERT
						_tgt_expns.setValueNE(_id, l.get(0));
						dbInsert(createSqlId(LOGIC_ID, builder.getBaseDbc(), "insert_insert2"), _tgt_expns, builder);
					}
				}
			}
		}
	}

	/**
	 * 費目別情報とともにコピーするためのクラスを生成する。
	 */
	protected <DR extends MCDBContainer, DRE extends MCDBContainer> MGBDL_InsActExpns<DR, DRE> createInsActExpns(
			MCList<DR> base, MCList<DR> tgt, MCList<DRE> tgtExpns) {
		MGBDL_InsActExpns<DR, DRE> iae = new MGBDL_InsActExpns<DR, DRE>();
		iae._base = base;
		iae._tgt = tgt;
		iae._tgt_expns = tgtExpns;
		return iae;
	}

	/**
	 * 売上実績を費目別情報とともにコピーするためのクラスを生成する。
	 */
	protected MGBDL_InsActExpns<MGT_ACT_SLS_R, MGT_ACT_SLS_EXPNS_R> createInsSlsActExpns(
			MCList<MGT_ACT_SLS_R> base) {

		MGBDL_InsActExpns<MGT_ACT_SLS_R, MGT_ACT_SLS_EXPNS_R> tgt = createInsActExpns(
				base, MCList.create(MGT_ACT_SLS_R.class), MCList.create(MGT_ACT_SLS_EXPNS_R.class));
		tgt._id = MGT_ACT_SLS_R.$act_sls_id;
		tgt._idSub = MGT_ACT_SLS_R.$act_sls_id_sub;
		tgt._newIdPre = FSC_MODULE_ID.CostManagement.value();
		tgt._nstyp = MGC_NUM_SYS_TYP.ACT_SLS_ID;
		return tgt;
	}

	/**
	 * 入出庫実績を費目別情報とともにコピーするためのクラスを生成する。
	 */
	protected MGBDL_InsActExpns<MGT_ACT_IO_R, MGT_ACT_IO_EXPNS_R> createInsIoActExpns(
			MCList<MGT_ACT_IO_R> base) {

		MGBDL_InsActExpns<MGT_ACT_IO_R, MGT_ACT_IO_EXPNS_R> tgt = createInsActExpns(
				base, MCList.create(MGT_ACT_IO_R.class), MCList.create(MGT_ACT_IO_EXPNS_R.class));
		tgt._id = MGT_ACT_IO_R.$act_io_id;
		tgt._idSub = MGT_ACT_IO_R.$act_io_id_sub;
		tgt._newIdPre = FSC_MODULE_ID.CostManagement.value();
		tgt._nstyp = MGC_NUM_SYS_TYP.ACT_IO_ID;
		return tgt;
	}

	/**
	 * 投入実績を費目別情報とともにコピーするためのクラスを生成する。
	 */
	protected MGBDL_InsActExpns<MGT_ACT_INPT_R, MGT_ACT_INPT_EXPNS_R> createInsInptActExpns(
			MCList<MGT_ACT_INPT_R> base) {

		MGBDL_InsActExpns<MGT_ACT_INPT_R, MGT_ACT_INPT_EXPNS_R> tgt = createInsActExpns(
				base, MCList.create(MGT_ACT_INPT_R.class), MCList.create(MGT_ACT_INPT_EXPNS_R.class));
		tgt._id = MGT_ACT_INPT_R.$act_inpt_id;
		tgt._idSub = MGT_ACT_INPT_R.$act_inpt_id_sub;
		tgt._newIdPre = FSC_MODULE_ID.CostManagement.value();
		tgt._nstyp = MGC_NUM_SYS_TYP.ACT_INPT_ID;
		return tgt;
	}

	protected MGBDL_SeqTgt createSeqTgt(IfNumSysTyp typ,String col, MCMeta meta) {
		return new MGBDL_SeqTgt(typ, col, meta);
	}

	protected MGBDL_SeqTgt getSeqTgt(MGC_COST_COPY_TYP typ) {
		if (MGC_COST_COPY_TYP.isMGT_PLN_ALC_AMT(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY,
					MGT_PLN_ALC_AMT_R.$pln_alc_amt_key,
					MGT_PLN_ALC_AMT_R.pln_alc_amt_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_ALC_AMT_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO,
					MGT_PLN_ALC_AMT_IF_R.$data_lno,
					MGT_PLN_ALC_AMT_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_ITM_WK(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_ITM_WK_KEY,
					MGT_PLN_ITM_WK_R.$pln_itm_wk_key,
					MGT_PLN_ITM_WK_R.pln_itm_wk_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_OTHER_WK(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_OTHER_WK_KEY,
					MGT_PLN_OTHER_WK_R.$pln_other_wk_key,
					MGT_PLN_OTHER_WK_R.pln_other_wk_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_MFG(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_MFG_KEY,
					MGT_PLN_MFG_R.$pln_mfg_key,
					MGT_PLN_MFG_R.pln_mfg_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_PURC(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_PURC_KEY,
					MGT_PLN_PURC_R.$pln_purc_key,
					MGT_PLN_PURC_R.pln_purc_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_SLS(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_SLS_KEY,
					MGT_PLN_SLS_R.$pln_sls_key,
					MGT_PLN_SLS_R.pln_sls_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_RQMT(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_RQMT_KEY,
					MGT_PLN_RQMT_R.$pln_rqmt_key,
					MGT_PLN_RQMT_R.pln_rqmt_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PLN_INPT(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.PLN_INPT_KEY,
					MGT_PLN_INPT_R.$pln_inpt_key,
					MGT_PLN_INPT_R.pln_inpt_key_META);
		}
		if (MGC_COST_COPY_TYP.isMGT_ACT_ALC_AMT(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY,
					MGT_ACT_ALC_AMT_R.$act_alc_amt_key,
					MGT_ACT_ALC_AMT_R.act_alc_amt_key_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_ALC_AMT_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO,
					MGT_ACT_ALC_AMT_IF_R.$data_lno, MGT_ACT_ALC_AMT_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INPT_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_INPT_IF_DATA_LNO, MGT_ACT_INPT_IF_R.$data_lno,
					MGT_ACT_INPT_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INST_WK_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_INST_WK_IF_DATA_LNO,
					MGT_ACT_INST_WK_IF_R.$data_lno, MGT_ACT_INST_WK_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INST_WIP_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_INST_WIP_IF_DATA_LNO,
					MGT_ACT_INST_WIP_IF_R.$data_lno, MGT_ACT_INST_WIP_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_IO_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO, MGT_ACT_IO_IF_R.$data_lno,
					MGT_ACT_IO_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_OTHER_WK_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_OTHER_WK_IF_DATA_LNO,
					MGT_ACT_OTHER_WK_IF_R.$data_lno, MGT_ACT_MFG_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_MFG_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_MFG_IF_DATA_LNO, MGT_ACT_MFG_IF_R.$data_lno,
					MGT_ACT_MFG_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_PURC_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_PURC_IF_DATA_LNO, MGT_ACT_PURC_IF_R.$data_lno,
					MGT_ACT_PURC_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_SLS_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_SLS_IF_DATA_LNO, MGT_ACT_SLS_IF_R.$data_lno,
					MGT_ACT_SLS_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_STK_IF(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_STK_IF_DATA_LNO, MGT_ACT_STK_IF_R.$data_lno,
					MGT_ACT_STK_IF_R.data_lno_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INPT(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_INPT_ID, MGT_ACT_INPT_R.$act_inpt_id,
					MGT_ACT_INPT_R.act_inpt_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INST_WK(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_INST_WK_ID,
					MGT_ACT_INST_WK_R.$act_inst_wk_id, MGT_ACT_INST_WK_R.act_inst_wk_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_IO(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_IO_ID, MGT_ACT_IO_R.$act_io_id,
					MGT_ACT_IO_R.act_io_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_OTHER_WK(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_OTHER_WK_ID,
					MGT_ACT_OTHER_WK_R.$act_other_wk_id, MGT_ACT_OTHER_WK_R.act_other_wk_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_PURC(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_PURC_ID, MGT_ACT_PURC_R.$act_purc_id,
					MGT_ACT_PURC_R.act_purc_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_MFG(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_MFG_ID, MGT_ACT_MFG_R.$act_mfg_id,
					MGT_ACT_MFG_R.act_mfg_id_META);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_SLS(typ)) {
			return createSeqTgt(MGC_NUM_SYS_TYP.ACT_SLS_ID, MGT_ACT_SLS_R.$act_sls_id,
					MGT_ACT_SLS_R.act_sls_id_META);
		}
		else {
			return null;
		}
	}

	/**
	 * キーに対応する原価コピー対象区分を取得します。
	 * @param key 原価コピー対象区分のキー
	 * @return 原価コピー対象区分
	 */
	protected MGC_COST_COPY_TYP getCostCopyTyp(String key) {
		MGC_COST_COPY_TYP ret = _keyTypMap.get(key);
		if (ret == null) {
			for (MGC_COST_COPY_TYP typ : MGC_COST_COPY_TYP.array()) {
				if (typ.key().equals(key)) {
					ret = typ;
					break;
				}
			}
			_keyTypMap.put(key, ret);
		}
		return ret;
	}

	protected String getYmColNm(MGC_COST_COPY_TYP typ) {
		return YM;
	}

	protected String getCalcCtgColNm(MGC_COST_COPY_TYP typ) {
		return CACL_CTG_CD;
	}

	protected String getTermColNm(MGC_COST_COPY_TYP typ) {
		return TERM;
	}

	protected String getWgCdColNm(MGC_COST_COPY_TYP typ) {
		return WG_CD;

	}

	protected MCDBContainer createDbc(String tbl, String alias) {
		String classNm = MCFactory.createClassName("mcframe", "server" + tbl.substring(0, 2), "dbc", tbl + "_R");
		Class<? extends MCDBContainer> clazz = MCFactory.getClass(MCDBContainer.class, classNm);
		return clazz.cast(MCFactory.invokeStatic(clazz, "create", new Class<?>[] {String.class}, new Object[] {alias}));
	}

	/**
	 * マスタに存在しないデータを使用しているレコードがコピーされた場合、メッセージプールにメッセージを設定する。
	 */
	protected void chkExists(HdrR h, DtlR r, MCRow bind) {
		MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
		MCDBContainer T = createDbc(typ.value(), "T");
		MCMainQuery select = sql(createSqlId(LOGIC_ID, T, "chkExists_select1")).mainQuery()
				.select(count(value("X")).as(COUNT)).from(T);
		MCPredicate where = getWhere(T, typ, r, false, true);

		boolean hasErr = false;

		if (MGC_COST_COPY_TYP.isMAM_DPT_CONFIG(typ)) {
			MCPredicate where2 = getWhere(T, typ, r, false, true);
			where2 = appendNotExist(T, where2, "PAR_DPT_CD", true);
			hasErr = hasErrRecord(h, r, select.where(where2), bind);
			if (!hasErr) {
				where = appendNotExist(T, where, "DPT_CD", false);
				hasErr = hasErrRecord(h, r, select.where(where), bind);
			}
		}
		else if (MGC_COST_COPY_TYP.isMAM_PRE_ALC_DPT(typ)) {
			MCPredicate where2 = getWhere(T, typ, r, false, true);
			where2 = appendNotExist(T, where2, "SRC_DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where2), bind);
			if (!hasErr) {
				where = appendNotExist(T, where, "DST_DPT_CD", false);
				hasErr = hasErrRecord(h, r, select.where(where), bind);
			}
		}
		else if (MGC_COST_COPY_TYP.isMAM_PRE_ALC_RATE_SEL(typ)) {
			where = appendNotExist(T, where, "DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where), bind);
		}
		else if (MGC_COST_COPY_TYP.isMGT_PRE_RATE_TERM(typ)) {
			where = appendNotExist(T, where, "DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where), bind);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ITM_DTL(typ)) {
			MCPredicate where2 = getWhere(T, typ, r, false, true);
			where2 = appendNotExist(T, where2 , "ALC_DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where2), bind);
			if (!hasErr) {
				where = appendNotExist(T, where , "EXP_DPT_CD", false);
				hasErr = hasErrRecord(h, r, select.where(where), bind);
			}
		}
		else if (MGC_COST_COPY_TYP.isMGT_ITM_SLS(typ)) {
			where = appendNotExist(T, where, "DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where), bind);
		}
		else if (MGC_COST_COPY_TYP.isMGT_STD_ALC_RATE(typ)) {
			where = appendNotExist(T, where, "DPT_CD", false);
			hasErr = hasErrRecord(h, r, select.where(where), bind);
		}
		if (hasErr) {
			addExistInfoToMsgPool(typ, r);
		}
	}

	protected void addExistInfoToMsgPool(MGC_COST_COPY_TYP typ, DtlR r) {
		//チェックしたＷＧごとにコピーするため、同一テーブルのエラーが複数回発生する可能性がある。
		//sortForCopyで処理対象はソート済みのため、１つ前のメッセージと重複していない場合のみメッセージを追加する。
		String mid = MGBDL0040;
		MCMessageList ml = MCMessagePool.getMessageList();
		if (ml.size() == 0) {
			MCMessagePool.add(new MCMessage(r, null, mid, typ.value()));
		}
		else {
			MCMessage m = ml.get(ml.size() - 1);
			if (!isSame(mid, m.getID()) || !isSame(typ.value(), m.getBind(1))) {
				MCMessagePool.add(new MCMessage(r, null, mid, typ.value()));
			}
		}
	}

	protected MCPredicate appendNotExist(MCDBContainer T, MCPredicate where, String dptCol,
			boolean configFlg) {
		MAM_COST_DPT_R S1D = MAM_COST_DPT_R.create("D");
		MCStringPermColumn col = (MCStringPermColumn) T.getColumn$(dptCol);
		MCDatePermColumn col2 = (MCDatePermColumn) T.getColumn$("term");

		MCPredicate subWhere = S1D.term.eq(col2).and(S1D.dpt_cd.eq(col));
		if (configFlg) {
			subWhere = subWhere
					.and(S1D.dpt_config_typ.eq(value(MAC_DPT_CONFIG_TYP.CONFIG.value())));
		}

		where = where.and(col.neq(value(MAC_STR.NULL_VAL.value())));
		where = where.and(col.isNotNull());
		where = where
				.and(notExists(subQuery().select(value("X")).from(S1D).where(subWhere)));
		return where;
	}

	protected boolean hasErrRecord(HdrR h, DtlR r, MCMainQuery mainQuery, MCRow bind) {
		convToBind(h, r, bind);
		MCRow rslt = MCRow.create();
		rslt.addNumberColumn("CNT");
		mainQuery.executeQuery(bind, rslt);
		boolean rtn = rslt.getNumber("CNT").gt(MCNumber.ZERO);
		return rtn;
	}

	/**
	 * コピー順番を調整するためのソート
	 */
	protected void sortForCopy(MCList<DtlR> up1) {
		//原価部門は１番にコピーする必要があるので一番上に移動する
		up1.sort((s1, s2) -> {
			String s1k = s1.cost_copy_typ_key();
			String s2k = s2.cost_copy_typ_key();
			int rtn = s1k.compareTo(s2k);
			if (rtn == 0) {
				return 0;
			}
			if (MGC_COST_COPY_TYP.isMAM_COST_DPT(
					getCostCopyTyp(s1k))) {
				return -1;
			}
			if (MGC_COST_COPY_TYP.isMAM_COST_DPT(
					getCostCopyTyp(s2k))) {
				return 1;
			}
			return rtn;
		});
	}

	protected void delete(HdrR h, DtlR r) {
		MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
		MCDBContainer T = createDbc(typ.value(), "T");
		MCRow bind = MCRow.create();
		convToBind(h, r, bind);

		sql(createSqlId(LOGIC_ID, T, "delete_delete")).delete(T)
				.where(getWhere(T, typ, r, false, false)).executeUpdate(bind);
	}

	/**
	 * コピー先のデータを削除する。<p>
	 * 削除済の原価コピー対象区分キーに関しては何もしない。
	 * @param befCckey １つ前に処理した原価コピー対象区分キー
	 * @param hr 上り電文ヘッダ
	 * @param r 上り電文明細
	 * @param del 削除対象
	 * @param delk 削除対象のキー
	 * @return 処理した原価コピー対象区分キー
	 */
	protected String deleteDest(String befCckey,HdrR hr, DtlR r, MCList<DtlR> del, MCIndexKey delk) {

		if (!isSame(befCckey, r.cost_copy_typ_key())) {

			del.subList(delk, r.cost_copy_typ_key()).
				forEach(dr -> {
					// MGT_ACT_SLS、MGT_ACT_IO、MGT_ACT_INPTの場合は費目別情報も削除
					MGC_COST_COPY_TYP typ = getCostCopyTyp(dr.cost_copy_typ_key());
					if (MGC_COST_COPY_TYP.isMGT_ACT_SLS(typ)) {
						deleteActSlsExpns(hr, r);
					}
					else if (MGC_COST_COPY_TYP.isMGT_ACT_IO(typ)) {
						deleteActIoExpns(hr, r);
					}
					else if (MGC_COST_COPY_TYP.isMGT_ACT_INPT(typ)) {
						deleteActInptExpns(hr, r);
					}
					delete(hr, dr);
				});
		}
		return r.cost_copy_typ_key();
	}

	protected void deleteActSlsExpns(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		executeUpdate(MGBDL0300_MGT_ACT_SLS_EXPNS_D01(), bind);
	}

	protected void deleteActIoExpns(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		executeUpdate(MGBDL0300_MGT_ACT_IO_EXPNS_D01(), bind);
	}

	protected void deleteActInptExpns(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		executeUpdate(MGBDL0300_MGT_ACT_INPT_EXPNS_D01(), bind);
	}

	protected MCCursor<MGT_ACT_SLS_R> selectTgtSls(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		return FXUCL_MCDbUtil.openCursor(MGT_ACT_SLS_R.class, MGBDL0300_MGT_ACT_SLS_S01(),
				bind, null, _fetchSize.intValueExact());
	}

	protected MCCursor<MGT_ACT_IO_R> selectTgtIo(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		return FXUCL_MCDbUtil.openCursor(MGT_ACT_IO_R.class, MGBDL0300_MGT_ACT_IO_S01(),
				bind, null, _fetchSize.intValueExact());
	}

	protected MCCursor<MGT_ACT_INPT_R> selectTgtInpt(HdrR hr, DtlR dr) {
		HdrR bind = hr.clone();
		bind.setStringNE(DtlR.$wg_cd, dr.wg_cd());
		return FXUCL_MCDbUtil.openCursor(MGT_ACT_INPT_R.class, MGBDL0300_MGT_ACT_INPT_S01(),
				bind, null, _fetchSize.intValueExact());
	}

	protected void insertActSls(HdrR hr, DtlR dr) {
		// コピー元のレコードを抽出
		MCCursor<MGT_ACT_SLS_R> slsCur = selectTgtSls(hr, dr);
		if (slsCur.dbFetch() == 0) {
			return;
		}
		while (true) {
			// 売上実績のコピー
			insSls(hr, slsCur.getList());
			if (slsCur.dbFetch() == 0) {
				break;
			}
		}
	}

	protected void insertActIo(HdrR hr, DtlR dr) {
		// コピー元のレコードを抽出
		MCCursor<MGT_ACT_IO_R> ioCur = selectTgtIo(hr, dr);
		if (ioCur.dbFetch() == 0) {
			return;
		}
		while (true) {
			insIo(hr, ioCur.getList());
			if (ioCur.dbFetch() == 0) {
				break;
			}
		}
	}

	protected void insertActInpt(HdrR hr, DtlR dr) {
		// コピー元のレコードを抽出
		MCCursor<MGT_ACT_INPT_R> inptCur = selectTgtInpt(hr, dr);
		if (inptCur.dbFetch() == 0) {
			return;
		}
		while (true) {
			insInpt(hr, inptCur.getList());
			if (inptCur.dbFetch() == 0) {
				break;
			}
		}
	}

	protected void insSls(HdrR hr, MCList<MGT_ACT_SLS_R> slsL) {
		MGBDL_InsActExpns<MGT_ACT_SLS_R, MGT_ACT_SLS_EXPNS_R> tgt = createInsSlsActExpns(slsL);
		tgt.insert(hr);
	}

	protected void insIo(HdrR hr, MCList<MGT_ACT_IO_R> ioL) {
		MGBDL_InsActExpns<MGT_ACT_IO_R, MGT_ACT_IO_EXPNS_R> tgt = createInsIoActExpns(ioL);
		tgt.insert(hr);
	}

	protected void insInpt(HdrR hr, MCList<MGT_ACT_INPT_R> inptL) {
		MGBDL_InsActExpns<MGT_ACT_INPT_R, MGT_ACT_INPT_EXPNS_R> tgt = createInsInptActExpns(inptL);
		tgt.insert(hr);
	}

	protected void insert(HdrR h, DtlR r, MCRow bind, String... col) {
		// MGT_ACT_SLS、MGT_ACT_IO、MGT_ACT_INPTの場合は費目別情報もコピーするので別処理とする
		MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
		if (MGC_COST_COPY_TYP.isMGT_ACT_SLS(typ)) {
			insertActSls(h, r);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_IO(typ)) {
			insertActIo(h, r);
		}
		else if (MGC_COST_COPY_TYP.isMGT_ACT_INPT(typ)) {
			insertActInpt(h, r);
		}
		else {
			convFrBind(h, r, bind);
			insertOthers(r, bind, col);
		}
	}
	protected void insertOthers(DtlR r, MCRow bind, String... cols) {
		MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
		MCDBContainer T = createDbc(typ.value(), "T");
		List<MCPermColumn> insColL = new ArrayList<MCPermColumn>();
		List<MCData> selColL = new ArrayList<MCData>();

		for (String col : cols) {
			insColL.add(T.getColumn$(col));
			selColL.add(bind(BIND_PREFIX + col));
		}

		if (typ.use_key()) {
			MGBDL_SeqTgt tabKey = getSeqTgt(typ);
			insColL.add(T.getColumn$(tabKey._col));
			// 文字列項目は接頭辞「MG-」を付与する
			if (tabKey._meta.type() == MCDataType.STRING) {
				selColL.add(value(
						FSC_MODULE_ID.CostManagement.value() + MGC_STR.ACT_ID_DLM.value())
								.concat(toChar(
										MAPA_NUM$F_GET_SEQ(value(tabKey._typ.value())),
										tabKey._typ.length().intValue(), 0,
										MCNumberFmtOpt.FILL_MODE,
										MCNumberFmtOpt.ZERO_PAD)));
			}
			else {
				selColL.add(MAPA_NUM$F_GET_SEQ(value(tabKey._typ.value())));
			}
			String[] withouts = new String[cols.length + 1];
			System.arraycopy(cols, 0, withouts, 0, cols.length);
			withouts[cols.length] = tabKey._col;
			for (String col : getTabCols(T, r, withouts)) {
				insColL.add(T.getColumn$(col));
				selColL.add(T.getColumn$(col));
			}
		}
		else {
			for (String col : getTabCols(T, r, cols)) {
				insColL.add(T.getColumn$(col));
				selColL.add(T.getColumn$(col));
			}
		}
		//DBLink対応（登録担当者などの登録）
		String[] uc = getUpdInfoColumn(r);
		if (uc != null) {
			for (String col : uc) {
				insColL.add(T.getColumn$(col));
				selColL.add(bind(":" + col));
			}
		}

		sql(createSqlId(LOGIC_ID, T, "insertOthers_insert")).insert(T)
				.columns(insColL.toArray(new MCPermColumn[] {}))
				.query(subQuery().select(selColL.toArray(new MCData[] {})).from(T)
						.where(getWhere(T, typ, r, true, false)))
				.executeUpdate(bind);
	}

	/**
	 * 登録・更新担当者、機能ＩＤ、更新リクエストＮＯを取得する。
	 * 対象がマスタ以外の場合はnullを返す。
	 */
	protected MAM_ITM_COM_R selectUpdInfo(DtlR r) {
		MGC_COST_COPY_TYP t = getCostCopyTyp(r.cost_copy_typ_key());
		if (!t.value().startsWith(FSC_MODULE_ID.MasterAdmin.value())) {
			return null;
		}
		if (_dbc == null) {
			//ＤＢコンテナを使用しているのは更新情報のカラムを固定カラムにしたいため
			_dbc = MAM_ITM_COM_R.create();
			sql(createSqlId(LOGIC_ID, "FCPA_CONTEXT", "selectUpdInfo_select"))
					.mainQuery()
					.select(nvl(FCPA_CONTEXT$F_GET_USERID(), FCPA_CONTEXT$F_GET_OS_USR()).as("ins_usr_id"),
							FCPA_CONTEXT$F_GET_USERNM().as("ins_usr_nm"),
							FCPA_CONTEXT$F_GET_CALL_PG_ID().as("ins_func_id"),
							FCPA_CONTEXT$F_GET_PROCESSID().as("upd_srv_req_no"))
					.executeQuery(_dbc);
			_dbc.upd_usr_id(_dbc.ins_usr_id());
			_dbc.upd_usr_nm(_dbc.ins_usr_nm());
			_dbc.upd_func_id(_dbc.ins_func_id());
		}
		return _dbc;
	}

	/**
	 * 登録・更新担当者、機能ＩＤ、更新リクエストＮＯのカラム名を取得する。
	 * 対象がマスタ以外の場合はnullを返す。
	 */
	protected String[] getUpdInfoColumn(DtlR r) {
		MGC_COST_COPY_TYP t = getCostCopyTyp(r.cost_copy_typ_key());
		if (!t.value().startsWith(FSC_MODULE_ID.MasterAdmin.value())) {
			return null;
		}
		if (_upd_info_col == null) {
			_upd_info_col = new String[]{
					MAM_ITM_COM_R.$ins_usr_id,
					MAM_ITM_COM_R.$ins_usr_nm,
					MAM_ITM_COM_R.$ins_func_id,
					MAM_ITM_COM_R.$upd_srv_req_no,
					MAM_ITM_COM_R.$upd_usr_id,
					MAM_ITM_COM_R.$upd_usr_nm,
					MAM_ITM_COM_R.$upd_func_id,
					};
		}
		return _upd_info_col;
	}

	protected String[] getTabCols(MCDBContainer dbc, DtlR r, String... withouts) {
		List<String> cols = new ArrayList<String>();
		MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
		String[] sysCol = new String[] {
				"ins_usr_id", "ins_usr_nm", "ins_func_id", "ins_ts", "upd_cntr",
				"upd_srv_req_no", "upd_usr_id", "upd_usr_nm", "upd_func_id", "upd_ts"
		};
		for (String col : dbc.getBaseColumns()) {
			if (!isNonTgtCols(col, getNonTgtCols(typ, withouts)) && !isNonTgtCols(col, sysCol)) {
				if (MGC_COST_COPY_TYP.isMAM_COST_DPT(typ) && isSame(col, "base_dpt_nm")) {
					continue;
				}
				cols.add(col);
			}
		}
		return cols.toArray(new String[0]);
	}

	protected boolean isNonTgtCols(String col, String[] withouts) {
		for (String without : withouts) {
			if (isSame(without.toUpperCase(), col.toUpperCase())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 原価コピー対象区分に対応したwhere句を返す
	 * @param typ 原価コピー対象区分
	 * @param r 対象のrow
	 * @param ins INSERT SELECT用のwhere句の場合はtrue
	 * @param forSelectWg wg_cdをwhere句に追加する場合はtrue
	 * */
	protected MCPredicate getWhere(MCDBContainer T, MGC_COST_COPY_TYP typ, DtlR r, boolean ins, boolean forSelectWg) {
		MCPredicate where = value(0).eq(value(0));

		if (typ != null) {
			if (typ.tgt_ctg()) {
				MCStringPermColumn col = (MCStringPermColumn)T.getColumn$(getCalcCtgColNm(typ));
				where = where.and(col.eq(bind("calc_ctg_cd")));
			}
			if (typ.tgt_term()) {
				MCDatePermColumn col = (MCDatePermColumn)T.getColumn$(getTermColNm(typ));
				where = where.and(col.eq(bind("term")));
			}
			if (typ.tgt_pln() || typ.tgt_act()) {
				MCDatePermColumn col1 = (MCDatePermColumn)T.getColumn$(getYmColNm(typ));
				MCStringPermColumn col2 = (MCStringPermColumn)T.getColumn$(getCalcCtgColNm(typ));
				where = where.and(col1.eq(bind("ym")));
				where = where.and(col2.eq(bind("calc_ctg_cd")));
			}

			// 一次配賦月次比率（計画） / 一次配賦比率作成対象マスタ（計画）
			if (MGC_COST_COPY_TYP.isMGT_PRE_RATE_MLY_PLN(typ) || MGC_COST_COPY_TYP.isMAM_PRE_RATE_TGT_PLN(typ)) {
				MCStringPermColumn col = (MCStringPermColumn)T.getColumn$("sa_typ");
				where = where.and(MAC_SA_TYP$IS_PLN(col).eq(value(true)));
			}
			// 一次配賦月次比率（実績） / 一次配賦比率作成対象マスタ（実績）
			if (MGC_COST_COPY_TYP.isMGT_PRE_RATE_MLY_ACT(typ) || MGC_COST_COPY_TYP.isMAM_PRE_RATE_TGT_ACT(typ)) {
				MCStringPermColumn col = (MCStringPermColumn)T.getColumn$("sa_typ");
				where = where.and(MAC_SA_TYP$IS_ACT(col).eq(value(true)));
			}

			// 配賦費用は一次配賦処理済ＦＬＧがオフのみがコピー対象
			// 件数カウントの時は全て検索
			if (ins) {
				if (MGC_COST_COPY_TYP.isMGT_ACT_ALC_AMT(typ)
						|| MGC_COST_COPY_TYP.isMGT_PLN_ALC_AMT(typ)) {
					MCBooleanPermColumn col = (MCBooleanPermColumn)T.getColumn$("pre_alc_fin_flg");
					where = where.and(col.eq(value(false)));
				}
			}
			if (!forSelectWg) {
				if (hasWgCd(null, typ)) {
					MCStringPermColumn col = (MCStringPermColumn)T.getColumn$(getWgCdColNm(typ));
					where = where.and(col.eq(bind("wg_cd")));
				}
			}
		}
		return where;
	}

	protected String[] getNonTgtCols(MGC_COST_COPY_TYP typ, String... cols) {
		List<String> nCols = new ArrayList<String>();

		for (String col : cols) {
			nCols.add(col);
		}

		for (MGC_COST_COPY_NCOL_TYP nTyp : MGC_COST_COPY_NCOL_TYP.array()) {
			if (isSame(typ.value(), nTyp.tgt_table())) {
				nCols.add(nTyp.value());
			}
		}

		return nCols.toArray(new String[0]);
	}

	protected String getTableLocaleName(String tableName) {
		String t = getDBLabel(tableName, null , getUsrLocale());
		if (t != null) {
			return t;
		}
		return tableName;
	}

	protected void convFrBind(HdrR h, DtlR r, MCRow bind) {
		bind.addStringColumn("calc_ctg_cd", h.calc_ctg_cd_fr());
		bind.addDateColumn("term", h.term_fr());
		bind.addDateColumn("ym", h.ym_fr());
		bind.addStringColumn("wg_cd", r.wg_cd());

		//更新日時情報の追加
		MAM_ITM_COM_R ui = selectUpdInfo(r);
		if (ui != null) {
			for(String uc : getUpdInfoColumn(r)) {
				bind.setValueNE(uc, ui.getValue(uc));
			}
		}
	}

	protected void convToBind(HdrR h, DtlR r, MCRow bind) {
		bind.addStringColumn("calc_ctg_cd", h.calc_ctg_cd_to());
		bind.addDateColumn("term", h.term_to());
		bind.addDateColumn("ym", h.ym_to());
		bind.addStringColumn("wg_cd", r.wg_cd());
	}

	/**
	 * チェック実行
	 */
	protected void callThisChk(MAUDL_Operation caller, HdrR up0, MCList<DtlR> up1, MCList<DtlR> del) {
		MGBDL_CostTermCalcCtgPtnCopy.Chk01 ope = MGBDL_CostTermCalcCtgPtnCopy.crtChk01();
		ope.setCaller(caller);
		MCRow.copyall(ope.up0(), up0);
		ope.up1().setAll(up1);
		ope.exec();
		//コピー元のWG_CDを追加したデータを取得
		up1.setAll(ope.down0());
		//コピー先削除対象のWG_CDを追加したデータを取得
		del.setAll(ope.down1());
	}

	/**
	 * 区分の対象がwg_cdを持つかどうかを判定する
	 */
	protected boolean hasWgCd(MCList<DtlR> up1, MGC_COST_COPY_TYP typ) {
		MCRow r = getCostCopyCols(up1).getFirst(_cost_copy_k, typ.value(), getWgCdColNm(typ).toUpperCase());
		return r != null;
	}

	/**
	 * 項目名をキャッシュする
	 */
	protected void cacheCols(MCList<DtlR> up1) {
		getCostCopyCols(up1);

		// 論理削除フラグ＝オンのレコードを見られるようにする
		_tnameL = new ArrayList<String>();
		for (DtlR r : up1) {
			MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
			MCDBContainer dbc = createDbc(typ.value(), "T");
			_tnameL.add(dbc.tableName());
		}
		MAUCL_ContextUtil.enableDelFlgOn(_tnameL.toArray(new String[] {}));
	}

	/**
	 * コピー対象のWG_CD,CALC_CTG_CD,TERM,YMの項目名のリストを返す。<br>
	 * キャッシュするため２回目以降は引数はnull可。
	 */
	protected MCList<MCRow> getCostCopyCols(MCList<DtlR> up1) {

		if (_cost_copy_cols == null) {
			String tblcol = "table_name";
			String colcol = "column_name";
			_cost_copy_cols = MCList.create(MCRow.class);
			_cost_copy_cols.addStringColumn(tblcol);
			_cost_copy_cols.addStringColumn(colcol);

			for (DtlR r : up1) {
				MGC_COST_COPY_TYP typ = getCostCopyTyp(r.cost_copy_typ_key());
				MCDBContainer dbc = createDbc(typ.value(), "T");

				String w_col = getWgCdColNm(typ).toUpperCase();
				String c_col = getCalcCtgColNm(typ).toUpperCase();
				String t_col = getTermColNm(typ).toUpperCase();
				String y_col = getYmColNm(typ).toUpperCase();

				//原価部門のWG_CDはコピー条件の対象外
				if (MGC_COST_COPY_TYP.isMAM_COST_DPT(typ)) {
					w_col = null;
				}

				for (String c : dbc.getBaseColumns()) {
					String col = c.toUpperCase();
					if (isSame(col, w_col) || isSame(col, c_col) || isSame(col, t_col)
							|| isSame(col, y_col)) {
						MCRow row = _cost_copy_cols.createRow();
						row.setStringNE(tblcol, typ.value());
						row.setStringNE(colcol, col);
						_cost_copy_cols.add(row);
					}
				}
			}

			_cost_copy_k = _cost_copy_cols.createIndex(tblcol, colcol);
		}
		return _cost_copy_cols;
	}

	//FMCB CUSTOM END
}