import commonStyle from "./commonStyle.module.css";

export default function Home() {
  return (
    <div>
      <h1> Customer App </h1>

      <div className={commonStyle.content}>
        <div>
          This is customer app
          <br /> various features availble are
        </div>
      </div>
    </div>
  );
}
