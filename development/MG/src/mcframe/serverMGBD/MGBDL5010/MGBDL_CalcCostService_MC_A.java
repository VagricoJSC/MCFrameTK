package mcframe.serverMGBD.MGBDL5010;

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
 * "MGBDL_CalcCostService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CalcCostService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CalcCostService.CalcCost_Ins01 aCalcCost_Ins01;

	protected void initCalcCost_Ins01() {
		this.info = PDef.MG_MGBDL5010_CalcCost_Ins01_INFO;
		this.aCalcCost_Ins01 = ((MGBDL_CalcCostService)this).new CalcCost_Ins01();
	}

	public static MGBDL_CalcCostService.CalcCost_Ins01 crtCalcCost_Ins01() {
		MGBDL_CalcCostService lgc = new MGBDL_CalcCostService();
		lgc.initCalcCost_Ins01();
		return lgc.aCalcCost_Ins01;
	}

	protected void paramCalcCost_Ins01(MCParam p) {
		if (this.aCalcCost_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCost_Ins01.up0());
		p.addDownBlock(aCalcCost_Ins01.down0());
	}

	protected void doCalcCost_Ins01() {
		aCalcCost_Ins01.call();
	};

	/**
	 * CalcCost_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcCost_CndR createCalcCost_CndR(){
		return mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.create();
	}

	/**
	 * CalcCost_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> createCalcCost_CndL(){
		return MCList.create(mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.class);
	}
	protected MGBDL_CalcCostService.CalcRsltDel_Chk01 aCalcRsltDel_Chk01;

	protected void initCalcRsltDel_Chk01() {
		this.info = PDef.MG_MGBDL5010_CalcRsltDel_Chk01_INFO;
		this.aCalcRsltDel_Chk01 = ((MGBDL_CalcCostService)this).new CalcRsltDel_Chk01();
	}

	public static MGBDL_CalcCostService.CalcRsltDel_Chk01 crtCalcRsltDel_Chk01() {
		MGBDL_CalcCostService lgc = new MGBDL_CalcCostService();
		lgc.initCalcRsltDel_Chk01();
		return lgc.aCalcRsltDel_Chk01;
	}

	protected void paramCalcRsltDel_Chk01(MCParam p) {
		if (this.aCalcRsltDel_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcRsltDel_Chk01.up0());
		p.addUpBlock(aCalcRsltDel_Chk01.up1());
		p.addDownBlock(aCalcRsltDel_Chk01.down0());
	}

	protected void doCalcRsltDel_Chk01() {
		aCalcRsltDel_Chk01.call();
	};

	/**
	 * CalcRsltDel_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR createCalcRsltDel_DtlR(){
		return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.create();
	}

	/**
	 * CalcRsltDel_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> createCalcRsltDel_DtlL(){
		return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
	}

	/**
	 * CalcRsltDel_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR createCalcRsltDel_HdrR(){
		return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR.create();
	}
	protected MGBDL_CalcCostService.CalcRsltDel_Del01 aCalcRsltDel_Del01;

	protected void initCalcRsltDel_Del01() {
		this.info = PDef.MG_MGBDL5010_CalcRsltDel_Del01_INFO;
		this.aCalcRsltDel_Del01 = ((MGBDL_CalcCostService)this).new CalcRsltDel_Del01();
	}

	public static MGBDL_CalcCostService.CalcRsltDel_Del01 crtCalcRsltDel_Del01() {
		MGBDL_CalcCostService lgc = new MGBDL_CalcCostService();
		lgc.initCalcRsltDel_Del01();
		return lgc.aCalcRsltDel_Del01;
	}

	protected void paramCalcRsltDel_Del01(MCParam p) {
		if (this.aCalcRsltDel_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcRsltDel_Del01.up0());
		p.addUpBlock(aCalcRsltDel_Del01.up1());
		p.addDownBlock(aCalcRsltDel_Del01.down0());
	}

	protected void doCalcRsltDel_Del01() {
		aCalcRsltDel_Del01.call();
	};
	protected MGBDL_CalcCostService.CalcCost_Ins02 aCalcCost_Ins02;

	protected void initCalcCost_Ins02() {
		this.info = PDef.MG_MGBDL5010_CalcCost_Ins02_INFO;
		this.aCalcCost_Ins02 = ((MGBDL_CalcCostService)this).new CalcCost_Ins02();
	}

	public static MGBDL_CalcCostService.CalcCost_Ins02 crtCalcCost_Ins02() {
		MGBDL_CalcCostService lgc = new MGBDL_CalcCostService();
		lgc.initCalcCost_Ins02();
		return lgc.aCalcCost_Ins02;
	}

	protected void paramCalcCost_Ins02(MCParam p) {
		if (this.aCalcCost_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCost_Ins02.up0());
	}

	protected void doCalcCost_Ins02() {
		aCalcCost_Ins02.call();
	};

	/**
	 * Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5010.Ins02_CndR createIns02_CndR(){
		return mcframe.serverMGBD.MGBDL5010.Ins02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CalcCost_Ins01オペレーション.<p>
	 *
	 * 原価計算を実行する。<br>
	 */
	abstract public class CalcCost_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCost_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> down0;
		
		
		// コンストラクタ
		protected CalcCost_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.class);
			down0 = MCList.create(mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CalcCost_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcCost_CndR createCalcCost_CndR(){
			return mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.create();
		}

		/**
		 * CalcCost_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> createCalcCost_CndL(){
			return MCList.create(mcframe.serverMGBD.MGBDL5010.CalcCost_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>carry_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>data_check_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_limit_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL5010.CalcCost_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this).info;
		}


	}
	/**
	 * CalcRsltDel_Chk01オペレーション.<p>
	 *
	 * 原価計算結果削除前のチェックをする。<br>
	 */
	abstract public class CalcRsltDel_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcRsltDel_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> down0;
		
		
		// コンストラクタ
		protected CalcRsltDel_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
			up1 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR.create();
			down0 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CalcRsltDel_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR createCalcRsltDel_DtlR(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.create();
		}

		/**
		 * CalcRsltDel_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> createCalcRsltDel_DtlL(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
		}

		/**
		 * CalcRsltDel_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR createCalcRsltDel_HdrR(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_admin_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this).info;
		}


	}
	/**
	 * CalcRsltDel_Del01オペレーション.<p>
	 *
	 * 原価計算情報を削除する。<br>
	 */
	abstract public class CalcRsltDel_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcRsltDel_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> down0;
		
		
		// コンストラクタ
		protected CalcRsltDel_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
			up1 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR.create();
			down0 = mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CalcRsltDel_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR createCalcRsltDel_DtlR(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.create();
		}

		/**
		 * CalcRsltDel_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> createCalcRsltDel_DtlL(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL.createMG_MGBDL5010_CalcRsltDel_Dtl(mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR.class);
		}

		/**
		 * CalcRsltDel_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR createCalcRsltDel_HdrR(){
			return mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_admin_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlL<mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this).info;
		}


	}
	/**
	 * CalcCost_Ins02オペレーション.<p>
	 *
	 * マルチスレッド実行の対象となるオペレーションを実行する。<br>
	 */
	abstract public class CalcCost_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCost_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5010.Ins02_CndR up0;
		
		
		// コンストラクタ
		protected CalcCost_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5010.Ins02_CndR.create();

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
			invoke((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5010.Ins02_CndR createIns02_CndR(){
			return mcframe.serverMGBD.MGBDL5010.Ins02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arg.calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arg.calc_no</td></tr>
		 * 	<tr><td><br></td><td>arg.st_ym</td></tr>
		 * 	<tr><td><br></td><td>arg.end_ym</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sql_no</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_key_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_io_id</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5010.Ins02_CndR
		 */
		public mcframe.serverMGBD.MGBDL5010.Ins02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CalcCostService)MGBDL_CalcCostService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}