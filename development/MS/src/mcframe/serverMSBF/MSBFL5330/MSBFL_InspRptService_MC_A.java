package mcframe.serverMSBF.MSBFL5330;

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
 * "MSBFL_InspRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspRptService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5330";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspRptService.InspRpt_Prnt01 aInspRpt_Prnt01;

	protected void initInspRpt_Prnt01() {
		this.info = PDef.MS_MSBFL5330_InspRpt_Prnt01_INFO;
		this.aInspRpt_Prnt01 = ((MSBFL_InspRptService)this).new InspRpt_Prnt01();
	}

	public static MSBFL_InspRptService.InspRpt_Prnt01 crtInspRpt_Prnt01() {
		MSBFL_InspRptService lgc = new MSBFL_InspRptService();
		lgc.initInspRpt_Prnt01();
		return lgc.aInspRpt_Prnt01;
	}

	protected void paramInspRpt_Prnt01(MCParam p) {
		if (this.aInspRpt_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspRpt_Prnt01.up0());
		p.addDownBlock(aInspRpt_Prnt01.down0());
	}

	protected void doInspRpt_Prnt01() {
		aInspRpt_Prnt01.call();
	};

	/**
	 * InspRpt_Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR createInspRpt_Prnt01_DtlR(){
		return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.create();
	}

	/**
	 * InspRpt_Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> createInspRpt_Prnt01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.class);
	}
	protected MSBFL_InspRptService.InspRpt_Prnt02 aInspRpt_Prnt02;

	protected void initInspRpt_Prnt02() {
		this.info = PDef.MS_MSBFL5330_InspRpt_Prnt02_INFO;
		this.aInspRpt_Prnt02 = ((MSBFL_InspRptService)this).new InspRpt_Prnt02();
	}

	public static MSBFL_InspRptService.InspRpt_Prnt02 crtInspRpt_Prnt02() {
		MSBFL_InspRptService lgc = new MSBFL_InspRptService();
		lgc.initInspRpt_Prnt02();
		return lgc.aInspRpt_Prnt02;
	}

	protected void paramInspRpt_Prnt02(MCParam p) {
		if (this.aInspRpt_Prnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspRpt_Prnt02.up0());
		p.addDownBlock(aInspRpt_Prnt02.down0());
	}

	protected void doInspRpt_Prnt02() {
		aInspRpt_Prnt02.call();
	};

	/**
	 * InspRpt_Prnt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR createInspRpt_Prnt02_DtlR(){
		return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.create();
	}

	/**
	 * InspRpt_Prnt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> createInspRpt_Prnt02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.class);
	}
	protected MSBFL_InspRptService.InspRpt_Prnt03 aInspRpt_Prnt03;

	protected void initInspRpt_Prnt03() {
		this.info = PDef.MS_MSBFL5330_InspRpt_Prnt03_INFO;
		this.aInspRpt_Prnt03 = ((MSBFL_InspRptService)this).new InspRpt_Prnt03();
	}

	public static MSBFL_InspRptService.InspRpt_Prnt03 crtInspRpt_Prnt03() {
		MSBFL_InspRptService lgc = new MSBFL_InspRptService();
		lgc.initInspRpt_Prnt03();
		return lgc.aInspRpt_Prnt03;
	}

	protected void paramInspRpt_Prnt03(MCParam p) {
		if (this.aInspRpt_Prnt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspRpt_Prnt03.up0());
		p.addDownBlock(aInspRpt_Prnt03.down0());
	}

	protected void doInspRpt_Prnt03() {
		aInspRpt_Prnt03.call();
	};

	/**
	 * InspRpt_Prnt03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR createInspRpt_Prnt03_DtlR(){
		return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.create();
	}

	/**
	 * InspRpt_Prnt03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> createInspRpt_Prnt03_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.class);
	}
	protected MSBFL_InspRptService.InspRpt_Prnt04 aInspRpt_Prnt04;

	protected void initInspRpt_Prnt04() {
		this.info = PDef.MS_MSBFL5330_InspRpt_Prnt04_INFO;
		this.aInspRpt_Prnt04 = ((MSBFL_InspRptService)this).new InspRpt_Prnt04();
	}

	public static MSBFL_InspRptService.InspRpt_Prnt04 crtInspRpt_Prnt04() {
		MSBFL_InspRptService lgc = new MSBFL_InspRptService();
		lgc.initInspRpt_Prnt04();
		return lgc.aInspRpt_Prnt04;
	}

	protected void paramInspRpt_Prnt04(MCParam p) {
		if (this.aInspRpt_Prnt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspRpt_Prnt04.up0());
		p.addDownBlock(aInspRpt_Prnt04.down0());
	}

	protected void doInspRpt_Prnt04() {
		aInspRpt_Prnt04.call();
	};

	/**
	 * InspRpt_Prnt04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR createInspRpt_Prnt04_DtlR(){
		return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.create();
	}

	/**
	 * InspRpt_Prnt04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> createInspRpt_Prnt04_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspRpt_Prnt01オペレーション.<p>
	 *
	 * 検査指図リストを発行する。<br>
	 */
	abstract public class InspRpt_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspRpt_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> down0;
		
		
		// コンストラクタ
		protected InspRpt_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.class);

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
			invoke((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspRpt_Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR createInspRpt_Prnt01_DtlR(){
			return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.create();
		}

		/**
		 * InspRpt_Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> createInspRpt_Prnt01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_lst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_lst_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this).info;
		}


	}
	/**
	 * InspRpt_Prnt02オペレーション.<p>
	 *
	 * 検査成績書を発行する。<br>
	 */
	abstract public class InspRpt_Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspRpt_Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> down0;
		
		
		// コンストラクタ
		protected InspRpt_Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.class);

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
			invoke((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspRpt_Prnt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR createInspRpt_Prnt02_DtlR(){
			return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.create();
		}

		/**
		 * InspRpt_Prnt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> createInspRpt_Prnt02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_rslt_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this).info;
		}


	}
	/**
	 * InspRpt_Prnt03オペレーション.<p>
	 *
	 * 工場出荷記録書を発行する。<br>
	 */
	abstract public class InspRpt_Prnt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspRpt_Prnt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> down0;
		
		
		// コンストラクタ
		protected InspRpt_Prnt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.class);

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
			invoke((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspRpt_Prnt03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR createInspRpt_Prnt03_DtlR(){
			return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.create();
		}

		/**
		 * InspRpt_Prnt03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> createInspRpt_Prnt03_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this).info;
		}


	}
	/**
	 * InspRpt_Prnt04オペレーション.<p>
	 *
	 * 市場出荷可否判定記録書を発行する。<br>
	 */
	abstract public class InspRpt_Prnt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspRpt_Prnt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> down0;
		
		
		// コンストラクタ
		protected InspRpt_Prnt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.class);

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
			invoke((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspRpt_Prnt04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR createInspRpt_Prnt04_DtlR(){
			return mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.create();
		}

		/**
		 * InspRpt_Prnt04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> createInspRpt_Prnt04_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_prnt_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5330.InspRpt_Prnt04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspRptService)MSBFL_InspRptService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}