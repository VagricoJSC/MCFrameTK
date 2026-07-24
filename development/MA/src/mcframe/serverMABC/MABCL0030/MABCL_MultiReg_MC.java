package mcframe.serverMABC.MABCL0030;

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
import mcframe.serverMABC.MABCL0030.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverCore.database.MCDBExpr;
import mcframe.serverCore.queryapi.MCForeignInfo;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 複数のマスタ、名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_MultiReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected List<String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add(up0().mst_nm() + "_LCL");
			Collections.sort(l);
			return l;
		}

		@Override
		protected int getDownBlockNumber(String grp, MCController ctrl) {
			if (grp.equals(SELECT)) {
				return 0;
			}
			else {
				return 1;
			}
		}

		@Override
		public List<MCController> getSubOpes(String key) {
			if (isSame(key, SELECT)) {
				return super.getSubOpes(up0().mst_nm());
			}
			else {
				return super.getSubOpes(key);
			}
		}

		@Override
		public void mapUpContainers(String key) {
			if (isSame(key, SELECT)) {
				super.mapUpContainers(up0().mst_nm());
			}
			else {
				super.mapUpContainers(key);
			}
		}

		@Override
		public void mapDownContainers(String key) {
			if (isSame(key, SELECT)) {
				super.mapDownContainers(up0().mst_nm());
			}
			else {
				super.mapDownContainers(key);
			}
		}

		@Override
		protected MCRow getCond(MCController ctrl) {
			MCContainer c = up(0);
			if (c instanceof MCRow) {
				MCRow cndR = (MCRow) c;

				if (ctrl.up(0) instanceof MCRow) {
					MCRow r = (MCRow) ctrl.up(0);

					if (!r.contains(Srch01_CndR.$match_typ)) {

						// match_typの追加
						r.addStringColumn(Srch01_CndR.$match_typ, up0().match_typ());

						// 上り電文のcd, nmの値をＤＢコンテナの対応項目にセットしたものを、検索条件に戻す
						// up0().cd -> MAM_AREA_R.area_cd -> up0().area_cd
						for (String col : r.getConstColumnPathArray()) {
							if (r.getValueNE(col) != null
									&& !isSame(r.getDataType(col), MCDataType.BOOLEAN)) {

								// match_typによる文字列の加工を行う
								cndR.setValueNE(col, getEditString(r, col));
							}
						}
						for (String x : new String[]{Srch01_CndR.$memo1,Srch01_CndR.$memo2,Srch01_CndR.$memo3}) {
							cndR.setValueNE(x, getEditString(cndR, x));
						}
					}
				}
				return cndR;
			}
			return null;
		}

		protected void setWhere(MCQueryApiBuilder builder) {
			super.setWhere(builder);

			MCRow upR = getCond(getCurrentController());
			if (upR != null) {

				String[] upT = upR.getTempNameArray();
				MCDBContainer dbcR = builder.getBaseDbc();

				for (int i = 0; i < upT.length; i++) {
					String bindCol = upT[i];

					if (FXBAL_MCRLUtil.isLinkedToTableColumn(dbcR, bindCol)) {

						/* 外部参照先の項目の場合は結合します。 */
						MCForeignInfo f = dbcR.getForeignInfoByColumn(bindCol);
						if (f != null) {
							if (isForeignEQ()) {
								builder.activeForeignEQ(f);
							}
							else {
								builder.activeForeign(f);
							}
						}

						/* String,Number以外の項目はwhere句を設定しません。 */
						MCDataType typ = dbcR.getMeta(bindCol).type();
						if (!isAddWhereTyp(typ)) {
							continue;
						}

						/* WHERE句を取得します。 */
						MCPermColumn col = dbcR.getColumn$(bindCol);
						MCPredicate where = getWhere(typ, col, bindCol);

						/* WHERE句を設定します。 */
						builder.addWhereWithCutOffAnd(where);

					}
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 複数のマスタ、名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_MultiReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		protected List<String> getSortedCallOpeGrpNms() {
			List<String> l = new ArrayList<String>();
			if (up(2) instanceof Upd01_CndR) {
				l.add(((Upd01_CndR) up(2)).mst_nm());
			}
			Collections.sort(l);
			return l;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 複数のマスタ、名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_MultiReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		protected List<String> getSortedCallOpeGrpNms() {
			List<String> l = new ArrayList<String>();
			if (up(1) instanceof Del01_CndR) {
				l.add(((Del01_CndR) up(1)).mst_nm());
			}
			Collections.sort(l);
			return l;
		}
	}

	//FMCB CUSTOM END
}