package mcframe.serverMSBF.MSBFL5200;

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
 * "MSBFL_LotTraceService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_LotTraceService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL5200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_LotTraceService.LotTrace_Chk01 aLotTrace_Chk01;

	protected void initLotTrace_Chk01() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Chk01_INFO;
		this.aLotTrace_Chk01 = ((MSBFL_LotTraceService)this).new LotTrace_Chk01();
	}

	public static MSBFL_LotTraceService.LotTrace_Chk01 crtLotTrace_Chk01() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Chk01();
		return lgc.aLotTrace_Chk01;
	}

	protected void paramLotTrace_Chk01(MCParam p) {
		if (this.aLotTrace_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Chk01.up0());
		p.addUpBlock(aLotTrace_Chk01.up1());
		p.addDownBlock(aLotTrace_Chk01.down0());
	}

	protected void doLotTrace_Chk01() {
		aLotTrace_Chk01.call();
	};

	/**
	 * LotTrace_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR createLotTrace_Chk01_RsltR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.create();
	}

	/**
	 * LotTrace_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> createLotTrace_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.class);
	}

	/**
	 * LotTrace_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR createLotTrace_Chk01_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR.create();
	}
	protected MSBFL_LotTraceService.LotTrace_Srch01 aLotTrace_Srch01;

	protected void initLotTrace_Srch01() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Srch01_INFO;
		this.aLotTrace_Srch01 = ((MSBFL_LotTraceService)this).new LotTrace_Srch01();
	}

	public static MSBFL_LotTraceService.LotTrace_Srch01 crtLotTrace_Srch01() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Srch01();
		return lgc.aLotTrace_Srch01;
	}

	protected void paramLotTrace_Srch01(MCParam p) {
		if (this.aLotTrace_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Srch01.up0());
		p.addDownBlock(aLotTrace_Srch01.down0());
		p.addDownBlock(aLotTrace_Srch01.down1());
		p.addDownBlock(aLotTrace_Srch01.down2());
	}

	protected void doLotTrace_Srch01() {
		aLotTrace_Srch01.call();
	};

	/**
	 * LotTrace_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR createLotTrace_Srch01_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.create();
	}

	/**
	 * LotTrace_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR> createLotTrace_Srch01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.class);
	}

	/**
	 * LotTrace_Srch01_RsltGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR createLotTrace_Srch01_RsltGrR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.create();
	}

	/**
	 * LotTrace_Srch01_RsltGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> createLotTrace_Srch01_RsltGrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
	}

	/**
	 * LotTrace_Srch01_RsltGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR createLotTrace_Srch01_RsltGiR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.create();
	}

	/**
	 * LotTrace_Srch01_RsltGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> createLotTrace_Srch01_RsltGiL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
	}

	/**
	 * LotTrace_Srch01_RsltAprvJudgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR createLotTrace_Srch01_RsltAprvJudgR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.create();
	}

	/**
	 * LotTrace_Srch01_RsltAprvJudgブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> createLotTrace_Srch01_RsltAprvJudgL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);
	}
	protected MSBFL_LotTraceService.LotTrace_Srch02 aLotTrace_Srch02;

	protected void initLotTrace_Srch02() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Srch02_INFO;
		this.aLotTrace_Srch02 = ((MSBFL_LotTraceService)this).new LotTrace_Srch02();
	}

	public static MSBFL_LotTraceService.LotTrace_Srch02 crtLotTrace_Srch02() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Srch02();
		return lgc.aLotTrace_Srch02;
	}

	protected void paramLotTrace_Srch02(MCParam p) {
		if (this.aLotTrace_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Srch02.up0());
		p.addDownBlock(aLotTrace_Srch02.down0());
	}

	protected void doLotTrace_Srch02() {
		aLotTrace_Srch02.call();
	};

	/**
	 * LotTrace_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR createLotTrace_Srch02_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.create();
	}

	/**
	 * LotTrace_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> createLotTrace_Srch02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
	}

	/**
	 * LotTrace_Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR createLotTrace_Srch02_RsltR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.create();
	}

	/**
	 * LotTrace_Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> createLotTrace_Srch02_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);
	}
	protected MSBFL_LotTraceService.LotTrace_Srch03 aLotTrace_Srch03;

	protected void initLotTrace_Srch03() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Srch03_INFO;
		this.aLotTrace_Srch03 = ((MSBFL_LotTraceService)this).new LotTrace_Srch03();
	}

	public static MSBFL_LotTraceService.LotTrace_Srch03 crtLotTrace_Srch03() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Srch03();
		return lgc.aLotTrace_Srch03;
	}

	protected void paramLotTrace_Srch03(MCParam p) {
		if (this.aLotTrace_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Srch03.up0());
		p.addDownBlock(aLotTrace_Srch03.down0());
	}

	protected void doLotTrace_Srch03() {
		aLotTrace_Srch03.call();
	};

	/**
	 * LotTrace_Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR createLotTrace_Srch03_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.create();
	}

	/**
	 * LotTrace_Srch03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR> createLotTrace_Srch03_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.class);
	}

	/**
	 * LotTrace_Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR createLotTrace_Srch03_RsltR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.create();
	}

	/**
	 * LotTrace_Srch03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> createLotTrace_Srch03_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);
	}
	protected MSBFL_LotTraceService.LotTrace_Srch04 aLotTrace_Srch04;

	protected void initLotTrace_Srch04() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Srch04_INFO;
		this.aLotTrace_Srch04 = ((MSBFL_LotTraceService)this).new LotTrace_Srch04();
	}

	public static MSBFL_LotTraceService.LotTrace_Srch04 crtLotTrace_Srch04() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Srch04();
		return lgc.aLotTrace_Srch04;
	}

	protected void paramLotTrace_Srch04(MCParam p) {
		if (this.aLotTrace_Srch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Srch04.up0());
		p.addDownBlock(aLotTrace_Srch04.down0());
	}

	protected void doLotTrace_Srch04() {
		aLotTrace_Srch04.call();
	};

	/**
	 * LotTrace_Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR createLotTrace_Srch04_CndR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.create();
	}

	/**
	 * LotTrace_Srch04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> createLotTrace_Srch04_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
	}

	/**
	 * LotTrace_Srch04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR createLotTrace_Srch04_RsltR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.create();
	}

	/**
	 * LotTrace_Srch04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> createLotTrace_Srch04_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);
	}
	protected MSBFL_LotTraceService.LotTrace_Upd01 aLotTrace_Upd01;

	protected void initLotTrace_Upd01() {
		this.info = PDef.MS_MSBFL5200_LotTrace_Upd01_INFO;
		this.aLotTrace_Upd01 = ((MSBFL_LotTraceService)this).new LotTrace_Upd01();
	}

	public static MSBFL_LotTraceService.LotTrace_Upd01 crtLotTrace_Upd01() {
		MSBFL_LotTraceService lgc = new MSBFL_LotTraceService();
		lgc.initLotTrace_Upd01();
		return lgc.aLotTrace_Upd01;
	}

	protected void paramLotTrace_Upd01(MCParam p) {
		if (this.aLotTrace_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotTrace_Upd01.up0());
		p.addUpBlock(aLotTrace_Upd01.up1());
	}

	protected void doLotTrace_Upd01() {
		aLotTrace_Upd01.call();
	};

	/**
	 * LotTrace_Upd01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR createLotTrace_Upd01_DtlGrR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR.create();
	}

	/**
	 * LotTrace_Upd01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR> createLotTrace_Upd01_DtlGrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR.class);
	}

	/**
	 * LotTrace_Upd01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR createLotTrace_Upd01_DtlGiR(){
		return mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR.create();
	}

	/**
	 * LotTrace_Upd01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR> createLotTrace_Upd01_DtlGiL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * LotTrace_Chk01オペレーション.<p>
	 *
	 * 出荷時構成チェックを行う。<br>
	 */
	abstract public class LotTrace_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected LotTrace_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.class);
			up1 = mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.class);

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
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotTrace_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR createLotTrace_Chk01_RsltR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.create();
		}

		/**
		 * LotTrace_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> createLotTrace_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR.class);
		}

		/**
		 * LotTrace_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR createLotTrace_Chk01_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
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
		 * 	<tr><td><br></td><td>no_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>no_err_msg_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_itm_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_itm_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_itm_mfg_aprv_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}
	/**
	 * LotTrace_Srch01オペレーション.<p>
	 *
	 * ロットトレース入出庫情報を検索する。<br>
	 */
	abstract public class LotTrace_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> down2;
		
		
		// コンストラクタ
		protected LotTrace_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * LotTrace_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR createLotTrace_Srch01_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.create();
		}

		/**
		 * LotTrace_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR> createLotTrace_Srch01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR.class);
		}

		/**
		 * LotTrace_Srch01_RsltGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR createLotTrace_Srch01_RsltGrR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.create();
		}

		/**
		 * LotTrace_Srch01_RsltGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> createLotTrace_Srch01_RsltGrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR.class);
		}

		/**
		 * LotTrace_Srch01_RsltGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR createLotTrace_Srch01_RsltGiR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.create();
		}

		/**
		 * LotTrace_Srch01_RsltGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> createLotTrace_Srch01_RsltGiL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR.class);
		}

		/**
		 * LotTrace_Srch01_RsltAprvJudgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR createLotTrace_Srch01_RsltAprvJudgR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.create();
		}

		/**
		 * LotTrace_Srch01_RsltAprvJudgブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> createLotTrace_Srch01_RsltAprvJudgL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		 * 	<tr><td><br></td><td>out_use_par_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ntfy_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_good_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>plnt_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_dt</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_base_unit_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch01_RsltAprvJudgR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}
	/**
	 * LotTrace_Srch02オペレーション.<p>
	 *
	 * ロットトレース（原因調査）を行う。<br>
	 */
	abstract public class LotTrace_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected LotTrace_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);

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
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotTrace_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR createLotTrace_Srch02_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.create();
		}

		/**
		 * LotTrace_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> createLotTrace_Srch02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
		}

		/**
		 * LotTrace_Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR createLotTrace_Srch02_RsltR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.create();
		}

		/**
		 * LotTrace_Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> createLotTrace_Srch02_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
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
		 * 	<tr><td><br></td><td>not_mng_flg</td></tr>
		 * 	<tr><td><br></td><td>dupl_abl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
		 * 	<tr><td><br></td><td>extno</td></tr>
		 * 	<tr><td><br></td><td>par_extno</td></tr>
		 * 	<tr><td><br></td><td>loop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_quality_good_flg</td></tr>
		 * 	<tr><td><br></td><td>not_mfg_aprv_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_stk_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_not_quality_good_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_not_mfg_aprv_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg5</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}
	/**
	 * LotTrace_Srch03オペレーション.<p>
	 *
	 * ロットトレース（影響調査）を行う。<br>
	 */
	abstract public class LotTrace_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> down0;
		
		
		// コンストラクタ
		protected LotTrace_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);

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
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotTrace_Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR createLotTrace_Srch03_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.create();
		}

		/**
		 * LotTrace_Srch03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR> createLotTrace_Srch03_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR.class);
		}

		/**
		 * LotTrace_Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR createLotTrace_Srch03_RsltR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.create();
		}

		/**
		 * LotTrace_Srch03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> createLotTrace_Srch03_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
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
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_mng_flg</td></tr>
		 * 	<tr><td><br></td><td>dupl_abl_flg</td></tr>
		 * 	<tr><td><br></td><td>bottom_layer_only_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
		 * 	<tr><td><br></td><td>extno</td></tr>
		 * 	<tr><td><br></td><td>par_extno</td></tr>
		 * 	<tr><td><br></td><td>loop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg5</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}
	/**
	 * LotTrace_Srch04オペレーション.<p>
	 *
	 * ロットトレース（原因調査）を行う。<br>
	 */
	abstract public class LotTrace_Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected LotTrace_Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);

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
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LotTrace_Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR createLotTrace_Srch04_CndR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.create();
		}

		/**
		 * LotTrace_Srch04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> createLotTrace_Srch04_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR.class);
		}

		/**
		 * LotTrace_Srch04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR createLotTrace_Srch04_RsltR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.create();
		}

		/**
		 * LotTrace_Srch04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> createLotTrace_Srch04_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
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
		 * 	<tr><td><br></td><td>not_mng_flg</td></tr>
		 * 	<tr><td><br></td><td>dupl_abl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hrrchy</td></tr>
		 * 	<tr><td><br></td><td>extno</td></tr>
		 * 	<tr><td><br></td><td>par_extno</td></tr>
		 * 	<tr><td><br></td><td>loop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_quality_good_flg</td></tr>
		 * 	<tr><td><br></td><td>not_mfg_aprv_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_stk_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_not_quality_good_flg</td></tr>
		 * 	<tr><td><br></td><td>hrchy_not_mfg_aprv_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_num5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg1</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg2</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg3</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg4</td></tr>
		 * 	<tr><td><br></td><td>lot_sub_flg5</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}
	/**
	 * LotTrace_Upd01オペレーション.<p>
	 *
	 * ロットトレース情報を追加・更新・削除する。<br>
	 */
	abstract public class LotTrace_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotTrace_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR> up1;
		
		
		// コンストラクタ
		protected LotTrace_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotTrace_Upd01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR createLotTrace_Upd01_DtlGrR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR.create();
		}

		/**
		 * LotTrace_Upd01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR> createLotTrace_Upd01_DtlGrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR.class);
		}

		/**
		 * LotTrace_Upd01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR createLotTrace_Upd01_DtlGiR(){
			return mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR.create();
		}

		/**
		 * LotTrace_Upd01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR> createLotTrace_Upd01_DtlGiL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_gr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
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
		 * 	<tr><td><br></td><td>slip_no</td></tr>
		 * 	<tr><td><br></td><td>slip_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_gi_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5200.LotTrace_Upd01_DtlGiR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotTraceService)MSBFL_LotTraceService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}