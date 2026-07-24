package mcframe.serverMSBF.MSBFL5110;

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
 * "MSBFL_MrktJudgService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_MrktJudgService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL5110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_MrktJudgService.MrktJudg_Chk01 aMrktJudg_Chk01;

	protected void initMrktJudg_Chk01() {
		this.info = PDef.MS_MSBFL5110_MrktJudg_Chk01_INFO;
		this.aMrktJudg_Chk01 = ((MSBFL_MrktJudgService)this).new MrktJudg_Chk01();
	}

	public static MSBFL_MrktJudgService.MrktJudg_Chk01 crtMrktJudg_Chk01() {
		MSBFL_MrktJudgService lgc = new MSBFL_MrktJudgService();
		lgc.initMrktJudg_Chk01();
		return lgc.aMrktJudg_Chk01;
	}

	protected void paramMrktJudg_Chk01(MCParam p) {
		if (this.aMrktJudg_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMrktJudg_Chk01.up0());
		p.addDownBlock(aMrktJudg_Chk01.down0());
	}

	protected void doMrktJudg_Chk01() {
		aMrktJudg_Chk01.call();
	};

	/**
	 * MrktJudg_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR createMrktJudg_Chk01_RsltR(){
		return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.create();
	}

	/**
	 * MrktJudg_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> createMrktJudg_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
	}
	protected MSBFL_MrktJudgService.MrktJudg_Chk02 aMrktJudg_Chk02;

	protected void initMrktJudg_Chk02() {
		this.info = PDef.MS_MSBFL5110_MrktJudg_Chk02_INFO;
		this.aMrktJudg_Chk02 = ((MSBFL_MrktJudgService)this).new MrktJudg_Chk02();
	}

	public static MSBFL_MrktJudgService.MrktJudg_Chk02 crtMrktJudg_Chk02() {
		MSBFL_MrktJudgService lgc = new MSBFL_MrktJudgService();
		lgc.initMrktJudg_Chk02();
		return lgc.aMrktJudg_Chk02;
	}

	protected void paramMrktJudg_Chk02(MCParam p) {
		if (this.aMrktJudg_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMrktJudg_Chk02.up0());
		p.addDownBlock(aMrktJudg_Chk02.down0());
	}

	protected void doMrktJudg_Chk02() {
		aMrktJudg_Chk02.call();
	};

	/**
	 * MrktJudg_Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR createMrktJudg_Chk02_RsltR(){
		return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.create();
	}

	/**
	 * MrktJudg_Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> createMrktJudg_Chk02_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.class);
	}
	protected MSBFL_MrktJudgService.MrktJudg_Chk03 aMrktJudg_Chk03;

	protected void initMrktJudg_Chk03() {
		this.info = PDef.MS_MSBFL5110_MrktJudg_Chk03_INFO;
		this.aMrktJudg_Chk03 = ((MSBFL_MrktJudgService)this).new MrktJudg_Chk03();
	}

	public static MSBFL_MrktJudgService.MrktJudg_Chk03 crtMrktJudg_Chk03() {
		MSBFL_MrktJudgService lgc = new MSBFL_MrktJudgService();
		lgc.initMrktJudg_Chk03();
		return lgc.aMrktJudg_Chk03;
	}

	protected void paramMrktJudg_Chk03(MCParam p) {
		if (this.aMrktJudg_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMrktJudg_Chk03.up0());
		p.addDownBlock(aMrktJudg_Chk03.down0());
	}

	protected void doMrktJudg_Chk03() {
		aMrktJudg_Chk03.call();
	};

	/**
	 * MrktJudg_Chk03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR createMrktJudg_Chk03_RsltR(){
		return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.create();
	}

	/**
	 * MrktJudg_Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> createMrktJudg_Chk03_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.class);
	}
	protected MSBFL_MrktJudgService.MrktJudg_Upd01 aMrktJudg_Upd01;

	protected void initMrktJudg_Upd01() {
		this.info = PDef.MS_MSBFL5110_MrktJudg_Upd01_INFO;
		this.aMrktJudg_Upd01 = ((MSBFL_MrktJudgService)this).new MrktJudg_Upd01();
	}

	public static MSBFL_MrktJudgService.MrktJudg_Upd01 crtMrktJudg_Upd01() {
		MSBFL_MrktJudgService lgc = new MSBFL_MrktJudgService();
		lgc.initMrktJudg_Upd01();
		return lgc.aMrktJudg_Upd01;
	}

	protected void paramMrktJudg_Upd01(MCParam p) {
		if (this.aMrktJudg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMrktJudg_Upd01.up0());
		p.addDownBlock(aMrktJudg_Upd01.down0());
	}

	protected void doMrktJudg_Upd01() {
		aMrktJudg_Upd01.call();
	};

	/**
	 * MrktJudg_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR createMrktJudg_Upd01_RsltR(){
		return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.create();
	}

	/**
	 * MrktJudg_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> createMrktJudg_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MrktJudg_Chk01オペレーション.<p>
	 *
	 * 市場出荷判定情報を登録・訂正する前チェックを行う。<br>
	 */
	abstract public class MrktJudg_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MrktJudg_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected MrktJudg_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);

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
			invoke((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MrktJudg_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR createMrktJudg_Chk01_RsltR(){
			return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.create();
		}

		/**
		 * MrktJudg_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> createMrktJudg_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>fromScrFlg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_so_aprv_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>deviant_typ</td></tr>
		 * 	<tr><td><br></td><td>deviant_msr_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_info_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_info_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>no_del_flg</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_no_del</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this).info;
		}


	}
	/**
	 * MrktJudg_Chk02オペレーション.<p>
	 *
	 * 指定されたロットが出荷可能かチェックする。<br>
	 */
	abstract public class MrktJudg_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MrktJudg_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected MrktJudg_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.class);

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
			invoke((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MrktJudg_Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR createMrktJudg_Chk02_RsltR(){
			return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.create();
		}

		/**
		 * MrktJudg_Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> createMrktJudg_Chk02_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>pre_inst_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this).info;
		}


	}
	/**
	 * MrktJudg_Chk03オペレーション.<p>
	 *
	 * 指定されたロットが仕入直送売上可能かチェックする。<br>
	 */
	abstract public class MrktJudg_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MrktJudg_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected MrktJudg_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.class);

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
			invoke((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MrktJudg_Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR createMrktJudg_Chk03_RsltR(){
			return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.create();
		}

		/**
		 * MrktJudg_Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> createMrktJudg_Chk03_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this).info;
		}


	}
	/**
	 * MrktJudg_Upd01オペレーション.<p>
	 *
	 * 市場出荷判定情報を作成、更新または削除する。<br>
	 */
	abstract public class MrktJudg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MrktJudg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected MrktJudg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);

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
			invoke((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MrktJudg_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR createMrktJudg_Upd01_RsltR(){
			return mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.create();
		}

		/**
		 * MrktJudg_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> createMrktJudg_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>fromScrFlg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_so_aprv_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>deviant_typ</td></tr>
		 * 	<tr><td><br></td><td>deviant_msr_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_info_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_info_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>no_del_flg</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_src_no_del</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_no</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5110.MrktJudg_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_MrktJudgService)MSBFL_MrktJudgService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}