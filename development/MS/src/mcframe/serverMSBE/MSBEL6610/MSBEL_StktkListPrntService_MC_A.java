package mcframe.serverMSBE.MSBEL6610;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_StktkListPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StktkListPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL6610";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StktkListPrntService.StktkList_Prnt01 aStktkList_Prnt01;

	protected void initStktkList_Prnt01() {
		this.info = PDef.MS_MSBEL6610_StktkList_Prnt01_INFO;
		this.aStktkList_Prnt01 = ((MSBEL_StktkListPrntService)this).new StktkList_Prnt01();
	}

	public static MSBEL_StktkListPrntService.StktkList_Prnt01 crtStktkList_Prnt01() {
		MSBEL_StktkListPrntService lgc = new MSBEL_StktkListPrntService();
		lgc.initStktkList_Prnt01();
		return lgc.aStktkList_Prnt01;
	}

	protected void paramStktkList_Prnt01(MCParam p) {
		if (this.aStktkList_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStktkList_Prnt01.up0());
	}

	protected void doStktkList_Prnt01() {
		aStktkList_Prnt01.call();
	};

	/**
	 * StktkList_Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR createStktkList_Prnt01_DtlR(){
		return mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR.create();
	}

	/**
	 * StktkList_Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR> createStktkList_Prnt01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StktkList_Prnt01オペレーション.<p>
	 *
	 * 棚卸表あるいは実棚差異リストを印刷します。<br>
	 */
	abstract public class StktkList_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StktkList_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR> up0;
		
		
		// コンストラクタ
		protected StktkList_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_StktkListPrntService)MSBEL_StktkListPrntService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StktkList_Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR createStktkList_Prnt01_DtlR(){
			return mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR.create();
		}

		/**
		 * StktkList_Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR> createStktkList_Prnt01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctrl_tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stktk_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>diff_rpt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_rpt_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6610.StktkList_Prnt01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkListPrntService)MSBEL_StktkListPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}