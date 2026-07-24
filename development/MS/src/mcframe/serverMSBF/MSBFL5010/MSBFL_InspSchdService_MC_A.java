package mcframe.serverMSBF.MSBFL5010;

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
 * "MSBFL_InspSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspSchdService.InspSchd_Chk01 aInspSchd_Chk01;

	protected void initInspSchd_Chk01() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Chk01_INFO;
		this.aInspSchd_Chk01 = ((MSBFL_InspSchdService)this).new InspSchd_Chk01();
	}

	public static MSBFL_InspSchdService.InspSchd_Chk01 crtInspSchd_Chk01() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Chk01();
		return lgc.aInspSchd_Chk01;
	}

	protected void paramInspSchd_Chk01(MCParam p) {
		if (this.aInspSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Chk01.up0());
		p.addDownBlock(aInspSchd_Chk01.down0());
	}

	protected void doInspSchd_Chk01() {
		aInspSchd_Chk01.call();
	};

	/**
	 * InspSchd_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR createInspSchd_Chk01_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.create();
	}

	/**
	 * InspSchd_Chk01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> createInspSchd_Chk01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Chk02 aInspSchd_Chk02;

	protected void initInspSchd_Chk02() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Chk02_INFO;
		this.aInspSchd_Chk02 = ((MSBFL_InspSchdService)this).new InspSchd_Chk02();
	}

	public static MSBFL_InspSchdService.InspSchd_Chk02 crtInspSchd_Chk02() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Chk02();
		return lgc.aInspSchd_Chk02;
	}

	protected void paramInspSchd_Chk02(MCParam p) {
		if (this.aInspSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Chk02.up0());
		p.addDownBlock(aInspSchd_Chk02.down0());
	}

	protected void doInspSchd_Chk02() {
		aInspSchd_Chk02.call();
	};

	/**
	 * InspSchd_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR createInspSchd_Chk02_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.create();
	}

	/**
	 * InspSchd_Chk02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> createInspSchd_Chk02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Srch01 aInspSchd_Srch01;

	protected void initInspSchd_Srch01() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Srch01_INFO;
		this.aInspSchd_Srch01 = ((MSBFL_InspSchdService)this).new InspSchd_Srch01();
	}

	public static MSBFL_InspSchdService.InspSchd_Srch01 crtInspSchd_Srch01() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Srch01();
		return lgc.aInspSchd_Srch01;
	}

	protected void paramInspSchd_Srch01(MCParam p) {
		if (this.aInspSchd_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Srch01.up0());
		p.addDownBlock(aInspSchd_Srch01.down0());
	}

	protected void doInspSchd_Srch01() {
		aInspSchd_Srch01.call();
	};

	/**
	 * InspSchd_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR createInspSchd_Srch01_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.create();
	}

	/**
	 * InspSchd_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> createInspSchd_Srch01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Srch02 aInspSchd_Srch02;

	protected void initInspSchd_Srch02() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Srch02_INFO;
		this.aInspSchd_Srch02 = ((MSBFL_InspSchdService)this).new InspSchd_Srch02();
	}

	public static MSBFL_InspSchdService.InspSchd_Srch02 crtInspSchd_Srch02() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Srch02();
		return lgc.aInspSchd_Srch02;
	}

	protected void paramInspSchd_Srch02(MCParam p) {
		if (this.aInspSchd_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Srch02.up0());
		p.addDownBlock(aInspSchd_Srch02.down0());
	}

	protected void doInspSchd_Srch02() {
		aInspSchd_Srch02.call();
	};

	/**
	 * InspSchd_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR createInspSchd_Srch02_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.create();
	}

	/**
	 * InspSchd_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> createInspSchd_Srch02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Srch03 aInspSchd_Srch03;

	protected void initInspSchd_Srch03() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Srch03_INFO;
		this.aInspSchd_Srch03 = ((MSBFL_InspSchdService)this).new InspSchd_Srch03();
	}

	public static MSBFL_InspSchdService.InspSchd_Srch03 crtInspSchd_Srch03() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Srch03();
		return lgc.aInspSchd_Srch03;
	}

	protected void paramInspSchd_Srch03(MCParam p) {
		if (this.aInspSchd_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Srch03.up0());
		p.addDownBlock(aInspSchd_Srch03.down0());
	}

	protected void doInspSchd_Srch03() {
		aInspSchd_Srch03.call();
	};

	/**
	 * InspSchd_Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR createInspSchd_Srch03_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.create();
	}

	/**
	 * InspSchd_Srch03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> createInspSchd_Srch03_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Upd01 aInspSchd_Upd01;

	protected void initInspSchd_Upd01() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Upd01_INFO;
		this.aInspSchd_Upd01 = ((MSBFL_InspSchdService)this).new InspSchd_Upd01();
	}

	public static MSBFL_InspSchdService.InspSchd_Upd01 crtInspSchd_Upd01() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Upd01();
		return lgc.aInspSchd_Upd01;
	}

	protected void paramInspSchd_Upd01(MCParam p) {
		if (this.aInspSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Upd01.up0());
	}

	protected void doInspSchd_Upd01() {
		aInspSchd_Upd01.call();
	};

	/**
	 * InspSchd_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR createInspSchd_Upd01_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR.create();
	}

	/**
	 * InspSchd_Upd01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR> createInspSchd_Upd01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Upd02 aInspSchd_Upd02;

	protected void initInspSchd_Upd02() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Upd02_INFO;
		this.aInspSchd_Upd02 = ((MSBFL_InspSchdService)this).new InspSchd_Upd02();
	}

	public static MSBFL_InspSchdService.InspSchd_Upd02 crtInspSchd_Upd02() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Upd02();
		return lgc.aInspSchd_Upd02;
	}

	protected void paramInspSchd_Upd02(MCParam p) {
		if (this.aInspSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Upd02.up0());
	}

	protected void doInspSchd_Upd02() {
		aInspSchd_Upd02.call();
	};

	/**
	 * InspSchd_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR createInspSchd_Upd02_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR.create();
	}

	/**
	 * InspSchd_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR> createInspSchd_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Upd03 aInspSchd_Upd03;

	protected void initInspSchd_Upd03() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Upd03_INFO;
		this.aInspSchd_Upd03 = ((MSBFL_InspSchdService)this).new InspSchd_Upd03();
	}

	public static MSBFL_InspSchdService.InspSchd_Upd03 crtInspSchd_Upd03() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Upd03();
		return lgc.aInspSchd_Upd03;
	}

	protected void paramInspSchd_Upd03(MCParam p) {
		if (this.aInspSchd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Upd03.up0());
	}

	protected void doInspSchd_Upd03() {
		aInspSchd_Upd03.call();
	};

	/**
	 * InspSchd_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR createInspSchd_Upd03_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR.create();
	}

	/**
	 * InspSchd_Upd03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR> createInspSchd_Upd03_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR.class);
	}
	protected MSBFL_InspSchdService.InspSchd_Upd04 aInspSchd_Upd04;

	protected void initInspSchd_Upd04() {
		this.info = PDef.MS_MSBFL5010_InspSchd_Upd04_INFO;
		this.aInspSchd_Upd04 = ((MSBFL_InspSchdService)this).new InspSchd_Upd04();
	}

	public static MSBFL_InspSchdService.InspSchd_Upd04 crtInspSchd_Upd04() {
		MSBFL_InspSchdService lgc = new MSBFL_InspSchdService();
		lgc.initInspSchd_Upd04();
		return lgc.aInspSchd_Upd04;
	}

	protected void paramInspSchd_Upd04(MCParam p) {
		if (this.aInspSchd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspSchd_Upd04.up0());
	}

	protected void doInspSchd_Upd04() {
		aInspSchd_Upd04.call();
	};

	/**
	 * InspSchd_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR createInspSchd_Upd04_CndR(){
		return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR.create();
	}

	/**
	 * InspSchd_Upd04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR> createInspSchd_Upd04_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspSchd_Chk01オペレーション.<p>
	 *
	 * 検査関連データの追加・更新・削除前にチェックを行う。<br>
	 */
	abstract public class InspSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> down0;
		
		
		// コンストラクタ
		protected InspSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspSchd_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR createInspSchd_Chk01_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.create();
		}

		/**
		 * InspSchd_Chk01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> createInspSchd_Chk01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR.class);
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
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gr_tm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> up0() {
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
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Chk02オペレーション.<p>
	 *
	 * 製造承認関連処理前に検査関連データのチェックを行う。<br>
	 */
	abstract public class InspSchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> down0;
		
		
		// コンストラクタ
		protected InspSchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspSchd_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR createInspSchd_Chk02_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.create();
		}

		/**
		 * InspSchd_Chk02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> createInspSchd_Chk02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> up0() {
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
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Chk02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Srch01オペレーション.<p>
	 *
	 * 品管に関連するマスタ値（品目品管マスタ、品目検査パタンマスタ、品目マスタ（工場・物流倉庫））を取得する。<br>
	 */
	abstract public class InspSchd_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> down0;
		
		
		// コンストラクタ
		protected InspSchd_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspSchd_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR createInspSchd_Srch01_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.create();
		}

		/**
		 * InspSchd_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> createInspSchd_Srch01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR.class);
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
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>no_insp_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>from_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>no_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_pd</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_vld_pd</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_insp_valid_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>so_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>no_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Srch02オペレーション.<p>
	 *
	 * 入庫実績用に、在庫検査区分を取得する。<br>
	 */
	abstract public class InspSchd_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> down0;
		
		
		// コンストラクタ
		protected InspSchd_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspSchd_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR createInspSchd_Srch02_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.create();
		}

		/**
		 * InspSchd_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> createInspSchd_Srch02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gr_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>from_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Srch03オペレーション.<p>
	 *
	 * 検査着手・終了予定日を取得する<br>
	 */
	abstract public class InspSchd_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> down0;
		
		
		// コンストラクタ
		protected InspSchd_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspSchd_Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR createInspSchd_Srch03_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.create();
		}

		/**
		 * InspSchd_Srch03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> createInspSchd_Srch03_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>from_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Srch03_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Upd01オペレーション.<p>
	 *
	 * 検査関連データの追加・更新・削除をする。<br>
	 */
	abstract public class InspSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected InspSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspSchd_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR createInspSchd_Upd01_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR.create();
		}

		/**
		 * InspSchd_Upd01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR> createInspSchd_Upd01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>sts_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>gr_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Upd02オペレーション.<p>
	 *
	 * 製造承認関連処理に伴い、チェック処理や検査予定状況の更新を行う。<br>
	 */
	abstract public class InspSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR> up0;
		
		
		// コンストラクタ
		protected InspSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspSchd_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR createInspSchd_Upd02_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR.create();
		}

		/**
		 * InspSchd_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR> createInspSchd_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd02_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Upd03オペレーション.<p>
	 *
	 * 検査指図・規格検査指図・規格検査実績を登録する。<br>
	 */
	abstract public class InspSchd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR> up0;
		
		
		// コンストラクタ
		protected InspSchd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspSchd_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR createInspSchd_Upd03_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR.create();
		}

		/**
		 * InspSchd_Upd03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR> createInspSchd_Upd03_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd.src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_schd.insp_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd03_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}
	/**
	 * InspSchd_Upd04オペレーション.<p>
	 *
	 * 在庫検査区分に関連する受払予定を追加・更新・削除する。<br>
	 */
	abstract public class InspSchd_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspSchd_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR> up0;
		
		
		// コンストラクタ
		protected InspSchd_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR.class);

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
			invoke((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspSchd_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR createInspSchd_Upd04_CndR(){
			return mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR.create();
		}

		/**
		 * InspSchd_Upd04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR> createInspSchd_Upd04_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5010.InspSchd_Upd04_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspSchdService)MSBFL_InspSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}